
package com.hdr.ws.stubs.opportunity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffinityLvlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="InfluenceLvlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptyConId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PERPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RoleCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PrimaryFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrganizationPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelationshipRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesAffinityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesBuyingRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesInfluenceLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPointId1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PhonePreferenceExistsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailPreferenceExistsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPointType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPointType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormattedMultilineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCentricJobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Phone_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titles_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityContact", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", propOrder = {
    "affinityLvlCd",
    "comments",
    "conflictId",
    "contactedFlg",
    "createdBy",
    "creationDate",
    "influenceLvlCd",
    "lastUpdateDate",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "objectVersionNumber",
    "optyConId",
    "optyId",
    "perPartyId",
    "relationshipId",
    "roleCd",
    "userLastUpdateDate",
    "primaryFlg",
    "relationshipCode",
    "jobTitle",
    "orgContactId",
    "organizationPartyName",
    "organizationPartyId",
    "relationshipRecId",
    "salesAffinityCode",
    "salesBuyingRoleCode",
    "salesInfluenceLevelCode",
    "partyUniqueName",
    "partyName",
    "partyId",
    "preferredContactMethod",
    "emailAddress",
    "contactPointId",
    "contactPointId1",
    "targetPartyId",
    "objectVersionNumber1",
    "subjectId",
    "objectId",
    "phonePreferenceExistsFlag",
    "emailPreferenceExistsFlag",
    "formattedAddress",
    "formattedPhoneNumber",
    "contactPointType",
    "contactPointType1",
    "rawPhoneNumber",
    "locationId",
    "formattedMultilineAddress",
    "personCentricJobTitle",
    "doNotContactFlag",
    "phoneC",
    "emailC",
    "titleC",
    "titlesC"
})
public class OpportunityContact {

