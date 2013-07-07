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
 *       &lt;sequence>
 *         &lt;element ref="{}Columns"/>
 *         &lt;element ref="{}Conversions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inputfile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outputfile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="model" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "columns",
    "conversions"
})
@XmlRootElement(name = "BatchData")
public class BatchData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Columns", required = true)
    protected Columns columns;
    @XmlElement(name = "Conversions")
    protected Conversions conversions;
    @XmlAttribute(name = "inputfile", required = true)
    protected String inputfile;
    @XmlAttribute(name = "outputfile", required = true)
    protected String outputfile;
    @XmlAttribute(name = "model", required = true)
    protected String model;

    /**
     * Obtiene el valor de la propiedad columns.
     * 
     * @return
     *     possible object is
     *     {@link Columns }
     *     
     */
    public Columns getColumns() {
        return columns;
    }

    /**
     * Define el valor de la propiedad columns.
     * 
     * @param value
     *     allowed object is
     *     {@link Columns }
     *     
     */
    public void setColumns(Columns value) {
        this.columns = value;
    }

    public boolean isSetColumns() {
        return (this.columns!= null);
    }

    /**
     * Obtiene el valor de la propiedad conversions.
     * 
     * @return
     *     possible object is
     *     {@link Conversions }
     *     
     */
    public Conversions getConversions() {
        return conversions;
    }

    /**
     * Define el valor de la propiedad conversions.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversions }
     *     
     */
    public void setConversions(Conversions value) {
        this.conversions = value;
    }

    public boolean isSetConversions() {
        return (this.conversions!= null);
    }

    /**
     * Obtiene el valor de la propiedad inputfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputfile() {
        return inputfile;
    }

    /**
     * Define el valor de la propiedad inputfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputfile(String value) {
        this.inputfile = value;
    }

    public boolean isSetInputfile() {
        return (this.inputfile!= null);
    }

    /**
     * Obtiene el valor de la propiedad outputfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputfile() {
        return outputfile;
    }

    /**
     * Define el valor de la propiedad outputfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputfile(String value) {
        this.outputfile = value;
    }

    public boolean isSetOutputfile() {
        return (this.outputfile!= null);
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    public boolean isSetModel() {
        return (this.model!= null);
    }

}
