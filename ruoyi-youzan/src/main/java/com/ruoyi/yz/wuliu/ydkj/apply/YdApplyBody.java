//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.03 at 11:36:21 AM CST 
//


package com.ruoyi.yz.wuliu.ydkj.apply;

import com.ruoyi.yz.base.BaseCif;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
 *         &lt;element ref="{}logistics_id"/>
 *         &lt;element ref="{}customs_id"/>
 *         &lt;element ref="{}logc_reg_cid"/>
 *         &lt;element ref="{}logc_reg_cname"/>
 *         &lt;element ref="{}ec_id"/>
 *         &lt;element ref="{}ec_reg_cid"/>
 *         &lt;element ref="{}ec_reg_cname"/>
 *         &lt;element ref="{}apply_type"/>
 *         &lt;element ref="{}ship_lists"/>
 *         &lt;element ref="{}source_flag"/>
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
    "logisticsId",
    "customsId",
    "logcRegCid",
    "logcRegCname",
    "ecId",
    "ecRegCid",
    "ecRegCname",
    "applyType",
    "ship",
    "sourceFlag"
})
@XmlRootElement(name = "body")
public class YdApplyBody  extends BaseCif{

    @XmlElement(name = "logistics_id", required = true)
    protected String logisticsId;
    @XmlElement(name = "customs_id", required = true)
    protected String customsId;
    @XmlElement(name = "logc_reg_cid", required = true)
    protected String logcRegCid;
    @XmlElement(name = "logc_reg_cname", required = true)
    protected String logcRegCname;
    @XmlElement(name = "ec_id", required = true)
    protected String ecId;
    @XmlElement(name = "ec_reg_cid", required = true)
    protected String ecRegCid;
    @XmlElement(name = "ec_reg_cname", required = true)
    protected String ecRegCname;
    @XmlElement(name = "apply_type", required = true)
    protected String applyType;
    @XmlElementWrapper(name="ship_lists")
    @XmlElement(name="ship", required = true)
    protected List<YdApplyShip> ship;
    @XmlElement(name = "source_flag", required = true)
    protected String sourceFlag;

    /**
     * Gets the value of the logisticsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsId() {
        return logisticsId;
    }

    /**
     * Sets the value of the logisticsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsId(String value) {
        this.logisticsId = value;
    }

    /**
     * Gets the value of the customsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsId() {
        return customsId;
    }

    /**
     * Sets the value of the customsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsId(String value) {
        this.customsId = value;
    }

    /**
     * Gets the value of the logcRegCid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogcRegCid() {
        return logcRegCid;
    }

    /**
     * Sets the value of the logcRegCid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogcRegCid(String value) {
        this.logcRegCid = value;
    }

    /**
     * Gets the value of the logcRegCname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogcRegCname() {
        return logcRegCname;
    }

    /**
     * Sets the value of the logcRegCname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogcRegCname(String value) {
        this.logcRegCname = value;
    }

    /**
     * Gets the value of the ecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcId() {
        return ecId;
    }

    /**
     * Sets the value of the ecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcId(String value) {
        this.ecId = value;
    }

    /**
     * Gets the value of the ecRegCid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcRegCid() {
        return ecRegCid;
    }

    /**
     * Sets the value of the ecRegCid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcRegCid(String value) {
        this.ecRegCid = value;
    }

    /**
     * Gets the value of the ecRegCname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcRegCname() {
        return ecRegCname;
    }

    /**
     * Sets the value of the ecRegCname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcRegCname(String value) {
        this.ecRegCname = value;
    }

    /**
     * Gets the value of the applyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * Sets the value of the applyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyType(String value) {
        this.applyType = value;
    }

    /**
     * Gets the value of the sourceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFlag() {
        return sourceFlag;
    }

    /**
     * Sets the value of the sourceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFlag(String value) {
        this.sourceFlag = value;
    }

    /**
     * Gets the value of the ship property.
     * 
     * @return
     *     possible object is
     *     {@link YdApplyShip }
     *     
     */
    public List<YdApplyShip> getShip() {
        return ship;
    }

    /**
     * Sets the value of the ship property.
     * 
     * @param value
     *     allowed object is
     *     {@link YdApplyShip }
     *     
     */
    public void setShip(List<YdApplyShip> value) {
        this.ship = value;
    }

}
