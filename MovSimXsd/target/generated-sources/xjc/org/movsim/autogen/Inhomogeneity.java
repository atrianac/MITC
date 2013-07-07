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
 *       &lt;attribute name="alpha_T" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="alpha_v0" type="{}nonNegativeDouble" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Inhomogeneity")
public class Inhomogeneity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "position", required = true)
    protected double position;
    @XmlAttribute(name = "alpha_T")
    protected Double alphaT;
    @XmlAttribute(name = "alpha_v0")
    protected Double alphaV0;

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
     * Obtiene el valor de la propiedad alphaT.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlphaT() {
        if (alphaT == null) {
            return  1.0D;
        } else {
            return alphaT;
        }
    }

    /**
     * Define el valor de la propiedad alphaT.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlphaT(double value) {
        this.alphaT = value;
    }

    public boolean isSetAlphaT() {
        return (this.alphaT!= null);
    }

    public void unsetAlphaT() {
        this.alphaT = null;
    }

    /**
     * Obtiene el valor de la propiedad alphaV0.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlphaV0() {
        if (alphaV0 == null) {
            return  1.0D;
        } else {
            return alphaV0;
        }
    }

    /**
     * Define el valor de la propiedad alphaV0.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlphaV0(double value) {
        this.alphaV0 = value;
    }

    public boolean isSetAlphaV0() {
        return (this.alphaV0 != null);
    }

    public void unsetAlphaV0() {
        this.alphaV0 = null;
    }

}
