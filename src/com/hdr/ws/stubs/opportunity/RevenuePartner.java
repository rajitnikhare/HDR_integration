
package com.hdr.ws.stubs.opportunity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RevenuePartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenuePartner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartProgramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnPartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DealEstCloseDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="DealExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="DealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrPartResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnPartnerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartOrgEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartOrgFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenuePartner", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", propOrder = {
    "optyId",
    "partOrgPartyId",
    "partProgramId",
    "partTypeCd",
    "revnId",
    "revnPartOrgPartyId",
    "dealEstCloseDate",
    "dealExpirationDate",
    "dealType",
    "prPartResourcePartyId",
    "registrationNumber",
    "partyId",
    "partyName",
    "partyName1",
    "revnPartnerNumber",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "partOrgEmailAddress",
    "partOrgFormattedPhoneNumber",
    "registrationStatus",
    "preferredContactName",
    "preferredContactEmail",
    "preferredContactPhone"
})
public class RevenuePartner {

    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "PartOrgPartyId")
    protected Long partOrgPartyId;
    @XmlElementRef(name = "PartProgramId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> partProgramId;
    @XmlElementRef(name = "PartTypeCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partTypeCd;
    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElement(name = "RevnPartOrgPartyId")
    protected Long revnPartOrgPartyId;
    @XmlElementRef(name = "DealEstCloseDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dealEstCloseDate;
    @XmlElementRef(name = "DealExpirationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dealExpirationDate;
    @XmlElementRef(name = "DealType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealType;
    @XmlElementRef(name = "PrPartResourcePartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prPartResourcePartyId;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElementRef(name = "RevnPartnerNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revnPartnerNumber;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "PartOrgEmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partOrgEmailAddress;
    @XmlElementRef(name = "PartOrgFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partOrgFormattedPhoneNumber;
    @XmlElementRef(name = "RegistrationStatus", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "PreferredContactName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactName;
    @XmlElementRef(name = "PreferredContactEmail", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactEmail;
    @XmlElementRef(name = "PreferredContactPhone", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactPhone;

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyId(Long value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the partOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartOrgPartyId() {
        return partOrgPartyId;
    }

    /**
     * Sets the value of the partOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartOrgPartyId(Long value) {
        this.partOrgPartyId = value;
    }

    /**
     * Gets the value of the partProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartProgramId() {
        return partProgramId;
    }

    /**
     * Sets the value of the partProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartProgramId(JAXBElement<Long> value) {
        this.partProgramId = value;
    }

    /**
     * Gets the value of the partTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartTypeCd() {
        return partTypeCd;
    }

    /**
     * Sets the value of the partTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartTypeCd(JAXBElement<String> value) {
        this.partTypeCd = value;
    }

    /**
     * Gets the value of the revnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevnId() {
        return revnId;
    }

    /**
     * Sets the value of the revnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevnId(Long value) {
        this.revnId = value;
    }

    /**
     * Gets the value of the revnPartOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevnPartOrgPartyId() {
        return revnPartOrgPartyId;
    }

    /**
     * Sets the value of the revnPartOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevnPartOrgPartyId(Long value) {
        this.revnPartOrgPartyId = value;
    }

    /**
     * Gets the value of the dealEstCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDealEstCloseDate() {
        return dealEstCloseDate;
    }

    /**
     * Sets the value of the dealEstCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDealEstCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dealEstCloseDate = value;
    }

    /**
     * Gets the value of the dealExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDealExpirationDate() {
        return dealExpirationDate;
    }

    /**
     * Sets the value of the dealExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDealExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dealExpirationDate = value;
    }

    /**
     * Gets the value of the dealType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealType(JAXBElement<String> value) {
        this.dealType = value;
    }

    /**
     * Gets the value of the prPartResourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrPartResourcePartyId() {
        return prPartResourcePartyId;
    }

    /**
     * Sets the value of the prPartResourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrPartResourcePartyId(JAXBElement<Long> value) {
        this.prPartResourcePartyId = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName1(String value) {
        this.partyName1 = value;
    }

    /**
     * Gets the value of the revnPartnerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnPartnerNumber() {
        return revnPartnerNumber;
    }

    /**
     * Sets the value of the revnPartnerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnPartnerNumber(JAXBElement<String> value) {
        this.revnPartnerNumber = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedBy(JAXBElement<String> value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the partOrgEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartOrgEmailAddress() {
        return partOrgEmailAddress;
    }

    /**
     * Sets the value of the partOrgEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartOrgEmailAddress(JAXBElement<String> value) {
        this.partOrgEmailAddress = value;
    }

    /**
     * Gets the value of the partOrgFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartOrgFormattedPhoneNumber() {
        return partOrgFormattedPhoneNumber;
    }

    /**
     * Sets the value of the partOrgFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartOrgFormattedPhoneNumber(JAXBElement<String> value) {
        this.partOrgFormattedPhoneNumber = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatus(JAXBElement<String> value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the preferredContactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactName() {
        return preferredContactName;
    }

    /**
     * Sets the value of the preferredContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactName(JAXBElement<String> value) {
        this.preferredContactName = value;
    }

    /**
     * Gets the value of the preferredContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactEmail() {
        return preferredContactEmail;
    }

    /**
     * Sets the value of the preferredContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactEmail(JAXBElement<String> value) {
        this.preferredContactEmail = value;
    }

    /**
     * Gets the value of the preferredContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPhone() {
        return preferredContactPhone;
    }

    /**
     * Sets the value of the preferredContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPhone(JAXBElement<String> value) {
        this.preferredContactPhone = value;
    }

}
