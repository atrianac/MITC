//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.05 a las 09:47:51 PM COT 
//


package org.movsim.network.autogen.opendrive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para laneValidity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="laneValidity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fromLane" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="toLane" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laneValidity", propOrder = {
    "userData",
    "include"
})
public class LaneValidity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<UserData> userData;
    protected List<Include> include;
    @XmlAttribute(name = "fromLane")
    protected Integer fromLane;
    @XmlAttribute(name = "toLane")
    protected Integer toLane;

    /**
     * Gets the value of the userData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserData }
     * 
     * 
     */
    public List<UserData> getUserData() {
        if (userData == null) {
            userData = new ArrayList<UserData>();
        }
        return this.userData;
    }

    public boolean isSetUserData() {
        return ((this.userData!= null)&&(!this.userData.isEmpty()));
    }

    public void unsetUserData() {
        this.userData = null;
    }

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * 
     * 
     */
    public List<Include> getInclude() {
        if (include == null) {
            include = new ArrayList<Include>();
        }
        return this.include;
    }

    public boolean isSetInclude() {
        return ((this.include!= null)&&(!this.include.isEmpty()));
    }

    public void unsetInclude() {
        this.include = null;
    }

    /**
     * Obtiene el valor de la propiedad fromLane.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFromLane() {
        return fromLane;
    }

    /**
     * Define el valor de la propiedad fromLane.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromLane(int value) {
        this.fromLane = value;
    }

    public boolean isSetFromLane() {
        return (this.fromLane!= null);
    }

    public void unsetFromLane() {
        this.fromLane = null;
    }

    /**
     * Obtiene el valor de la propiedad toLane.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getToLane() {
        return toLane;
    }

    /**
     * Define el valor de la propiedad toLane.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToLane(int value) {
        this.toLane = value;
    }

    public boolean isSetToLane() {
        return (this.toLane!= null);
    }

    public void unsetToLane() {
        this.toLane = null;
    }

}
