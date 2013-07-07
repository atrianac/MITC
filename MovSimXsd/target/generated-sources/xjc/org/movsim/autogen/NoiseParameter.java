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
 *       &lt;attribute name="tau" type="{}nonNegativeDouble" default="0" />
 *       &lt;attribute name="fluct_strength" use="required" type="{}nonNegativeDouble" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NoiseParameter")
public class NoiseParameter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "tau")
    protected Double tau;
    @XmlAttribute(name = "fluct_strength", required = true)
    protected double fluctStrength;

    /**
     * Obtiene el valor de la propiedad tau.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTau() {
        if (tau == null) {
            return  0.0D;
        } else {
            return tau;
        }
    }

    /**
     * Define el valor de la propiedad tau.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTau(double value) {
        this.tau = value;
    }

    public boolean isSetTau() {
        return (this.tau!= null);
    }

    public void unsetTau() {
        this.tau = null;
    }

    /**
     * Obtiene el valor de la propiedad fluctStrength.
     * 
     */
    public double getFluctStrength() {
        return fluctStrength;
    }

    /**
     * Define el valor de la propiedad fluctStrength.
     * 
     */
    public void setFluctStrength(double value) {
        this.fluctStrength = value;
    }

    public boolean isSetFluctStrength() {
        return true;
    }

}
