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
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fraction" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="relative_v0_randomization" type="{}nonNegativeDouble" default="0.0" />
 *       &lt;attribute name="v0_distribution_type" type="{}DistributionTypeEnum" default="uniform" />
 *       &lt;attribute name="route_label" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleType")
public class VehicleType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "fraction", required = true)
    protected double fraction;
    @XmlAttribute(name = "relative_v0_randomization")
    protected Double relativeV0Randomization;
    @XmlAttribute(name = "v0_distribution_type")
    protected DistributionTypeEnum v0DistributionType;
    @XmlAttribute(name = "route_label")
    protected String routeLabel;

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
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

    /**
     * Obtiene el valor de la propiedad fraction.
     * 
     */
    public double getFraction() {
        return fraction;
    }

    /**
     * Define el valor de la propiedad fraction.
     * 
     */
    public void setFraction(double value) {
        this.fraction = value;
    }

    public boolean isSetFraction() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad relativeV0Randomization.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRelativeV0Randomization() {
        if (relativeV0Randomization == null) {
            return  0.0D;
        } else {
            return relativeV0Randomization;
        }
    }

    /**
     * Define el valor de la propiedad relativeV0Randomization.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeV0Randomization(double value) {
        this.relativeV0Randomization = value;
    }

    public boolean isSetRelativeV0Randomization() {
        return (this.relativeV0Randomization!= null);
    }

    public void unsetRelativeV0Randomization() {
        this.relativeV0Randomization = null;
    }

    /**
     * Obtiene el valor de la propiedad v0DistributionType.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeEnum }
     *     
     */
    public DistributionTypeEnum getV0DistributionType() {
        if (v0DistributionType == null) {
            return DistributionTypeEnum.UNIFORM;
        } else {
            return v0DistributionType;
        }
    }

    /**
     * Define el valor de la propiedad v0DistributionType.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeEnum }
     *     
     */
    public void setV0DistributionType(DistributionTypeEnum value) {
        this.v0DistributionType = value;
    }

    public boolean isSetV0DistributionType() {
        return (this.v0DistributionType!= null);
    }

    /**
     * Obtiene el valor de la propiedad routeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteLabel() {
        if (routeLabel == null) {
            return "";
        } else {
            return routeLabel;
        }
    }

    /**
     * Define el valor de la propiedad routeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteLabel(String value) {
        this.routeLabel = value;
    }

    public boolean isSetRouteLabel() {
        return (this.routeLabel!= null);
    }

}
