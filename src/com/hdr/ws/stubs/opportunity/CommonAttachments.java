
package com.hdr.ws.stubs.opportunity;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonAttachments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonAttachments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachedDocumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pk1Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pk2Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pk3Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pk4Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pk5Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatatypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmNode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DmFolderPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmRepository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownloadStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionControlIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadedFileContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadedFileLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UploadedFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadedFile" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonAttachments", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", propOrder = {
    "attachedDocumentId",
    "tableName",
    "entityName",
    "pk1Value",
    "pk2Value",
    "pk3Value",
    "pk4Value",
    "pk5Value",
    "datatypeCode",
    "description",
    "fileName",
    "usageType",
    "dmNode",
    "dmFolderPath",
    "dmType",
    "dmVersionNumber",
    "url",
    "title",
    "attachment",
    "entityAttributes",
    "dmRepository",
    "documentAttributes",
    "downloadStatus",
    "documentEntityId",
    "categoryName",
    "versionControlIcon",
    "fileURL",
    "uploadedText",
    "uploadedFileContentType",
    "uploadedFileLength",
    "uploadedFileName",
    "uploadedFile"
})
public class CommonAttachments {

    @XmlElementRef(name = "AttachedDocumentId", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> attachedDocumentId;
    @XmlElementRef(name = "TableName", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableName;
    @XmlElementRef(name = "EntityName", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElementRef(name = "Pk1Value", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pk1Value;
    @XmlElementRef(name = "Pk2Value", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pk2Value;
    @XmlElementRef(name = "Pk3Value", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pk3Value;
    @XmlElementRef(name = "Pk4Value", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pk4Value;
    @XmlElementRef(name = "Pk5Value", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pk5Value;
    @XmlElementRef(name = "DatatypeCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datatypeCode;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "FileName", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "UsageType", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usageType;
    @XmlElementRef(name = "DmNode", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dmNode;
    @XmlElementRef(name = "DmFolderPath", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmFolderPath;
    @XmlElementRef(name = "DmType", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmType;
    @XmlElementRef(name = "DmVersionNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmVersionNumber;
    @XmlElementRef(name = "URL", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Attachment", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachment;
    @XmlElementRef(name = "EntityAttributes", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityAttributes;
    @XmlElementRef(name = "DmRepository", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmRepository;
    @XmlElementRef(name = "DocumentAttributes", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentAttributes;
    @XmlElementRef(name = "DownloadStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downloadStatus;
    @XmlElementRef(name = "DocumentEntityId", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> documentEntityId;
    @XmlElementRef(name = "CategoryName", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryName;
    @XmlElementRef(name = "VersionControlIcon", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionControlIcon;
    @XmlElementRef(name = "FileURL", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileURL;
    @XmlElementRef(name = "UploadedText", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadedText;
    @XmlElementRef(name = "UploadedFileContentType", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadedFileContentType;
    @XmlElementRef(name = "UploadedFileLength", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> uploadedFileLength;
    @XmlElementRef(name = "UploadedFileName", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadedFileName;
    @XmlElementRef(name = "UploadedFile", namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> uploadedFile;

    /**
     * Gets the value of the attachedDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAttachedDocumentId() {
        return attachedDocumentId;
    }

    /**
     * Sets the value of the attachedDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAttachedDocumentId(JAXBElement<Long> value) {
        this.attachedDocumentId = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableName(JAXBElement<String> value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the pk1Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPk1Value() {
        return pk1Value;
    }

    /**
     * Sets the value of the pk1Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPk1Value(JAXBElement<String> value) {
        this.pk1Value = value;
    }

    /**
     * Gets the value of the pk2Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPk2Value() {
        return pk2Value;
    }

    /**
     * Sets the value of the pk2Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPk2Value(JAXBElement<String> value) {
        this.pk2Value = value;
    }

    /**
     * Gets the value of the pk3Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPk3Value() {
        return pk3Value;
    }

    /**
     * Sets the value of the pk3Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPk3Value(JAXBElement<String> value) {
        this.pk3Value = value;
    }

    /**
     * Gets the value of the pk4Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPk4Value() {
        return pk4Value;
    }

    /**
     * Sets the value of the pk4Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPk4Value(JAXBElement<String> value) {
        this.pk4Value = value;
    }

    /**
     * Gets the value of the pk5Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPk5Value() {
        return pk5Value;
    }

    /**
     * Sets the value of the pk5Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPk5Value(JAXBElement<String> value) {
        this.pk5Value = value;
    }

    /**
     * Gets the value of the datatypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatatypeCode() {
        return datatypeCode;
    }

    /**
     * Sets the value of the datatypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatatypeCode(JAXBElement<String> value) {
        this.datatypeCode = value;
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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsageType(JAXBElement<String> value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the dmNode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDmNode() {
        return dmNode;
    }

    /**
     * Sets the value of the dmNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDmNode(JAXBElement<BigDecimal> value) {
        this.dmNode = value;
    }

    /**
     * Gets the value of the dmFolderPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmFolderPath() {
        return dmFolderPath;
    }

    /**
     * Sets the value of the dmFolderPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmFolderPath(JAXBElement<String> value) {
        this.dmFolderPath = value;
    }

    /**
     * Gets the value of the dmType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmType() {
        return dmType;
    }

    /**
     * Sets the value of the dmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmType(JAXBElement<String> value) {
        this.dmType = value;
    }

    /**
     * Gets the value of the dmVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmVersionNumber() {
        return dmVersionNumber;
    }

    /**
     * Sets the value of the dmVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmVersionNumber(JAXBElement<String> value) {
        this.dmVersionNumber = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachment(JAXBElement<String> value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the entityAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityAttributes() {
        return entityAttributes;
    }

    /**
     * Sets the value of the entityAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityAttributes(JAXBElement<String> value) {
        this.entityAttributes = value;
    }

    /**
     * Gets the value of the dmRepository property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmRepository() {
        return dmRepository;
    }

    /**
     * Sets the value of the dmRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmRepository(JAXBElement<String> value) {
        this.dmRepository = value;
    }

    /**
     * Gets the value of the documentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * Sets the value of the documentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentAttributes(JAXBElement<String> value) {
        this.documentAttributes = value;
    }

    /**
     * Gets the value of the downloadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownloadStatus() {
        return downloadStatus;
    }

    /**
     * Sets the value of the downloadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownloadStatus(JAXBElement<String> value) {
        this.downloadStatus = value;
    }

    /**
     * Gets the value of the documentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDocumentEntityId() {
        return documentEntityId;
    }

    /**
     * Sets the value of the documentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDocumentEntityId(JAXBElement<Long> value) {
        this.documentEntityId = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryName(JAXBElement<String> value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the versionControlIcon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionControlIcon() {
        return versionControlIcon;
    }

    /**
     * Sets the value of the versionControlIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionControlIcon(JAXBElement<String> value) {
        this.versionControlIcon = value;
    }

    /**
     * Gets the value of the fileURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileURL() {
        return fileURL;
    }

    /**
     * Sets the value of the fileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileURL(JAXBElement<String> value) {
        this.fileURL = value;
    }

    /**
     * Gets the value of the uploadedText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadedText() {
        return uploadedText;
    }

    /**
     * Sets the value of the uploadedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadedText(JAXBElement<String> value) {
        this.uploadedText = value;
    }

    /**
     * Gets the value of the uploadedFileContentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadedFileContentType() {
        return uploadedFileContentType;
    }

    /**
     * Sets the value of the uploadedFileContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadedFileContentType(JAXBElement<String> value) {
        this.uploadedFileContentType = value;
    }

    /**
     * Gets the value of the uploadedFileLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUploadedFileLength() {
        return uploadedFileLength;
    }

    /**
     * Sets the value of the uploadedFileLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUploadedFileLength(JAXBElement<Long> value) {
        this.uploadedFileLength = value;
    }

    /**
     * Gets the value of the uploadedFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadedFileName() {
        return uploadedFileName;
    }

    /**
     * Sets the value of the uploadedFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadedFileName(JAXBElement<String> value) {
        this.uploadedFileName = value;
    }

    /**
     * Gets the value of the uploadedFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getUploadedFile() {
        return uploadedFile;
    }

    /**
     * Sets the value of the uploadedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setUploadedFile(JAXBElement<byte[]> value) {
        this.uploadedFile = value;
    }

}
