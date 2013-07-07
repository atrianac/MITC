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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterACC;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="s1" type="{}nonNegativeDouble" default="0" />
 *       &lt;attribute name="T" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="a" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="b" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="delta" type="{}nonNegativeDouble" default="4" />
 *       &lt;attribute name="coolness" use="required" type="{}probability" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterACC")
public class ModelParameterACC
    extends BasicModelParameter
    implements Serializable, IModelParameterACC
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "s1")
    protected Double s1;
    @XmlAttribute(name = "T", required = true)
    protected double t;
    @XmlAttribute(name = "a", required = true)
    protected double a;
    @XmlAttribute(name = "b", required = true)
    protected double b;
    @XmlAttribute(name = "delta")
    protected Double delta;
    @XmlAttribute(name = "coolness", required = true)
    protected double coolness;

    /**
     * Obtiene el valor de la propiedad s1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getS1() {
        if (s1 == null) {
            return  0.0D;
        } else {
            return s1;
        }
    }

    /**
     * Define el valor de la propiedad s1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setS1(double value) {
        this.s1 = value;
    }

    public boolean isSetS1() {
        return (this.s1 != null);
    }

    public void unsetS1() {
        this.s1 = null;
    }

    /**
     * Obtiene el valor de la propiedad t.
     * 
     */
    public double getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     */
    public void setT(double value) {
        this.t = value;
    }

    public boolean isSetT() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Define el valor de la propiedad a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    public boolean isSetA() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Define el valor de la propiedad b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

    public boolean isSetB() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad delta.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDelta() {
        if (delta == null) {
            return  4.0D;
        } else {
            return delta;
        }
    }

    /**
     * Define el valor de la propiedad delta.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDelta(double value) {
        this.delta = value;
    }

    public boolean isSetDelta() {
        return (this.delta!= null);
    }

    public void unsetDelta() {
        this.delta = null;
    }

    /**
     * Obtiene el valor de la propiedad coolness.
     * 
     */
    public double getCoolness() {
        return coolness;
    }

    /**
     * Define el valor de la propiedad coolness.
     * 
     */
    public void setCoolness(double value) {
        this.coolness = value;
    }

    public boolean isSetCoolness() {
        return true;
    }

}
