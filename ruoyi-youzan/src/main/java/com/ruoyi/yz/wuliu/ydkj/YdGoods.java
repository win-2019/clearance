//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.18 at 02:35:10 PM CST 
//
package com.ruoyi.yz.wuliu.ydkj;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}specificationType"/>
 *         &lt;element ref="{}brand"/>
 *         &lt;element ref="{}hs_code"/>
 *         &lt;element ref="{}unit_price"/>
 *         &lt;element ref="{}act_weight"/>
 *         &lt;element ref="{}dim_weight"/>
 *         &lt;element ref="{}quantity"/>
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
    "name",
    "specificationType",
    "brand",
    "hsCode",
    "unitPrice",
    "actWeight",
    "dimWeight",
    "quantity"
})
@XmlRootElement(name = "goods")
public class YdGoods {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String specificationType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String brand;
    @XmlElement(name = "hs_code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hsCode;
    @XmlElement(name = "unit_price", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "act_weight", required = true)
    protected BigDecimal actWeight;
    @XmlElement(name = "dim_weight", required = true)
    protected BigDecimal dimWeight;
    @XmlElement(required = true)
    protected int quantity;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the specificationType property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSpecificationType() {
        return specificationType;
    }

    /**
     * Sets the value of the specificationType property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSpecificationType(String value) {
        this.specificationType = value;
    }

    /**
     * Gets the value of the brand property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the hsCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * Sets the value of the hsCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    /**
     * Gets the value of the unitPrice property.
     *
     * @return possible object is {@link String }
     *
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the actWeight property.
     *
     * @return possible object is {@link String }
     *
     */
    public BigDecimal getActWeight() {
        return actWeight;
    }

    /**
     * Sets the value of the actWeight property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActWeight(BigDecimal value) {
        this.actWeight = value;
    }

    /**
     * Gets the value of the dimWeight property.
     *
     * @return possible object is {@link String }
     *
     */
    public BigDecimal getDimWeight() {
        return dimWeight;
    }

    /**
     * Sets the value of the dimWeight property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDimWeight(BigDecimal value) {
        this.dimWeight = value;
    }

    /**
     * Gets the value of the quantity property.
     *
     * @return possible object is {@link String }
     *
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
