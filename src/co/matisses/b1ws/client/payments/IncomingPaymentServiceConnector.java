package co.matisses.b1ws.client.payments;

import co.matisses.b1ws.dto.CreditCardPaymentDTO;
import co.matisses.b1ws.dto.PaymentDTO;
import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.PaymentAccountDTO;
import co.matisses.b1ws.incomingpayment.Add;
import co.matisses.b1ws.incomingpayment.AddResponse;
import co.matisses.b1ws.incomingpayment.Cancel;
import co.matisses.b1ws.incomingpayment.GetByParams;
import co.matisses.b1ws.incomingpayment.GetByParamsResponse;
import co.matisses.b1ws.incomingpayment.IncomingPaymentsService;
import co.matisses.b1ws.incomingpayment.IncomingPaymentsServiceSoap;
import co.matisses.b1ws.incomingpayment.MsgHeader;
import co.matisses.b1ws.incomingpayment.Payment;
import co.matisses.b1ws.incomingpayment.PaymentParams;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class IncomingPaymentServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(IncomingPaymentServiceConnector.class.getSimpleName());
    private IncomingPaymentsService service;
    private String sessionId;

    public IncomingPaymentServiceConnector(IncomingPaymentsService service, String sessionId) {
        super();
        this.sessionId = sessionId;
        this.service = service;
    }

    public void cancelPayment(Long docEntry) throws IncomingPaymentServiceException {
        IncomingPaymentsServiceSoap port = service.getIncomingPaymentsServiceSoap12();
        if (sessionId == null) {
            throw new IncomingPaymentServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(INCOMING_PAYMENT_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        PaymentParams params = new PaymentParams();
        params.setDocEntry(docEntry);

        Cancel request = new Cancel();
        request.setPaymentParams(params);

        try {
            port.cancel(request, header);
        } catch (Exception e) {
            Logger.getLogger(IncomingPaymentServiceException.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear el recibo de caja. ", e);
            throw new IncomingPaymentServiceException("No fue posible crear el recibo de caja. " + e.getMessage());
        }
    }

    public Long addPayment(PaymentDTO paymentDto) throws IncomingPaymentServiceException {
        log.log(Level.INFO, "Se recibio un pago para agregar. {0}", paymentDto);
        if (sessionId == null) {
            throw new IncomingPaymentServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }
        IncomingPaymentsServiceSoap port = service.getIncomingPaymentsServiceSoap12();

        MsgHeader header = new MsgHeader();
        header.setServiceName(INCOMING_PAYMENT_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        Payment payment = new Payment();
        payment.setDocType(paymentDto.getPaymentType().getType());
        payment.setCardCode(paymentDto.getCardCode());
        payment.setSeries(Long.parseLong(paymentDto.getSeriesCode()));
        if (paymentDto.getCashAccount() != null) {
            payment.setCashAccount(paymentDto.getCashAccount());
            payment.setCashSum(new BigDecimal(paymentDto.getPaidCash()));
        }
        if (paymentDto.getInvoiceDocEntry() != null) {
            Payment.PaymentInvoices paymentInvoices = new Payment.PaymentInvoices();
            Payment.PaymentInvoices.PaymentInvoice paymentInvoice = new Payment.PaymentInvoices.PaymentInvoice();
            paymentInvoice.setDocEntry(Long.parseLong(paymentDto.getInvoiceDocEntry()));
            paymentInvoice.setPaidSum(new BigDecimal(paymentDto.getPaidTotal()));
            paymentInvoices.getPaymentInvoice().add(paymentInvoice);
            payment.setPaymentInvoices(paymentInvoices);
        }
//        Agrega datos de pago por cuenta
        Payment.PaymentAccounts accounts = new Payment.PaymentAccounts();
        long lineNum = 0;
        for (PaymentAccountDTO accountPayment : paymentDto.getAccountPayments()) {
            Payment.PaymentAccounts.PaymentAccount paymentAccount = new Payment.PaymentAccounts.PaymentAccount();
            paymentAccount.setAccountCode(accountPayment.getAccountCode());
            paymentAccount.setSumPaid(accountPayment.getSumPaid());
            paymentAccount.setUTercero(paymentDto.getCardCode());
            paymentAccount.setLineNum(lineNum++);
            accounts.getPaymentAccount().add(paymentAccount);
        }
        payment.setPaymentAccounts(accounts);

        Payment.PaymentCreditCards paymentCreditCards = new Payment.PaymentCreditCards();
        GregorianCalendar cal = new GregorianCalendar(2050, 11, 31);
        for (CreditCardPaymentDTO creditPayment : paymentDto.getCreditCardPayments()) {
            try {
                Payment.PaymentCreditCards.PaymentCreditCard paymentCreditCard = new Payment.PaymentCreditCards.PaymentCreditCard();
                paymentCreditCard.setCreditCard(Long.parseLong(creditPayment.getCreditCardCode()));
                paymentCreditCard.setCreditCardNumber(creditPayment.getCreditCardNumber());
                paymentCreditCard.setCardValidUntil(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
                paymentCreditCard.setVoucherNum(creditPayment.getVoucherNumber());
                paymentCreditCard.setOwnerIdNum(paymentDto.getCardCode());
                paymentCreditCard.setOwnerPhone(paymentDto.getCardCode());
                paymentCreditCard.setNumOfPayments(1L);
                paymentCreditCard.setNumOfCreditPayments(Long.parseLong(creditPayment.getNumberOfPayments()));
                paymentCreditCard.setFirstPaymentSum(new BigDecimal(Long.parseLong(creditPayment.getPaidSum())));
                paymentCreditCard.setCreditSum(new BigDecimal(Long.parseLong(creditPayment.getPaidSum())));
                paymentCreditCard.setCreditType(paymentDto.getCreditType());
                paymentCreditCards.getPaymentCreditCard().add(paymentCreditCard);
            } catch (Exception e) {
                log.log(Level.SEVERE, "Ocurrio un error al registrar los pagos con tarjeta en el recibo de caja. ", e);
            }
        }
        payment.setPaymentCreditCards(paymentCreditCards);
        Add request = new Add();
        request.setPayment(payment);
        try {
            AddResponse response = port.add(request, header);
            return response.getPaymentParams().getDocEntry();
        } catch (Exception e) {
            Logger.getLogger(IncomingPaymentServiceException.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear el recibo de caja. ", e);
            throw new IncomingPaymentServiceException("No fue posible crear el recibo de caja. " + e.getMessage());
        }
    }

    public Payment findPayment(Long docEntry) throws IncomingPaymentServiceException {
        IncomingPaymentsServiceSoap port = service.getIncomingPaymentsServiceSoap12();
        if (sessionId == null) {
            throw new IncomingPaymentServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

//        Configura el encabezado de la solicitud
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(INCOMING_PAYMENT_SERVICE_WSDL_NAME);

        PaymentParams paymentParams = new PaymentParams();
        paymentParams.setDocEntry(docEntry);

        GetByParams params = new GetByParams();
        params.setPaymentParams(paymentParams);

        try {
            GetByParamsResponse response = port.getByParams(params, requestHeader);
            return response.getPayment();
        } catch (Exception e) {
            Logger.getLogger(IncomingPaymentServiceException.class.getName()).log(Level.SEVERE, "Ocurrio un error al consultar el recibo de caja. ", e);
            throw new IncomingPaymentServiceException("No fue posible consultar el recibo de caja. " + e.getMessage());
        }

    }
}
