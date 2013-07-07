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
 *       &lt;attribute name="position" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="speed" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="lane" type="{}nonNegativeInteger" default="1" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MicroIC")
public class MicroIC
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "position", required = true)
    protected double position;
    @XmlAttribute(name = "speed", required = true)
    protected double speed;
    @XmlAttribute(name = "lane")
    protected Integer lane;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Obtiene el valor de la propiedad position.
     * 
     */
    public double getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     */
    public void setPosition(double value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad speed.
     * 
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad lane.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLane() {
        if (lane == null) {
            return  1;
        } else {
            return lane;
        }
    }

    /**
     * Define el valor de la propiedad lane.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLane(int value) {
        this.lane = value;
    }

    public boolean isSetLane() {
        return (this.lane!= null);
    }

    public void unsetLane() {
        this.lane = null;
    }

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        if (label == null) {
            return "";
        } else {
            return label;
        }
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    public boolean isSetLabel() {
        return (this.label!= null);
    }

}
