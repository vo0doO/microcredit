//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.10 at 05:59:42 PM GMT+03:00 
//


package ru.simplgroupp.odins.model.rastorop;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for OnlineCreditExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineCreditExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentsExpense" type="{urn:rastorop.ru:OnlineCreditExchange}PaymentExpense" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentsReceipt" type="{urn:rastorop.ru:OnlineCreditExchange}PaymentReceipt" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OnlineCreditExchange", propOrder = {
    "version",
    "paymentsExpense",
    "paymentsReceipt",
    "totalsRecords"
})
public class OnlineCreditExchange {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "PaymentsExpense")
    protected List<PaymentExpense> paymentsExpense;
    @XmlElement(name = "PaymentsReceipt")
    protected List<PaymentReceipt> paymentsReceipt;
    @XmlElement(name = "TotalsRecords")
    protected List<TotalsRecords> totalsRecords;


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

    public void setPaymentsExpense(List<PaymentExpense> paymentsExpense) {
        this.paymentsExpense = paymentsExpense;
    }

    public void setPaymentsReceipt(List<PaymentReceipt> paymentsReceipt) {
        this.paymentsReceipt = paymentsReceipt;
    }


    public List<TotalsRecords> getTotalsRecords() {
        return totalsRecords;
    }

    public void setTotalsRecords(List<TotalsRecords> totalsRecords) {
        this.totalsRecords = totalsRecords;
    }
}
