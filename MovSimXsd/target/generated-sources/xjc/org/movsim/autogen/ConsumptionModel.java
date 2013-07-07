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
 *         &lt;element ref="{}VehicleData"/>
 *         &lt;choice>
 *           &lt;element ref="{}EngineCombustionMap"/>
 *           &lt;element ref="{}EngineConstantMap"/>
 *         &lt;/choice>
 *         &lt;element ref="{}RotationModel"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="output" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleData",
    "engineCombustionMap",
    "engineConstantMap",
    "rotationModel"
})
@XmlRootElement(name = "ConsumptionModel")
public class ConsumptionModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleData", required = true)
    protected VehicleData vehicleData;
    @XmlElement(name = "EngineCombustionMap")
    protected EngineCombustionMap engineCombustionMap;
    @XmlElement(name = "EngineConstantMap")
    protected EngineConstantMap engineConstantMap;
    @XmlElement(name = "RotationModel", required = true)
    protected RotationModel rotationModel;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "output")
    protected Boolean output;

    /**
     * Obtiene el valor de la propiedad vehicleData.
     * 
     * @return
     *     possible object is
     *     {@link VehicleData }
     *     
     */
    public VehicleData getVehicleData() {
        return vehicleData;
    }

    /**
     * Define el valor de la propiedad vehicleData.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleData }
     *     
     */
    public void setVehicleData(VehicleData value) {
        this.vehicleData = value;
    }

    public boolean isSetVehicleData() {
        return (this.vehicleData!= null);
    }

    /**
     * Obtiene el valor de la propiedad engineCombustionMap.
     * 
     * @return
     *     possible object is
     *     {@link EngineCombustionMap }
     *     
     */
    public EngineCombustionMap getEngineCombustionMap() {
        return engineCombustionMap;
    }

    /**
     * Define el valor de la propiedad engineCombustionMap.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineCombustionMap }
     *     
     */
    public void setEngineCombustionMap(EngineCombustionMap value) {
        this.engineCombustionMap = value;
    }

    public boolean isSetEngineCombustionMap() {
        return (this.engineCombustionMap!= null);
    }

    /**
     * Obtiene el valor de la propiedad engineConstantMap.
     * 
     * @return
     *     possible object is
     *     {@link EngineConstantMap }
     *     
     */
    public EngineConstantMap getEngineConstantMap() {
        return engineConstantMap;
    }

    /**
     * Define el valor de la propiedad engineConstantMap.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineConstantMap }
     *     
     */
    public void setEngineConstantMap(EngineConstantMap value) {
        this.engineConstantMap = value;
    }

    public boolean isSetEngineConstantMap() {
        return (this.engineConstantMap!= null);
    }

    /**
     * Obtiene el valor de la propiedad rotationModel.
     * 
     * @return
     *     possible object is
     *     {@link RotationModel }
     *     
     */
    public RotationModel getRotationModel() {
        return rotationModel;
    }

    /**
     * Define el valor de la propiedad rotationModel.
     * 
     * @param value
     *     allowed object is
     *     {@link RotationModel }
     *     
     */
    public void setRotationModel(RotationModel value) {
        this.rotationModel = value;
    }

    public boolean isSetRotationModel() {
        return (this.rotationModel!= null);
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
     * Obtiene el valor de la propiedad output.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOutput() {
        if (output == null) {
            return false;
        } else {
            return output;
        }
    }

    /**
     * Define el valor de la propiedad output.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutput(boolean value) {
        this.output = value;
    }

    public boolean isSetOutput() {
        return (this.output!= null);
    }

    public void unsetOutput() {
        this.output = null;
    }

}
