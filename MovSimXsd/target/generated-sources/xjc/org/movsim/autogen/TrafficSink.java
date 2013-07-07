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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}Parking" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="logging" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parking"
})
@XmlRootElement(name = "TrafficSink")
public class TrafficSink
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Parking")
    protected Parking parking;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Obtiene el valor de la propiedad parking.
     * 
     * @return
     *     possible object is
     *     {@link Parking }
     *     
     */
    public Parking getParking() {
        return parking;
    }

    /**
     * Define el valor de la propiedad parking.
     * 
     * @param value
     *     allowed object is
     *     {@link Parking }
     *     
     */
    public void setParking(Parking value) {
        this.parking = value;
    }

    public boolean isSetParking() {
        return (this.parking!= null);
    }

    /**
     * Obtiene el valor de la propiedad logging.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLogging() {
        if (logging == null) {
            return false;
        } else {
            return logging;
        }
    }

    /**
     * Define el valor de la propiedad logging.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogging(boolean value) {
        this.logging = value;
    }

    public boolean isSetLogging() {
        return (this.logging!= null);
    }

    public void unsetLogging() {
        this.logging = null;
    }

}
