
package com.tavi.objects.billing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for billingAdditionalOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingAdditionalOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfProperties" type="{http://vodafone.ro/ods/ODS_BillingData}listOfPropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingAdditionalOfferType", propOrder = {
    "socID",
    "offerCode",
    "socName",
    "socDescription",
    "boInstanceID",
    "socType",
    "serviceLevel",
    "listOfProperties"
})
public class BillingAdditionalOfferType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String socID;
    protected String offerCode;
    protected String socName;
    protected String socDescription;
    protected String boInstanceID;
    protected String socType;
    protected String serviceLevel;
    protected ListOfPropertiesType listOfProperties;

    /**
     * Gets the value of the socID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocID() {
        return socID;
    }

    /**
     * Sets the value of the socID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocID(String value) {
        this.socID = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the socName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocName() {
        return socName;
    }

    /**
     * Sets the value of the socName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocName(String value) {
        this.socName = value;
    }

    /**
     * Gets the value of the socDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocDescription() {
        return socDescription;
    }

    /**
     * Sets the value of the socDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocDescription(String value) {
        this.socDescription = value;
    }

    /**
     * Gets the value of the boInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoInstanceID() {
        return boInstanceID;
    }

    /**
     * Sets the value of the boInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoInstanceID(String value) {
        this.boInstanceID = value;
    }

    /**
     * Gets the value of the socType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocType() {
        return socType;
    }

    /**
     * Sets the value of the socType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocType(String value) {
        this.socType = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the listOfProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPropertiesType }
     *     
     */
    public ListOfPropertiesType getListOfProperties() {
        return listOfProperties;
    }

    /**
     * Sets the value of the listOfProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPropertiesType }
     *     
     */
    public void setListOfProperties(ListOfPropertiesType value) {
        this.listOfProperties = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
