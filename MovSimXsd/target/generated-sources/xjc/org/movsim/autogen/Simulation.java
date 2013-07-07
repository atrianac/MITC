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
 *         &lt;element ref="{}TrafficComposition"/>
 *         &lt;element ref="{}Road" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timestep" use="required" type="{}positiveDouble" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}double" default="-1" />
 *       &lt;attribute name="with_seed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="seed" type="{http://www.w3.org/2001/XMLSchema}int" default="42" />
 *       &lt;attribute name="crash_exit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="time_offset" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "road"
})
@XmlRootElement(name = "Simulation")
public class Simulation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrafficComposition", required = true)
    protected TrafficComposition trafficComposition;
    @XmlElement(name = "Road")
    protected List<Road> road;
    @XmlAttribute(name = "timestep", required = true)
    protected double timestep;
    @XmlAttribute(name = "duration")
    protected Double duration;
    @XmlAttribute(name = "with_seed")
    protected Boolean withSeed;
    @XmlAttribute(name = "seed")
    protected Integer seed;
    @XmlAttribute(name = "crash_exit")
    protected Boolean crashExit;
    @XmlAttribute(name = "time_offset")
    protected String timeOffset;

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
     * Gets the value of the road property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the road property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Road }
     * 
     * 
     */
    public List<Road> getRoad() {
        if (road == null) {
            road = new ArrayList<Road>();
        }
        return this.road;
    }

    public boolean isSetRoad() {
        return ((this.road!= null)&&(!this.road.isEmpty()));
    }

    public void unsetRoad() {
        this.road = null;
    }

    /**
     * Obtiene el valor de la propiedad timestep.
     * 
     */
    public double getTimestep() {
        return timestep;
    }

    /**
     * Define el valor de la propiedad timestep.
     * 
     */
    public void setTimestep(double value) {
        this.timestep = value;
    }

    public boolean isSetTimestep() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDuration() {
        if (duration == null) {
            return -1.0D;
        } else {
            return duration;
        }
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDuration(double value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    public void unsetDuration() {
        this.duration = null;
    }

    /**
     * Obtiene el valor de la propiedad withSeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWithSeed() {
        if (withSeed == null) {
            return true;
        } else {
            return withSeed;
        }
    }

    /**
     * Define el valor de la propiedad withSeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithSeed(boolean value) {
        this.withSeed = value;
    }

    public boolean isSetWithSeed() {
        return (this.withSeed!= null);
    }

    public void unsetWithSeed() {
        this.withSeed = null;
    }

    /**
     * Obtiene el valor de la propiedad seed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSeed() {
        if (seed == null) {
            return  42;
        } else {
            return seed;
        }
    }

    /**
     * Define el valor de la propiedad seed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeed(int value) {
        this.seed = value;
    }

    public boolean isSetSeed() {
        return (this.seed!= null);
    }

    public void unsetSeed() {
        this.seed = null;
    }

    /**
     * Obtiene el valor de la propiedad crashExit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCrashExit() {
        if (crashExit == null) {
            return true;
        } else {
            return crashExit;
        }
    }

    /**
     * Define el valor de la propiedad crashExit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrashExit(boolean value) {
        this.crashExit = value;
    }

    public boolean isSetCrashExit() {
        return (this.crashExit!= null);
    }

    public void unsetCrashExit() {
        this.crashExit = null;
    }

    /**
     * Obtiene el valor de la propiedad timeOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOffset() {
        return timeOffset;
    }

    /**
     * Define el valor de la propiedad timeOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOffset(String value) {
        this.timeOffset = value;
    }

    public boolean isSetTimeOffset() {
        return (this.timeOffset!= null);
    }

}
