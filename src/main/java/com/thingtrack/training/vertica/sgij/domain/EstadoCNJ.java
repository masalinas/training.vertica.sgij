//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 09:48:48 PM CEST 
//


package com.thingtrack.training.vertica.sgij.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoCNJ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoCNJ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="PV"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoCNJ")
@XmlEnum
public enum EstadoCNJ {

    A,
    PV,
    S,
    C,
    SC,
    AC,
    PR,
    AE,
    O;

    public String value() {
        return name();
    }

    public static EstadoCNJ fromValue(String v) {
        return valueOf(v);
    }

}