    @XmlElementRef(name = "AffinityLvlCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affinityLvlCd;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "ContactedFlg", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactedFlg;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "InfluenceLvlCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> influenceLvlCd;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "OptyConId")
    protected Long optyConId;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "PERPartyId")
    protected Long perPartyId;
    @XmlElementRef(name = "RelationshipId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> relationshipId;
    @XmlElementRef(name = "RoleCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleCd;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "PrimaryFlg", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryFlg;
    @XmlElement(name = "RelationshipCode")
    protected String relationshipCode;
    @XmlElementRef(name = "JobTitle", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobTitle;
    @XmlElement(name = "OrgContactId")
    protected Long orgContactId;
    @XmlElement(name = "OrganizationPartyName")
    protected String organizationPartyName;
    @XmlElement(name = "OrganizationPartyId")
    protected Long organizationPartyId;
    @XmlElement(name = "RelationshipRecId")
    protected Long relationshipRecId;
    @XmlElementRef(name = "SalesAffinityCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAffinityCode;
    @XmlElementRef(name = "SalesBuyingRoleCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesBuyingRoleCode;
    @XmlElementRef(name = "SalesInfluenceLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesInfluenceLevelCode;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElement(name = "ContactPointId")
    protected Long contactPointId;
    @XmlElement(name = "ContactPointId1")
    protected Long contactPointId1;
    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetPartyId;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElement(name = "SubjectId")
    protected Long subjectId;
    @XmlElement(name = "ObjectId")
    protected Long objectId;
    @XmlElementRef(name = "PhonePreferenceExistsFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phonePreferenceExistsFlag;
    @XmlElementRef(name = "EmailPreferenceExistsFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emailPreferenceExistsFlag;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "FormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedPhoneNumber;
    @XmlElementRef(name = "ContactPointType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactPointType;
    @XmlElementRef(name = "ContactPointType1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactPointType1;
    @XmlElementRef(name = "RawPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rawPhoneNumber;
    @XmlElementRef(name = "LocationId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationId;
    @XmlElementRef(name = "FormattedMultilineAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedMultilineAddress;
    @XmlElementRef(name = "PersonCentricJobTitle", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personCentricJobTitle;
    @XmlElementRef(name = "DoNotContactFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotContactFlag;
    @XmlElementRef(name = "Phone_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneC;
    @XmlElementRef(name = "Email_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailC;
    @XmlElementRef(name = "Title_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titleC;
    @XmlElementRef(name = "Titles_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titlesC;

    /**
     * Gets the value of the affinityLvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffinityLvlCd() {
        return affinityLvlCd;
    }

    /**
     * Sets the value of the affinityLvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffinityLvlCd(JAXBElement<String> value) {
        this.affinityLvlCd = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConflictId(Long value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the contactedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactedFlg() {
        return contactedFlg;
    }

    /**
     * Sets the value of the contactedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactedFlg(JAXBElement<String> value) {
        this.contactedFlg = value;
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
     * Gets the value of the influenceLvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfluenceLvlCd() {
        return influenceLvlCd;
    }

    /**
     * Sets the value of the influenceLvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfluenceLvlCd(JAXBElement<String> value) {
        this.influenceLvlCd = value;
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
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
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
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the optyConId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyConId() {
        return optyConId;
    }

    /**
     * Sets the value of the optyConId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyConId(Long value) {
        this.optyConId = value;
    }

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
     * Gets the value of the perPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPERPartyId() {
        return perPartyId;
    }

    /**
     * Sets the value of the perPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPERPartyId(Long value) {
        this.perPartyId = value;
    }

    /**
     * Gets the value of the relationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelationshipId() {
        return relationshipId;
    }

    /**
     * Sets the value of the relationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelationshipId(JAXBElement<Long> value) {
        this.relationshipId = value;
    }

    /**
     * Gets the value of the roleCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleCd() {
        return roleCd;
    }

    /**
     * Sets the value of the roleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleCd(JAXBElement<String> value) {
        this.roleCd = value;
    }

    /**
     * Gets the value of the userLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Sets the value of the userLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = value;
    }

    /**
     * Gets the value of the primaryFlg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFlg() {
        return primaryFlg;
    }

    /**
     * Sets the value of the primaryFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFlg(JAXBElement<String> value) {
        this.primaryFlg = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipCode(String value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitle(JAXBElement<String> value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the orgContactId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgContactId() {
        return orgContactId;
    }

    /**
     * Sets the value of the orgContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgContactId(Long value) {
        this.orgContactId = value;
    }

    /**
     * Gets the value of the organizationPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationPartyName() {
        return organizationPartyName;
    }

    /**
     * Sets the value of the organizationPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationPartyName(String value) {
        this.organizationPartyName = value;
    }

    /**
     * Gets the value of the organizationPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationPartyId() {
        return organizationPartyId;
    }

    /**
     * Sets the value of the organizationPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationPartyId(Long value) {
        this.organizationPartyId = value;
    }

    /**
     * Gets the value of the relationshipRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationshipRecId() {
        return relationshipRecId;
    }

    /**
     * Sets the value of the relationshipRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationshipRecId(Long value) {
        this.relationshipRecId = value;
    }

    /**
     * Gets the value of the salesAffinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAffinityCode() {
        return salesAffinityCode;
    }

    /**
     * Sets the value of the salesAffinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAffinityCode(JAXBElement<String> value) {
        this.salesAffinityCode = value;
    }

    /**
     * Gets the value of the salesBuyingRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesBuyingRoleCode() {
        return salesBuyingRoleCode;
    }

    /**
     * Sets the value of the salesBuyingRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesBuyingRoleCode(JAXBElement<String> value) {
        this.salesBuyingRoleCode = value;
    }

    /**
     * Gets the value of the salesInfluenceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesInfluenceLevelCode() {
        return salesInfluenceLevelCode;
    }

    /**
     * Sets the value of the salesInfluenceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesInfluenceLevelCode(JAXBElement<String> value) {
        this.salesInfluenceLevelCode = value;
    }

    /**
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName(JAXBElement<String> value) {
        this.partyUniqueName = value;
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
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactMethod(JAXBElement<String> value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the contactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPointId() {
        return contactPointId;
    }

    /**
     * Sets the value of the contactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPointId(Long value) {
        this.contactPointId = value;
    }

    /**
     * Gets the value of the contactPointId1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPointId1() {
        return contactPointId1;
    }

    /**
     * Sets the value of the contactPointId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPointId1(Long value) {
        this.contactPointId1 = value;
    }

    /**
     * Gets the value of the targetPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetPartyId() {
        return targetPartyId;
    }

    /**
     * Sets the value of the targetPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetPartyId(JAXBElement<Long> value) {
        this.targetPartyId = value;
    }

    /**
     * Gets the value of the objectVersionNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber1() {
        return objectVersionNumber1;
    }

    /**
     * Sets the value of the objectVersionNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber1(Integer value) {
        this.objectVersionNumber1 = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectId(Long value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectId(Long value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the phonePreferenceExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhonePreferenceExistsFlag() {
        return phonePreferenceExistsFlag;
    }

    /**
     * Sets the value of the phonePreferenceExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhonePreferenceExistsFlag(JAXBElement<Boolean> value) {
        this.phonePreferenceExistsFlag = value;
    }

    /**
     * Gets the value of the emailPreferenceExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmailPreferenceExistsFlag() {
        return emailPreferenceExistsFlag;
    }

    /**
     * Sets the value of the emailPreferenceExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmailPreferenceExistsFlag(JAXBElement<Boolean> value) {
        this.emailPreferenceExistsFlag = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the formattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    /**
     * Sets the value of the formattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedPhoneNumber(JAXBElement<String> value) {
        this.formattedPhoneNumber = value;
    }

    /**
     * Gets the value of the contactPointType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPointType() {
        return contactPointType;
    }

    /**
     * Sets the value of the contactPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPointType(JAXBElement<String> value) {
        this.contactPointType = value;
    }

    /**
     * Gets the value of the contactPointType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPointType1() {
        return contactPointType1;
    }

    /**
     * Sets the value of the contactPointType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPointType1(JAXBElement<String> value) {
        this.contactPointType1 = value;
    }

    /**
     * Gets the value of the rawPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRawPhoneNumber() {
        return rawPhoneNumber;
    }

    /**
     * Sets the value of the rawPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRawPhoneNumber(JAXBElement<String> value) {
        this.rawPhoneNumber = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationId(JAXBElement<Long> value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the formattedMultilineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedMultilineAddress() {
        return formattedMultilineAddress;
    }

    /**
     * Sets the value of the formattedMultilineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedMultilineAddress(JAXBElement<String> value) {
        this.formattedMultilineAddress = value;
    }

    /**
     * Gets the value of the personCentricJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonCentricJobTitle() {
        return personCentricJobTitle;
    }

    /**
     * Sets the value of the personCentricJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonCentricJobTitle(JAXBElement<String> value) {
        this.personCentricJobTitle = value;
    }

    /**
     * Gets the value of the doNotContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotContactFlag() {
        return doNotContactFlag;
    }

    /**
     * Sets the value of the doNotContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotContactFlag(JAXBElement<Boolean> value) {
        this.doNotContactFlag = value;
    }

    /**
     * Gets the value of the phoneC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneC() {
        return phoneC;
    }

    /**
     * Sets the value of the phoneC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneC(JAXBElement<String> value) {
        this.phoneC = value;
    }

    /**
     * Gets the value of the emailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailC() {
        return emailC;
    }

    /**
     * Sets the value of the emailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailC(JAXBElement<String> value) {
        this.emailC = value;
    }

    /**
     * Gets the value of the titleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitleC() {
        return titleC;
    }

    /**
     * Sets the value of the titleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitleC(JAXBElement<String> value) {
        this.titleC = value;
    }

    /**
     * Gets the value of the titlesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitlesC() {
        return titlesC;
    }

    /**
     * Sets the value of the titlesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitlesC(JAXBElement<String> value) {
        this.titlesC = value;
    }

}
