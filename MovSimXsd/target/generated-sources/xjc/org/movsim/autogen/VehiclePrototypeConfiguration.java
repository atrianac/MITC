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
 *         &lt;element ref="{}AccelerationModelType"/>
 *         &lt;element ref="{}LaneChangeModelType" minOccurs="0"/>
 *         &lt;element ref="{}MemoryParameter" minOccurs="0"/>
 *         &lt;element ref="{}NoiseParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="width" type="{}nonNegativeDouble" default="4.4" />
 *       &lt;attribute name="maximum_deceleration" type="{}nonNegativeDouble" default="10000" />
 *       &lt;attribute name="consumption_model_name" type="{http://www.w3.org/2001/XMLSchema}string" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accelerationModelType",
    "laneChangeModelType",
    "memoryParameter",
    "noiseParameter"
})
@XmlRootElement(name = "VehiclePrototypeConfiguration")
public class VehiclePrototypeConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccelerationModelType", required = true)
    protected AccelerationModelType accelerationModelType;
    @XmlElement(name = "LaneChangeModelType")
    protected LaneChangeModelType laneChangeModelType;
    @XmlElement(name = "MemoryParameter")
    protected MemoryParameter memoryParameter;
    @XmlElement(name = "NoiseParameter")
    protected NoiseParameter noiseParameter;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "length", required = true)
    protected double length;
    @XmlAttribute(name = "width")
    protected Double width;
    @XmlAttribute(name = "maximum_deceleration")
    protected Double maximumDeceleration;
    @XmlAttribute(name = "consumption_model_name")
    protected String consumptionModelName;

    /**
     * Obtiene el valor de la propiedad accelerationModelType.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationModelType }
     *     
     */
    public AccelerationModelType getAccelerationModelType() {
        return accelerationModelType;
    }

    /**
     * Define el valor de la propiedad accelerationModelType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationModelType }
     *     
     */
    public void setAccelerationModelType(AccelerationModelType value) {
        this.accelerationModelType = value;
    }

    public boolean isSetAccelerationModelType() {
        return (this.accelerationModelType!= null);
    }

    /**
     * Obtiene el valor de la propiedad laneChangeModelType.
     * 
     * @return
     *     possible object is
     *     {@link LaneChangeModelType }
     *     
     */
    public LaneChangeModelType getLaneChangeModelType() {
        return laneChangeModelType;
    }

    /**
     * Define el valor de la propiedad laneChangeModelType.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneChangeModelType }
     *     
     */
    public void setLaneChangeModelType(LaneChangeModelType value) {
        this.laneChangeModelType = value;
    }

    public boolean isSetLaneChangeModelType() {
        return (this.laneChangeModelType!= null);
    }

    /**
     * Obtiene el valor de la propiedad memoryParameter.
     * 
     * @return
     *     possible object is
     *     {@link MemoryParameter }
     *     
     */
    public MemoryParameter getMemoryParameter() {
        return memoryParameter;
    }

    /**
     * Define el valor de la propiedad memoryParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryParameter }
     *     
     */
    public void setMemoryParameter(MemoryParameter value) {
        this.memoryParameter = value;
    }

    public boolean isSetMemoryParameter() {
        return (this.memoryParameter!= null);
    }

    /**
     * Obtiene el valor de la propiedad noiseParameter.
     * 
     * @return
     *     possible object is
     *     {@link NoiseParameter }
     *     
     */
    public NoiseParameter getNoiseParameter() {
        return noiseParameter;
    }

    /**
     * Define el valor de la propiedad noiseParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseParameter }
     *     
     */
    public void setNoiseParameter(NoiseParameter value) {
        this.noiseParameter = value;
    }

    public boolean isSetNoiseParameter() {
        return (this.noiseParameter!= null);
    }

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
     * Obtiene el valor de la propiedad length.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWidth() {
        if (width == null) {
            return  4.4D;
        } else {
            return width;
        }
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(double value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    public void unsetWidth() {
        this.width = null;
    }

    /**
     * Obtiene el valor de la propiedad maximumDeceleration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMaximumDeceleration() {
        if (maximumDeceleration == null) {
            return  10000.0D;
        } else {
            return maximumDeceleration;
        }
    }

    /**
     * Define el valor de la propiedad maximumDeceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumDeceleration(double value) {
        this.maximumDeceleration = value;
    }

    public boolean isSetMaximumDeceleration() {
        return (this.maximumDeceleration!= null);
    }

    public void unsetMaximumDeceleration() {
        this.maximumDeceleration = null;
    }

    /**
     * Obtiene el valor de la propiedad consumptionModelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionModelName() {
        if (consumptionModelName == null) {
            return "none";
        } else {
            return consumptionModelName;
        }
    }

    /**
     * Define el valor de la propiedad consumptionModelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionModelName(String value) {
        this.consumptionModelName = value;
    }

    public boolean isSetConsumptionModelName() {
        return (this.consumptionModelName!= null);
    }

}
