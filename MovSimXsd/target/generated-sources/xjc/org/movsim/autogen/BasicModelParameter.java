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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameter;


/**
 * <p>Clase Java para BasicModelParameter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BasicModelParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="v0" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="s0" use="required" type="{}nonNegativeDouble" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicModelParameter")
@XmlSeeAlso({
    ModelParameterPTM.class,
    ModelParameterCCS.class,
    ModelParameterKKW.class,
    ModelParameterNSM.class,
    ModelParameterNewell.class,
    ModelParameterKrauss.class,
    ModelParameterGipps.class,
    ModelParameterOVMFVDM.class,
    ModelParameterACC.class,
    ModelParameterIDM.class
})
public class BasicModelParameter
    implements Serializable, IModelParameter
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "v0", required = true)
    protected double v0;
    @XmlAttribute(name = "s0", required = true)
    protected double s0;

    /**
     * Obtiene el valor de la propiedad v0.
     * 
     */
    public double getV0() {
        return v0;
    }

    /**
     * Define el valor de la propiedad v0.
     * 
     */
    public void setV0(double value) {
        this.v0 = value;
    }

    public boolean isSetV0() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad s0.
     * 
     */
    public double getS0() {
        return s0;
    }

    /**
     * Define el valor de la propiedad s0.
     * 
     */
    public void setS0(double value) {
        this.s0 = value;
    }

    public boolean isSetS0() {
        return true;
    }

}
