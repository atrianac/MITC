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
 *       &lt;attribute name="density_per_km" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="speed" type="{}nonNegativeDouble" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MacroIC")
public class MacroIC
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "position", required = true)
    protected double position;
    @XmlAttribute(name = "density_per_km", required = true)
    protected double densityPerKm;
    @XmlAttribute(name = "speed")
    protected Double speed;

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
     * Obtiene el valor de la propiedad densityPerKm.
     * 
     */
    public double getDensityPerKm() {
        return densityPerKm;
    }

    /**
     * Define el valor de la propiedad densityPerKm.
     * 
     */
    public void setDensityPerKm(double value) {
        this.densityPerKm = value;
    }

    public boolean isSetDensityPerKm() {
        return true;
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
        return speed;
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

}
