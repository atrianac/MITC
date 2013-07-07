//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.05 a las 09:47:49 PM COT 
//


package org.movsim.autogen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Inflow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="relative_speed" type="{}nonNegativeDouble" default="0.5" />
 *       &lt;attribute name="relative_gap" type="{}nonNegativeDouble" default="0.5" />
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
    "inflow"
})
@XmlRootElement(name = "SimpleRamp")
public class SimpleRamp
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Inflow")
    protected List<Inflow> inflow;
    @XmlAttribute(name = "relative_speed")
    protected Double relativeSpeed;
    @XmlAttribute(name = "relative_gap")
    protected Double relativeGap;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Gets the value of the inflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inflow }
     * 
     * 
     */
    public List<Inflow> getInflow() {
        if (inflow == null) {
            inflow = new ArrayList<Inflow>();
        }
        return this.inflow;
    }

    public boolean isSetInflow() {
        return ((this.inflow!= null)&&(!this.inflow.isEmpty()));
    }

    public void unsetInflow() {
        this.inflow = null;
    }

    /**
     * Obtiene el valor de la propiedad relativeSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRelativeSpeed() {
        if (relativeSpeed == null) {
            return  0.5D;
        } else {
            return relativeSpeed;
        }
    }

    /**
     * Define el valor de la propiedad relativeSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeSpeed(double value) {
        this.relativeSpeed = value;
    }

    public boolean isSetRelativeSpeed() {
        return (this.relativeSpeed!= null);
    }

    public void unsetRelativeSpeed() {
        this.relativeSpeed = null;
    }

    /**
     * Obtiene el valor de la propiedad relativeGap.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRelativeGap() {
        if (relativeGap == null) {
            return  0.5D;
        } else {
            return relativeGap;
        }
    }

    /**
     * Define el valor de la propiedad relativeGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeGap(double value) {
        this.relativeGap = value;
    }

    public boolean isSetRelativeGap() {
        return (this.relativeGap!= null);
    }

    public void unsetRelativeGap() {
        this.relativeGap = null;
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
