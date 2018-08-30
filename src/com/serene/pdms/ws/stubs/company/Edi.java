
package com.serene.pdms.ws.stubs.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Edi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPointType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPointPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryByPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDITransactionHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDIIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDIPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDIPaymentFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDIRemittanceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDIRemittanceInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDITpHeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EDIEceTpLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallPrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}ContactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edi", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", propOrder = {
    "contactPointId",
    "contactPointType",
    "status",
    "ownerTableName",
    "ownerTableId",
    "primaryFlag",
    "origSystemReference",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "objectVersionNumber",
    "createdByModule",
    "contactPointPurpose",
    "primaryByPurpose",
    "startDate",
    "endDate",
    "relationshipId",
    "partyUsageCode",
    "origSystem",
    "ediTransactionHandling",
    "ediIdNumber",
    "ediPaymentMethod",
    "ediPaymentFormat",
    "ediRemittanceMethod",
    "ediRemittanceInstruction",
    "ediTpHeaderId",
    "ediEceTpLocationCode",
    "overallPrimaryFlag",
    "contactPreference",
    "originalSystemReference"
})
public class Edi {

    @XmlElement(name = "ContactPointId")
    protected Long contactPointId;
    @XmlElement(name = "ContactPointType", defaultValue = "EDI")
    protected String contactPointType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OwnerTableName")
    protected String ownerTableName;
    @XmlElement(name = "OwnerTableId")
    protected Long ownerTableId;
    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElementRef(name = "OrigSystemReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystemReference;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "ContactPointPurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactPointPurpose;
    @XmlElementRef(name = "PrimaryByPurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryByPurpose;
    @XmlElement(name = "StartDate")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "RelationshipId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> relationshipId;
    @XmlElementRef(name = "PartyUsageCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUsageCode;
    @XmlElementRef(name = "OrigSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystem;
    @XmlElementRef(name = "EDITransactionHandling", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediTransactionHandling;
    @XmlElementRef(name = "EDIIdNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediIdNumber;
    @XmlElementRef(name = "EDIPaymentMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediPaymentMethod;
    @XmlElementRef(name = "EDIPaymentFormat", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediPaymentFormat;
    @XmlElementRef(name = "EDIRemittanceMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediRemittanceMethod;
    @XmlElementRef(name = "EDIRemittanceInstruction", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediRemittanceInstruction;
    @XmlElementRef(name = "EDITpHeaderId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ediTpHeaderId;
    @XmlElementRef(name = "EDIEceTpLocationCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediEceTpLocationCode;
    @XmlElement(name = "OverallPrimaryFlag")
    protected Boolean overallPrimaryFlag;
    @XmlElement(name = "ContactPreference")
    protected List<ContactPreference> contactPreference;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;

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
     * Gets the value of the contactPointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPointType() {
        return contactPointType;
    }

    /**
     * Sets the value of the contactPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPointType(String value) {
        this.contactPointType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the ownerTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTableName() {
        return ownerTableName;
    }

    /**
     * Sets the value of the ownerTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTableName(String value) {
        this.ownerTableName = value;
    }

    /**
     * Gets the value of the ownerTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerTableId() {
        return ownerTableId;
    }

    /**
     * Sets the value of the ownerTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerTableId(Long value) {
        this.ownerTableId = value;
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryFlag(Boolean value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the origSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystemReference() {
        return origSystemReference;
    }

    /**
     * Sets the value of the origSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystemReference(JAXBElement<String> value) {
        this.origSystemReference = value;
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
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = value;
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
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = value;
    }

    /**
     * Gets the value of the contactPointPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPointPurpose() {
        return contactPointPurpose;
    }

    /**
     * Sets the value of the contactPointPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPointPurpose(JAXBElement<String> value) {
        this.contactPointPurpose = value;
    }

    /**
     * Gets the value of the primaryByPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryByPurpose() {
        return primaryByPurpose;
    }

    /**
     * Sets the value of the primaryByPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryByPurpose(JAXBElement<String> value) {
        this.primaryByPurpose = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the partyUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUsageCode() {
        return partyUsageCode;
    }

    /**
     * Sets the value of the partyUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUsageCode(JAXBElement<String> value) {
        this.partyUsageCode = value;
    }

    /**
     * Gets the value of the origSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystem() {
        return origSystem;
    }

    /**
     * Sets the value of the origSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystem(JAXBElement<String> value) {
        this.origSystem = value;
    }

    /**
     * Gets the value of the ediTransactionHandling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDITransactionHandling() {
        return ediTransactionHandling;
    }

    /**
     * Sets the value of the ediTransactionHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDITransactionHandling(JAXBElement<String> value) {
        this.ediTransactionHandling = value;
    }

    /**
     * Gets the value of the ediIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIIdNumber() {
        return ediIdNumber;
    }

    /**
     * Sets the value of the ediIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIIdNumber(JAXBElement<String> value) {
        this.ediIdNumber = value;
    }

    /**
     * Gets the value of the ediPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIPaymentMethod() {
        return ediPaymentMethod;
    }

    /**
     * Sets the value of the ediPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIPaymentMethod(JAXBElement<String> value) {
        this.ediPaymentMethod = value;
    }

    /**
     * Gets the value of the ediPaymentFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIPaymentFormat() {
        return ediPaymentFormat;
    }

    /**
     * Sets the value of the ediPaymentFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIPaymentFormat(JAXBElement<String> value) {
        this.ediPaymentFormat = value;
    }

    /**
     * Gets the value of the ediRemittanceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIRemittanceMethod() {
        return ediRemittanceMethod;
    }

    /**
     * Sets the value of the ediRemittanceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIRemittanceMethod(JAXBElement<String> value) {
        this.ediRemittanceMethod = value;
    }

    /**
     * Gets the value of the ediRemittanceInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIRemittanceInstruction() {
        return ediRemittanceInstruction;
    }

    /**
     * Sets the value of the ediRemittanceInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIRemittanceInstruction(JAXBElement<String> value) {
        this.ediRemittanceInstruction = value;
    }

    /**
     * Gets the value of the ediTpHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEDITpHeaderId() {
        return ediTpHeaderId;
    }

    /**
     * Sets the value of the ediTpHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEDITpHeaderId(JAXBElement<Long> value) {
        this.ediTpHeaderId = value;
    }

    /**
     * Gets the value of the ediEceTpLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDIEceTpLocationCode() {
        return ediEceTpLocationCode;
    }

    /**
     * Sets the value of the ediEceTpLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDIEceTpLocationCode(JAXBElement<String> value) {
        this.ediEceTpLocationCode = value;
    }

    /**
     * Gets the value of the overallPrimaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverallPrimaryFlag() {
        return overallPrimaryFlag;
    }

    /**
     * Sets the value of the overallPrimaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverallPrimaryFlag(Boolean value) {
        this.overallPrimaryFlag = value;
    }

    /**
     * Gets the value of the contactPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreference }
     * 
     * 
     */
    public List<ContactPreference> getContactPreference() {
        if (contactPreference == null) {
            contactPreference = new ArrayList<ContactPreference>();
        }
        return this.contactPreference;
    }

    /**
     * Gets the value of the originalSystemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalSystemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalSystemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalSystemReference }
     * 
     * 
     */
    public List<OriginalSystemReference> getOriginalSystemReference() {
        if (originalSystemReference == null) {
            originalSystemReference = new ArrayList<OriginalSystemReference>();
        }
        return this.originalSystemReference;
    }

}
