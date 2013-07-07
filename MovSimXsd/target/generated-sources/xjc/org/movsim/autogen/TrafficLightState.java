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
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{}TrafficLightStatus" />
 *       &lt;attribute name="condition" type="{}TrafficLightCondition" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TrafficLightState")
public class TrafficLightState
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "status")
    protected TrafficLightStatus status;
    @XmlAttribute(name = "condition")
    protected TrafficLightCondition condition;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link TrafficLightStatus }
     *     
     */
    public TrafficLightStatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficLightStatus }
     *     
     */
    public void setStatus(TrafficLightStatus value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtiene el valor de la propiedad condition.
     * 
     * @return
     *     possible object is
     *     {@link TrafficLightCondition }
     *     
     */
    public TrafficLightCondition getCondition() {
        if (condition == null) {
            return TrafficLightCondition.NONE;
        } else {
            return condition;
        }
    }

    /**
     * Define el valor de la propiedad condition.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficLightCondition }
     *     
     */
    public void setCondition(TrafficLightCondition value) {
        this.condition = value;
    }

    public boolean isSetCondition() {
        return (this.condition!= null);
    }

}
