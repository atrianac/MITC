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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterNSM;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="p_slowdown" use="required" type="{}probability" />
 *       &lt;attribute name="p_slow_start" use="required" type="{}probability" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterNSM")
public class ModelParameterNSM
    extends BasicModelParameter
    implements Serializable, IModelParameterNSM
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "p_slowdown", required = true)
    protected double pSlowdown;
    @XmlAttribute(name = "p_slow_start", required = true)
    protected double pSlowStart;

    /**
     * Obtiene el valor de la propiedad pSlowdown.
     * 
     */
    public double getPSlowdown() {
        return pSlowdown;
    }

    /**
     * Define el valor de la propiedad pSlowdown.
     * 
     */
    public void setPSlowdown(double value) {
        this.pSlowdown = value;
    }

    public boolean isSetPSlowdown() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pSlowStart.
     * 
     */
    public double getPSlowStart() {
        return pSlowStart;
    }

    /**
     * Define el valor de la propiedad pSlowStart.
     * 
     */
    public void setPSlowStart(double value) {
        this.pSlowStart = value;
    }

    public boolean isSetPSlowStart() {
        return true;
    }

}
