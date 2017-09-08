
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dealerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dealerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recentpo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pos" type="{}posType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dealerid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealerType", propOrder = {
    "recentpo",
    "pos"
})
public class DealerType {

    @XmlElement(required = true)
    protected String recentpo;
    @XmlElement(required = true)
    protected PosType pos;
    @XmlAttribute(name = "dealerid")
    protected String dealerid;

    /**
     * Gets the value of the recentpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentpo() {
        return recentpo;
    }

    /**
     * Sets the value of the recentpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentpo(String value) {
        this.recentpo = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link PosType }
     *     
     */
    public PosType getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosType }
     *     
     */
    public void setPos(PosType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the dealerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerid() {
        return dealerid;
    }

    /**
     * Sets the value of the dealerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerid(String value) {
        this.dealerid = value;
    }

}
