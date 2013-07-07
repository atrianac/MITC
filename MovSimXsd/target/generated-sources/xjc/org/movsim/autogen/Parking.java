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
 *       &lt;attribute name="source_road_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time_delay" type="{}positiveDouble" default="60" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Parking")
public class Parking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "source_road_id", required = true)
    protected String sourceRoadId;
    @XmlAttribute(name = "time_delay")
    protected Double timeDelay;

    /**
     * Obtiene el valor de la propiedad sourceRoadId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRoadId() {
        return sourceRoadId;
    }

    /**
     * Define el valor de la propiedad sourceRoadId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRoadId(String value) {
        this.sourceRoadId = value;
    }

    public boolean isSetSourceRoadId() {
        return (this.sourceRoadId!= null);
    }

    /**
     * Obtiene el valor de la propiedad timeDelay.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTimeDelay() {
        if (timeDelay == null) {
            return  60.0D;
        } else {
            return timeDelay;
        }
    }

    /**
     * Define el valor de la propiedad timeDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeDelay(double value) {
        this.timeDelay = value;
    }

    public boolean isSetTimeDelay() {
        return (this.timeDelay!= null);
    }

    public void unsetTimeDelay() {
        this.timeDelay = null;
    }

}
