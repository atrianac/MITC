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
 *       &lt;attribute name="route" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dt" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="tauEMA" type="{}nonNegativeDouble" default="20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TravelTimes")
public class TravelTimes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "route", required = true)
    protected String route;
    @XmlAttribute(name = "dt")
    protected Double dt;
    @XmlAttribute(name = "tauEMA")
    protected Double tauEMA;

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    public boolean isSetRoute() {
        return (this.route!= null);
    }

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDt() {
        if (dt == null) {
            return  1.0D;
        } else {
            return dt;
        }
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDt(double value) {
        this.dt = value;
    }

    public boolean isSetDt() {
        return (this.dt!= null);
    }

    public void unsetDt() {
        this.dt = null;
    }

    /**
     * Obtiene el valor de la propiedad tauEMA.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTauEMA() {
        if (tauEMA == null) {
            return  20.0D;
        } else {
            return tauEMA;
        }
    }

    /**
     * Define el valor de la propiedad tauEMA.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTauEMA(double value) {
        this.tauEMA = value;
    }

    public boolean isSetTauEMA() {
        return (this.tauEMA!= null);
    }

    public void unsetTauEMA() {
        this.tauEMA = null;
    }

}
