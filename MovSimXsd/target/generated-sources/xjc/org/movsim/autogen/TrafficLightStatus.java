//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.05 a las 09:47:49 PM COT 
//


package org.movsim.autogen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrafficLightStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficLightStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="RedGreen"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="GreenRed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficLightStatus")
@XmlEnum
public enum TrafficLightStatus {

    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("RedGreen")
    RED_GREEN("RedGreen"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("GreenRed")
    GREEN_RED("GreenRed");
    private final String value;

    TrafficLightStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficLightStatus fromValue(String v) {
        for (TrafficLightStatus c: TrafficLightStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
