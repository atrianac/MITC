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
 *         &lt;element ref="{}Consumption" minOccurs="0"/>
 *         &lt;element ref="{}VehiclePrototypes" minOccurs="0"/>
 *         &lt;element ref="{}Scenario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consumption",
    "vehiclePrototypes",
    "scenario"
})
@XmlRootElement(name = "Movsim")
public class Movsim
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Consumption")
    protected Consumption consumption;
    @XmlElement(name = "VehiclePrototypes")
    protected VehiclePrototypes vehiclePrototypes;
    @XmlElement(name = "Scenario")
    protected Scenario scenario;

    /**
     * Obtiene el valor de la propiedad consumption.
     * 
     * @return
     *     possible object is
     *     {@link Consumption }
     *     
     */
    public Consumption getConsumption() {
        return consumption;
    }

    /**
     * Define el valor de la propiedad consumption.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumption }
     *     
     */
    public void setConsumption(Consumption value) {
        this.consumption = value;
    }

    public boolean isSetConsumption() {
        return (this.consumption!= null);
    }

    /**
     * Obtiene el valor de la propiedad vehiclePrototypes.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrototypes }
     *     
     */
    public VehiclePrototypes getVehiclePrototypes() {
        return vehiclePrototypes;
    }

    /**
     * Define el valor de la propiedad vehiclePrototypes.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrototypes }
     *     
     */
    public void setVehiclePrototypes(VehiclePrototypes value) {
        this.vehiclePrototypes = value;
    }

    public boolean isSetVehiclePrototypes() {
        return (this.vehiclePrototypes!= null);
    }

    /**
     * Obtiene el valor de la propiedad scenario.
     * 
     * @return
     *     possible object is
     *     {@link Scenario }
     *     
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * Define el valor de la propiedad scenario.
     * 
     * @param value
     *     allowed object is
     *     {@link Scenario }
     *     
     */
    public void setScenario(Scenario value) {
        this.scenario = value;
    }

    public boolean isSetScenario() {
        return (this.scenario!= null);
    }

}
