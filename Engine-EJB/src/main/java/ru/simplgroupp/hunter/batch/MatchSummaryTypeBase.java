
package ru.simplgroupp.hunter.batch;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchSummaryTypeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSummaryTypeBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rules" type="{}RulesType" minOccurs="0"/&gt;
 *         &lt;element name="MatchSchemes" type="{}MatchSchemeType" minOccurs="0"/&gt;
 *         &lt;element name="TotalMatchScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionScores" type="{}ScoreTypeResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSummaryTypeBase", propOrder = {
    "rules",
    "matchSchemes",
    "totalMatchScore",
    "submissionScores"
})
@XmlSeeAlso({
    MatchSummaryType.class
})
public class MatchSummaryTypeBase {

    @XmlElement(name = "Rules")
    protected RulesType rules;
    @XmlElement(name = "MatchSchemes")
    protected MatchSchemeType matchSchemes;
    @XmlElement(name = "TotalMatchScore")
    protected BigInteger totalMatchScore;
    @XmlElement(name = "SubmissionScores")
    protected ScoreTypeResult submissionScores;

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link RulesType }
     *     
     */
    public RulesType getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesType }
     *     
     */
    public void setRules(RulesType value) {
        this.rules = value;
    }

    /**
     * Gets the value of the matchSchemes property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSchemeType }
     *     
     */
    public MatchSchemeType getMatchSchemes() {
        return matchSchemes;
    }

    /**
     * Sets the value of the matchSchemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSchemeType }
     *     
     */
    public void setMatchSchemes(MatchSchemeType value) {
        this.matchSchemes = value;
    }

    /**
     * Gets the value of the totalMatchScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMatchScore() {
        return totalMatchScore;
    }

    /**
     * Sets the value of the totalMatchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMatchScore(BigInteger value) {
        this.totalMatchScore = value;
    }

    /**
     * Gets the value of the submissionScores property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreTypeResult }
     *     
     */
    public ScoreTypeResult getSubmissionScores() {
        return submissionScores;
    }

    /**
     * Sets the value of the submissionScores property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreTypeResult }
     *     
     */
    public void setSubmissionScores(ScoreTypeResult value) {
        this.submissionScores = value;
    }

}