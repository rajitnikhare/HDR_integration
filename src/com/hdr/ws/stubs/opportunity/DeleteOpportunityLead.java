
package com.hdr.ws.stubs.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="opportunityLeadVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityLead"/>
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
    "opportunityLeadVO"
})
@XmlRootElement(name = "deleteOpportunityLead")
public class DeleteOpportunityLead {

    @XmlElement(required = true)
    protected OpportunityLead opportunityLeadVO;

    /**
     * Gets the value of the opportunityLeadVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityLead }
     *     
     */
    public OpportunityLead getOpportunityLeadVO() {
        return opportunityLeadVO;
    }

    /**
     * Sets the value of the opportunityLeadVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityLead }
     *     
     */
    public void setOpportunityLeadVO(OpportunityLead value) {
        this.opportunityLeadVO = value;
    }

}
