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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="revMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                 &lt;attribute name="revMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="north" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="south" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="east" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="west" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="road" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="link" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="predecessor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="successor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="neighbor" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="planView">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="geometry" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="line">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="spiral">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="curvStart" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="curvEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="arc">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="curvature" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="poly3">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="elevationProfile" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elevation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="lateralProfile" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="superelevation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="crossfall" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="lanes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="laneOffset" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="laneSection" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="left" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="center" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lane" type="{}centerLane" minOccurs="0"/>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="right" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="objects" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="object" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="repeat" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="outline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cornerRoad" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cornerLocal" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="material" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="objectReference" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="tunnel" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="lighting" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="daylight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="bridge" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="signals" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="signal" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="dependency" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="signalReference" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="surface" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CRG" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="sStart" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="sEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="tOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="zScale" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                     &lt;attribute name="hOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="junction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="controller" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="control" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="signalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="junction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="connection" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="laneLink" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="incomingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="connectingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="priority" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="low" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="controller" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "header",
    "road",
    "controller",
    "junction"
})
@XmlRootElement(name = "OpenDRIVE")
public class OpenDRIVE
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected OpenDRIVE.Header header;
    @XmlElement(required = true)
    protected List<OpenDRIVE.Road> road;
    protected List<OpenDRIVE.Controller> controller;
    protected List<OpenDRIVE.Junction> junction;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link OpenDRIVE.Header }
     *     
     */
    public OpenDRIVE.Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDRIVE.Header }
     *     
     */
    public void setHeader(OpenDRIVE.Header value) {
        this.header = value;
    }

    public boolean isSetHeader() {
        return (this.header!= null);
    }

    /**
     * Gets the value of the road property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the road property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenDRIVE.Road }
     * 
     * 
     */
    public List<OpenDRIVE.Road> getRoad() {
        if (road == null) {
            road = new ArrayList<OpenDRIVE.Road>();
        }
        return this.road;
    }

    public boolean isSetRoad() {
        return ((this.road!= null)&&(!this.road.isEmpty()));
    }

    public void unsetRoad() {
        this.road = null;
    }

    /**
     * Gets the value of the controller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getController().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenDRIVE.Controller }
     * 
     * 
     */
    public List<OpenDRIVE.Controller> getController() {
        if (controller == null) {
            controller = new ArrayList<OpenDRIVE.Controller>();
        }
        return this.controller;
    }

    public boolean isSetController() {
        return ((this.controller!= null)&&(!this.controller.isEmpty()));
    }

    public void unsetController() {
        this.controller = null;
    }

    /**
     * Gets the value of the junction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the junction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenDRIVE.Junction }
     * 
     * 
     */
    public List<OpenDRIVE.Junction> getJunction() {
        if (junction == null) {
            junction = new ArrayList<OpenDRIVE.Junction>();
        }
        return this.junction;
    }

    public boolean isSetJunction() {
        return ((this.junction!= null)&&(!this.junction.isEmpty()));
    }

    public void unsetJunction() {
        this.junction = null;
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
     *         &lt;element name="control" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="signalId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "control",
        "userData",
        "include"
    })
    public static class Controller
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<OpenDRIVE.Controller.Control> control;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "sequence")
        protected Integer sequence;

        /**
         * Gets the value of the control property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the control property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenDRIVE.Controller.Control }
         * 
         * 
         */
        public List<OpenDRIVE.Controller.Control> getControl() {
            if (control == null) {
                control = new ArrayList<OpenDRIVE.Controller.Control>();
            }
            return this.control;
        }

        public boolean isSetControl() {
            return ((this.control!= null)&&(!this.control.isEmpty()));
        }

        public void unsetControl() {
            this.control = null;
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
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        public boolean isSetId() {
            return (this.id!= null);
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        public boolean isSetName() {
            return (this.name!= null);
        }

        /**
         * Obtiene el valor de la propiedad sequence.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getSequence() {
            return sequence;
        }

        /**
         * Define el valor de la propiedad sequence.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(int value) {
            this.sequence = value;
        }

        public boolean isSetSequence() {
            return (this.sequence!= null);
        }

        public void unsetSequence() {
            this.sequence = null;
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
         *       &lt;attribute name="signalId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Control
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<UserData> userData;
            protected List<Include> include;
            @XmlAttribute(name = "signalId")
            protected String signalId;
            @XmlAttribute(name = "type")
            protected String type;

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
             * Obtiene el valor de la propiedad signalId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignalId() {
                return signalId;
            }

            /**
             * Define el valor de la propiedad signalId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignalId(String value) {
                this.signalId = value;
            }

            public boolean isSetSignalId() {
                return (this.signalId!= null);
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
     *       &lt;attribute name="revMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *       &lt;attribute name="revMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="north" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="south" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="east" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="west" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Header
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "revMajor")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer revMajor;
        @XmlAttribute(name = "revMinor")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer revMinor;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "version")
        protected Double version;
        @XmlAttribute(name = "date")
        protected String date;
        @XmlAttribute(name = "north")
        protected Double north;
        @XmlAttribute(name = "south")
        protected Double south;
        @XmlAttribute(name = "east")
        protected Double east;
        @XmlAttribute(name = "west")
        protected Double west;
        @XmlAttribute(name = "vendor")
        protected String vendor;

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
         * Obtiene el valor de la propiedad revMajor.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getRevMajor() {
            return revMajor;
        }

        /**
         * Define el valor de la propiedad revMajor.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRevMajor(int value) {
            this.revMajor = value;
        }

        public boolean isSetRevMajor() {
            return (this.revMajor!= null);
        }

        public void unsetRevMajor() {
            this.revMajor = null;
        }

        /**
         * Obtiene el valor de la propiedad revMinor.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getRevMinor() {
            return revMinor;
        }

        /**
         * Define el valor de la propiedad revMinor.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRevMinor(int value) {
            this.revMinor = value;
        }

        public boolean isSetRevMinor() {
            return (this.revMinor!= null);
        }

        public void unsetRevMinor() {
            this.revMinor = null;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        public boolean isSetName() {
            return (this.name!= null);
        }

        /**
         * Obtiene el valor de la propiedad version.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getVersion() {
            return version;
        }

        /**
         * Define el valor de la propiedad version.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setVersion(double value) {
            this.version = value;
        }

        public boolean isSetVersion() {
            return (this.version!= null);
        }

        public void unsetVersion() {
            this.version = null;
        }

        /**
         * Obtiene el valor de la propiedad date.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Define el valor de la propiedad date.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        public boolean isSetDate() {
            return (this.date!= null);
        }

        /**
         * Obtiene el valor de la propiedad north.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getNorth() {
            return north;
        }

        /**
         * Define el valor de la propiedad north.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNorth(double value) {
            this.north = value;
        }

        public boolean isSetNorth() {
            return (this.north!= null);
        }

        public void unsetNorth() {
            this.north = null;
        }

        /**
         * Obtiene el valor de la propiedad south.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getSouth() {
            return south;
        }

        /**
         * Define el valor de la propiedad south.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSouth(double value) {
            this.south = value;
        }

        public boolean isSetSouth() {
            return (this.south!= null);
        }

        public void unsetSouth() {
            this.south = null;
        }

        /**
         * Obtiene el valor de la propiedad east.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getEast() {
            return east;
        }

        /**
         * Define el valor de la propiedad east.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setEast(double value) {
            this.east = value;
        }

        public boolean isSetEast() {
            return (this.east!= null);
        }

        public void unsetEast() {
            this.east = null;
        }

        /**
         * Obtiene el valor de la propiedad west.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getWest() {
            return west;
        }

        /**
         * Define el valor de la propiedad west.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setWest(double value) {
            this.west = value;
        }

        public boolean isSetWest() {
            return (this.west!= null);
        }

        public void unsetWest() {
            this.west = null;
        }

        /**
         * Obtiene el valor de la propiedad vendor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Define el valor de la propiedad vendor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        public boolean isSetVendor() {
            return (this.vendor!= null);
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
     *         &lt;element name="connection" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="laneLink" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="incomingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="connectingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="priority" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="low" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="controller" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "connection",
        "priority",
        "controller",
        "userData",
        "include"
    })
    public static class Junction
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<OpenDRIVE.Junction.Connection> connection;
        protected List<OpenDRIVE.Junction.Priority> priority;
        protected List<OpenDRIVE.Junction.Controller> controller;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Gets the value of the connection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenDRIVE.Junction.Connection }
         * 
         * 
         */
        public List<OpenDRIVE.Junction.Connection> getConnection() {
            if (connection == null) {
                connection = new ArrayList<OpenDRIVE.Junction.Connection>();
            }
            return this.connection;
        }

        public boolean isSetConnection() {
            return ((this.connection!= null)&&(!this.connection.isEmpty()));
        }

        public void unsetConnection() {
            this.connection = null;
        }

        /**
         * Gets the value of the priority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenDRIVE.Junction.Priority }
         * 
         * 
         */
        public List<OpenDRIVE.Junction.Priority> getPriority() {
            if (priority == null) {
                priority = new ArrayList<OpenDRIVE.Junction.Priority>();
            }
            return this.priority;
        }

        public boolean isSetPriority() {
            return ((this.priority!= null)&&(!this.priority.isEmpty()));
        }

        public void unsetPriority() {
            this.priority = null;
        }

        /**
         * Gets the value of the controller property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controller property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getController().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenDRIVE.Junction.Controller }
         * 
         * 
         */
        public List<OpenDRIVE.Junction.Controller> getController() {
            if (controller == null) {
                controller = new ArrayList<OpenDRIVE.Junction.Controller>();
            }
            return this.controller;
        }

        public boolean isSetController() {
            return ((this.controller!= null)&&(!this.controller.isEmpty()));
        }

        public void unsetController() {
            this.controller = null;
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
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        public boolean isSetName() {
            return (this.name!= null);
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        public boolean isSetId() {
            return (this.id!= null);
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
         *         &lt;element name="laneLink" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="incomingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="connectingRoad" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "laneLink",
            "userData",
            "include"
        })
        public static class Connection
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Junction.Connection.LaneLink> laneLink;
            protected List<UserData> userData;
            protected List<Include> include;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "incomingRoad")
            protected String incomingRoad;
            @XmlAttribute(name = "connectingRoad")
            protected String connectingRoad;
            @XmlAttribute(name = "contactPoint")
            protected String contactPoint;

            /**
             * Gets the value of the laneLink property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the laneLink property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLaneLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Junction.Connection.LaneLink }
             * 
             * 
             */
            public List<OpenDRIVE.Junction.Connection.LaneLink> getLaneLink() {
                if (laneLink == null) {
                    laneLink = new ArrayList<OpenDRIVE.Junction.Connection.LaneLink>();
                }
                return this.laneLink;
            }

            public boolean isSetLaneLink() {
                return ((this.laneLink!= null)&&(!this.laneLink.isEmpty()));
            }

            public void unsetLaneLink() {
                this.laneLink = null;
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
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            public boolean isSetId() {
                return (this.id!= null);
            }

            /**
             * Obtiene el valor de la propiedad incomingRoad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncomingRoad() {
                return incomingRoad;
            }

            /**
             * Define el valor de la propiedad incomingRoad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncomingRoad(String value) {
                this.incomingRoad = value;
            }

            public boolean isSetIncomingRoad() {
                return (this.incomingRoad!= null);
            }

            /**
             * Obtiene el valor de la propiedad connectingRoad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConnectingRoad() {
                return connectingRoad;
            }

            /**
             * Define el valor de la propiedad connectingRoad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConnectingRoad(String value) {
                this.connectingRoad = value;
            }

            public boolean isSetConnectingRoad() {
                return (this.connectingRoad!= null);
            }

            /**
             * Obtiene el valor de la propiedad contactPoint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPoint() {
                return contactPoint;
            }

            /**
             * Define el valor de la propiedad contactPoint.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPoint(String value) {
                this.contactPoint = value;
            }

            public boolean isSetContactPoint() {
                return (this.contactPoint!= null);
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
             *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class LaneLink
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "from")
                protected Integer from;
                @XmlAttribute(name = "to")
                protected Integer to;

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
                 * Obtiene el valor de la propiedad from.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getFrom() {
                    return from;
                }

                /**
                 * Define el valor de la propiedad from.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setFrom(int value) {
                    this.from = value;
                }

                public boolean isSetFrom() {
                    return (this.from!= null);
                }

                public void unsetFrom() {
                    this.from = null;
                }

                /**
                 * Obtiene el valor de la propiedad to.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getTo() {
                    return to;
                }

                /**
                 * Define el valor de la propiedad to.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTo(int value) {
                    this.to = value;
                }

                public boolean isSetTo() {
                    return (this.to!= null);
                }

                public void unsetTo() {
                    this.to = null;
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
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        public static class Controller
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<UserData> userData;
            protected List<Include> include;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "sequence")
            protected Integer sequence;

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
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            public boolean isSetId() {
                return (this.id!= null);
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
             * Obtiene el valor de la propiedad sequence.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getSequence() {
                return sequence;
            }

            /**
             * Define el valor de la propiedad sequence.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(int value) {
                this.sequence = value;
            }

            public boolean isSetSequence() {
                return (this.sequence!= null);
            }

            public void unsetSequence() {
                this.sequence = null;
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
         *       &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="low" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Priority
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<UserData> userData;
            protected List<Include> include;
            @XmlAttribute(name = "high")
            protected String high;
            @XmlAttribute(name = "low")
            protected String low;

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
             * Obtiene el valor de la propiedad high.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHigh() {
                return high;
            }

            /**
             * Define el valor de la propiedad high.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHigh(String value) {
                this.high = value;
            }

            public boolean isSetHigh() {
                return (this.high!= null);
            }

            /**
             * Obtiene el valor de la propiedad low.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLow() {
                return low;
            }

            /**
             * Define el valor de la propiedad low.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLow(String value) {
                this.low = value;
            }

            public boolean isSetLow() {
                return (this.low!= null);
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
     *         &lt;element name="link" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predecessor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="successor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="neighbor" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="planView">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="geometry" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="line">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="spiral">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="curvStart" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="curvEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="arc">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="curvature" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="poly3">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/choice>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="elevationProfile" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elevation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
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
     *         &lt;element name="lateralProfile" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="superelevation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="crossfall" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
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
     *         &lt;element name="lanes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="laneOffset" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="laneSection" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="left" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="center" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lane" type="{}centerLane" minOccurs="0"/>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="right" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="objects" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="object" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="repeat" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="outline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cornerRoad" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="cornerLocal" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="material" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                     &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="objectReference" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="tunnel" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="lighting" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="daylight" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="bridge" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="signals" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="signal" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="dependency" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="signalReference" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="surface" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CRG" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="sStart" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="sEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="tOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="zScale" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                           &lt;attribute name="hOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
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
     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="junction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "link",
        "type",
        "planView",
        "elevationProfile",
        "lateralProfile",
        "lanes",
        "objects",
        "signals",
        "surface",
        "userData",
        "include"
    })
    public static class Road
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected OpenDRIVE.Road.Link link;
        protected List<OpenDRIVE.Road.Type> type;
        @XmlElement(required = true)
        protected OpenDRIVE.Road.PlanView planView;
        protected OpenDRIVE.Road.ElevationProfile elevationProfile;
        protected OpenDRIVE.Road.LateralProfile lateralProfile;
        @XmlElement(required = true)
        protected OpenDRIVE.Road.Lanes lanes;
        protected OpenDRIVE.Road.Objects objects;
        protected OpenDRIVE.Road.Signals signals;
        protected OpenDRIVE.Road.Surface surface;
        protected List<UserData> userData;
        protected List<Include> include;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "length")
        protected Double length;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "junction")
        protected String junction;

        /**
         * Obtiene el valor de la propiedad link.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.Link }
         *     
         */
        public OpenDRIVE.Road.Link getLink() {
            return link;
        }

        /**
         * Define el valor de la propiedad link.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.Link }
         *     
         */
        public void setLink(OpenDRIVE.Road.Link value) {
            this.link = value;
        }

        public boolean isSetLink() {
            return (this.link!= null);
        }

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OpenDRIVE.Road.Type }
         * 
         * 
         */
        public List<OpenDRIVE.Road.Type> getType() {
            if (type == null) {
                type = new ArrayList<OpenDRIVE.Road.Type>();
            }
            return this.type;
        }

        public boolean isSetType() {
            return ((this.type!= null)&&(!this.type.isEmpty()));
        }

        public void unsetType() {
            this.type = null;
        }

        /**
         * Obtiene el valor de la propiedad planView.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.PlanView }
         *     
         */
        public OpenDRIVE.Road.PlanView getPlanView() {
            return planView;
        }

        /**
         * Define el valor de la propiedad planView.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.PlanView }
         *     
         */
        public void setPlanView(OpenDRIVE.Road.PlanView value) {
            this.planView = value;
        }

        public boolean isSetPlanView() {
            return (this.planView!= null);
        }

        /**
         * Obtiene el valor de la propiedad elevationProfile.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.ElevationProfile }
         *     
         */
        public OpenDRIVE.Road.ElevationProfile getElevationProfile() {
            return elevationProfile;
        }

        /**
         * Define el valor de la propiedad elevationProfile.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.ElevationProfile }
         *     
         */
        public void setElevationProfile(OpenDRIVE.Road.ElevationProfile value) {
            this.elevationProfile = value;
        }

        public boolean isSetElevationProfile() {
            return (this.elevationProfile!= null);
        }

        /**
         * Obtiene el valor de la propiedad lateralProfile.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.LateralProfile }
         *     
         */
        public OpenDRIVE.Road.LateralProfile getLateralProfile() {
            return lateralProfile;
        }

        /**
         * Define el valor de la propiedad lateralProfile.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.LateralProfile }
         *     
         */
        public void setLateralProfile(OpenDRIVE.Road.LateralProfile value) {
            this.lateralProfile = value;
        }

        public boolean isSetLateralProfile() {
            return (this.lateralProfile!= null);
        }

        /**
         * Obtiene el valor de la propiedad lanes.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.Lanes }
         *     
         */
        public OpenDRIVE.Road.Lanes getLanes() {
            return lanes;
        }

        /**
         * Define el valor de la propiedad lanes.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.Lanes }
         *     
         */
        public void setLanes(OpenDRIVE.Road.Lanes value) {
            this.lanes = value;
        }

        public boolean isSetLanes() {
            return (this.lanes!= null);
        }

        /**
         * Obtiene el valor de la propiedad objects.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.Objects }
         *     
         */
        public OpenDRIVE.Road.Objects getObjects() {
            return objects;
        }

        /**
         * Define el valor de la propiedad objects.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.Objects }
         *     
         */
        public void setObjects(OpenDRIVE.Road.Objects value) {
            this.objects = value;
        }

        public boolean isSetObjects() {
            return (this.objects!= null);
        }

        /**
         * Obtiene el valor de la propiedad signals.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.Signals }
         *     
         */
        public OpenDRIVE.Road.Signals getSignals() {
            return signals;
        }

        /**
         * Define el valor de la propiedad signals.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.Signals }
         *     
         */
        public void setSignals(OpenDRIVE.Road.Signals value) {
            this.signals = value;
        }

        public boolean isSetSignals() {
            return (this.signals!= null);
        }

        /**
         * Obtiene el valor de la propiedad surface.
         * 
         * @return
         *     possible object is
         *     {@link OpenDRIVE.Road.Surface }
         *     
         */
        public OpenDRIVE.Road.Surface getSurface() {
            return surface;
        }

        /**
         * Define el valor de la propiedad surface.
         * 
         * @param value
         *     allowed object is
         *     {@link OpenDRIVE.Road.Surface }
         *     
         */
        public void setSurface(OpenDRIVE.Road.Surface value) {
            this.surface = value;
        }

        public boolean isSetSurface() {
            return (this.surface!= null);
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
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        public boolean isSetName() {
            return (this.name!= null);
        }

        /**
         * Obtiene el valor de la propiedad length.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getLength() {
            return length;
        }

        /**
         * Define el valor de la propiedad length.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLength(double value) {
            this.length = value;
        }

        public boolean isSetLength() {
            return (this.length!= null);
        }

        public void unsetLength() {
            this.length = null;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        public boolean isSetId() {
            return (this.id!= null);
        }

        /**
         * Obtiene el valor de la propiedad junction.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJunction() {
            return junction;
        }

        /**
         * Define el valor de la propiedad junction.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJunction(String value) {
            this.junction = value;
        }

        public boolean isSetJunction() {
            return (this.junction!= null);
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
         *         &lt;element name="elevation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            "elevation",
            "userData",
            "include"
        })
        public static class ElevationProfile
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Road.ElevationProfile.Elevation> elevation;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Gets the value of the elevation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elevation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElevation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.ElevationProfile.Elevation }
             * 
             * 
             */
            public List<OpenDRIVE.Road.ElevationProfile.Elevation> getElevation() {
                if (elevation == null) {
                    elevation = new ArrayList<OpenDRIVE.Road.ElevationProfile.Elevation>();
                }
                return this.elevation;
            }

            public boolean isSetElevation() {
                return ((this.elevation!= null)&&(!this.elevation.isEmpty()));
            }

            public void unsetElevation() {
                this.elevation = null;
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
             *       &lt;sequence>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            public static class Elevation
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
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
         *         &lt;element name="laneOffset" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="laneSection" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="left" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="center" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lane" type="{}centerLane" minOccurs="0"/>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="right" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "laneOffset",
            "laneSection"
        })
        public static class Lanes
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Road.Lanes.LaneOffset> laneOffset;
            @XmlElement(required = true)
            protected List<OpenDRIVE.Road.Lanes.LaneSection> laneSection;

            /**
             * Gets the value of the laneOffset property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the laneOffset property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLaneOffset().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Lanes.LaneOffset }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Lanes.LaneOffset> getLaneOffset() {
                if (laneOffset == null) {
                    laneOffset = new ArrayList<OpenDRIVE.Road.Lanes.LaneOffset>();
                }
                return this.laneOffset;
            }

            public boolean isSetLaneOffset() {
                return ((this.laneOffset!= null)&&(!this.laneOffset.isEmpty()));
            }

            public void unsetLaneOffset() {
                this.laneOffset = null;
            }

            /**
             * Gets the value of the laneSection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the laneSection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLaneSection().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Lanes.LaneSection }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Lanes.LaneSection> getLaneSection() {
                if (laneSection == null) {
                    laneSection = new ArrayList<OpenDRIVE.Road.Lanes.LaneSection>();
                }
                return this.laneSection;
            }

            public boolean isSetLaneSection() {
                return ((this.laneSection!= null)&&(!this.laneSection.isEmpty()));
            }

            public void unsetLaneSection() {
                this.laneSection = null;
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
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            public static class LaneOffset
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
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
             *         &lt;element name="left" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="center" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lane" type="{}centerLane" minOccurs="0"/>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="right" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "left",
                "center",
                "right",
                "userData",
                "include"
            })
            public static class LaneSection
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected OpenDRIVE.Road.Lanes.LaneSection.Left left;
                protected OpenDRIVE.Road.Lanes.LaneSection.Center center;
                protected OpenDRIVE.Road.Lanes.LaneSection.Right right;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;

                /**
                 * Obtiene el valor de la propiedad left.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Left }
                 *     
                 */
                public OpenDRIVE.Road.Lanes.LaneSection.Left getLeft() {
                    return left;
                }

                /**
                 * Define el valor de la propiedad left.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Left }
                 *     
                 */
                public void setLeft(OpenDRIVE.Road.Lanes.LaneSection.Left value) {
                    this.left = value;
                }

                public boolean isSetLeft() {
                    return (this.left!= null);
                }

                /**
                 * Obtiene el valor de la propiedad center.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Center }
                 *     
                 */
                public OpenDRIVE.Road.Lanes.LaneSection.Center getCenter() {
                    return center;
                }

                /**
                 * Define el valor de la propiedad center.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Center }
                 *     
                 */
                public void setCenter(OpenDRIVE.Road.Lanes.LaneSection.Center value) {
                    this.center = value;
                }

                public boolean isSetCenter() {
                    return (this.center!= null);
                }

                /**
                 * Obtiene el valor de la propiedad right.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Right }
                 *     
                 */
                public OpenDRIVE.Road.Lanes.LaneSection.Right getRight() {
                    return right;
                }

                /**
                 * Define el valor de la propiedad right.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Lanes.LaneSection.Right }
                 *     
                 */
                public void setRight(OpenDRIVE.Road.Lanes.LaneSection.Right value) {
                    this.right = value;
                }

                public boolean isSetRight() {
                    return (this.right!= null);
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
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
                 *         &lt;element name="lane" type="{}centerLane" minOccurs="0"/>
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
                    "lane",
                    "userData",
                    "include"
                })
                public static class Center
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected CenterLane lane;
                    protected List<UserData> userData;
                    protected List<Include> include;

                    /**
                     * Obtiene el valor de la propiedad lane.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CenterLane }
                     *     
                     */
                    public CenterLane getLane() {
                        return lane;
                    }

                    /**
                     * Define el valor de la propiedad lane.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CenterLane }
                     *     
                     */
                    public void setLane(CenterLane value) {
                        this.lane = value;
                    }

                    public boolean isSetLane() {
                        return (this.lane!= null);
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
                 *         &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
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
                    "lane",
                    "userData",
                    "include"
                })
                public static class Left
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    @XmlElement(required = true)
                    protected List<Lane> lane;
                    protected List<UserData> userData;
                    protected List<Include> include;

                    /**
                     * Gets the value of the lane property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lane property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLane().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Lane }
                     * 
                     * 
                     */
                    public List<Lane> getLane() {
                        if (lane == null) {
                            lane = new ArrayList<Lane>();
                        }
                        return this.lane;
                    }

                    public boolean isSetLane() {
                        return ((this.lane!= null)&&(!this.lane.isEmpty()));
                    }

                    public void unsetLane() {
                        this.lane = null;
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
                 *         &lt;element name="lane" type="{}lane" maxOccurs="unbounded"/>
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
                    "lane",
                    "userData",
                    "include"
                })
                public static class Right
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    @XmlElement(required = true)
                    protected List<Lane> lane;
                    protected List<UserData> userData;
                    protected List<Include> include;

                    /**
                     * Gets the value of the lane property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lane property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLane().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Lane }
                     * 
                     * 
                     */
                    public List<Lane> getLane() {
                        if (lane == null) {
                            lane = new ArrayList<Lane>();
                        }
                        return this.lane;
                    }

                    public boolean isSetLane() {
                        return ((this.lane!= null)&&(!this.lane.isEmpty()));
                    }

                    public void unsetLane() {
                        this.lane = null;
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
         *         &lt;element name="superelevation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="crossfall" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            "superelevation",
            "crossfall",
            "userData",
            "include"
        })
        public static class LateralProfile
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Road.LateralProfile.Superelevation> superelevation;
            protected List<OpenDRIVE.Road.LateralProfile.Crossfall> crossfall;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Gets the value of the superelevation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the superelevation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSuperelevation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.LateralProfile.Superelevation }
             * 
             * 
             */
            public List<OpenDRIVE.Road.LateralProfile.Superelevation> getSuperelevation() {
                if (superelevation == null) {
                    superelevation = new ArrayList<OpenDRIVE.Road.LateralProfile.Superelevation>();
                }
                return this.superelevation;
            }

            public boolean isSetSuperelevation() {
                return ((this.superelevation!= null)&&(!this.superelevation.isEmpty()));
            }

            public void unsetSuperelevation() {
                this.superelevation = null;
            }

            /**
             * Gets the value of the crossfall property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the crossfall property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCrossfall().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.LateralProfile.Crossfall }
             * 
             * 
             */
            public List<OpenDRIVE.Road.LateralProfile.Crossfall> getCrossfall() {
                if (crossfall == null) {
                    crossfall = new ArrayList<OpenDRIVE.Road.LateralProfile.Crossfall>();
                }
                return this.crossfall;
            }

            public boolean isSetCrossfall() {
                return ((this.crossfall!= null)&&(!this.crossfall.isEmpty()));
            }

            public void unsetCrossfall() {
                this.crossfall = null;
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
             *       &lt;sequence>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            public static class Crossfall
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "side")
                protected String side;
                @XmlAttribute(name = "s")
                protected Double s;
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
                 * Obtiene el valor de la propiedad side.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSide() {
                    return side;
                }

                /**
                 * Define el valor de la propiedad side.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSide(String value) {
                    this.side = value;
                }

                public boolean isSetSide() {
                    return (this.side!= null);
                }

                /**
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
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
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            public static class Superelevation
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
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
         *                 &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="successor" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="neighbor" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "neighbor",
            "userData",
            "include"
        })
        public static class Link
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected OpenDRIVE.Road.Link.Predecessor predecessor;
            protected OpenDRIVE.Road.Link.Successor successor;
            protected List<OpenDRIVE.Road.Link.Neighbor> neighbor;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Obtiene el valor de la propiedad predecessor.
             * 
             * @return
             *     possible object is
             *     {@link OpenDRIVE.Road.Link.Predecessor }
             *     
             */
            public OpenDRIVE.Road.Link.Predecessor getPredecessor() {
                return predecessor;
            }

            /**
             * Define el valor de la propiedad predecessor.
             * 
             * @param value
             *     allowed object is
             *     {@link OpenDRIVE.Road.Link.Predecessor }
             *     
             */
            public void setPredecessor(OpenDRIVE.Road.Link.Predecessor value) {
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
             *     {@link OpenDRIVE.Road.Link.Successor }
             *     
             */
            public OpenDRIVE.Road.Link.Successor getSuccessor() {
                return successor;
            }

            /**
             * Define el valor de la propiedad successor.
             * 
             * @param value
             *     allowed object is
             *     {@link OpenDRIVE.Road.Link.Successor }
             *     
             */
            public void setSuccessor(OpenDRIVE.Road.Link.Successor value) {
                this.successor = value;
            }

            public boolean isSetSuccessor() {
                return (this.successor!= null);
            }

            /**
             * Gets the value of the neighbor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the neighbor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNeighbor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Link.Neighbor }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Link.Neighbor> getNeighbor() {
                if (neighbor == null) {
                    neighbor = new ArrayList<OpenDRIVE.Road.Link.Neighbor>();
                }
                return this.neighbor;
            }

            public boolean isSetNeighbor() {
                return ((this.neighbor!= null)&&(!this.neighbor.isEmpty()));
            }

            public void unsetNeighbor() {
                this.neighbor = null;
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
             *       &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Neighbor
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                @XmlAttribute(name = "side")
                protected String side;
                @XmlAttribute(name = "elementId")
                protected String elementId;
                @XmlAttribute(name = "direction")
                protected String direction;

                /**
                 * Obtiene el valor de la propiedad side.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSide() {
                    return side;
                }

                /**
                 * Define el valor de la propiedad side.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSide(String value) {
                    this.side = value;
                }

                public boolean isSetSide() {
                    return (this.side!= null);
                }

                /**
                 * Obtiene el valor de la propiedad elementId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElementId() {
                    return elementId;
                }

                /**
                 * Define el valor de la propiedad elementId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElementId(String value) {
                    this.elementId = value;
                }

                public boolean isSetElementId() {
                    return (this.elementId!= null);
                }

                /**
                 * Obtiene el valor de la propiedad direction.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDirection() {
                    return direction;
                }

                /**
                 * Define el valor de la propiedad direction.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDirection(String value) {
                    this.direction = value;
                }

                public boolean isSetDirection() {
                    return (this.direction!= null);
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
             *       &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                @XmlAttribute(name = "elementType")
                protected String elementType;
                @XmlAttribute(name = "elementId")
                protected String elementId;
                @XmlAttribute(name = "contactPoint")
                protected String contactPoint;

                /**
                 * Obtiene el valor de la propiedad elementType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElementType() {
                    return elementType;
                }

                /**
                 * Define el valor de la propiedad elementType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElementType(String value) {
                    this.elementType = value;
                }

                public boolean isSetElementType() {
                    return (this.elementType!= null);
                }

                /**
                 * Obtiene el valor de la propiedad elementId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElementId() {
                    return elementId;
                }

                /**
                 * Define el valor de la propiedad elementId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElementId(String value) {
                    this.elementId = value;
                }

                public boolean isSetElementId() {
                    return (this.elementId!= null);
                }

                /**
                 * Obtiene el valor de la propiedad contactPoint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContactPoint() {
                    return contactPoint;
                }

                /**
                 * Define el valor de la propiedad contactPoint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContactPoint(String value) {
                    this.contactPoint = value;
                }

                public boolean isSetContactPoint() {
                    return (this.contactPoint!= null);
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
             *       &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="contactPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                @XmlAttribute(name = "elementType")
                protected String elementType;
                @XmlAttribute(name = "elementId")
                protected String elementId;
                @XmlAttribute(name = "contactPoint")
                protected String contactPoint;

                /**
                 * Obtiene el valor de la propiedad elementType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElementType() {
                    return elementType;
                }

                /**
                 * Define el valor de la propiedad elementType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElementType(String value) {
                    this.elementType = value;
                }

                public boolean isSetElementType() {
                    return (this.elementType!= null);
                }

                /**
                 * Obtiene el valor de la propiedad elementId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElementId() {
                    return elementId;
                }

                /**
                 * Define el valor de la propiedad elementId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElementId(String value) {
                    this.elementId = value;
                }

                public boolean isSetElementId() {
                    return (this.elementId!= null);
                }

                /**
                 * Obtiene el valor de la propiedad contactPoint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContactPoint() {
                    return contactPoint;
                }

                /**
                 * Define el valor de la propiedad contactPoint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContactPoint(String value) {
                    this.contactPoint = value;
                }

                public boolean isSetContactPoint() {
                    return (this.contactPoint!= null);
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
         *         &lt;element name="object" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="repeat" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="outline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cornerRoad" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="cornerLocal" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="material" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="objectReference" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="tunnel" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="lighting" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="daylight" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="bridge" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "object",
            "objectReference",
            "tunnel",
            "bridge",
            "userData",
            "include"
        })
        public static class Objects
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Road.Objects.Object> object;
            protected List<OpenDRIVE.Road.Objects.ObjectReference> objectReference;
            protected List<OpenDRIVE.Road.Objects.Tunnel> tunnel;
            protected List<OpenDRIVE.Road.Objects.Bridge> bridge;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Gets the value of the object property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the object property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Objects.Object }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Objects.Object> getObject() {
                if (object == null) {
                    object = new ArrayList<OpenDRIVE.Road.Objects.Object>();
                }
                return this.object;
            }

            public boolean isSetObject() {
                return ((this.object!= null)&&(!this.object.isEmpty()));
            }

            public void unsetObject() {
                this.object = null;
            }

            /**
             * Gets the value of the objectReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the objectReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObjectReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Objects.ObjectReference }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Objects.ObjectReference> getObjectReference() {
                if (objectReference == null) {
                    objectReference = new ArrayList<OpenDRIVE.Road.Objects.ObjectReference>();
                }
                return this.objectReference;
            }

            public boolean isSetObjectReference() {
                return ((this.objectReference!= null)&&(!this.objectReference.isEmpty()));
            }

            public void unsetObjectReference() {
                this.objectReference = null;
            }

            /**
             * Gets the value of the tunnel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tunnel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTunnel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Objects.Tunnel }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Objects.Tunnel> getTunnel() {
                if (tunnel == null) {
                    tunnel = new ArrayList<OpenDRIVE.Road.Objects.Tunnel>();
                }
                return this.tunnel;
            }

            public boolean isSetTunnel() {
                return ((this.tunnel!= null)&&(!this.tunnel.isEmpty()));
            }

            public void unsetTunnel() {
                this.tunnel = null;
            }

            /**
             * Gets the value of the bridge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bridge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBridge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Objects.Bridge }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Objects.Bridge> getBridge() {
                if (bridge == null) {
                    bridge = new ArrayList<OpenDRIVE.Road.Objects.Bridge>();
                }
                return this.bridge;
            }

            public boolean isSetBridge() {
                return ((this.bridge!= null)&&(!this.bridge.isEmpty()));
            }

            public void unsetBridge() {
                this.bridge = null;
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
             *       &lt;sequence>
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "validity",
                "userData",
                "include"
            })
            public static class Bridge
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<LaneValidity> validity;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "length")
                protected Double length;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad length.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getLength() {
                    return length;
                }

                /**
                 * Define el valor de la propiedad length.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLength(double value) {
                    this.length = value;
                }

                public boolean isSetLength() {
                    return (this.length!= null);
                }

                public void unsetLength() {
                    this.length = null;
                }

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                public boolean isSetName() {
                    return (this.name!= null);
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
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
             *         &lt;element name="repeat" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="outline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cornerRoad" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="cornerLocal" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
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
             *         &lt;element name="material" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="surface" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="friction" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="roughness" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "repeat",
                "outline",
                "material",
                "validity",
                "userData",
                "include"
            })
            public static class Object
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected OpenDRIVE.Road.Objects.Object.Repeat repeat;
                protected OpenDRIVE.Road.Objects.Object.Outline outline;
                protected OpenDRIVE.Road.Objects.Object.Material material;
                protected List<LaneValidity> validity;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "t")
                protected Double t;
                @XmlAttribute(name = "zOffset")
                protected Double zOffset;
                @XmlAttribute(name = "validLength")
                protected Double validLength;
                @XmlAttribute(name = "orientation")
                protected String orientation;
                @XmlAttribute(name = "length")
                protected Double length;
                @XmlAttribute(name = "width")
                protected Double width;
                @XmlAttribute(name = "radius")
                protected Double radius;
                @XmlAttribute(name = "height")
                protected Double height;
                @XmlAttribute(name = "hdg")
                protected Double hdg;
                @XmlAttribute(name = "pitch")
                protected Double pitch;
                @XmlAttribute(name = "roll")
                protected Double roll;

                /**
                 * Obtiene el valor de la propiedad repeat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Repeat }
                 *     
                 */
                public OpenDRIVE.Road.Objects.Object.Repeat getRepeat() {
                    return repeat;
                }

                /**
                 * Define el valor de la propiedad repeat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Repeat }
                 *     
                 */
                public void setRepeat(OpenDRIVE.Road.Objects.Object.Repeat value) {
                    this.repeat = value;
                }

                public boolean isSetRepeat() {
                    return (this.repeat!= null);
                }

                /**
                 * Obtiene el valor de la propiedad outline.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Outline }
                 *     
                 */
                public OpenDRIVE.Road.Objects.Object.Outline getOutline() {
                    return outline;
                }

                /**
                 * Define el valor de la propiedad outline.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Outline }
                 *     
                 */
                public void setOutline(OpenDRIVE.Road.Objects.Object.Outline value) {
                    this.outline = value;
                }

                public boolean isSetOutline() {
                    return (this.outline!= null);
                }

                /**
                 * Obtiene el valor de la propiedad material.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Material }
                 *     
                 */
                public OpenDRIVE.Road.Objects.Object.Material getMaterial() {
                    return material;
                }

                /**
                 * Define el valor de la propiedad material.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.Objects.Object.Material }
                 *     
                 */
                public void setMaterial(OpenDRIVE.Road.Objects.Object.Material value) {
                    this.material = value;
                }

                public boolean isSetMaterial() {
                    return (this.material!= null);
                }

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
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
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                public boolean isSetName() {
                    return (this.name!= null);
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
                }

                /**
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad t.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getT() {
                    return t;
                }

                /**
                 * Define el valor de la propiedad t.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setT(double value) {
                    this.t = value;
                }

                public boolean isSetT() {
                    return (this.t!= null);
                }

                public void unsetT() {
                    this.t = null;
                }

                /**
                 * Obtiene el valor de la propiedad zOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getZOffset() {
                    return zOffset;
                }

                /**
                 * Define el valor de la propiedad zOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setZOffset(double value) {
                    this.zOffset = value;
                }

                public boolean isSetZOffset() {
                    return (this.zOffset!= null);
                }

                public void unsetZOffset() {
                    this.zOffset = null;
                }

                /**
                 * Obtiene el valor de la propiedad validLength.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getValidLength() {
                    return validLength;
                }

                /**
                 * Define el valor de la propiedad validLength.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setValidLength(double value) {
                    this.validLength = value;
                }

                public boolean isSetValidLength() {
                    return (this.validLength!= null);
                }

                public void unsetValidLength() {
                    this.validLength = null;
                }

                /**
                 * Obtiene el valor de la propiedad orientation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrientation() {
                    return orientation;
                }

                /**
                 * Define el valor de la propiedad orientation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrientation(String value) {
                    this.orientation = value;
                }

                public boolean isSetOrientation() {
                    return (this.orientation!= null);
                }

                /**
                 * Obtiene el valor de la propiedad length.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getLength() {
                    return length;
                }

                /**
                 * Define el valor de la propiedad length.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLength(double value) {
                    this.length = value;
                }

                public boolean isSetLength() {
                    return (this.length!= null);
                }

                public void unsetLength() {
                    this.length = null;
                }

                /**
                 * Obtiene el valor de la propiedad width.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getWidth() {
                    return width;
                }

                /**
                 * Define el valor de la propiedad width.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setWidth(double value) {
                    this.width = value;
                }

                public boolean isSetWidth() {
                    return (this.width!= null);
                }

                public void unsetWidth() {
                    this.width = null;
                }

                /**
                 * Obtiene el valor de la propiedad radius.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getRadius() {
                    return radius;
                }

                /**
                 * Define el valor de la propiedad radius.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setRadius(double value) {
                    this.radius = value;
                }

                public boolean isSetRadius() {
                    return (this.radius!= null);
                }

                public void unsetRadius() {
                    this.radius = null;
                }

                /**
                 * Obtiene el valor de la propiedad height.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getHeight() {
                    return height;
                }

                /**
                 * Define el valor de la propiedad height.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setHeight(double value) {
                    this.height = value;
                }

                public boolean isSetHeight() {
                    return (this.height!= null);
                }

                public void unsetHeight() {
                    this.height = null;
                }

                /**
                 * Obtiene el valor de la propiedad hdg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getHdg() {
                    return hdg;
                }

                /**
                 * Define el valor de la propiedad hdg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setHdg(double value) {
                    this.hdg = value;
                }

                public boolean isSetHdg() {
                    return (this.hdg!= null);
                }

                public void unsetHdg() {
                    this.hdg = null;
                }

                /**
                 * Obtiene el valor de la propiedad pitch.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getPitch() {
                    return pitch;
                }

                /**
                 * Define el valor de la propiedad pitch.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setPitch(double value) {
                    this.pitch = value;
                }

                public boolean isSetPitch() {
                    return (this.pitch!= null);
                }

                public void unsetPitch() {
                    this.pitch = null;
                }

                /**
                 * Obtiene el valor de la propiedad roll.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getRoll() {
                    return roll;
                }

                /**
                 * Define el valor de la propiedad roll.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setRoll(double value) {
                    this.roll = value;
                }

                public boolean isSetRoll() {
                    return (this.roll!= null);
                }

                public void unsetRoll() {
                    this.roll = null;
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
                 *         &lt;element name="cornerRoad" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="cornerLocal" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                    "cornerRoad",
                    "cornerLocal",
                    "userData",
                    "include"
                })
                public static class Outline
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<OpenDRIVE.Road.Objects.Object.Outline.CornerRoad> cornerRoad;
                    protected List<OpenDRIVE.Road.Objects.Object.Outline.CornerLocal> cornerLocal;
                    protected List<UserData> userData;
                    protected List<Include> include;

                    /**
                     * Gets the value of the cornerRoad property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cornerRoad property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCornerRoad().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OpenDRIVE.Road.Objects.Object.Outline.CornerRoad }
                     * 
                     * 
                     */
                    public List<OpenDRIVE.Road.Objects.Object.Outline.CornerRoad> getCornerRoad() {
                        if (cornerRoad == null) {
                            cornerRoad = new ArrayList<OpenDRIVE.Road.Objects.Object.Outline.CornerRoad>();
                        }
                        return this.cornerRoad;
                    }

                    public boolean isSetCornerRoad() {
                        return ((this.cornerRoad!= null)&&(!this.cornerRoad.isEmpty()));
                    }

                    public void unsetCornerRoad() {
                        this.cornerRoad = null;
                    }

                    /**
                     * Gets the value of the cornerLocal property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cornerLocal property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCornerLocal().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OpenDRIVE.Road.Objects.Object.Outline.CornerLocal }
                     * 
                     * 
                     */
                    public List<OpenDRIVE.Road.Objects.Object.Outline.CornerLocal> getCornerLocal() {
                        if (cornerLocal == null) {
                            cornerLocal = new ArrayList<OpenDRIVE.Road.Objects.Object.Outline.CornerLocal>();
                        }
                        return this.cornerLocal;
                    }

                    public boolean isSetCornerLocal() {
                        return ((this.cornerLocal!= null)&&(!this.cornerLocal.isEmpty()));
                    }

                    public void unsetCornerLocal() {
                        this.cornerLocal = null;
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
                     *       &lt;sequence>
                     *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="u" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="z" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                    public static class CornerLocal
                        implements Serializable
                    {

                        private final static long serialVersionUID = 1L;
                        protected List<UserData> userData;
                        protected List<Include> include;
                        @XmlAttribute(name = "u")
                        protected Double u;
                        @XmlAttribute(name = "v")
                        protected Double v;
                        @XmlAttribute(name = "z")
                        protected Double z;
                        @XmlAttribute(name = "height")
                        protected Double height;

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
                         * Obtiene el valor de la propiedad u.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getU() {
                            return u;
                        }

                        /**
                         * Define el valor de la propiedad u.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setU(double value) {
                            this.u = value;
                        }

                        public boolean isSetU() {
                            return (this.u!= null);
                        }

                        public void unsetU() {
                            this.u = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad v.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getV() {
                            return v;
                        }

                        /**
                         * Define el valor de la propiedad v.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setV(double value) {
                            this.v = value;
                        }

                        public boolean isSetV() {
                            return (this.v!= null);
                        }

                        public void unsetV() {
                            this.v = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad z.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getZ() {
                            return z;
                        }

                        /**
                         * Define el valor de la propiedad z.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setZ(double value) {
                            this.z = value;
                        }

                        public boolean isSetZ() {
                            return (this.z!= null);
                        }

                        public void unsetZ() {
                            this.z = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad height.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getHeight() {
                            return height;
                        }

                        /**
                         * Define el valor de la propiedad height.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setHeight(double value) {
                            this.height = value;
                        }

                        public boolean isSetHeight() {
                            return (this.height!= null);
                        }

                        public void unsetHeight() {
                            this.height = null;
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
                     *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="dz" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                    public static class CornerRoad
                        implements Serializable
                    {

                        private final static long serialVersionUID = 1L;
                        protected List<UserData> userData;
                        protected List<Include> include;
                        @XmlAttribute(name = "s")
                        protected Double s;
                        @XmlAttribute(name = "t")
                        protected Double t;
                        @XmlAttribute(name = "dz")
                        protected Double dz;
                        @XmlAttribute(name = "height")
                        protected Double height;

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
                         * Obtiene el valor de la propiedad s.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getS() {
                            return s;
                        }

                        /**
                         * Define el valor de la propiedad s.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setS(double value) {
                            this.s = value;
                        }

                        public boolean isSetS() {
                            return (this.s!= null);
                        }

                        public void unsetS() {
                            this.s = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad t.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getT() {
                            return t;
                        }

                        /**
                         * Define el valor de la propiedad t.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setT(double value) {
                            this.t = value;
                        }

                        public boolean isSetT() {
                            return (this.t!= null);
                        }

                        public void unsetT() {
                            this.t = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad dz.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getDz() {
                            return dz;
                        }

                        /**
                         * Define el valor de la propiedad dz.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setDz(double value) {
                            this.dz = value;
                        }

                        public boolean isSetDz() {
                            return (this.dz!= null);
                        }

                        public void unsetDz() {
                            this.dz = null;
                        }

                        /**
                         * Obtiene el valor de la propiedad height.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public double getHeight() {
                            return height;
                        }

                        /**
                         * Define el valor de la propiedad height.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setHeight(double value) {
                            this.height = value;
                        }

                        public boolean isSetHeight() {
                            return (this.height!= null);
                        }

                        public void unsetHeight() {
                            this.height = null;
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
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *       &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                public static class Repeat
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;
                    @XmlAttribute(name = "s")
                    protected Double s;
                    @XmlAttribute(name = "length")
                    protected Double length;
                    @XmlAttribute(name = "distance")
                    protected Double distance;

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
                     * Obtiene el valor de la propiedad s.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getS() {
                        return s;
                    }

                    /**
                     * Define el valor de la propiedad s.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setS(double value) {
                        this.s = value;
                    }

                    public boolean isSetS() {
                        return (this.s!= null);
                    }

                    public void unsetS() {
                        this.s = null;
                    }

                    /**
                     * Obtiene el valor de la propiedad length.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getLength() {
                        return length;
                    }

                    /**
                     * Define el valor de la propiedad length.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setLength(double value) {
                        this.length = value;
                    }

                    public boolean isSetLength() {
                        return (this.length!= null);
                    }

                    public void unsetLength() {
                        this.length = null;
                    }

                    /**
                     * Obtiene el valor de la propiedad distance.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getDistance() {
                        return distance;
                    }

                    /**
                     * Define el valor de la propiedad distance.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setDistance(double value) {
                        this.distance = value;
                    }

                    public boolean isSetDistance() {
                        return (this.distance!= null);
                    }

                    public void unsetDistance() {
                        this.distance = null;
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
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="validLength" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "validity",
                "userData",
                "include"
            })
            public static class ObjectReference
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<LaneValidity> validity;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "t")
                protected Double t;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "zOffset")
                protected Double zOffset;
                @XmlAttribute(name = "validLength")
                protected Double validLength;
                @XmlAttribute(name = "orientation")
                protected String orientation;

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad t.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getT() {
                    return t;
                }

                /**
                 * Define el valor de la propiedad t.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setT(double value) {
                    this.t = value;
                }

                public boolean isSetT() {
                    return (this.t!= null);
                }

                public void unsetT() {
                    this.t = null;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
                }

                /**
                 * Obtiene el valor de la propiedad zOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getZOffset() {
                    return zOffset;
                }

                /**
                 * Define el valor de la propiedad zOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setZOffset(double value) {
                    this.zOffset = value;
                }

                public boolean isSetZOffset() {
                    return (this.zOffset!= null);
                }

                public void unsetZOffset() {
                    this.zOffset = null;
                }

                /**
                 * Obtiene el valor de la propiedad validLength.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getValidLength() {
                    return validLength;
                }

                /**
                 * Define el valor de la propiedad validLength.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setValidLength(double value) {
                    this.validLength = value;
                }

                public boolean isSetValidLength() {
                    return (this.validLength!= null);
                }

                public void unsetValidLength() {
                    this.validLength = null;
                }

                /**
                 * Obtiene el valor de la propiedad orientation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrientation() {
                    return orientation;
                }

                /**
                 * Define el valor de la propiedad orientation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrientation(String value) {
                    this.orientation = value;
                }

                public boolean isSetOrientation() {
                    return (this.orientation!= null);
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
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="lighting" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="daylight" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "validity",
                "userData",
                "include"
            })
            public static class Tunnel
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<LaneValidity> validity;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "length")
                protected Double length;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "lighting")
                protected Double lighting;
                @XmlAttribute(name = "daylight")
                protected Double daylight;

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad length.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getLength() {
                    return length;
                }

                /**
                 * Define el valor de la propiedad length.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLength(double value) {
                    this.length = value;
                }

                public boolean isSetLength() {
                    return (this.length!= null);
                }

                public void unsetLength() {
                    this.length = null;
                }

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                public boolean isSetName() {
                    return (this.name!= null);
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
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
                 * Obtiene el valor de la propiedad lighting.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getLighting() {
                    return lighting;
                }

                /**
                 * Define el valor de la propiedad lighting.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLighting(double value) {
                    this.lighting = value;
                }

                public boolean isSetLighting() {
                    return (this.lighting!= null);
                }

                public void unsetLighting() {
                    this.lighting = null;
                }

                /**
                 * Obtiene el valor de la propiedad daylight.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getDaylight() {
                    return daylight;
                }

                /**
                 * Define el valor de la propiedad daylight.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setDaylight(double value) {
                    this.daylight = value;
                }

                public boolean isSetDaylight() {
                    return (this.daylight!= null);
                }

                public void unsetDaylight() {
                    this.daylight = null;
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
         *         &lt;element name="geometry" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="line">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="spiral">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="curvStart" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="curvEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="arc">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="curvature" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="poly3">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                           &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/choice>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "geometry"
        })
        public static class PlanView
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(required = true)
            protected List<OpenDRIVE.Road.PlanView.Geometry> geometry;

            /**
             * Gets the value of the geometry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geometry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeometry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.PlanView.Geometry }
             * 
             * 
             */
            public List<OpenDRIVE.Road.PlanView.Geometry> getGeometry() {
                if (geometry == null) {
                    geometry = new ArrayList<OpenDRIVE.Road.PlanView.Geometry>();
                }
                return this.geometry;
            }

            public boolean isSetGeometry() {
                return ((this.geometry!= null)&&(!this.geometry.isEmpty()));
            }

            public void unsetGeometry() {
                this.geometry = null;
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
             *       &lt;choice>
             *         &lt;element name="line">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="spiral">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="curvStart" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="curvEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="arc">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="curvature" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="poly3">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="b" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                 &lt;attribute name="d" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/choice>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="hdg" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "line",
                "spiral",
                "arc",
                "poly3",
                "userData",
                "include"
            })
            public static class Geometry
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected OpenDRIVE.Road.PlanView.Geometry.Line line;
                protected OpenDRIVE.Road.PlanView.Geometry.Spiral spiral;
                protected OpenDRIVE.Road.PlanView.Geometry.Arc arc;
                protected OpenDRIVE.Road.PlanView.Geometry.Poly3 poly3;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "x")
                protected Double x;
                @XmlAttribute(name = "y")
                protected Double y;
                @XmlAttribute(name = "hdg")
                protected Double hdg;
                @XmlAttribute(name = "length")
                protected Double length;

                /**
                 * Obtiene el valor de la propiedad line.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Line }
                 *     
                 */
                public OpenDRIVE.Road.PlanView.Geometry.Line getLine() {
                    return line;
                }

                /**
                 * Define el valor de la propiedad line.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Line }
                 *     
                 */
                public void setLine(OpenDRIVE.Road.PlanView.Geometry.Line value) {
                    this.line = value;
                }

                public boolean isSetLine() {
                    return (this.line!= null);
                }

                /**
                 * Obtiene el valor de la propiedad spiral.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Spiral }
                 *     
                 */
                public OpenDRIVE.Road.PlanView.Geometry.Spiral getSpiral() {
                    return spiral;
                }

                /**
                 * Define el valor de la propiedad spiral.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Spiral }
                 *     
                 */
                public void setSpiral(OpenDRIVE.Road.PlanView.Geometry.Spiral value) {
                    this.spiral = value;
                }

                public boolean isSetSpiral() {
                    return (this.spiral!= null);
                }

                /**
                 * Obtiene el valor de la propiedad arc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Arc }
                 *     
                 */
                public OpenDRIVE.Road.PlanView.Geometry.Arc getArc() {
                    return arc;
                }

                /**
                 * Define el valor de la propiedad arc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Arc }
                 *     
                 */
                public void setArc(OpenDRIVE.Road.PlanView.Geometry.Arc value) {
                    this.arc = value;
                }

                public boolean isSetArc() {
                    return (this.arc!= null);
                }

                /**
                 * Obtiene el valor de la propiedad poly3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Poly3 }
                 *     
                 */
                public OpenDRIVE.Road.PlanView.Geometry.Poly3 getPoly3() {
                    return poly3;
                }

                /**
                 * Define el valor de la propiedad poly3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OpenDRIVE.Road.PlanView.Geometry.Poly3 }
                 *     
                 */
                public void setPoly3(OpenDRIVE.Road.PlanView.Geometry.Poly3 value) {
                    this.poly3 = value;
                }

                public boolean isSetPoly3() {
                    return (this.poly3 != null);
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad x.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getX() {
                    return x;
                }

                /**
                 * Define el valor de la propiedad x.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setX(double value) {
                    this.x = value;
                }

                public boolean isSetX() {
                    return (this.x!= null);
                }

                public void unsetX() {
                    this.x = null;
                }

                /**
                 * Obtiene el valor de la propiedad y.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getY() {
                    return y;
                }

                /**
                 * Define el valor de la propiedad y.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setY(double value) {
                    this.y = value;
                }

                public boolean isSetY() {
                    return (this.y!= null);
                }

                public void unsetY() {
                    this.y = null;
                }

                /**
                 * Obtiene el valor de la propiedad hdg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getHdg() {
                    return hdg;
                }

                /**
                 * Define el valor de la propiedad hdg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setHdg(double value) {
                    this.hdg = value;
                }

                public boolean isSetHdg() {
                    return (this.hdg!= null);
                }

                public void unsetHdg() {
                    this.hdg = null;
                }

                /**
                 * Obtiene el valor de la propiedad length.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getLength() {
                    return length;
                }

                /**
                 * Define el valor de la propiedad length.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setLength(double value) {
                    this.length = value;
                }

                public boolean isSetLength() {
                    return (this.length!= null);
                }

                public void unsetLength() {
                    this.length = null;
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
                 *       &lt;attribute name="curvature" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                public static class Arc
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;
                    @XmlAttribute(name = "curvature")
                    protected Double curvature;

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
                     * Obtiene el valor de la propiedad curvature.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getCurvature() {
                        return curvature;
                    }

                    /**
                     * Define el valor de la propiedad curvature.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setCurvature(double value) {
                        this.curvature = value;
                    }

                    public boolean isSetCurvature() {
                        return (this.curvature!= null);
                    }

                    public void unsetCurvature() {
                        this.curvature = null;
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
                public static class Line
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;

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
                public static class Poly3
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;
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
                 *       &lt;attribute name="curvStart" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *       &lt;attribute name="curvEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                public static class Spiral
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;
                    @XmlAttribute(name = "curvStart")
                    protected Double curvStart;
                    @XmlAttribute(name = "curvEnd")
                    protected Double curvEnd;

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
                     * Obtiene el valor de la propiedad curvStart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getCurvStart() {
                        return curvStart;
                    }

                    /**
                     * Define el valor de la propiedad curvStart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setCurvStart(double value) {
                        this.curvStart = value;
                    }

                    public boolean isSetCurvStart() {
                        return (this.curvStart!= null);
                    }

                    public void unsetCurvStart() {
                        this.curvStart = null;
                    }

                    /**
                     * Obtiene el valor de la propiedad curvEnd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public double getCurvEnd() {
                        return curvEnd;
                    }

                    /**
                     * Define el valor de la propiedad curvEnd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setCurvEnd(double value) {
                        this.curvEnd = value;
                    }

                    public boolean isSetCurvEnd() {
                        return (this.curvEnd!= null);
                    }

                    public void unsetCurvEnd() {
                        this.curvEnd = null;
                    }

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
         *         &lt;element name="signal" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="dependency" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="signalReference" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "signal",
            "signalReference",
            "userData",
            "include"
        })
        public static class Signals
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<OpenDRIVE.Road.Signals.Signal> signal;
            protected List<OpenDRIVE.Road.Signals.SignalReference> signalReference;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Gets the value of the signal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the signal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSignal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Signals.Signal }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Signals.Signal> getSignal() {
                if (signal == null) {
                    signal = new ArrayList<OpenDRIVE.Road.Signals.Signal>();
                }
                return this.signal;
            }

            public boolean isSetSignal() {
                return ((this.signal!= null)&&(!this.signal.isEmpty()));
            }

            public void unsetSignal() {
                this.signal = null;
            }

            /**
             * Gets the value of the signalReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the signalReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSignalReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Signals.SignalReference }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Signals.SignalReference> getSignalReference() {
                if (signalReference == null) {
                    signalReference = new ArrayList<OpenDRIVE.Road.Signals.SignalReference>();
                }
                return this.signalReference;
            }

            public boolean isSetSignalReference() {
                return ((this.signalReference!= null)&&(!this.signalReference.isEmpty()));
            }

            public void unsetSignalReference() {
                this.signalReference = null;
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
             *       &lt;sequence>
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="dependency" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "validity",
                "dependency",
                "userData",
                "include"
            })
            public static class Signal
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<LaneValidity> validity;
                protected List<OpenDRIVE.Road.Signals.Signal.Dependency> dependency;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "t")
                protected Double t;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "dynamic")
                protected String dynamic;
                @XmlAttribute(name = "orientation")
                protected String orientation;
                @XmlAttribute(name = "zOffset")
                protected Double zOffset;
                @XmlAttribute(name = "country")
                protected String country;
                @XmlAttribute(name = "type")
                protected Integer type;
                @XmlAttribute(name = "subtype")
                protected Integer subtype;
                @XmlAttribute(name = "value")
                protected Double value;

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
                }

                /**
                 * Gets the value of the dependency property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dependency property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDependency().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OpenDRIVE.Road.Signals.Signal.Dependency }
                 * 
                 * 
                 */
                public List<OpenDRIVE.Road.Signals.Signal.Dependency> getDependency() {
                    if (dependency == null) {
                        dependency = new ArrayList<OpenDRIVE.Road.Signals.Signal.Dependency>();
                    }
                    return this.dependency;
                }

                public boolean isSetDependency() {
                    return ((this.dependency!= null)&&(!this.dependency.isEmpty()));
                }

                public void unsetDependency() {
                    this.dependency = null;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad t.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getT() {
                    return t;
                }

                /**
                 * Define el valor de la propiedad t.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setT(double value) {
                    this.t = value;
                }

                public boolean isSetT() {
                    return (this.t!= null);
                }

                public void unsetT() {
                    this.t = null;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
                }

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                public boolean isSetName() {
                    return (this.name!= null);
                }

                /**
                 * Obtiene el valor de la propiedad dynamic.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDynamic() {
                    return dynamic;
                }

                /**
                 * Define el valor de la propiedad dynamic.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDynamic(String value) {
                    this.dynamic = value;
                }

                public boolean isSetDynamic() {
                    return (this.dynamic!= null);
                }

                /**
                 * Obtiene el valor de la propiedad orientation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrientation() {
                    return orientation;
                }

                /**
                 * Define el valor de la propiedad orientation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrientation(String value) {
                    this.orientation = value;
                }

                public boolean isSetOrientation() {
                    return (this.orientation!= null);
                }

                /**
                 * Obtiene el valor de la propiedad zOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getZOffset() {
                    return zOffset;
                }

                /**
                 * Define el valor de la propiedad zOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setZOffset(double value) {
                    this.zOffset = value;
                }

                public boolean isSetZOffset() {
                    return (this.zOffset!= null);
                }

                public void unsetZOffset() {
                    this.zOffset = null;
                }

                /**
                 * Obtiene el valor de la propiedad country.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Define el valor de la propiedad country.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                public boolean isSetCountry() {
                    return (this.country!= null);
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setType(int value) {
                    this.type = value;
                }

                public boolean isSetType() {
                    return (this.type!= null);
                }

                public void unsetType() {
                    this.type = null;
                }

                /**
                 * Obtiene el valor de la propiedad subtype.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getSubtype() {
                    return subtype;
                }

                /**
                 * Define el valor de la propiedad subtype.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSubtype(int value) {
                    this.subtype = value;
                }

                public boolean isSetSubtype() {
                    return (this.subtype!= null);
                }

                public void unsetSubtype() {
                    this.subtype = null;
                }

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                public boolean isSetValue() {
                    return (this.value!= null);
                }

                public void unsetValue() {
                    this.value = null;
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
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Dependency
                    implements Serializable
                {

                    private final static long serialVersionUID = 1L;
                    protected List<UserData> userData;
                    protected List<Include> include;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "type")
                    protected String type;

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
                     *     {@link String }
                     *     
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                    public boolean isSetId() {
                        return (this.id!= null);
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
             *         &lt;element name="validity" type="{}laneValidity" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="t" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "validity",
                "userData",
                "include"
            })
            public static class SignalReference
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<LaneValidity> validity;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "s")
                protected Double s;
                @XmlAttribute(name = "t")
                protected Double t;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "orientation")
                protected String orientation;

                /**
                 * Gets the value of the validity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LaneValidity }
                 * 
                 * 
                 */
                public List<LaneValidity> getValidity() {
                    if (validity == null) {
                        validity = new ArrayList<LaneValidity>();
                    }
                    return this.validity;
                }

                public boolean isSetValidity() {
                    return ((this.validity!= null)&&(!this.validity.isEmpty()));
                }

                public void unsetValidity() {
                    this.validity = null;
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
                 * Obtiene el valor de la propiedad s.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getS() {
                    return s;
                }

                /**
                 * Define el valor de la propiedad s.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setS(double value) {
                    this.s = value;
                }

                public boolean isSetS() {
                    return (this.s!= null);
                }

                public void unsetS() {
                    this.s = null;
                }

                /**
                 * Obtiene el valor de la propiedad t.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getT() {
                    return t;
                }

                /**
                 * Define el valor de la propiedad t.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setT(double value) {
                    this.t = value;
                }

                public boolean isSetT() {
                    return (this.t!= null);
                }

                public void unsetT() {
                    this.t = null;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                public boolean isSetId() {
                    return (this.id!= null);
                }

                /**
                 * Obtiene el valor de la propiedad orientation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrientation() {
                    return orientation;
                }

                /**
                 * Define el valor de la propiedad orientation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrientation(String value) {
                    this.orientation = value;
                }

                public boolean isSetOrientation() {
                    return (this.orientation!= null);
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
         *         &lt;element name="CRG" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="sStart" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="sEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="tOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="zScale" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                 &lt;attribute name="hOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            "crg",
            "userData",
            "include"
        })
        public static class Surface
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(name = "CRG")
            protected List<OpenDRIVE.Road.Surface.CRG> crg;
            protected List<UserData> userData;
            protected List<Include> include;

            /**
             * Gets the value of the crg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the crg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCRG().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OpenDRIVE.Road.Surface.CRG }
             * 
             * 
             */
            public List<OpenDRIVE.Road.Surface.CRG> getCRG() {
                if (crg == null) {
                    crg = new ArrayList<OpenDRIVE.Road.Surface.CRG>();
                }
                return this.crg;
            }

            public boolean isSetCRG() {
                return ((this.crg!= null)&&(!this.crg.isEmpty()));
            }

            public void unsetCRG() {
                this.crg = null;
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
             *       &lt;sequence>
             *         &lt;element name="userData" type="{}userData" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="include" type="{}include" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="sStart" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="sEnd" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="sOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="tOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="zOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="zScale" type="{http://www.w3.org/2001/XMLSchema}double" />
             *       &lt;attribute name="hOffset" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            public static class CRG
                implements Serializable
            {

                private final static long serialVersionUID = 1L;
                protected List<UserData> userData;
                protected List<Include> include;
                @XmlAttribute(name = "file")
                protected String file;
                @XmlAttribute(name = "sStart")
                protected Double sStart;
                @XmlAttribute(name = "sEnd")
                protected Double sEnd;
                @XmlAttribute(name = "orientation")
                protected String orientation;
                @XmlAttribute(name = "mode")
                protected String mode;
                @XmlAttribute(name = "sOffset")
                protected Double sOffset;
                @XmlAttribute(name = "tOffset")
                protected Double tOffset;
                @XmlAttribute(name = "zOffset")
                protected Double zOffset;
                @XmlAttribute(name = "zScale")
                protected Double zScale;
                @XmlAttribute(name = "hOffset")
                protected Double hOffset;

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
                 * Obtiene el valor de la propiedad file.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFile() {
                    return file;
                }

                /**
                 * Define el valor de la propiedad file.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFile(String value) {
                    this.file = value;
                }

                public boolean isSetFile() {
                    return (this.file!= null);
                }

                /**
                 * Obtiene el valor de la propiedad sStart.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getSStart() {
                    return sStart;
                }

                /**
                 * Define el valor de la propiedad sStart.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setSStart(double value) {
                    this.sStart = value;
                }

                public boolean isSetSStart() {
                    return (this.sStart!= null);
                }

                public void unsetSStart() {
                    this.sStart = null;
                }

                /**
                 * Obtiene el valor de la propiedad sEnd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getSEnd() {
                    return sEnd;
                }

                /**
                 * Define el valor de la propiedad sEnd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setSEnd(double value) {
                    this.sEnd = value;
                }

                public boolean isSetSEnd() {
                    return (this.sEnd!= null);
                }

                public void unsetSEnd() {
                    this.sEnd = null;
                }

                /**
                 * Obtiene el valor de la propiedad orientation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrientation() {
                    return orientation;
                }

                /**
                 * Define el valor de la propiedad orientation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrientation(String value) {
                    this.orientation = value;
                }

                public boolean isSetOrientation() {
                    return (this.orientation!= null);
                }

                /**
                 * Obtiene el valor de la propiedad mode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMode() {
                    return mode;
                }

                /**
                 * Define el valor de la propiedad mode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMode(String value) {
                    this.mode = value;
                }

                public boolean isSetMode() {
                    return (this.mode!= null);
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
                 * Obtiene el valor de la propiedad tOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getTOffset() {
                    return tOffset;
                }

                /**
                 * Define el valor de la propiedad tOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setTOffset(double value) {
                    this.tOffset = value;
                }

                public boolean isSetTOffset() {
                    return (this.tOffset!= null);
                }

                public void unsetTOffset() {
                    this.tOffset = null;
                }

                /**
                 * Obtiene el valor de la propiedad zOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getZOffset() {
                    return zOffset;
                }

                /**
                 * Define el valor de la propiedad zOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setZOffset(double value) {
                    this.zOffset = value;
                }

                public boolean isSetZOffset() {
                    return (this.zOffset!= null);
                }

                public void unsetZOffset() {
                    this.zOffset = null;
                }

                /**
                 * Obtiene el valor de la propiedad zScale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getZScale() {
                    return zScale;
                }

                /**
                 * Define el valor de la propiedad zScale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setZScale(double value) {
                    this.zScale = value;
                }

                public boolean isSetZScale() {
                    return (this.zScale!= null);
                }

                public void unsetZScale() {
                    this.zScale = null;
                }

                /**
                 * Obtiene el valor de la propiedad hOffset.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public double getHOffset() {
                    return hOffset;
                }

                /**
                 * Define el valor de la propiedad hOffset.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setHOffset(double value) {
                    this.hOffset = value;
                }

                public boolean isSetHOffset() {
                    return (this.hOffset!= null);
                }

                public void unsetHOffset() {
                    this.hOffset = null;
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
         *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Type
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            protected List<UserData> userData;
            protected List<Include> include;
            @XmlAttribute(name = "s")
            protected Double s;
            @XmlAttribute(name = "type")
            protected String type;

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
             * Obtiene el valor de la propiedad s.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public double getS() {
                return s;
            }

            /**
             * Define el valor de la propiedad s.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setS(double value) {
                this.s = value;
            }

            public boolean isSetS() {
                return (this.s!= null);
            }

            public void unsetS() {
                this.s = null;
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

        }

    }

}
