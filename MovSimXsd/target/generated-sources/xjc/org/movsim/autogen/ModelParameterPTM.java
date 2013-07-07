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
import org.movsim.simulator.vehicles.longitudinalmodel.acceleration.parameter.IModelParameterPTM;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}BasicModelParameter">
 *       &lt;attribute name="tau" type="{}nonNegativeDouble" default="0" />
 *       &lt;attribute name="weightMinus" type="{}positiveDouble" default="2" />
 *       &lt;attribute name="a0" type="{}nonNegativeDouble" default="1" />
 *       &lt;attribute name="gamma" type="{}nonNegativeDouble" default="0.3" />
 *       &lt;attribute name="weightCrash" type="{}positiveDouble" default="100000" />
 *       &lt;attribute name="tauMax" type="{}positiveDouble" default="4" />
 *       &lt;attribute name="alpha" type="{}positiveDouble" default="0.2" />
 *       &lt;attribute name="betaLogit" type="{}positiveDouble" default="2" />
 *       &lt;attribute name="tauCorrelation" type="{}positiveDouble" default="10" />
 *       &lt;attribute name="bMax" type="{}positiveDouble" default="8" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ModelParameterPTM")
public class ModelParameterPTM
    extends BasicModelParameter
    implements Serializable, IModelParameterPTM
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "tau")
    protected Double tau;
    @XmlAttribute(name = "weightMinus")
    protected Double weightMinus;
    @XmlAttribute(name = "a0")
    protected Double a0;
    @XmlAttribute(name = "gamma")
    protected Double gamma;
    @XmlAttribute(name = "weightCrash")
    protected Double weightCrash;
    @XmlAttribute(name = "tauMax")
    protected Double tauMax;
    @XmlAttribute(name = "alpha")
    protected Double alpha;
    @XmlAttribute(name = "betaLogit")
    protected Double betaLogit;
    @XmlAttribute(name = "tauCorrelation")
    protected Double tauCorrelation;
    @XmlAttribute(name = "bMax")
    protected Double bMax;

    /**
     * Obtiene el valor de la propiedad tau.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTau() {
        if (tau == null) {
            return  0.0D;
        } else {
            return tau;
        }
    }

    /**
     * Define el valor de la propiedad tau.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTau(double value) {
        this.tau = value;
    }

    public boolean isSetTau() {
        return (this.tau!= null);
    }

    public void unsetTau() {
        this.tau = null;
    }

    /**
     * Obtiene el valor de la propiedad weightMinus.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeightMinus() {
        if (weightMinus == null) {
            return  2.0D;
        } else {
            return weightMinus;
        }
    }

    /**
     * Define el valor de la propiedad weightMinus.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightMinus(double value) {
        this.weightMinus = value;
    }

    public boolean isSetWeightMinus() {
        return (this.weightMinus!= null);
    }

    public void unsetWeightMinus() {
        this.weightMinus = null;
    }

    /**
     * Obtiene el valor de la propiedad a0.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getA0() {
        if (a0 == null) {
            return  1.0D;
        } else {
            return a0;
        }
    }

    /**
     * Define el valor de la propiedad a0.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA0(double value) {
        this.a0 = value;
    }

    public boolean isSetA0() {
        return (this.a0 != null);
    }

    public void unsetA0() {
        this.a0 = null;
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
            return  0.3D;
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
     * Obtiene el valor de la propiedad weightCrash.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeightCrash() {
        if (weightCrash == null) {
            return  100000.0D;
        } else {
            return weightCrash;
        }
    }

    /**
     * Define el valor de la propiedad weightCrash.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightCrash(double value) {
        this.weightCrash = value;
    }

    public boolean isSetWeightCrash() {
        return (this.weightCrash!= null);
    }

    public void unsetWeightCrash() {
        this.weightCrash = null;
    }

    /**
     * Obtiene el valor de la propiedad tauMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTauMax() {
        if (tauMax == null) {
            return  4.0D;
        } else {
            return tauMax;
        }
    }

    /**
     * Define el valor de la propiedad tauMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTauMax(double value) {
        this.tauMax = value;
    }

    public boolean isSetTauMax() {
        return (this.tauMax!= null);
    }

    public void unsetTauMax() {
        this.tauMax = null;
    }

    /**
     * Obtiene el valor de la propiedad alpha.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlpha() {
        if (alpha == null) {
            return  0.2D;
        } else {
            return alpha;
        }
    }

    /**
     * Define el valor de la propiedad alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlpha(double value) {
        this.alpha = value;
    }

    public boolean isSetAlpha() {
        return (this.alpha!= null);
    }

    public void unsetAlpha() {
        this.alpha = null;
    }

    /**
     * Obtiene el valor de la propiedad betaLogit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getBetaLogit() {
        if (betaLogit == null) {
            return  2.0D;
        } else {
            return betaLogit;
        }
    }

    /**
     * Define el valor de la propiedad betaLogit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBetaLogit(double value) {
        this.betaLogit = value;
    }

    public boolean isSetBetaLogit() {
        return (this.betaLogit!= null);
    }

    public void unsetBetaLogit() {
        this.betaLogit = null;
    }

    /**
     * Obtiene el valor de la propiedad tauCorrelation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTauCorrelation() {
        if (tauCorrelation == null) {
            return  10.0D;
        } else {
            return tauCorrelation;
        }
    }

    /**
     * Define el valor de la propiedad tauCorrelation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTauCorrelation(double value) {
        this.tauCorrelation = value;
    }

    public boolean isSetTauCorrelation() {
        return (this.tauCorrelation!= null);
    }

    public void unsetTauCorrelation() {
        this.tauCorrelation = null;
    }

    /**
     * Obtiene el valor de la propiedad bMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getBMax() {
        if (bMax == null) {
            return  8.0D;
        } else {
            return bMax;
        }
    }

    /**
     * Define el valor de la propiedad bMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMax(double value) {
        this.bMax = value;
    }

    public boolean isSetBMax() {
        return (this.bMax!= null);
    }

    public void unsetBMax() {
        this.bMax = null;
    }

}
