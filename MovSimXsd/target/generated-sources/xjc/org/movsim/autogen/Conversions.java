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
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="speed" type="{}positiveDouble" default="1" />
 *       &lt;attribute name="acceleration" type="{}positiveDouble" default="1" />
 *       &lt;attribute name="gradient" type="{}positiveDouble" default="1" />
 *       &lt;attribute name="position" type="{}positiveDouble" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Conversions")
public class Conversions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "time")
    protected String time;
    @XmlAttribute(name = "speed")
    protected Double speed;
    @XmlAttribute(name = "acceleration")
    protected Double acceleration;
    @XmlAttribute(name = "gradient")
    protected Double gradient;
    @XmlAttribute(name = "position")
    protected Double position;

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        if (time == null) {
            return "";
        } else {
            return time;
        }
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    public boolean isSetTime() {
        return (this.time!= null);
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSpeed() {
        if (speed == null) {
            return  1.0D;
        } else {
            return speed;
        }
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    public void unsetSpeed() {
        this.speed = null;
    }

    /**
     * Obtiene el valor de la propiedad acceleration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAcceleration() {
        if (acceleration == null) {
            return  1.0D;
        } else {
            return acceleration;
        }
    }

    /**
     * Define el valor de la propiedad acceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAcceleration(double value) {
        this.acceleration = value;
    }

    public boolean isSetAcceleration() {
        return (this.acceleration!= null);
    }

    public void unsetAcceleration() {
        this.acceleration = null;
    }

    /**
     * Obtiene el valor de la propiedad gradient.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getGradient() {
        if (gradient == null) {
            return  1.0D;
        } else {
            return gradient;
        }
    }

    /**
     * Define el valor de la propiedad gradient.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGradient(double value) {
        this.gradient = value;
    }

    public boolean isSetGradient() {
        return (this.gradient!= null);
    }

    public void unsetGradient() {
        this.gradient = null;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPosition() {
        if (position == null) {
            return  1.0D;
        } else {
            return position;
        }
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPosition(double value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    public void unsetPosition() {
        this.position = null;
    }

}
