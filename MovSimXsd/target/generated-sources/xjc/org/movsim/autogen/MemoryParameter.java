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
 *       &lt;attribute name="tau" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="alpha_T" use="required" type="{}positiveDouble" />
 *       &lt;attribute name="alpha_v0" use="required" type="{}positiveDouble" />
 *       &lt;attribute name="alpha_a" type="{}positiveDouble" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MemoryParameter")
public class MemoryParameter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "tau", required = true)
    protected double tau;
    @XmlAttribute(name = "alpha_T", required = true)
    protected double alphaT;
    @XmlAttribute(name = "alpha_v0", required = true)
    protected double alphaV0;
    @XmlAttribute(name = "alpha_a")
    protected Double alphaA;

    /**
     * Obtiene el valor de la propiedad tau.
     * 
     */
    public double getTau() {
        return tau;
    }

    /**
     * Define el valor de la propiedad tau.
     * 
     */
    public void setTau(double value) {
        this.tau = value;
    }

    public boolean isSetTau() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad alphaT.
     * 
     */
    public double getAlphaT() {
        return alphaT;
    }

    /**
     * Define el valor de la propiedad alphaT.
     * 
     */
    public void setAlphaT(double value) {
        this.alphaT = value;
    }

    public boolean isSetAlphaT() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad alphaV0.
     * 
     */
    public double getAlphaV0() {
        return alphaV0;
    }

    /**
     * Define el valor de la propiedad alphaV0.
     * 
     */
    public void setAlphaV0(double value) {
        this.alphaV0 = value;
    }

    public boolean isSetAlphaV0() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad alphaA.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlphaA() {
        if (alphaA == null) {
            return  1.0D;
        } else {
            return alphaA;
        }
    }

    /**
     * Define el valor de la propiedad alphaA.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlphaA(double value) {
        this.alphaA = value;
    }

    public boolean isSetAlphaA() {
        return (this.alphaA!= null);
    }

    public void unsetAlphaA() {
        this.alphaA = null;
    }

}
