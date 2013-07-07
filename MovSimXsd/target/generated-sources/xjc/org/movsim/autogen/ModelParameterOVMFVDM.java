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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterOVMFVDM;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="tau" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="transition_width" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="beta" use="required" type="{}nonNegativeDouble" />
 *       &lt;attribute name="gamma" type="{}nonNegativeDouble" default="0" />
 *       &lt;attribute name="optimal_speed_function" type="{}OptimalVelocityFunctionEnum" default="bando" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterOVM_FVDM")
public class ModelParameterOVMFVDM
    extends BasicModelParameter
    implements Serializable, IModelParameterOVMFVDM
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "tau", required = true)
    protected double tau;
    @XmlAttribute(name = "transition_width", required = true)
    protected double transitionWidth;
    @XmlAttribute(name = "beta", required = true)
    protected double beta;
    @XmlAttribute(name = "gamma")
    protected Double gamma;
    @XmlAttribute(name = "optimal_speed_function")
    protected OptimalVelocityFunctionEnum optimalSpeedFunction;

    /**
     * Obtiene el valor de la propiedad tau.
     * 
     */
    public double getTau() {
        return tau;
    }

    /**
     * Define el valor de la propiedad tau.
     * 
     */
    public void setTau(double value) {
        this.tau = value;
    }

    public boolean isSetTau() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad transitionWidth.
     * 
     */
    public double getTransitionWidth() {
        return transitionWidth;
    }

    /**
     * Define el valor de la propiedad transitionWidth.
     * 
     */
    public void setTransitionWidth(double value) {
        this.transitionWidth = value;
    }

    public boolean isSetTransitionWidth() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad beta.
     * 
     */
    public double getBeta() {
        return beta;
    }

    /**
     * Define el valor de la propiedad beta.
     * 
     */
    public void setBeta(double value) {
        this.beta = value;
    }

    public boolean isSetBeta() {
        return true;
    }

    /**
     * Obtiene el valor de la propiedad gamma.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getGamma() {
        if (gamma == null) {
            return  0.0D;
        } else {
            return gamma;
        }
    }

    /**
     * Define el valor de la propiedad gamma.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGamma(double value) {
        this.gamma = value;
    }

    public boolean isSetGamma() {
        return (this.gamma!= null);
    }

    public void unsetGamma() {
        this.gamma = null;
    }

    /**
     * Obtiene el valor de la propiedad optimalSpeedFunction.
     * 
     * @return
     *     possible object is
     *     {@link OptimalVelocityFunctionEnum }
     *     
     */
    public OptimalVelocityFunctionEnum getOptimalSpeedFunction() {
        if (optimalSpeedFunction == null) {
            return OptimalVelocityFunctionEnum.BANDO;
        } else {
            return optimalSpeedFunction;
        }
    }

    /**
     * Define el valor de la propiedad optimalSpeedFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimalVelocityFunctionEnum }
     *     
     */
    public void setOptimalSpeedFunction(OptimalVelocityFunctionEnum value) {
        this.optimalSpeedFunction = value;
    }

    public boolean isSetOptimalSpeedFunction() {
        return (this.optimalSpeedFunction!= null);
    }

}
