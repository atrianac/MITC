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
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="acceleration" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="gradient" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Columns")
public class Columns
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "time", required = true)
    protected int time;
    @XmlAttribute(name = "speed")
    protected Integer speed;
    @XmlAttribute(name = "acceleration")
    protected Integer acceleration;
    @XmlAttribute(name = "gradient")
    protected Integer gradient;
    @XmlAttribute(name = "position")
    protected Integer position;

    /**
     * Obtiene el valor de la propiedad time.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    public boolean isSetTime() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpeed() {
        if (speed == null) {
            return -1;
        } else {
            return speed;
        }
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(int value) {
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
     *     {@link Integer }
     *     
     */
    public int getAcceleration() {
        if (acceleration == null) {
            return -1;
        } else {
            return acceleration;
        }
    }

    /**
     * Define el valor de la propiedad acceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceleration(int value) {
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
     *     {@link Integer }
     *     
     */
    public int getGradient() {
        if (gradient == null) {
            return -1;
        } else {
            return gradient;
        }
    }

    /**
     * Define el valor de la propiedad gradient.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradient(int value) {
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
     *     {@link Integer }
     *     
     */
    public int getPosition() {
        if (position == null) {
            return -1;
        } else {
            return position;
        }
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(int value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    public void unsetPosition() {
        this.position = null;
    }

}
