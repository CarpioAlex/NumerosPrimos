package MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
    "invoiceHeader",
    "invoiceIssueData",
    "taxesOutputs",
    "invoiceTotals",
    "items",
})
public class Invoice {
    private InvoiceHeader invoiceHeader;
    private InvoiceIssueData invoiceIssueData;
    private TaxesOutputs taxesOutputs;
    private InvoiceTotals invoiceTotals;
    private Items items;

    @XmlElement(name = "InvoiceHeader")
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    @XmlElement(name = "InvoiceIssueData")
    public InvoiceIssueData getInvoiceIssueData() {
        return invoiceIssueData;
    }

    public void setInvoiceIssueData(InvoiceIssueData invoiceIssueData) {
        this.invoiceIssueData = invoiceIssueData;
    }

    @XmlElement(name = "TaxesOutputs")
    public TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    public void setTaxesOutputs(TaxesOutputs taxesOutputs) {
        this.taxesOutputs = taxesOutputs;
    }

    @XmlElement(name = "InvoiceTotals")
    public InvoiceTotals getInvoiceTotals() {
        return invoiceTotals;
    }

    public void setInvoiceTotals(InvoiceTotals invoiceTotals) {
        this.invoiceTotals = invoiceTotals;
    }

    @XmlElement(name = "Items")
    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

}
