
package com.serene.pdms.ws.stubs.company;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContactProjects_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactProjects_c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonProfile_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JobDefinitionPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Favorable_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectName_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactProjects_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", propOrder = {
    "id",
    "recordName",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "personProfileIdC",
    "lastUpdateLogin",
    "cpdrfVerSor",
    "conflictId",
    "userLastUpdateDate",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "jobDefinitionPackage",
    "requestId",
    "jobDefinitionName",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "isOwner",
    "favorableC",
    "dateC",
    "projectNameIdC",
    "projectNameC",
    "roleC"
})
public class ContactProjectsC {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    @XmlElement(name = "RecordName")
    protected String recordName;
    @XmlElementRef(name = "CreatedBy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> objectVersionNumber;
    @XmlElementRef(name = "PersonProfile_Id_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> personProfileIdC;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "JobDefinitionPackage", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionPackage;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "JobDefinitionName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionName;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "IsOwner", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isOwner;
    @XmlElement(name = "Favorable_c")
    protected Boolean favorableC;
    @XmlElementRef(name = "Date_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateC;
    @XmlElementRef(name = "ProjectName_Id_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectNameIdC;
    @XmlElementRef(name = "ProjectName_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectNameC;
    @XmlElementRef(name = "Role_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleC;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = value;
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
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<BigDecimal> value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the personProfileIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPersonProfileIdC() {
        return personProfileIdC;
    }

    /**
     * Sets the value of the personProfileIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPersonProfileIdC(JAXBElement<BigDecimal> value) {
        this.personProfileIdC = value;
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
     * Gets the value of the cpdrfVerSor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerSor() {
        return cpdrfVerSor;
    }

    /**
     * Sets the value of the cpdrfVerSor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerSor(JAXBElement<Integer> value) {
        this.cpdrfVerSor = value;
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
     * Gets the value of the cpdrfLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpdrfLastUpd() {
        return cpdrfLastUpd;
    }

    /**
     * Sets the value of the cpdrfLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpdrfLastUpd(JAXBElement<String> value) {
        this.cpdrfLastUpd = value;
    }

    /**
     * Gets the value of the cpdrfVerPillar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerPillar() {
        return cpdrfVerPillar;
    }

    /**
     * Sets the value of the cpdrfVerPillar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerPillar(JAXBElement<Integer> value) {
        this.cpdrfVerPillar = value;
    }

    /**
     * Gets the value of the jobDefinitionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionPackage() {
        return jobDefinitionPackage;
    }

    /**
     * Sets the value of the jobDefinitionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionPackage(JAXBElement<String> value) {
        this.jobDefinitionPackage = value;
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
     * Gets the value of the jobDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Sets the value of the jobDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionName(JAXBElement<String> value) {
        this.jobDefinitionName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOwner(JAXBElement<String> value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the favorableC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorableC() {
        return favorableC;
    }

    /**
     * Sets the value of the favorableC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorableC(Boolean value) {
        this.favorableC = value;
    }

    /**
     * Gets the value of the dateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateC() {
        return dateC;
    }

    /**
     * Sets the value of the dateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.dateC = value;
    }

    /**
     * Gets the value of the projectNameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectNameIdC() {
        return projectNameIdC;
    }

    /**
     * Sets the value of the projectNameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectNameIdC(JAXBElement<BigDecimal> value) {
        this.projectNameIdC = value;
    }

    /**
     * Gets the value of the projectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectNameC() {
        return projectNameC;
    }

    /**
     * Sets the value of the projectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectNameC(JAXBElement<String> value) {
        this.projectNameC = value;
    }

    /**
     * Gets the value of the roleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleC() {
        return roleC;
    }

    /**
     * Sets the value of the roleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleC(JAXBElement<String> value) {
        this.roleC = value;
    }

}