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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterCCS;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="mass" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="cw" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="A" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="friction" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="p0" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="v_c" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="p_herringbone" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="v_c_herringbone" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="T" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="b" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="b_maximum" use="required" type="{}nonNegativeDouble" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterCCS")
public class ModelParameterCCS
    extends BasicModelParameter
    implements Serializable, IModelParameterCCS
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "mass", required = true)
    protected double mass;
    @XmlAttribute(name = "cw", required = true)
    protected double cw;
    @XmlAttribute(name = "A", required = true)
    protected double a;
    @XmlAttribute(name = "friction", required = true)
    protected double friction;
    @XmlAttribute(name = "p0", required = true)
    protected double p0;
    @XmlAttribute(name = "v_c", required = true)
    protected double vc;
    @XmlAttribute(name = "p_herringbone", required = true)
    protected double pHerringbone;
    @XmlAttribute(name = "v_c_herringbone", required = true)
    protected double vcHerringbone;
    @XmlAttribute(name = "T", required = true)
    protected double t;
    @XmlAttribute(name = "b", required = true)
    protected double b;
    @XmlAttribute(name = "b_maximum", required = true)
    protected double bMaximum;

    /**
     * Obtiene el valor de la propiedad mass.
     * 
     */
    public double getMass() {
        return mass;
    }

    /**
     * Define el valor de la propiedad mass.
     * 
     */
    public void setMass(double value) {
        this.mass = value;
    }

    public boolean isSetMass() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad cw.
     * 
     */
    public double getCw() {
        return cw;
    }

    /**
     * Define el valor de la propiedad cw.
     * 
     */
    public void setCw(double value) {
        this.cw = value;
    }

    public boolean isSetCw() {
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
     * Obtiene el valor de la propiedad friction.
     * 
     */
    public double getFriction() {
        return friction;
    }

    /**
     * Define el valor de la propiedad friction.
     * 
     */
    public void setFriction(double value) {
        this.friction = value;
    }

    public boolean isSetFriction() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad p0.
     * 
     */
    public double getP0() {
        return p0;
    }

    /**
     * Define el valor de la propiedad p0.
     * 
     */
    public void setP0(double value) {
        this.p0 = value;
    }

    public boolean isSetP0() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad vc.
     * 
     */
    public double getVC() {
        return vc;
    }

    /**
     * Define el valor de la propiedad vc.
     * 
     */
    public void setVC(double value) {
        this.vc = value;
    }

    public boolean isSetVC() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad pHerringbone.
     * 
     */
    public double getPHerringbone() {
        return pHerringbone;
    }

    /**
     * Define el valor de la propiedad pHerringbone.
     * 
     */
    public void setPHerringbone(double value) {
        this.pHerringbone = value;
    }

    public boolean isSetPHerringbone() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad vcHerringbone.
     * 
     */
    public double getVCHerringbone() {
        return vcHerringbone;
    }

    /**
     * Define el valor de la propiedad vcHerringbone.
     * 
     */
    public void setVCHerringbone(double value) {
        this.vcHerringbone = value;
    }

    public boolean isSetVCHerringbone() {
        return true;
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
     * Obtiene el valor de la propiedad bMaximum.
     * 
     */
    public double getBMaximum() {
        return bMaximum;
    }

    /**
     * Define el valor de la propiedad bMaximum.
     * 
     */
    public void setBMaximum(double value) {
        this.bMaximum = value;
    }

    public boolean isSetBMaximum() {
        return true;
    }

}
