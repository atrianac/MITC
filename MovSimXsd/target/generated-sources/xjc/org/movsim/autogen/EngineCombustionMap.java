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
 *       &lt;attribute name="max_power_kW" type="{}nonNegativeDouble" default="90" />
 *       &lt;attribute name="cylinder_vol_l" type="{}nonNegativeDouble" default="1.4" />
 *       &lt;attribute name="idle_cons_rate_linvh" type="{}nonNegativeDouble" default="0.6" />
 *       &lt;attribute name="cspec_min_g_per_kwh" type="{}nonNegativeDouble" default="212" />
 *       &lt;attribute name="pe_min_bar" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="pe_max_bar" type="{}nonNegativeDouble" default="19" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EngineCombustionMap")
public class EngineCombustionMap
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "max_power_kW")
    protected Double maxPowerKW;
    @XmlAttribute(name = "cylinder_vol_l")
    protected Double cylinderVolL;
    @XmlAttribute(name = "idle_cons_rate_linvh")
    protected Double idleConsRateLinvh;
    @XmlAttribute(name = "cspec_min_g_per_kwh")
    protected Double cspecMinGPerKwh;
    @XmlAttribute(name = "pe_min_bar")
    protected Double peMinBar;
    @XmlAttribute(name = "pe_max_bar")
    protected Double peMaxBar;

    /**
     * Obtiene el valor de la propiedad maxPowerKW.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMaxPowerKW() {
        if (maxPowerKW == null) {
            return  90.0D;
        } else {
            return maxPowerKW;
        }
    }

    /**
     * Define el valor de la propiedad maxPowerKW.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPowerKW(double value) {
        this.maxPowerKW = value;
    }

    public boolean isSetMaxPowerKW() {
        return (this.maxPowerKW!= null);
    }

    public void unsetMaxPowerKW() {
        this.maxPowerKW = null;
    }

    /**
     * Obtiene el valor de la propiedad cylinderVolL.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCylinderVolL() {
        if (cylinderVolL == null) {
            return  1.4D;
        } else {
            return cylinderVolL;
        }
    }

    /**
     * Define el valor de la propiedad cylinderVolL.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCylinderVolL(double value) {
        this.cylinderVolL = value;
    }

    public boolean isSetCylinderVolL() {
        return (this.cylinderVolL!= null);
    }

    public void unsetCylinderVolL() {
        this.cylinderVolL = null;
    }

    /**
     * Obtiene el valor de la propiedad idleConsRateLinvh.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getIdleConsRateLinvh() {
        if (idleConsRateLinvh == null) {
            return  0.6D;
        } else {
            return idleConsRateLinvh;
        }
    }

    /**
     * Define el valor de la propiedad idleConsRateLinvh.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIdleConsRateLinvh(double value) {
        this.idleConsRateLinvh = value;
    }

    public boolean isSetIdleConsRateLinvh() {
        return (this.idleConsRateLinvh!= null);
    }

    public void unsetIdleConsRateLinvh() {
        this.idleConsRateLinvh = null;
    }

    /**
     * Obtiene el valor de la propiedad cspecMinGPerKwh.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCspecMinGPerKwh() {
        if (cspecMinGPerKwh == null) {
            return  212.0D;
        } else {
            return cspecMinGPerKwh;
        }
    }

    /**
     * Define el valor de la propiedad cspecMinGPerKwh.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCspecMinGPerKwh(double value) {
        this.cspecMinGPerKwh = value;
    }

    public boolean isSetCspecMinGPerKwh() {
        return (this.cspecMinGPerKwh!= null);
    }

    public void unsetCspecMinGPerKwh() {
        this.cspecMinGPerKwh = null;
    }

    /**
     * Obtiene el valor de la propiedad peMinBar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPeMinBar() {
        if (peMinBar == null) {
            return  1.0D;
        } else {
            return peMinBar;
        }
    }

    /**
     * Define el valor de la propiedad peMinBar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeMinBar(double value) {
        this.peMinBar = value;
    }

    public boolean isSetPeMinBar() {
        return (this.peMinBar!= null);
    }

    public void unsetPeMinBar() {
        this.peMinBar = null;
    }

    /**
     * Obtiene el valor de la propiedad peMaxBar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPeMaxBar() {
        if (peMaxBar == null) {
            return  19.0D;
        } else {
            return peMaxBar;
        }
    }

    /**
     * Define el valor de la propiedad peMaxBar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeMaxBar(double value) {
        this.peMaxBar = value;
    }

    public boolean isSetPeMaxBar() {
        return (this.peMaxBar!= null);
    }

    public void unsetPeMaxBar() {
        this.peMaxBar = null;
    }

}
