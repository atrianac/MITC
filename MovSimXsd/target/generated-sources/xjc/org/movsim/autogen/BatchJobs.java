//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.05 a las 09:47:49 PM COT 
//


package org.movsim.autogen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}BatchData" maxOccurs="unbounded"/>
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
    "batchData"
})
@XmlRootElement(name = "BatchJobs")
public class BatchJobs
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BatchData", required = true)
    protected List<BatchData> batchData;

    /**
     * Gets the value of the batchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchData }
     * 
     * 
     */
    public List<BatchData> getBatchData() {
        if (batchData == null) {
            batchData = new ArrayList<BatchData>();
        }
        return this.batchData;
    }

    public boolean isSetBatchData() {
        return ((this.batchData!= null)&&(!this.batchData.isEmpty()));
    }

    public void unsetBatchData() {
        this.batchData = null;
    }

}
