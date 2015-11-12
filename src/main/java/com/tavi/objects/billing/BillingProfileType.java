
package com.tavi.objects.billing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BillingProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingContext" type="{http://vodafone.ro/ods/ODS_BillingData}billingContextType"/>
 *         &lt;element name="billingPricePlan" type="{http://vodafone.ro/ods/ODS_BillingData}billingPricePlanType" minOccurs="0"/>
 *         &lt;element name="listOfBillingAdditionalOffers" type="{http://vodafone.ro/ods/ODS_BillingData}listOfBillingAdditionalOffersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingProfileType", propOrder = {
    "billingContext",
    "billingPricePlan",
    "listOfBillingAdditionalOffers"
})
public class BillingProfileType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BillingContextType billingContext;
    protected BillingPricePlanType billingPricePlan;
    @XmlElement(required = true)
    protected ListOfBillingAdditionalOffersType listOfBillingAdditionalOffers;

    /**
     * Gets the value of the billingContext property.
     * 
     * @return
     *     possible object is
     *     {@link BillingContextType }
     *     
     */
    public BillingContextType getBillingContext() {
        return billingContext;
    }

    /**
     * Sets the value of the billingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingContextType }
     *     
     */
    public void setBillingContext(BillingContextType value) {
        this.billingContext = value;
    }

    /**
     * Gets the value of the billingPricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPricePlanType }
     *     
     */
    public BillingPricePlanType getBillingPricePlan() {
        return billingPricePlan;
    }

    /**
     * Sets the value of the billingPricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPricePlanType }
     *     
     */
    public void setBillingPricePlan(BillingPricePlanType value) {
        this.billingPricePlan = value;
    }

    /**
     * Gets the value of the listOfBillingAdditionalOffers property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBillingAdditionalOffersType }
     *     
     */
    public ListOfBillingAdditionalOffersType getListOfBillingAdditionalOffers() {
        return listOfBillingAdditionalOffers;
    }

    /**
     * Sets the value of the listOfBillingAdditionalOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBillingAdditionalOffersType }
     *     
     */
    public void setListOfBillingAdditionalOffers(ListOfBillingAdditionalOffersType value) {
        this.listOfBillingAdditionalOffers = value;
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
