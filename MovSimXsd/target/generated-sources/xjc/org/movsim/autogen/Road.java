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
 *         &lt;element ref="{}TrafficComposition" minOccurs="0"/>
 *         &lt;element ref="{}InitialConditions" minOccurs="0"/>
 *         &lt;element ref="{}TrafficSource" minOccurs="0"/>
 *         &lt;element ref="{}TrafficSink" minOccurs="0"/>
 *         &lt;element ref="{}FlowConservingInhomogeneities" minOccurs="0"/>
 *         &lt;element ref="{}SimpleRamp" minOccurs="0"/>
 *         &lt;element ref="{}Detectors" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "trafficComposition",
    "initialConditions",
    "trafficSource",
    "trafficSink",
    "flowConservingInhomogeneities",
    "simpleRamp",
    "detectors"
})
@XmlRootElement(name = "Road")
public class Road
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrafficComposition")
    protected TrafficComposition trafficComposition;
    @XmlElement(name = "InitialConditions")
    protected InitialConditions initialConditions;
    @XmlElement(name = "TrafficSource")
    protected TrafficSource trafficSource;
    @XmlElement(name = "TrafficSink")
    protected TrafficSink trafficSink;
    @XmlElement(name = "FlowConservingInhomogeneities")
    protected FlowConservingInhomogeneities flowConservingInhomogeneities;
    @XmlElement(name = "SimpleRamp")
    protected SimpleRamp simpleRamp;
    @XmlElement(name = "Detectors")
    protected Detectors detectors;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Obtiene el valor de la propiedad trafficComposition.
     * 
     * @return
     *     possible object is
     *     {@link TrafficComposition }
     *     
     */
    public TrafficComposition getTrafficComposition() {
        return trafficComposition;
    }

    /**
     * Define el valor de la propiedad trafficComposition.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficComposition }
     *     
     */
    public void setTrafficComposition(TrafficComposition value) {
        this.trafficComposition = value;
    }

    public boolean isSetTrafficComposition() {
        return (this.trafficComposition!= null);
    }

    /**
     * Obtiene el valor de la propiedad initialConditions.
     * 
     * @return
     *     possible object is
     *     {@link InitialConditions }
     *     
     */
    public InitialConditions getInitialConditions() {
        return initialConditions;
    }

    /**
     * Define el valor de la propiedad initialConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialConditions }
     *     
     */
    public void setInitialConditions(InitialConditions value) {
        this.initialConditions = value;
    }

    public boolean isSetInitialConditions() {
        return (this.initialConditions!= null);
    }

    /**
     * Obtiene el valor de la propiedad trafficSource.
     * 
     * @return
     *     possible object is
     *     {@link TrafficSource }
     *     
     */
    public TrafficSource getTrafficSource() {
        return trafficSource;
    }

    /**
     * Define el valor de la propiedad trafficSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficSource }
     *     
     */
    public void setTrafficSource(TrafficSource value) {
        this.trafficSource = value;
    }

    public boolean isSetTrafficSource() {
        return (this.trafficSource!= null);
    }

    /**
     * Obtiene el valor de la propiedad trafficSink.
     * 
     * @return
     *     possible object is
     *     {@link TrafficSink }
     *     
     */
    public TrafficSink getTrafficSink() {
        return trafficSink;
    }

    /**
     * Define el valor de la propiedad trafficSink.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficSink }
     *     
     */
    public void setTrafficSink(TrafficSink value) {
        this.trafficSink = value;
    }

    public boolean isSetTrafficSink() {
        return (this.trafficSink!= null);
    }

    /**
     * Obtiene el valor de la propiedad flowConservingInhomogeneities.
     * 
     * @return
     *     possible object is
     *     {@link FlowConservingInhomogeneities }
     *     
     */
    public FlowConservingInhomogeneities getFlowConservingInhomogeneities() {
        return flowConservingInhomogeneities;
    }

    /**
     * Define el valor de la propiedad flowConservingInhomogeneities.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConservingInhomogeneities }
     *     
     */
    public void setFlowConservingInhomogeneities(FlowConservingInhomogeneities value) {
        this.flowConservingInhomogeneities = value;
    }

    public boolean isSetFlowConservingInhomogeneities() {
        return (this.flowConservingInhomogeneities!= null);
    }

    /**
     * Obtiene el valor de la propiedad simpleRamp.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRamp }
     *     
     */
    public SimpleRamp getSimpleRamp() {
        return simpleRamp;
    }

    /**
     * Define el valor de la propiedad simpleRamp.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRamp }
     *     
     */
    public void setSimpleRamp(SimpleRamp value) {
        this.simpleRamp = value;
    }

    public boolean isSetSimpleRamp() {
        return (this.simpleRamp!= null);
    }

    /**
     * Obtiene el valor de la propiedad detectors.
     * 
     * @return
     *     possible object is
     *     {@link Detectors }
     *     
     */
    public Detectors getDetectors() {
        return detectors;
    }

    /**
     * Define el valor de la propiedad detectors.
     * 
     * @param value
     *     allowed object is
     *     {@link Detectors }
     *     
     */
    public void setDetectors(Detectors value) {
        this.detectors = value;
    }

    public boolean isSetDetectors() {
        return (this.detectors!= null);
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
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
