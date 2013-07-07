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
 *       &lt;choice>
 *         &lt;element ref="{}Inflow" maxOccurs="unbounded"/>
 *         &lt;element ref="{}InflowFromFile"/>
 *       &lt;/choice>
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
    "inflow",
    "inflowFromFile"
})
@XmlRootElement(name = "TrafficSource")
public class TrafficSource
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Inflow")
    protected List<Inflow> inflow;
    @XmlElement(name = "InflowFromFile")
    protected InflowFromFile inflowFromFile;
    @XmlAttribute(name = "logging")
    protected Boolean logging;

    /**
     * Gets the value of the inflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inflow }
     * 
     * 
     */
    public List<Inflow> getInflow() {
        if (inflow == null) {
            inflow = new ArrayList<Inflow>();
        }
        return this.inflow;
    }

    public boolean isSetInflow() {
        return ((this.inflow!= null)&&(!this.inflow.isEmpty()));
    }

    public void unsetInflow() {
        this.inflow = null;
    }

    /**
     * Obtiene el valor de la propiedad inflowFromFile.
     * 
     * @return
     *     possible object is
     *     {@link InflowFromFile }
     *     
     */
    public InflowFromFile getInflowFromFile() {
        return inflowFromFile;
    }

    /**
     * Define el valor de la propiedad inflowFromFile.
     * 
     * @param value
     *     allowed object is
     *     {@link InflowFromFile }
     *     
     */
    public void setInflowFromFile(InflowFromFile value) {
        this.inflowFromFile = value;
    }

    public boolean isSetInflowFromFile() {
        return (this.inflowFromFile!= null);
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
