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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lane complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lane">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="link" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="predecessor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="successor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="width" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="material" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="visibility" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="forward" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="back" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="speed" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="access" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="height" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="inner" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="outer" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lane", propOrder = {
    "link",
    "width",
    "material",
    "visibility",
    "speed",
    "access",
    "height",
    "userData",
    "include"
})
public class Lane
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Lane.Link link;
    @XmlElement(required = true)
    protected List<Lane.Width> width;
    protected List<Lane.Material> material;
    protected List<Lane.Visibility> visibility;
    protected List<Lane.Speed> speed;
    protected List<Lane.Access> access;
    protected List<Lane.Height> height;
    protected List<UserData> userData;
    protected List<Include> include;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "level")
    protected String level;

    /**
     * Obtiene el valor de la propiedad link.
     * 
     * @return
     *     possible object is
     *     {@link Lane.Link }
     *     
     */
    public Lane.Link getLink() {
        return link;
    }

    /**
     * Define el valor de la propiedad link.
     * 
     * @param value
     *     allowed object is
     *     {@link Lane.Link }
     *     
     */
    public void setLink(Lane.Link value) {
        this.link = value;
    }

    public boolean isSetLink() {
        return (this.link!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the width property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Width }
     * 
     * 
     */
    public List<Lane.Width> getWidth() {
        if (width == null) {
            width = new ArrayList<Lane.Width>();
        }
        return this.width;
    }

    public boolean isSetWidth() {
        return ((this.width!= null)&&(!this.width.isEmpty()));
    }

    public void unsetWidth() {
        this.width = null;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Material }
     * 
     * 
     */
    public List<Lane.Material> getMaterial() {
        if (material == null) {
            material = new ArrayList<Lane.Material>();
        }
        return this.material;
    }

    public boolean isSetMaterial() {
        return ((this.material!= null)&&(!this.material.isEmpty()));
    }

    public void unsetMaterial() {
        this.material = null;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Visibility }
     * 
     * 
     */
    public List<Lane.Visibility> getVisibility() {
        if (visibility == null) {
            visibility = new ArrayList<Lane.Visibility>();
        }
        return this.visibility;
    }

    public boolean isSetVisibility() {
        return ((this.visibility!= null)&&(!this.visibility.isEmpty()));
    }

    public void unsetVisibility() {
        this.visibility = null;
    }

    /**
     * Gets the value of the speed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Speed }
     * 
     * 
     */
    public List<Lane.Speed> getSpeed() {
        if (speed == null) {
            speed = new ArrayList<Lane.Speed>();
        }
        return this.speed;
    }

    public boolean isSetSpeed() {
        return ((this.speed!= null)&&(!this.speed.isEmpty()));
    }

    public void unsetSpeed() {
        this.speed = null;
    }

    /**
     * Gets the value of the access property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the access property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Access }
     * 
     * 
     */
    public List<Lane.Access> getAccess() {
        if (access == null) {
            access = new ArrayList<Lane.Access>();
        }
        return this.access;
    }

    public boolean isSetAccess() {
        return ((this.access!= null)&&(!this.access.isEmpty()));
    }

    public void unsetAccess() {
        this.access = null;
    }

    /**
     * Gets the value of the height property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the height property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane.Height }
     * 
     * 
     */
    public List<Lane.Height> getHeight() {
        if (height == null) {
            height = new ArrayList<Lane.Height>();
        }
        return this.height;
    }

    public boolean isSetHeight() {
        return ((this.height!= null)&&(!this.height.isEmpty()));
    }

    public void unsetHeight() {
        this.height = null;
    }

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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(int value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Access
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "restriction")
        protected String restriction;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad restriction.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * Define el valor de la propiedad restriction.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        public boolean isSetRestriction() {
            return (this.restriction!= null);
        }

    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="inner" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="outer" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Height
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "inner")
        protected Double inner;
        @XmlAttribute(name = "outer")
        protected Double outer;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad inner.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getInner() {
            return inner;
        }

        /**
         * Define el valor de la propiedad inner.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setInner(double value) {
            this.inner = value;
        }

        public boolean isSetInner() {
            return (this.inner!= null);
        }

        public void unsetInner() {
            this.inner = null;
        }

        /**
         * Obtiene el valor de la propiedad outer.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getOuter() {
            return outer;
        }

        /**
         * Define el valor de la propiedad outer.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOuter(double value) {
            this.outer = value;
        }

        public boolean isSetOuter() {
            return (this.outer!= null);
        }

        public void unsetOuter() {
            this.outer = null;
        }

    }


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
     *         &lt;element name="predecessor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="successor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
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
        "predecessor",
        "successor",
        "userData",
        "include"
    })
    public static class Link
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected Lane.Link.Predecessor predecessor;
        protected Lane.Link.Successor successor;
        protected List<UserData> userData;
        protected List<Include> include;

        /**
         * Obtiene el valor de la propiedad predecessor.
         * 
         * @return
         *     possible object is
         *     {@link Lane.Link.Predecessor }
         *     
         */
        public Lane.Link.Predecessor getPredecessor() {
            return predecessor;
        }

        /**
         * Define el valor de la propiedad predecessor.
         * 
         * @param value
         *     allowed object is
         *     {@link Lane.Link.Predecessor }
         *     
         */
        public void setPredecessor(Lane.Link.Predecessor value) {
            this.predecessor = value;
        }

        public boolean isSetPredecessor() {
            return (this.predecessor!= null);
        }

        /**
         * Obtiene el valor de la propiedad successor.
         * 
         * @return
         *     possible object is
         *     {@link Lane.Link.Successor }
         *     
         */
        public Lane.Link.Successor getSuccessor() {
            return successor;
        }

        /**
         * Define el valor de la propiedad successor.
         * 
         * @param value
         *     allowed object is
         *     {@link Lane.Link.Successor }
         *     
         */
        public void setSuccessor(Lane.Link.Successor value) {
            this.successor = value;
        }

        public boolean isSetSuccessor() {
            return (this.successor!= null);
        }

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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Predecessor
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "id")
            protected Integer id;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setId(int value) {
                this.id = value;
            }

            public boolean isSetId() {
                return (this.id!= null);
            }

            public void unsetId() {
                this.id = null;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Successor
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "id")
            protected Integer id;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setId(int value) {
                this.id = value;
            }

            public boolean isSetId() {
                return (this.id!= null);
            }

            public void unsetId() {
                this.id = null;
            }

        }

    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Material
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "surface")
        protected String surface;
        @XmlAttribute(name = "friction")
        protected Double friction;
        @XmlAttribute(name = "roughness")
        protected Double roughness;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad surface.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurface() {
            return surface;
        }

        /**
         * Define el valor de la propiedad surface.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurface(String value) {
            this.surface = value;
        }

        public boolean isSetSurface() {
            return (this.surface!= null);
        }

        /**
         * Obtiene el valor de la propiedad friction.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getFriction() {
            return friction;
        }

        /**
         * Define el valor de la propiedad friction.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFriction(double value) {
            this.friction = value;
        }

        public boolean isSetFriction() {
            return (this.friction!= null);
        }

        public void unsetFriction() {
            this.friction = null;
        }

        /**
         * Obtiene el valor de la propiedad roughness.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getRoughness() {
            return roughness;
        }

        /**
         * Define el valor de la propiedad roughness.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRoughness(double value) {
            this.roughness = value;
        }

        public boolean isSetRoughness() {
            return (this.roughness!= null);
        }

        public void unsetRoughness() {
            this.roughness = null;
        }

    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Speed
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "max")
        protected Double max;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad max.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getMax() {
            return max;
        }

        /**
         * Define el valor de la propiedad max.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMax(double value) {
            this.max = value;
        }

        public boolean isSetMax() {
            return (this.max!= null);
        }

        public void unsetMax() {
            this.max = null;
        }

    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="forward" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="back" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Visibility
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "forward")
        protected Double forward;
        @XmlAttribute(name = "back")
        protected Double back;
        @XmlAttribute(name = "left")
        protected Double left;
        @XmlAttribute(name = "right")
        protected Double right;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad forward.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getForward() {
            return forward;
        }

        /**
         * Define el valor de la propiedad forward.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setForward(double value) {
            this.forward = value;
        }

        public boolean isSetForward() {
            return (this.forward!= null);
        }

        public void unsetForward() {
            this.forward = null;
        }

        /**
         * Obtiene el valor de la propiedad back.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getBack() {
            return back;
        }

        /**
         * Define el valor de la propiedad back.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setBack(double value) {
            this.back = value;
        }

        public boolean isSetBack() {
            return (this.back!= null);
        }

        public void unsetBack() {
            this.back = null;
        }

        /**
         * Obtiene el valor de la propiedad left.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getLeft() {
            return left;
        }

        /**
         * Define el valor de la propiedad left.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLeft(double value) {
            this.left = value;
        }

        public boolean isSetLeft() {
            return (this.left!= null);
        }

        public void unsetLeft() {
            this.left = null;
        }

        /**
         * Obtiene el valor de la propiedad right.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getRight() {
            return right;
        }

        /**
         * Define el valor de la propiedad right.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRight(double value) {
            this.right = value;
        }

        public boolean isSetRight() {
            return (this.right!= null);
        }

        public void unsetRight() {
            this.right = null;
        }

    }


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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userData",
        "include"
    })
    public static class Width
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "sOffset")
        protected Double sOffset;
        @XmlAttribute(name = "a")
        protected Double a;
        @XmlAttribute(name = "b")
        protected Double b;
        @XmlAttribute(name = "c")
        protected Double c;
        @XmlAttribute(name = "d")
        protected Double d;

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
         * Obtiene el valor de la propiedad sOffset.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSOffset() {
            return sOffset;
        }

        /**
         * Define el valor de la propiedad sOffset.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSOffset(double value) {
            this.sOffset = value;
        }

        public boolean isSetSOffset() {
            return (this.sOffset!= null);
        }

        public void unsetSOffset() {
            this.sOffset = null;
        }

        /**
         * Obtiene el valor de la propiedad a.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getA() {
            return a;
        }

        /**
         * Define el valor de la propiedad a.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setA(double value) {
            this.a = value;
        }

        public boolean isSetA() {
            return (this.a!= null);
        }

        public void unsetA() {
            this.a = null;
        }

        /**
         * Obtiene el valor de la propiedad b.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getB() {
            return b;
        }

        /**
         * Define el valor de la propiedad b.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setB(double value) {
            this.b = value;
        }

        public boolean isSetB() {
            return (this.b!= null);
        }

        public void unsetB() {
            this.b = null;
        }

        /**
         * Obtiene el valor de la propiedad c.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getC() {
            return c;
        }

        /**
         * Define el valor de la propiedad c.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setC(double value) {
            this.c = value;
        }

        public boolean isSetC() {
            return (this.c!= null);
        }

        public void unsetC() {
            this.c = null;
        }

        /**
         * Obtiene el valor de la propiedad d.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getD() {
            return d;
        }

        /**
         * Define el valor de la propiedad d.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setD(double value) {
            this.d = value;
        }

        public boolean isSetD() {
            return (this.d!= null);
        }

        public void unsetD() {
            this.d = null;
        }

    }

}
