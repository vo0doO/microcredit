//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.19 at 04:50:07 PM OMST 
//


package ru.simplgroupp.odins.model.sberfond;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PassportSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassportIssued" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BankAccount" type="{urn:asap.digital:SputnikExchange}BankAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportIssued() {
        return passportIssued;
    }

    public void setPassportIssued(String passportIssued) {
        this.passportIssued = passportIssued;
    }

    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
