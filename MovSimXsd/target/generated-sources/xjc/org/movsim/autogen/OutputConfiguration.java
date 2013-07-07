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
 *         &lt;element ref="{}FloatingCarOutput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SpatioTemporalConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Trajectories" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TravelTimes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ConsumptionCalculation" maxOccurs="unbounded" minOccurs="0"/>
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
    "floatingCarOutput",
    "spatioTemporalConfiguration",
    "trajectories",
    "travelTimes",
    "consumptionCalculation"
})
@XmlRootElement(name = "OutputConfiguration")
public class OutputConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FloatingCarOutput")
    protected List<FloatingCarOutput> floatingCarOutput;
    @XmlElement(name = "SpatioTemporalConfiguration")
    protected List<SpatioTemporalConfiguration> spatioTemporalConfiguration;
    @XmlElement(name = "Trajectories")
    protected List<Trajectories> trajectories;
    @XmlElement(name = "TravelTimes")
    protected List<TravelTimes> travelTimes;
    @XmlElement(name = "ConsumptionCalculation")
    protected List<ConsumptionCalculation> consumptionCalculation;

    /**
     * Gets the value of the floatingCarOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatingCarOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatingCarOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatingCarOutput }
     * 
     * 
     */
    public List<FloatingCarOutput> getFloatingCarOutput() {
        if (floatingCarOutput == null) {
            floatingCarOutput = new ArrayList<FloatingCarOutput>();
        }
        return this.floatingCarOutput;
    }

    public boolean isSetFloatingCarOutput() {
        return ((this.floatingCarOutput!= null)&&(!this.floatingCarOutput.isEmpty()));
    }

    public void unsetFloatingCarOutput() {
        this.floatingCarOutput = null;
    }

    /**
     * Gets the value of the spatioTemporalConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatioTemporalConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatioTemporalConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpatioTemporalConfiguration }
     * 
     * 
     */
    public List<SpatioTemporalConfiguration> getSpatioTemporalConfiguration() {
        if (spatioTemporalConfiguration == null) {
            spatioTemporalConfiguration = new ArrayList<SpatioTemporalConfiguration>();
        }
        return this.spatioTemporalConfiguration;
    }

    public boolean isSetSpatioTemporalConfiguration() {
        return ((this.spatioTemporalConfiguration!= null)&&(!this.spatioTemporalConfiguration.isEmpty()));
    }

    public void unsetSpatioTemporalConfiguration() {
        this.spatioTemporalConfiguration = null;
    }

    /**
     * Gets the value of the trajectories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrajectories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trajectories }
     * 
     * 
     */
    public List<Trajectories> getTrajectories() {
        if (trajectories == null) {
            trajectories = new ArrayList<Trajectories>();
        }
        return this.trajectories;
    }

    public boolean isSetTrajectories() {
        return ((this.trajectories!= null)&&(!this.trajectories.isEmpty()));
    }

    public void unsetTrajectories() {
        this.trajectories = null;
    }

    /**
     * Gets the value of the travelTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelTimes }
     * 
     * 
     */
    public List<TravelTimes> getTravelTimes() {
        if (travelTimes == null) {
            travelTimes = new ArrayList<TravelTimes>();
        }
        return this.travelTimes;
    }

    public boolean isSetTravelTimes() {
        return ((this.travelTimes!= null)&&(!this.travelTimes.isEmpty()));
    }

    public void unsetTravelTimes() {
        this.travelTimes = null;
    }

    /**
     * Gets the value of the consumptionCalculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionCalculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCalculation }
     * 
     * 
     */
    public List<ConsumptionCalculation> getConsumptionCalculation() {
        if (consumptionCalculation == null) {
            consumptionCalculation = new ArrayList<ConsumptionCalculation>();
        }
        return this.consumptionCalculation;
    }

    public boolean isSetConsumptionCalculation() {
        return ((this.consumptionCalculation!= null)&&(!this.consumptionCalculation.isEmpty()));
    }

    public void unsetConsumptionCalculation() {
        this.consumptionCalculation = null;
    }

}
