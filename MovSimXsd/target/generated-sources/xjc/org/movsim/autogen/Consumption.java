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
 *       &lt;sequence>
 *         &lt;element ref="{}BatchJobs" minOccurs="0"/>
 *         &lt;element ref="{}ConsumptionModels"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "batchJobs",
    "consumptionModels"
})
@XmlRootElement(name = "Consumption")
public class Consumption
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BatchJobs")
    protected BatchJobs batchJobs;
    @XmlElement(name = "ConsumptionModels", required = true)
    protected ConsumptionModels consumptionModels;

    /**
     * Obtiene el valor de la propiedad batchJobs.
     * 
     * @return
     *     possible object is
     *     {@link BatchJobs }
     *     
     */
    public BatchJobs getBatchJobs() {
        return batchJobs;
    }

    /**
     * Define el valor de la propiedad batchJobs.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchJobs }
     *     
     */
    public void setBatchJobs(BatchJobs value) {
        this.batchJobs = value;
    }

    public boolean isSetBatchJobs() {
        return (this.batchJobs!= null);
    }

    /**
     * Obtiene el valor de la propiedad consumptionModels.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionModels }
     *     
     */
    public ConsumptionModels getConsumptionModels() {
        return consumptionModels;
    }

    /**
     * Define el valor de la propiedad consumptionModels.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionModels }
     *     
     */
    public void setConsumptionModels(ConsumptionModels value) {
        this.consumptionModels = value;
    }

    public boolean isSetConsumptionModels() {
        return (this.consumptionModels!= null);
    }

}
