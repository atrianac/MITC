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
 * <p>Clase Java para OptimalVelocityFunctionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OptimalVelocityFunctionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bando"/>
 *     &lt;enumeration value="triangular"/>
 *     &lt;enumeration value="threephase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptimalVelocityFunctionEnum")
@XmlEnum
public enum OptimalVelocityFunctionEnum {

    @XmlEnumValue("bando")
    BANDO("bando"),
    @XmlEnumValue("triangular")
    TRIANGULAR("triangular"),
    @XmlEnumValue("threephase")
    THREEPHASE("threephase");
    private final String value;

    OptimalVelocityFunctionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptimalVelocityFunctionEnum fromValue(String v) {
        for (OptimalVelocityFunctionEnum c: OptimalVelocityFunctionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
