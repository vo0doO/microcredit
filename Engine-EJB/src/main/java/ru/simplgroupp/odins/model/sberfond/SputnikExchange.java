//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.19 at 04:50:07 PM OMST 
//


package ru.simplgroupp.odins.model.sberfond;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SputnikExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SputnikExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentsExpense" type="{urn:asap.digital:SputnikExchange}PaymentExpense" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentsReceipt" type="{urn:asap.digital:SputnikExchange}PaymentReceipt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WritsOfExecution" type="{urn:asap.digital:SputnikExchange}WritOfExecution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalsRecords" type="{urn:asap.digital:SputnikExchange}TotalsRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SputnikExchange", propOrder = {
    "version",
    "paymentsExpense",
    "paymentsReceipt",
    "writsOfExecution",
    "totalsRecords"
})
public class SputnikExchange {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "PaymentsExpense")
    protected List<PaymentExpense> paymentsExpense;
    @XmlElement(name = "PaymentsReceipt")
    protected List<PaymentReceipt> paymentsReceipt;
    @XmlElement(name = "WritsOfExecution")
    protected List<WritOfExecution> writsOfExecution;
    @XmlElement(name = "TotalsRecords")
    protected List<TotalsRecord> totalsRecords;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the paymentsExpense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsExpense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsExpense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentExpense }
     * 
     * 
     */
    public List<PaymentExpense> getPaymentsExpense() {
        if (paymentsExpense == null) {
            paymentsExpense = new ArrayList<PaymentExpense>();
        }
        return this.paymentsExpense;
    }

    /**
     * Gets the value of the paymentsReceipt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsReceipt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsReceipt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt }
     * 
     * 
     */
    public List<PaymentReceipt> getPaymentsReceipt() {
        if (paymentsReceipt == null) {
            paymentsReceipt = new ArrayList<PaymentReceipt>();
        }
        return this.paymentsReceipt;
    }

    /**
     * Gets the value of the writsOfExecution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writsOfExecution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWritsOfExecution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WritOfExecution }
     * 
     * 
     */
    public List<WritOfExecution> getWritsOfExecution() {
        if (writsOfExecution == null) {
            writsOfExecution = new ArrayList<WritOfExecution>();
        }
        return this.writsOfExecution;
    }

    /**
     * Gets the value of the totalsRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalsRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalsRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsRecord }
     * 
     * 
     */
    public List<TotalsRecord> getTotalsRecords() {
        if (totalsRecords == null) {
            totalsRecords = new ArrayList<TotalsRecord>();
        }
        return this.totalsRecords;
    }

    public void setPaymentsExpense(List<PaymentExpense> paymentsExpense) {
        this.paymentsExpense = paymentsExpense;
    }

    public void setPaymentsReceipt(List<PaymentReceipt> paymentsReceipt) {
        this.paymentsReceipt = paymentsReceipt;
    }

    public void setWritsOfExecution(List<WritOfExecution> writsOfExecution) {
        this.writsOfExecution = writsOfExecution;
    }

    public void setTotalsRecords(List<TotalsRecord> totalsRecords) {
        this.totalsRecords = totalsRecords;
    }
}
