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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterKrauss;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="a" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="b" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="epsilon" use="required" type="{}nonNegativeDouble" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterKrauss")
public class ModelParameterKrauss
    extends BasicModelParameter
    implements Serializable, IModelParameterKrauss
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "a", required = true)
    protected double a;
    @XmlAttribute(name = "b", required = true)
    protected double b;
    @XmlAttribute(name = "epsilon", required = true)
    protected double epsilon;

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
     * Obtiene el valor de la propiedad epsilon.
     * 
     */
    public double getEpsilon() {
        return epsilon;
    }

    /**
     * Define el valor de la propiedad epsilon.
     * 
     */
    public void setEpsilon(double value) {
        this.epsilon = value;
    }

    public boolean isSetEpsilon() {
        return true;
    }

}
