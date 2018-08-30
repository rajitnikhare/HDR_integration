
package com.hdr.ws.stubs.accountService;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesTeamMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTeamMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeamMemberId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesProfileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MemberFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockAssignmentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ResourcePartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_BusinessUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_BusinessUnit_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Department_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Department_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Amount_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Amount_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Amount_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesAccountResourceEO_Title_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTeamMember", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", propOrder = {
    "teamMemberId",
    "salesProfileId",
    "resourceId",
    "memberFunctionCode",
    "accessLevelCode",
    "lockAssignmentFlag",
    "assignmentTypeCode",
    "creationDate",
    "createdBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "userLastUpdateDate",
    "startDateActive",
    "endDateActive",
    "resourcePartyNumber",
    "resourceEmailAddress",
    "salesAccountResourceEOBusinessUnitC",
    "salesAccountResourceEOBusinessUnitCMeaning",
    "salesAccountResourceEODepartmentC",
    "salesAccountResourceEODepartmentCMeaning",
    "salesAccountResourceEOAmountC",
    "salesAccountResourceEOAmountCCurrencyCode",
    "salesAccountResourceEOAmountCCurcyConvRate",
    "salesAccountResourceEOTitleC"
})
public class SalesTeamMember {

    @XmlElement(name = "TeamMemberId")
    protected Long teamMemberId;
    @XmlElement(name = "SalesProfileId")
    protected Long salesProfileId;
    @XmlElementRef(name = "ResourceId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceId;
    @XmlElementRef(name = "MemberFunctionCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberFunctionCode;
    @XmlElement(name = "AccessLevelCode")
    protected String accessLevelCode;
    @XmlElement(name = "LockAssignmentFlag", defaultValue = "false")
    protected Boolean lockAssignmentFlag;
    @XmlElementRef(name = "AssignmentTypeCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignmentTypeCode;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "StartDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElementRef(name = "ResourcePartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourcePartyNumber;
    @XmlElementRef(name = "ResourceEmailAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceEmailAddress;
    @XmlElementRef(name = "SalesAccountResourceEO_BusinessUnit_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEOBusinessUnitC;
    @XmlElementRef(name = "SalesAccountResourceEO_BusinessUnit_cMeaning", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEOBusinessUnitCMeaning;
    @XmlElementRef(name = "SalesAccountResourceEO_Department_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEODepartmentC;
    @XmlElementRef(name = "SalesAccountResourceEO_Department_cMeaning", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEODepartmentCMeaning;
    @XmlElementRef(name = "SalesAccountResourceEO_Amount_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> salesAccountResourceEOAmountC;
    @XmlElementRef(name = "SalesAccountResourceEO_Amount_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEOAmountCCurrencyCode;
    @XmlElementRef(name = "SalesAccountResourceEO_Amount_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesAccountResourceEOAmountCCurcyConvRate;
    @XmlElementRef(name = "SalesAccountResourceEO_Title_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountResourceEOTitleC;

    /**
     * Gets the value of the teamMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeamMemberId() {
        return teamMemberId;
    }

    /**
     * Sets the value of the teamMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeamMemberId(Long value) {
        this.teamMemberId = value;
    }

    /**
     * Gets the value of the salesProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesProfileId() {
        return salesProfileId;
    }

    /**
     * Sets the value of the salesProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesProfileId(Long value) {
        this.salesProfileId = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceId(JAXBElement<Long> value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the memberFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberFunctionCode() {
        return memberFunctionCode;
    }

    /**
     * Sets the value of the memberFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberFunctionCode(JAXBElement<String> value) {
        this.memberFunctionCode = value;
    }

    /**
     * Gets the value of the accessLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevelCode() {
        return accessLevelCode;
    }

    /**
     * Sets the value of the accessLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevelCode(String value) {
        this.accessLevelCode = value;
    }

    /**
     * Gets the value of the lockAssignmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockAssignmentFlag() {
        return lockAssignmentFlag;
    }

    /**
     * Sets the value of the lockAssignmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockAssignmentFlag(Boolean value) {
        this.lockAssignmentFlag = value;
    }

    /**
     * Gets the value of the assignmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentTypeCode() {
        return assignmentTypeCode;
    }

    /**
     * Sets the value of the assignmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentTypeCode(JAXBElement<String> value) {
        this.assignmentTypeCode = value;
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
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateActive = value;
    }

    /**
     * Gets the value of the endDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateActive() {
        return endDateActive;
    }

    /**
     * Sets the value of the endDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateActive = value;
    }

    /**
     * Gets the value of the resourcePartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourcePartyNumber() {
        return resourcePartyNumber;
    }

    /**
     * Sets the value of the resourcePartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourcePartyNumber(JAXBElement<String> value) {
        this.resourcePartyNumber = value;
    }

    /**
     * Gets the value of the resourceEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceEmailAddress() {
        return resourceEmailAddress;
    }

    /**
     * Sets the value of the resourceEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceEmailAddress(JAXBElement<String> value) {
        this.resourceEmailAddress = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOBusinessUnitC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEOBusinessUnitC() {
        return salesAccountResourceEOBusinessUnitC;
    }

    /**
     * Sets the value of the salesAccountResourceEOBusinessUnitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEOBusinessUnitC(JAXBElement<String> value) {
        this.salesAccountResourceEOBusinessUnitC = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOBusinessUnitCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEOBusinessUnitCMeaning() {
        return salesAccountResourceEOBusinessUnitCMeaning;
    }

    /**
     * Sets the value of the salesAccountResourceEOBusinessUnitCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEOBusinessUnitCMeaning(JAXBElement<String> value) {
        this.salesAccountResourceEOBusinessUnitCMeaning = value;
    }

    /**
     * Gets the value of the salesAccountResourceEODepartmentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEODepartmentC() {
        return salesAccountResourceEODepartmentC;
    }

    /**
     * Sets the value of the salesAccountResourceEODepartmentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEODepartmentC(JAXBElement<String> value) {
        this.salesAccountResourceEODepartmentC = value;
    }

    /**
     * Gets the value of the salesAccountResourceEODepartmentCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEODepartmentCMeaning() {
        return salesAccountResourceEODepartmentCMeaning;
    }

    /**
     * Sets the value of the salesAccountResourceEODepartmentCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEODepartmentCMeaning(JAXBElement<String> value) {
        this.salesAccountResourceEODepartmentCMeaning = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOAmountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getSalesAccountResourceEOAmountC() {
        return salesAccountResourceEOAmountC;
    }

    /**
     * Sets the value of the salesAccountResourceEOAmountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setSalesAccountResourceEOAmountC(JAXBElement<AmountType> value) {
        this.salesAccountResourceEOAmountC = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOAmountCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEOAmountCCurrencyCode() {
        return salesAccountResourceEOAmountCCurrencyCode;
    }

    /**
     * Sets the value of the salesAccountResourceEOAmountCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEOAmountCCurrencyCode(JAXBElement<String> value) {
        this.salesAccountResourceEOAmountCCurrencyCode = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOAmountCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesAccountResourceEOAmountCCurcyConvRate() {
        return salesAccountResourceEOAmountCCurcyConvRate;
    }

    /**
     * Sets the value of the salesAccountResourceEOAmountCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesAccountResourceEOAmountCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.salesAccountResourceEOAmountCCurcyConvRate = value;
    }

    /**
     * Gets the value of the salesAccountResourceEOTitleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountResourceEOTitleC() {
        return salesAccountResourceEOTitleC;
    }

    /**
     * Sets the value of the salesAccountResourceEOTitleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountResourceEOTitleC(JAXBElement<String> value) {
        this.salesAccountResourceEOTitleC = value;
    }

}
