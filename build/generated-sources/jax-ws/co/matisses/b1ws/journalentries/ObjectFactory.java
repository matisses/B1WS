
package co.matisses.b1ws.journalentries;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.matisses.b1ws.journalentries package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.matisses.b1ws.journalentries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JournalEntry }
     * 
     */
    public JournalEntry createJournalEntry() {
        return new JournalEntry();
    }

    /**
     * Create an instance of {@link JournalEntry.WithholdingTaxDataCollection }
     * 
     */
    public JournalEntry.WithholdingTaxDataCollection createJournalEntryWithholdingTaxDataCollection() {
        return new JournalEntry.WithholdingTaxDataCollection();
    }

    /**
     * Create an instance of {@link JournalEntry.JournalEntryLines }
     * 
     */
    public JournalEntry.JournalEntryLines createJournalEntryJournalEntryLines() {
        return new JournalEntry.JournalEntryLines();
    }

    /**
     * Create an instance of {@link JournalEntry.JournalEntryLines.JournalEntryLine }
     * 
     */
    public JournalEntry.JournalEntryLines.JournalEntryLine createJournalEntryJournalEntryLinesJournalEntryLine() {
        return new JournalEntry.JournalEntryLines.JournalEntryLine();
    }

    /**
     * Create an instance of {@link JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments }
     * 
     */
    public JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments createJournalEntryJournalEntryLinesJournalEntryLineCashFlowAssignments() {
        return new JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments();
    }

    /**
     * Create an instance of {@link GetByParamsResponse }
     * 
     */
    public GetByParamsResponse createGetByParamsResponse() {
        return new GetByParamsResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JournalEntryParams }
     * 
     */
    public JournalEntryParams createJournalEntryParams() {
        return new JournalEntryParams();
    }

    /**
     * Create an instance of {@link MsgHeader }
     * 
     */
    public MsgHeader createMsgHeader() {
        return new MsgHeader();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link GetByParams }
     * 
     */
    public GetByParams createGetByParams() {
        return new GetByParams();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData }
     * 
     */
    public JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData createJournalEntryWithholdingTaxDataCollectionWithholdingTaxData() {
        return new JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData();
    }

    /**
     * Create an instance of {@link JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment }
     * 
     */
    public JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment createJournalEntryJournalEntryLinesJournalEntryLineCashFlowAssignmentsCashFlowAssignment() {
        return new JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment();
    }

}
