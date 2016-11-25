//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.04 at 04:17:01 PM MSK 
//


package ru.simplgroupp.xsd.nbki;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Classification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Classification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serialNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fileSinceDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="memberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="freezeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressStrDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="suppressEndDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Classification", propOrder = {
    "fid",
    "serialNum",
    "fileSinceDt",
    "memberCode",
    "typeCode",
    "number",
    "lastUpdatedDt",
    "freezeFlag",
    "suppressFlag",
    "suppressStrDt",
    "suppressEndDt"
})
public class Classification {

    protected BigInteger fid;
    protected Long serialNum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileSinceDt;
    protected String memberCode;
    protected String typeCode;
    protected String number;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdatedDt;
    protected String freezeFlag;
    protected String suppressFlag;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suppressStrDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suppressEndDt;

    /**
     * Gets the value of the fid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFid() {
        return fid;
    }

    /**
     * Sets the value of the fid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFid(BigInteger value) {
        this.fid = value;
    }

    /**
     * Gets the value of the serialNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSerialNum() {
        return serialNum;
    }

    /**
     * Sets the value of the serialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSerialNum(Long value) {
        this.serialNum = value;
    }

    /**
     * Gets the value of the fileSinceDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileSinceDt() {
        return fileSinceDt;
    }

    /**
     * Sets the value of the fileSinceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileSinceDt(XMLGregorianCalendar value) {
        this.fileSinceDt = value;
    }

    /**
     * Gets the value of the memberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * Sets the value of the memberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCode(String value) {
        this.memberCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the lastUpdatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedDt() {
        return lastUpdatedDt;
    }

    /**
     * Sets the value of the lastUpdatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedDt(XMLGregorianCalendar value) {
        this.lastUpdatedDt = value;
    }

    /**
     * Gets the value of the freezeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreezeFlag() {
        return freezeFlag;
    }

    /**
     * Sets the value of the freezeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreezeFlag(String value) {
        this.freezeFlag = value;
    }

    /**
     * Gets the value of the suppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressFlag() {
        return suppressFlag;
    }

    /**
     * Sets the value of the suppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressFlag(String value) {
        this.suppressFlag = value;
    }

    /**
     * Gets the value of the suppressStrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuppressStrDt() {
        return suppressStrDt;
    }

    /**
     * Sets the value of the suppressStrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuppressStrDt(XMLGregorianCalendar value) {
        this.suppressStrDt = value;
    }

    /**
     * Gets the value of the suppressEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuppressEndDt() {
        return suppressEndDt;
    }

    /**
     * Sets the value of the suppressEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuppressEndDt(XMLGregorianCalendar value) {
        this.suppressEndDt = value;
    }

}