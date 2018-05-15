package co.matisses.b1ws.client.vendorpayment;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.CreditCardPaymentDTO;
import co.matisses.b1ws.dto.PaymentDTO;
import co.matisses.b1ws.vendorpayment.Add;
import co.matisses.b1ws.vendorpayment.AddResponse;
import co.matisses.b1ws.vendorpayment.MsgHeader;
import co.matisses.b1ws.vendorpayment.Payment;
import co.matisses.b1ws.vendorpayment.VendorPaymentsService;
import co.matisses.b1ws.vendorpayment.VendorPaymentsServiceSoap;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class VendorPaymentServiceConnector extends B1WSServiceInfo {

    private VendorPaymentsService vendorPaymentsService = null;
    private String sessionId = null;

    public VendorPaymentServiceConnector(VendorPaymentsService vendorPaymentsService, String sessionId) {
        super();
        this.sessionId = sessionId;
        this.vendorPaymentsService = vendorPaymentsService;
    }

    public Long createVendorPayment(PaymentDTO paymentDto) throws VendorPaymentServiceException {
        VendorPaymentsServiceSoap port = vendorPaymentsService.getVendorPaymentsServiceSoap12();
        if (sessionId == null) {
            throw new VendorPaymentServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        //Configura el encabezado de la solicitud
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(VENDOR_PAYMENTS_SERVICE_WSDL_NAME);

        Payment payment = new Payment();
        payment.setCardCode(paymentDto.getCardCode());
        payment.setSeries(Long.parseLong(paymentDto.getSeriesCode()));
        payment.setCashSum(Double.parseDouble(paymentDto.getPaidCash()));
        payment.setCashAccount(paymentDto.getCashAccount());
        payment.setDocType(paymentDto.getBusinessPartnerType().value);

        Payment.PaymentInvoices paymentInvoices = new Payment.PaymentInvoices();
        Payment.PaymentInvoices.PaymentInvoice paymentInvoice = new Payment.PaymentInvoices.PaymentInvoice();
        paymentInvoice.setDocEntry(Long.parseLong(paymentDto.getInvoiceDocEntry()));
        paymentInvoice.setPaidSum(Double.parseDouble(paymentDto.getPaidTotal()));
        paymentInvoice.setInvoiceType(Integer.toString(paymentDto.getDocType().value));
        paymentInvoices.getPaymentInvoice().add(paymentInvoice);
        payment.setPaymentInvoices(paymentInvoices);

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
                paymentCreditCard.setFirstPaymentSum(Double.parseDouble(creditPayment.getPaidSum()));
                paymentCreditCard.setCreditSum(Double.parseDouble(creditPayment.getPaidSum()));
                paymentCreditCard.setCreditType(paymentDto.getCreditType());
                paymentCreditCards.getPaymentCreditCard().add(paymentCreditCard);
            } catch (Exception e) {
            }
        }
        payment.setPaymentCreditCards(paymentCreditCards);

        //Configura el cuerpo de la solicitud
        Add parameters = new Add();
        parameters.setPayment(payment);

        try {
            AddResponse resp = port.add(parameters, requestHeader);
            return resp.getPaymentParams().getDocEntry();
        } catch (Exception e) {
            Logger.getLogger(VendorPaymentServiceConnector.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear el egreso. ", e);
            throw new VendorPaymentServiceException("No fue posible crear el egreso. " + e.getMessage());
        }
    }
}
