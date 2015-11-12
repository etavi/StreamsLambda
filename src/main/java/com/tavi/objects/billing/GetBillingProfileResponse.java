
package com.tavi.objects.billing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResponseSuccess" type="{http://vodafone.ro/ods/ODS_BillingData}BillingProfileType" minOccurs="0"/>
 *         &lt;element name="ResponseFault" type="{http://vodafone.ro/ods}ResponseFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseStatus",
    "responseSuccess",
    "responseFault"
})
@XmlRootElement(name = "getBillingProfileResponse")
public class GetBillingProfileResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponseStatus")
    protected int responseStatus;
    @XmlElement(name = "ResponseSuccess")
    protected BillingProfileType responseSuccess;
    @XmlElement(name = "ResponseFault")
    protected ResponseFault responseFault;

    /**
     * Gets the value of the responseStatus property.
     * 
     */
    public int getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     */
    public void setResponseStatus(int value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the responseSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link BillingProfileType }
     *     
     */
    public BillingProfileType getResponseSuccess() {
        return responseSuccess;
    }

    /**
     * Sets the value of the responseSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingProfileType }
     *     
     */
    public void setResponseSuccess(BillingProfileType value) {
        this.responseSuccess = value;
    }

    /**
     * Gets the value of the responseFault property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseFault }
     *     
     */
    public ResponseFault getResponseFault() {
        return responseFault;
    }

    /**
     * Sets the value of the responseFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseFault }
     *     
     */
    public void setResponseFault(ResponseFault value) {
        this.responseFault = value;
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
