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
 * <p>Java class for TipoJuego.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoJuego">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADC"/>
 *     &lt;enumeration value="AHC"/>
 *     &lt;enumeration value="ADX"/>
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="AHM"/>
 *     &lt;enumeration value="AHX"/>
 *     &lt;enumeration value="AOC"/>
 *     &lt;enumeration value="AOX"/>
 *     &lt;enumeration value="POC"/>
 *     &lt;enumeration value="POT"/>
 *     &lt;enumeration value="AZA"/>
 *     &lt;enumeration value="BLJ"/>
 *     &lt;enumeration value="BNG"/>
 *     &lt;enumeration value="PUN"/>
 *     &lt;enumeration value="RLT"/>
 *     &lt;enumeration value="COC"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="PDM"/>
 *     &lt;enumeration value="PHM"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PLP"/>
 *     &lt;enumeration value="PEU"/>
 *     &lt;enumeration value="PBL"/>
 *     &lt;enumeration value="PGP"/>
 *     &lt;enumeration value="PLT"/>
 *     &lt;enumeration value="OLN"/>
 *     &lt;enumeration value="OLP"/>
 *     &lt;enumeration value="OEU"/>
 *     &lt;enumeration value="OBL"/>
 *     &lt;enumeration value="OGP"/>
 *     &lt;enumeration value="OLT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoJuego")
@XmlEnum
public enum TipoJuego {

    ADC,
    AHC,
    ADX,
    ADM,
    AHM,
    AHX,
    AOC,
    AOX,
    POC,
    POT,
    AZA,
    BLJ,
    BNG,
    PUN,
    RLT,
    COC,
    COM,
    PDM,
    PHM,
    PLN,
    PLP,
    PEU,
    PBL,
    PGP,
    PLT,
    OLN,
    OLP,
    OEU,
    OBL,
    OGP,
    OLT;

    public String value() {
        return name();
    }

    public static TipoJuego fromValue(String v) {
        return valueOf(v);
    }

}