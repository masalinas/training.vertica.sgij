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
 * <p>Java class for TipoDocumento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="OT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumento")
@XmlEnum
public enum TipoDocumento {

    ID,
    SS,
    PA,
    DL,
    OT;

    public String value() {
        return name();
    }

    public static TipoDocumento fromValue(String v) {
        return valueOf(v);
    }

}