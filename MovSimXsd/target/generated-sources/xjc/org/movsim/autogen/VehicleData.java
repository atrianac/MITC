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
 *       &lt;attribute name="mass" type="{}nonNegativeDouble" default="1500" />
 *       &lt;attribute name="cross_section_surface" type="{}nonNegativeDouble" default="2.2" />
 *       &lt;attribute name="cd_value" type="{}nonNegativeDouble" default="0.32" />
 *       &lt;attribute name="electric_power" type="{}nonNegativeDouble" default="2000" />
 *       &lt;attribute name="const_friction" type="{}nonNegativeDouble" default="0.0145" />
 *       &lt;attribute name="v_friction" type="{}nonNegativeDouble" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleData")
public class VehicleData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "mass")
    protected Double mass;
    @XmlAttribute(name = "cross_section_surface")
    protected Double crossSectionSurface;
    @XmlAttribute(name = "cd_value")
    protected Double cdValue;
    @XmlAttribute(name = "electric_power")
    protected Double electricPower;
    @XmlAttribute(name = "const_friction")
    protected Double constFriction;
    @XmlAttribute(name = "v_friction")
    protected Double vFriction;

    /**
     * Obtiene el valor de la propiedad mass.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMass() {
        if (mass == null) {
            return  1500.0D;
        } else {
            return mass;
        }
    }

    /**
     * Define el valor de la propiedad mass.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMass(double value) {
        this.mass = value;
    }

    public boolean isSetMass() {
        return (this.mass!= null);
    }

    public void unsetMass() {
        this.mass = null;
    }

    /**
     * Obtiene el valor de la propiedad crossSectionSurface.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCrossSectionSurface() {
        if (crossSectionSurface == null) {
            return  2.2D;
        } else {
            return crossSectionSurface;
        }
    }

    /**
     * Define el valor de la propiedad crossSectionSurface.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrossSectionSurface(double value) {
        this.crossSectionSurface = value;
    }

    public boolean isSetCrossSectionSurface() {
        return (this.crossSectionSurface!= null);
    }

    public void unsetCrossSectionSurface() {
        this.crossSectionSurface = null;
    }

    /**
     * Obtiene el valor de la propiedad cdValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCdValue() {
        if (cdValue == null) {
            return  0.32D;
        } else {
            return cdValue;
        }
    }

    /**
     * Define el valor de la propiedad cdValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCdValue(double value) {
        this.cdValue = value;
    }

    public boolean isSetCdValue() {
        return (this.cdValue!= null);
    }

    public void unsetCdValue() {
        this.cdValue = null;
    }

    /**
     * Obtiene el valor de la propiedad electricPower.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getElectricPower() {
        if (electricPower == null) {
            return  2000.0D;
        } else {
            return electricPower;
        }
    }

    /**
     * Define el valor de la propiedad electricPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElectricPower(double value) {
        this.electricPower = value;
    }

    public boolean isSetElectricPower() {
        return (this.electricPower!= null);
    }

    public void unsetElectricPower() {
        this.electricPower = null;
    }

    /**
     * Obtiene el valor de la propiedad constFriction.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getConstFriction() {
        if (constFriction == null) {
            return  0.0145D;
        } else {
            return constFriction;
        }
    }

    /**
     * Define el valor de la propiedad constFriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConstFriction(double value) {
        this.constFriction = value;
    }

    public boolean isSetConstFriction() {
        return (this.constFriction!= null);
    }

    public void unsetConstFriction() {
        this.constFriction = null;
    }

    /**
     * Obtiene el valor de la propiedad vFriction.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getVFriction() {
        if (vFriction == null) {
            return  0.0D;
        } else {
            return vFriction;
        }
    }

    /**
     * Define el valor de la propiedad vFriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVFriction(double value) {
        this.vFriction = value;
    }

    public boolean isSetVFriction() {
        return (this.vFriction!= null);
    }

    public void unsetVFriction() {
        this.vFriction = null;
    }

}
