
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
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetOrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetOrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InterfaceRowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PurchaseDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConvRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmCorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnteredCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", propOrder = {
    "assetId",
    "assetNumber",
    "assetOrigSystem",
    "assetOrigSystemReference",
    "batchId",
    "assetAmount",
    "createdBy",
    "creationDate",
    "customerId",
    "endDate",
    "installDate",
    "interfaceRowId",
    "inventoryItemId",
    "inventoryOrgId",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "objectVersionNumber",
    "purchaseDate",
    "quantity",
    "requestId",
    "startDate",
    "statusCode",
    "crmConvRate",
    "assetTag",
    "serialNumber",
    "crmCorpCurrencyCode",
    "enteredCurrencyCode",
    "exchangeRate",
    "deleteFlag",
    "attributeCategory",
    "currencyCode",
    "corpCurrencyCode",
    "curcyConvRateType",
    "assetName",
    "assetDescription",
    "uomCode",
    "prodGroupId",
    "description",
    "organizationId",
    "itemNumber",
    "prodGroupName"
})
public class Asset {

    @XmlElement(name = "AssetId")
    protected Long assetId;
    @XmlElementRef(name = "AssetNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetNumber;
    @XmlElementRef(name = "AssetOrigSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetOrigSystem;
    @XmlElementRef(name = "AssetOrigSystemReference", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetOrigSystemReference;
    @XmlElementRef(name = "BatchId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> batchId;
    @XmlElementRef(name = "AssetAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> assetAmount;
    @XmlElementRef(name = "CreatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "CustomerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customerId;
    @XmlElementRef(name = "EndDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "InstallDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> installDate;
    @XmlElementRef(name = "InterfaceRowId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> interfaceRowId;
    @XmlElementRef(name = "InventoryItemId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inventoryItemId;
    @XmlElementRef(name = "InventoryOrgId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inventoryOrgId;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "PurchaseDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> purchaseDate;
    @XmlElementRef(name = "Quantity", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> quantity;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "StartDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "CrmConvRate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmConvRate;
    @XmlElementRef(name = "AssetTag", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetTag;
    @XmlElementRef(name = "SerialNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "CrmCorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmCorpCurrencyCode;
    @XmlElementRef(name = "EnteredCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enteredCurrencyCode;
    @XmlElementRef(name = "ExchangeRate", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> exchangeRate;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElementRef(name = "AttributeCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeCategory;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "AssetName", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetName;
    @XmlElementRef(name = "AssetDescription", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetDescription;
    @XmlElementRef(name = "UOMCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomCode;
    @XmlElementRef(name = "ProdGroupId", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prodGroupId;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "OrganizationId")
    protected Long organizationId;
    @XmlElementRef(name = "ItemNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElement(name = "ProdGroupName")
    protected String prodGroupName;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetId(Long value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetNumber(JAXBElement<String> value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the assetOrigSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetOrigSystem() {
        return assetOrigSystem;
    }

    /**
     * Sets the value of the assetOrigSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetOrigSystem(JAXBElement<String> value) {
        this.assetOrigSystem = value;
    }

    /**
     * Gets the value of the assetOrigSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetOrigSystemReference() {
        return assetOrigSystemReference;
    }

    /**
     * Sets the value of the assetOrigSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetOrigSystemReference(JAXBElement<String> value) {
        this.assetOrigSystemReference = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBatchId(JAXBElement<Long> value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the assetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAssetAmount() {
        return assetAmount;
    }

    /**
     * Sets the value of the assetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAssetAmount(JAXBElement<AmountType> value) {
        this.assetAmount = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<Long> value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInstallDate(JAXBElement<XMLGregorianCalendar> value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the interfaceRowId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInterfaceRowId() {
        return interfaceRowId;
    }

    /**
     * Sets the value of the interfaceRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInterfaceRowId(JAXBElement<Long> value) {
        this.interfaceRowId = value;
    }

    /**
     * Gets the value of the inventoryItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryItemId() {
        return inventoryItemId;
    }

    /**
     * Sets the value of the inventoryItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryItemId(JAXBElement<Long> value) {
        this.inventoryItemId = value;
    }

    /**
     * Gets the value of the inventoryOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryOrgId() {
        return inventoryOrgId;
    }

    /**
     * Sets the value of the inventoryOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryOrgId(JAXBElement<Long> value) {
        this.inventoryOrgId = value;
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
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPurchaseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<MeasureType> value) {
        this.quantity = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the crmConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmConvRate() {
        return crmConvRate;
    }

    /**
     * Sets the value of the crmConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmConvRate(JAXBElement<String> value) {
        this.crmConvRate = value;
    }

    /**
     * Gets the value of the assetTag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetTag() {
        return assetTag;
    }

    /**
     * Sets the value of the assetTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetTag(JAXBElement<String> value) {
        this.assetTag = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the crmCorpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmCorpCurrencyCode() {
        return crmCorpCurrencyCode;
    }

    /**
     * Sets the value of the crmCorpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmCorpCurrencyCode(JAXBElement<String> value) {
        this.crmCorpCurrencyCode = value;
    }

    /**
     * Gets the value of the enteredCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnteredCurrencyCode() {
        return enteredCurrencyCode;
    }

    /**
     * Sets the value of the enteredCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnteredCurrencyCode(JAXBElement<String> value) {
        this.enteredCurrencyCode = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<BigDecimal> value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = value;
    }

    /**
     * Gets the value of the attributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * Sets the value of the attributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCategory(JAXBElement<String> value) {
        this.attributeCategory = value;
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
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetName(JAXBElement<String> value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetDescription(JAXBElement<String> value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the uomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMCode() {
        return uomCode;
    }

    /**
     * Sets the value of the uomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMCode(JAXBElement<String> value) {
        this.uomCode = value;
    }

    /**
     * Gets the value of the prodGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProdGroupId() {
        return prodGroupId;
    }

    /**
     * Sets the value of the prodGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProdGroupId(JAXBElement<Long> value) {
        this.prodGroupId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationId(Long value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumber(JAXBElement<String> value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the prodGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdGroupName() {
        return prodGroupName;
    }

    /**
     * Sets the value of the prodGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdGroupName(String value) {
        this.prodGroupName = value;
    }

}
