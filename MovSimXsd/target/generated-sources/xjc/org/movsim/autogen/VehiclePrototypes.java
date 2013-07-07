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
 *         &lt;element ref="{}VehiclePrototypeConfiguration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="write_fund_diagrams" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehiclePrototypeConfiguration"
})
@XmlRootElement(name = "VehiclePrototypes")
public class VehiclePrototypes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehiclePrototypeConfiguration", required = true)
    protected List<VehiclePrototypeConfiguration> vehiclePrototypeConfiguration;
    @XmlAttribute(name = "write_fund_diagrams")
    protected Boolean writeFundDiagrams;

    /**
     * Gets the value of the vehiclePrototypeConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiclePrototypeConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiclePrototypeConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePrototypeConfiguration }
     * 
     * 
     */
    public List<VehiclePrototypeConfiguration> getVehiclePrototypeConfiguration() {
        if (vehiclePrototypeConfiguration == null) {
            vehiclePrototypeConfiguration = new ArrayList<VehiclePrototypeConfiguration>();
        }
        return this.vehiclePrototypeConfiguration;
    }

    public boolean isSetVehiclePrototypeConfiguration() {
        return ((this.vehiclePrototypeConfiguration!= null)&&(!this.vehiclePrototypeConfiguration.isEmpty()));
    }

    public void unsetVehiclePrototypeConfiguration() {
        this.vehiclePrototypeConfiguration = null;
    }

    /**
     * Obtiene el valor de la propiedad writeFundDiagrams.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWriteFundDiagrams() {
        if (writeFundDiagrams == null) {
            return false;
        } else {
            return writeFundDiagrams;
        }
    }

    /**
     * Define el valor de la propiedad writeFundDiagrams.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteFundDiagrams(boolean value) {
        this.writeFundDiagrams = value;
    }

    public boolean isSetWriteFundDiagrams() {
        return (this.writeFundDiagrams!= null);
    }

    public void unsetWriteFundDiagrams() {
        this.writeFundDiagrams = null;
    }

}
