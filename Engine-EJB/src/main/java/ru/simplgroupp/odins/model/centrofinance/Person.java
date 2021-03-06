//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.29 at 10:00:41 AM MSK 
//


package ru.simplgroupp.odins.model.centrofinance;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PassportSeries" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassportIssued" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="BankAccount" type="{urn:asap.digital:SputnikExchange}BankAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "id",
    "name",
    "birthDate",
    "passportSeries",
    "passportNumber",
    "passportIssued",
    "passportIssueDate",
    "bankAccount"
})
public class Person {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "date")
    protected String birthDate;
    @XmlElement(name = "PassportSeries", required = true)
    protected String passportSeries;
    @XmlElement(name = "PassportNumber", required = true)
    protected String passportNumber;
    @XmlElement(name = "PassportIssued", required = true)
    protected String passportIssued;
    @XmlElement(name = "PassportIssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected String passportIssueDate;
    @XmlElement(name = "BankAccount")
    protected BankAccount bankAccount;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the passportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportSeries() {
        return passportSeries;
    }

    /**
     * Sets the value of the passportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportSeries(String value) {
        this.passportSeries = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssued() {
        return passportIssued;
    }

    /**
     * Sets the value of the passportIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssued(String value) {
        this.passportIssued = value;
    }

    /**
     * Gets the value of the passportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    /**
     * Sets the value of the passportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssueDate(String value) {
        this.passportIssueDate = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

}
