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
 *         &lt;element ref="{}ModelParameterMOBIL" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="european_rules" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="crit_speed_eur" type="{}nonNegativeDouble" default="25" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelParameterMOBIL"
})
@XmlRootElement(name = "LaneChangeModelType")
public class LaneChangeModelType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ModelParameterMOBIL")
    protected ModelParameterMOBIL modelParameterMOBIL;
    @XmlAttribute(name = "european_rules")
    protected Boolean europeanRules;
    @XmlAttribute(name = "crit_speed_eur")
    protected Double critSpeedEur;

    /**
     * Obtiene el valor de la propiedad modelParameterMOBIL.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterMOBIL }
     *     
     */
    public ModelParameterMOBIL getModelParameterMOBIL() {
        return modelParameterMOBIL;
    }

    /**
     * Define el valor de la propiedad modelParameterMOBIL.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterMOBIL }
     *     
     */
    public void setModelParameterMOBIL(ModelParameterMOBIL value) {
        this.modelParameterMOBIL = value;
    }

    public boolean isSetModelParameterMOBIL() {
        return (this.modelParameterMOBIL!= null);
    }

    /**
     * Obtiene el valor de la propiedad europeanRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEuropeanRules() {
        if (europeanRules == null) {
            return false;
        } else {
            return europeanRules;
        }
    }

    /**
     * Define el valor de la propiedad europeanRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEuropeanRules(boolean value) {
        this.europeanRules = value;
    }

    public boolean isSetEuropeanRules() {
        return (this.europeanRules!= null);
    }

    public void unsetEuropeanRules() {
        this.europeanRules = null;
    }

    /**
     * Obtiene el valor de la propiedad critSpeedEur.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getCritSpeedEur() {
        if (critSpeedEur == null) {
            return  25.0D;
        } else {
            return critSpeedEur;
        }
    }

    /**
     * Define el valor de la propiedad critSpeedEur.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCritSpeedEur(double value) {
        this.critSpeedEur = value;
    }

    public boolean isSetCritSpeedEur() {
        return (this.critSpeedEur!= null);
    }

    public void unsetCritSpeedEur() {
        this.critSpeedEur = null;
    }

}
