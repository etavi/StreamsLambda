
package com.tavi.objects.billing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for billingContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ouID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryResource" type="{http://vodafone.ro/ods/ODS_BillingData}primaryResourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingContextType", propOrder = {
    "customerID",
    "ouID",
    "subscriberID",
    "primaryResource"
})
public class BillingContextType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String ouID;
    protected String subscriberID;
    protected PrimaryResourceType primaryResource;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the ouID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuID() {
        return ouID;
    }

    /**
     * Sets the value of the ouID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuID(String value) {
        this.ouID = value;
    }

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the primaryResource property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryResourceType }
     *     
     */
    public PrimaryResourceType getPrimaryResource() {
        return primaryResource;
    }

    /**
     * Sets the value of the primaryResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryResourceType }
     *     
     */
    public void setPrimaryResource(PrimaryResourceType value) {
        this.primaryResource = value;
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
