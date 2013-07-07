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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterKKW;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="k" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="pb0" use="required" type="{}probability" />
 *       &lt;attribute name="pb1" use="required" type="{}probability" />
 *       &lt;attribute name="pa1" use="required" type="{}probability" />
 *       &lt;attribute name="pa2" use="required" type="{}probability" />
 *       &lt;attribute name="vp" use="required" type="{}nonNegativeDouble" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterKKW")
public class ModelParameterKKW
    extends BasicModelParameter
    implements Serializable, IModelParameterKKW
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "k", required = true)
    protected double k;
    @XmlAttribute(name = "pb0", required = true)
    protected double pb0;
    @XmlAttribute(name = "pb1", required = true)
    protected double pb1;
    @XmlAttribute(name = "pa1", required = true)
    protected double pa1;
    @XmlAttribute(name = "pa2", required = true)
    protected double pa2;
    @XmlAttribute(name = "vp", required = true)
    protected double vp;

    /**
     * Obtiene el valor de la propiedad k.
     * 
     */
    public double getK() {
        return k;
    }

    /**
     * Define el valor de la propiedad k.
     * 
     */
    public void setK(double value) {
        this.k = value;
    }

    public boolean isSetK() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pb0.
     * 
     */
    public double getPb0() {
        return pb0;
    }

    /**
     * Define el valor de la propiedad pb0.
     * 
     */
    public void setPb0(double value) {
        this.pb0 = value;
    }

    public boolean isSetPb0() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pb1.
     * 
     */
    public double getPb1() {
        return pb1;
    }

    /**
     * Define el valor de la propiedad pb1.
     * 
     */
    public void setPb1(double value) {
        this.pb1 = value;
    }

    public boolean isSetPb1() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pa1.
     * 
     */
    public double getPa1() {
        return pa1;
    }

    /**
     * Define el valor de la propiedad pa1.
     * 
     */
    public void setPa1(double value) {
        this.pa1 = value;
    }

    public boolean isSetPa1() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pa2.
     * 
     */
    public double getPa2() {
        return pa2;
    }

    /**
     * Define el valor de la propiedad pa2.
     * 
     */
    public void setPa2(double value) {
        this.pa2 = value;
    }

    public boolean isSetPa2() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad vp.
     * 
     */
    public double getVp() {
        return vp;
    }

    /**
     * Define el valor de la propiedad vp.
     * 
     */
    public void setVp(double value) {
        this.vp = value;
    }

    public boolean isSetVp() {
        return true;
    }

}
