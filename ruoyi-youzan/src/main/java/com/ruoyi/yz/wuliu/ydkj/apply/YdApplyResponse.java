//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.03 at 11:41:06 AM CST 
//


package com.ruoyi.yz.wuliu.ydkj.apply;

import com.ruoyi.yz.base.BaseCif;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}client_ship"/>
 *         &lt;element ref="{}code"/>
 *         &lt;element ref="{}msg"/>
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
    "clientShip",
    "code",
    "msg"
})
@XmlRootElement(name = "response")
public class YdApplyResponse extends BaseCif{

    @XmlElement(name = "client_ship", required = true)
    protected String clientShip;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String msg;

    /**
     * Gets the value of the clientShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientShip() {
        return clientShip;
    }

    /**
     * Sets the value of the clientShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientShip(String value) {
        this.clientShip = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

}
