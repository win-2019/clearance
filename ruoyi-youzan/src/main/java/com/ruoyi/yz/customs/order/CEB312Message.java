//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.28 at 10:21:08 PM CST 
//


package com.ruoyi.yz.customs.order;

import com.ruoyi.yz.customs.Message;
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}OrderReturn"/>
 *       &lt;/sequence>
 *       &lt;attribute name="guid" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         namespace="xmlns", 
         propOrder = {"orderReturn"}
)
@XmlRootElement(name = "CEB312Message")
public class CEB312Message  extends Message{

    @XmlElement(name = "OrderReturn", required = true)
    private OrderReturn orderReturn;

    /**
     * Gets the value of the orderReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReturn }
     *     
     */
    public OrderReturn getOrderReturn() {
        return orderReturn;
    }

    /**
     * Sets the value of the orderReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReturn }
     *     
     */
    public void setOrderReturn(OrderReturn value) {
        this.orderReturn = value;
    }
}
