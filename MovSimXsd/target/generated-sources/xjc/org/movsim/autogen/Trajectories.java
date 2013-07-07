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
 *       &lt;attribute name="dt" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="start_time" type="{}nonNegativeDouble" />
 *       &lt;attribute name="end_time" type="{}nonNegativeDouble" />
 *       &lt;attribute name="route" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="random_fraction" type="{}probability" />
 *       &lt;attribute name="offset_position" type="{}nonNegativeDouble" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Trajectories")
public class Trajectories
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "dt")
    protected Double dt;
    @XmlAttribute(name = "start_time")
    protected Double startTime;
    @XmlAttribute(name = "end_time")
    protected Double endTime;
    @XmlAttribute(name = "route", required = true)
    protected String route;
    @XmlAttribute(name = "random_fraction")
    protected Double randomFraction;
    @XmlAttribute(name = "offset_position")
    protected Double offsetPosition;

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
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartTime(double value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    public void unsetStartTime() {
        this.startTime = null;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndTime(double value) {
        this.endTime = value;
    }

    public boolean isSetEndTime() {
        return (this.endTime!= null);
    }

    public void unsetEndTime() {
        this.endTime = null;
    }

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
     * Obtiene el valor de la propiedad randomFraction.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRandomFraction() {
        return randomFraction;
    }

    /**
     * Define el valor de la propiedad randomFraction.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRandomFraction(double value) {
        this.randomFraction = value;
    }

    public boolean isSetRandomFraction() {
        return (this.randomFraction!= null);
    }

    public void unsetRandomFraction() {
        this.randomFraction = null;
    }

    /**
     * Obtiene el valor de la propiedad offsetPosition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getOffsetPosition() {
        if (offsetPosition == null) {
            return  0.0D;
        } else {
            return offsetPosition;
        }
    }

    /**
     * Define el valor de la propiedad offsetPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetPosition(double value) {
        this.offsetPosition = value;
    }

    public boolean isSetOffsetPosition() {
        return (this.offsetPosition!= null);
    }

    public void unsetOffsetPosition() {
        this.offsetPosition = null;
    }

}
