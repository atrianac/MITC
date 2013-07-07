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
 *         &lt;element ref="{}FloatingCar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="n_timestep" type="{}positiveInteger" default="1" />
 *       &lt;attribute name="random_fraction" type="{}probability" default="0" />
 *       &lt;attribute name="route" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "floatingCar"
})
@XmlRootElement(name = "FloatingCarOutput")
public class FloatingCarOutput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FloatingCar")
    protected List<FloatingCar> floatingCar;
    @XmlAttribute(name = "n_timestep")
    protected Integer nTimestep;
    @XmlAttribute(name = "random_fraction")
    protected Double randomFraction;
    @XmlAttribute(name = "route", required = true)
    protected String route;

    /**
     * Gets the value of the floatingCar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatingCar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatingCar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatingCar }
     * 
     * 
     */
    public List<FloatingCar> getFloatingCar() {
        if (floatingCar == null) {
            floatingCar = new ArrayList<FloatingCar>();
        }
        return this.floatingCar;
    }

    public boolean isSetFloatingCar() {
        return ((this.floatingCar!= null)&&(!this.floatingCar.isEmpty()));
    }

    public void unsetFloatingCar() {
        this.floatingCar = null;
    }

    /**
     * Obtiene el valor de la propiedad nTimestep.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNTimestep() {
        if (nTimestep == null) {
            return  1;
        } else {
            return nTimestep;
        }
    }

    /**
     * Define el valor de la propiedad nTimestep.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTimestep(int value) {
        this.nTimestep = value;
    }

    public boolean isSetNTimestep() {
        return (this.nTimestep!= null);
    }

    public void unsetNTimestep() {
        this.nTimestep = null;
    }

    /**
     * Obtiene el valor de la propiedad randomFraction.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRandomFraction() {
        if (randomFraction == null) {
            return  0.0D;
        } else {
            return randomFraction;
        }
    }

    /**
     * Define el valor de la propiedad randomFraction.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRandomFraction(double value) {
        this.randomFraction = value;
    }

    public boolean isSetRandomFraction() {
        return (this.randomFraction!= null);
    }

    public void unsetRandomFraction() {
        this.randomFraction = null;
    }

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    public boolean isSetRoute() {
        return (this.route!= null);
    }

}
