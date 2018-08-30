
package com.serene.pdms.ws.stubs.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyUsageAssignmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyUsageAssignmentResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}MethodResult">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyUsageAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyUsageAssignmentResult", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", propOrder = {
    "value"
})
public class PartyUsageAssignmentResult
    extends MethodResult
{

    @XmlElement(name = "Value")
    protected List<PartyUsageAssignment> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyUsageAssignment }
     * 
     * 
     */
    public List<PartyUsageAssignment> getValue() {
        if (value == null) {
            value = new ArrayList<PartyUsageAssignment>();
        }
        return this.value;
    }

}
