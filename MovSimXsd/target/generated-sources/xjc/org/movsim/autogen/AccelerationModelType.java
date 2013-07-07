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
 *       &lt;choice>
 *         &lt;element ref="{}ModelParameterIDM" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterACC" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterOVM_FVDM" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterGipps" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterKrauss" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterNewell" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterNSM" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterKKW" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterCCS" minOccurs="0"/>
 *         &lt;element ref="{}ModelParameterPTM" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelParameterIDM",
    "modelParameterACC",
    "modelParameterOVMFVDM",
    "modelParameterGipps",
    "modelParameterKrauss",
    "modelParameterNewell",
    "modelParameterNSM",
    "modelParameterKKW",
    "modelParameterCCS",
    "modelParameterPTM"
})
@XmlRootElement(name = "AccelerationModelType")
public class AccelerationModelType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ModelParameterIDM")
    protected ModelParameterIDM modelParameterIDM;
    @XmlElement(name = "ModelParameterACC")
    protected ModelParameterACC modelParameterACC;
    @XmlElement(name = "ModelParameterOVM_FVDM")
    protected ModelParameterOVMFVDM modelParameterOVMFVDM;
    @XmlElement(name = "ModelParameterGipps")
    protected ModelParameterGipps modelParameterGipps;
    @XmlElement(name = "ModelParameterKrauss")
    protected ModelParameterKrauss modelParameterKrauss;
    @XmlElement(name = "ModelParameterNewell")
    protected ModelParameterNewell modelParameterNewell;
    @XmlElement(name = "ModelParameterNSM")
    protected ModelParameterNSM modelParameterNSM;
    @XmlElement(name = "ModelParameterKKW")
    protected ModelParameterKKW modelParameterKKW;
    @XmlElement(name = "ModelParameterCCS")
    protected ModelParameterCCS modelParameterCCS;
    @XmlElement(name = "ModelParameterPTM")
    protected ModelParameterPTM modelParameterPTM;

    /**
     * Obtiene el valor de la propiedad modelParameterIDM.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterIDM }
     *     
     */
    public ModelParameterIDM getModelParameterIDM() {
        return modelParameterIDM;
    }

    /**
     * Define el valor de la propiedad modelParameterIDM.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterIDM }
     *     
     */
    public void setModelParameterIDM(ModelParameterIDM value) {
        this.modelParameterIDM = value;
    }

    public boolean isSetModelParameterIDM() {
        return (this.modelParameterIDM!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterACC.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterACC }
     *     
     */
    public ModelParameterACC getModelParameterACC() {
        return modelParameterACC;
    }

    /**
     * Define el valor de la propiedad modelParameterACC.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterACC }
     *     
     */
    public void setModelParameterACC(ModelParameterACC value) {
        this.modelParameterACC = value;
    }

    public boolean isSetModelParameterACC() {
        return (this.modelParameterACC!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterOVMFVDM.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterOVMFVDM }
     *     
     */
    public ModelParameterOVMFVDM getModelParameterOVMFVDM() {
        return modelParameterOVMFVDM;
    }

    /**
     * Define el valor de la propiedad modelParameterOVMFVDM.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterOVMFVDM }
     *     
     */
    public void setModelParameterOVMFVDM(ModelParameterOVMFVDM value) {
        this.modelParameterOVMFVDM = value;
    }

    public boolean isSetModelParameterOVMFVDM() {
        return (this.modelParameterOVMFVDM!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterGipps.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterGipps }
     *     
     */
    public ModelParameterGipps getModelParameterGipps() {
        return modelParameterGipps;
    }

    /**
     * Define el valor de la propiedad modelParameterGipps.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterGipps }
     *     
     */
    public void setModelParameterGipps(ModelParameterGipps value) {
        this.modelParameterGipps = value;
    }

    public boolean isSetModelParameterGipps() {
        return (this.modelParameterGipps!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterKrauss.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterKrauss }
     *     
     */
    public ModelParameterKrauss getModelParameterKrauss() {
        return modelParameterKrauss;
    }

    /**
     * Define el valor de la propiedad modelParameterKrauss.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterKrauss }
     *     
     */
    public void setModelParameterKrauss(ModelParameterKrauss value) {
        this.modelParameterKrauss = value;
    }

    public boolean isSetModelParameterKrauss() {
        return (this.modelParameterKrauss!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterNewell.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterNewell }
     *     
     */
    public ModelParameterNewell getModelParameterNewell() {
        return modelParameterNewell;
    }

    /**
     * Define el valor de la propiedad modelParameterNewell.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterNewell }
     *     
     */
    public void setModelParameterNewell(ModelParameterNewell value) {
        this.modelParameterNewell = value;
    }

    public boolean isSetModelParameterNewell() {
        return (this.modelParameterNewell!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterNSM.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterNSM }
     *     
     */
    public ModelParameterNSM getModelParameterNSM() {
        return modelParameterNSM;
    }

    /**
     * Define el valor de la propiedad modelParameterNSM.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterNSM }
     *     
     */
    public void setModelParameterNSM(ModelParameterNSM value) {
        this.modelParameterNSM = value;
    }

    public boolean isSetModelParameterNSM() {
        return (this.modelParameterNSM!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterKKW.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterKKW }
     *     
     */
    public ModelParameterKKW getModelParameterKKW() {
        return modelParameterKKW;
    }

    /**
     * Define el valor de la propiedad modelParameterKKW.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterKKW }
     *     
     */
    public void setModelParameterKKW(ModelParameterKKW value) {
        this.modelParameterKKW = value;
    }

    public boolean isSetModelParameterKKW() {
        return (this.modelParameterKKW!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterCCS.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterCCS }
     *     
     */
    public ModelParameterCCS getModelParameterCCS() {
        return modelParameterCCS;
    }

    /**
     * Define el valor de la propiedad modelParameterCCS.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterCCS }
     *     
     */
    public void setModelParameterCCS(ModelParameterCCS value) {
        this.modelParameterCCS = value;
    }

    public boolean isSetModelParameterCCS() {
        return (this.modelParameterCCS!= null);
    }

    /**
     * Obtiene el valor de la propiedad modelParameterPTM.
     * 
     * @return
     *     possible object is
     *     {@link ModelParameterPTM }
     *     
     */
    public ModelParameterPTM getModelParameterPTM() {
        return modelParameterPTM;
    }

    /**
     * Define el valor de la propiedad modelParameterPTM.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelParameterPTM }
     *     
     */
    public void setModelParameterPTM(ModelParameterPTM value) {
        this.modelParameterPTM = value;
    }

    public boolean isSetModelParameterPTM() {
        return (this.modelParameterPTM!= null);
    }

}
