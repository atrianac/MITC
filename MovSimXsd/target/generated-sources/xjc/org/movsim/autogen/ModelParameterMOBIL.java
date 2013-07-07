//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.05 a las 09:47:49 PM COT 
//


package org.movsim.autogen;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="safe_deceleration" type="{}nonNegativeDouble" default="4.0" />
 *       &lt;attribute name="minimum_gap" type="{}nonNegativeDouble" default="2.0" />
 *       &lt;attribute name="threshold_acceleration" type="{http://www.w3.org/2001/XMLSchema}double" default="0.2" />
 *       &lt;attribute name="right_bias_acceleration" type="{http://www.w3.org/2001/XMLSchema}double" default="0.25" />
 *       &lt;attribute name="politeness" type="{http://www.w3.org/2001/XMLSchema}double" default="0.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterMOBIL")
public class ModelParameterMOBIL
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "safe_deceleration")
    protected Double safeDeceleration;
    @XmlAttribute(name = "minimum_gap")
    protected Double minimumGap;
    @XmlAttribute(name = "threshold_acceleration")
    protected Double thresholdAcceleration;
    @XmlAttribute(name = "right_bias_acceleration")
    protected Double rightBiasAcceleration;
    @XmlAttribute(name = "politeness")
    protected Double politeness;

    /**
     * Obtiene el valor de la propiedad safeDeceleration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSafeDeceleration() {
        if (safeDeceleration == null) {
            return  4.0D;
        } else {
            return safeDeceleration;
        }
    }

    /**
     * Define el valor de la propiedad safeDeceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSafeDeceleration(double value) {
        this.safeDeceleration = value;
    }

    public boolean isSetSafeDeceleration() {
        return (this.safeDeceleration!= null);
    }

    public void unsetSafeDeceleration() {
        this.safeDeceleration = null;
    }

    /**
     * Obtiene el valor de la propiedad minimumGap.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumGap() {
        if (minimumGap == null) {
            return  2.0D;
        } else {
            return minimumGap;
        }
    }

    /**
     * Define el valor de la propiedad minimumGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumGap(double value) {
        this.minimumGap = value;
    }

    public boolean isSetMinimumGap() {
        return (this.minimumGap!= null);
    }

    public void unsetMinimumGap() {
        this.minimumGap = null;
    }

    /**
     * Obtiene el valor de la propiedad thresholdAcceleration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getThresholdAcceleration() {
        if (thresholdAcceleration == null) {
            return  0.2D;
        } else {
            return thresholdAcceleration;
        }
    }

    /**
     * Define el valor de la propiedad thresholdAcceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThresholdAcceleration(double value) {
        this.thresholdAcceleration = value;
    }

    public boolean isSetThresholdAcceleration() {
        return (this.thresholdAcceleration!= null);
    }

    public void unsetThresholdAcceleration() {
        this.thresholdAcceleration = null;
    }

    /**
     * Obtiene el valor de la propiedad rightBiasAcceleration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRightBiasAcceleration() {
        if (rightBiasAcceleration == null) {
            return  0.25D;
        } else {
            return rightBiasAcceleration;
        }
    }

    /**
     * Define el valor de la propiedad rightBiasAcceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRightBiasAcceleration(double value) {
        this.rightBiasAcceleration = value;
    }

    public boolean isSetRightBiasAcceleration() {
        return (this.rightBiasAcceleration!= null);
    }

    public void unsetRightBiasAcceleration() {
        this.rightBiasAcceleration = null;
    }

    /**
     * Obtiene el valor de la propiedad politeness.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPoliteness() {
        if (politeness == null) {
            return  0.1D;
        } else {
            return politeness;
        }
    }

    /**
     * Define el valor de la propiedad politeness.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoliteness(double value) {
        this.politeness = value;
    }

    public boolean isSetPoliteness() {
        return (this.politeness!= null);
    }

    public void unsetPoliteness() {
        this.politeness = null;
    }

}
