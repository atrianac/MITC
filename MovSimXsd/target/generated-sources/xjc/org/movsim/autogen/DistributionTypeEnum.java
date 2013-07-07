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
 * <p>Clase Java para DistributionTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="uniform"/>
 *     &lt;enumeration value="gaussian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionTypeEnum")
@XmlEnum
public enum DistributionTypeEnum {

    @XmlEnumValue("uniform")
    UNIFORM("uniform"),
    @XmlEnumValue("gaussian")
    GAUSSIAN("gaussian");
    private final String value;

    DistributionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionTypeEnum fromValue(String v) {
        for (DistributionTypeEnum c: DistributionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
