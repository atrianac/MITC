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
 *       &lt;attribute name="t" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="q_per_hour" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="v" type="{}nonNegativeDouble" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Inflow")
public class Inflow
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "t", required = true)
    protected double t;
    @XmlAttribute(name = "q_per_hour", required = true)
    protected double qPerHour;
    @XmlAttribute(name = "v")
    protected Double v;

    /**
     * Obtiene el valor de la propiedad t.
     * 
     */
    public double getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     */
    public void setT(double value) {
        this.t = value;
    }

    public boolean isSetT() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad qPerHour.
     * 
     */
    public double getQPerHour() {
        return qPerHour;
    }

    /**
     * Define el valor de la propiedad qPerHour.
     * 
     */
    public void setQPerHour(double value) {
        this.qPerHour = value;
    }

    public boolean isSetQPerHour() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad v.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getV() {
        if (v == null) {
            return  0.0D;
        } else {
            return v;
        }
    }

    /**
     * Define el valor de la propiedad v.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setV(double value) {
        this.v = value;
    }

    public boolean isSetV() {
        return (this.v!= null);
    }

    public void unsetV() {
        this.v = null;
    }

}
