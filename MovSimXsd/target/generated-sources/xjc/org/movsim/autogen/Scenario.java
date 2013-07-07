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
 *         &lt;element ref="{}Simulation"/>
 *         &lt;element ref="{}TrafficLights" minOccurs="0"/>
 *         &lt;element ref="{}Routes" minOccurs="0"/>
 *         &lt;element ref="{}OutputConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="network_filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simulation",
    "trafficLights",
    "routes",
    "outputConfiguration"
})
@XmlRootElement(name = "Scenario")
public class Scenario
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Simulation", required = true)
    protected Simulation simulation;
    @XmlElement(name = "TrafficLights")
    protected TrafficLights trafficLights;
    @XmlElement(name = "Routes")
    protected Routes routes;
    @XmlElement(name = "OutputConfiguration")
    protected OutputConfiguration outputConfiguration;
    @XmlAttribute(name = "network_filename", required = true)
    protected String networkFilename;

    /**
     * Obtiene el valor de la propiedad simulation.
     * 
     * @return
     *     possible object is
     *     {@link Simulation }
     *     
     */
    public Simulation getSimulation() {
        return simulation;
    }

    /**
     * Define el valor de la propiedad simulation.
     * 
     * @param value
     *     allowed object is
     *     {@link Simulation }
     *     
     */
    public void setSimulation(Simulation value) {
        this.simulation = value;
    }

    public boolean isSetSimulation() {
        return (this.simulation!= null);
    }

    /**
     * Obtiene el valor de la propiedad trafficLights.
     * 
     * @return
     *     possible object is
     *     {@link TrafficLights }
     *     
     */
    public TrafficLights getTrafficLights() {
        return trafficLights;
    }

    /**
     * Define el valor de la propiedad trafficLights.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficLights }
     *     
     */
    public void setTrafficLights(TrafficLights value) {
        this.trafficLights = value;
    }

    public boolean isSetTrafficLights() {
        return (this.trafficLights!= null);
    }

    /**
     * Obtiene el valor de la propiedad routes.
     * 
     * @return
     *     possible object is
     *     {@link Routes }
     *     
     */
    public Routes getRoutes() {
        return routes;
    }

    /**
     * Define el valor de la propiedad routes.
     * 
     * @param value
     *     allowed object is
     *     {@link Routes }
     *     
     */
    public void setRoutes(Routes value) {
        this.routes = value;
    }

    public boolean isSetRoutes() {
        return (this.routes!= null);
    }

    /**
     * Obtiene el valor de la propiedad outputConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link OutputConfiguration }
     *     
     */
    public OutputConfiguration getOutputConfiguration() {
        return outputConfiguration;
    }

    /**
     * Define el valor de la propiedad outputConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputConfiguration }
     *     
     */
    public void setOutputConfiguration(OutputConfiguration value) {
        this.outputConfiguration = value;
    }

    public boolean isSetOutputConfiguration() {
        return (this.outputConfiguration!= null);
    }

    /**
     * Obtiene el valor de la propiedad networkFilename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkFilename() {
        return networkFilename;
    }

    /**
     * Define el valor de la propiedad networkFilename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkFilename(String value) {
        this.networkFilename = value;
    }

    public boolean isSetNetworkFilename() {
        return (this.networkFilename!= null);
    }

}
