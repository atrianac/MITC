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
 *       &lt;choice>
 *         &lt;element ref="{}MacroIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MicroIC" maxOccurs="unbounded" minOccurs="0"/>
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
    "macroIC",
    "microIC"
})
@XmlRootElement(name = "InitialConditions")
public class InitialConditions
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MacroIC")
    protected List<MacroIC> macroIC;
    @XmlElement(name = "MicroIC")
    protected List<MicroIC> microIC;

    /**
     * Gets the value of the macroIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macroIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacroIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MacroIC }
     * 
     * 
     */
    public List<MacroIC> getMacroIC() {
        if (macroIC == null) {
            macroIC = new ArrayList<MacroIC>();
        }
        return this.macroIC;
    }

    public boolean isSetMacroIC() {
        return ((this.macroIC!= null)&&(!this.macroIC.isEmpty()));
    }

    public void unsetMacroIC() {
        this.macroIC = null;
    }

    /**
     * Gets the value of the microIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicroIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicroIC }
     * 
     * 
     */
    public List<MicroIC> getMicroIC() {
        if (microIC == null) {
            microIC = new ArrayList<MicroIC>();
        }
        return this.microIC;
    }

    public boolean isSetMicroIC() {
        return ((this.microIC!= null)&&(!this.microIC.isEmpty()));
    }

    public void unsetMicroIC() {
        this.microIC = null;
    }

}
