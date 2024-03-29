//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 09:48:48 PM CEST 
//


package com.thingtrack.training.vertica.sgij.domain;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for RegistroPeriodicoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistroPeriodicoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cnjuego.gob.es/sci/v2.13.xsd}RegistroBase">
 *       &lt;sequence>
 *         &lt;element name="Periodicidad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Diaria"/>
 *               &lt;enumeration value="Mensual"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Periodo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://cnjuego.gob.es/sci/v2.13.xsd}Periodo">
 *                 &lt;choice>
 *                   &lt;element name="Dia" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaammdd"/>
 *                   &lt;element name="Mes" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaamm"/>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroPeriodicoBase", propOrder = {
    "periodicidad",
    "periodo"
})
@XmlSeeAlso({
    RegistroRUT.class,
    RegistroRUD.class,
    RegistroCJT.class,
    RegistroCEVDM.class,
    RegistroCJD.class
})
@Entity(name = "RegistroPeriodicoBase")
@Table(name = "REGISTROPERIODICOBASE", schema = "sgij")
public abstract class RegistroPeriodicoBase
    extends RegistroBase
    implements Equals, HashCode
{

    @XmlElement(name = "Periodicidad", required = true)
    protected String periodicidad;
    @XmlElement(name = "Periodo", required = true)
    protected RegistroPeriodicoBase.Periodo periodo;

    /**
     * Gets the value of the periodicidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PERIODICIDAD")
    public String getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Sets the value of the periodicidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidad(String value) {
        this.periodicidad = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link RegistroPeriodicoBase.Periodo }
     *     
     */
    @ManyToOne(targetEntity = RegistroPeriodicoBase.Periodo.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERIODO_REGISTROPERIODICOBAS_0")
    public RegistroPeriodicoBase.Periodo getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroPeriodicoBase.Periodo }
     *     
     */
    public void setPeriodo(RegistroPeriodicoBase.Periodo value) {
        this.periodo = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RegistroPeriodicoBase)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegistroPeriodicoBase that = ((RegistroPeriodicoBase) object);
        {
            String lhsPeriodicidad;
            lhsPeriodicidad = this.getPeriodicidad();
            String rhsPeriodicidad;
            rhsPeriodicidad = that.getPeriodicidad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periodicidad", lhsPeriodicidad), LocatorUtils.property(thatLocator, "periodicidad", rhsPeriodicidad), lhsPeriodicidad, rhsPeriodicidad)) {
                return false;
            }
        }
        {
            RegistroPeriodicoBase.Periodo lhsPeriodo;
            lhsPeriodo = this.getPeriodo();
            RegistroPeriodicoBase.Periodo rhsPeriodo;
            rhsPeriodo = that.getPeriodo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periodo", lhsPeriodo), LocatorUtils.property(thatLocator, "periodo", rhsPeriodo), lhsPeriodo, rhsPeriodo)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String thePeriodicidad;
            thePeriodicidad = this.getPeriodicidad();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periodicidad", thePeriodicidad), currentHashCode, thePeriodicidad);
        }
        {
            RegistroPeriodicoBase.Periodo thePeriodo;
            thePeriodo = this.getPeriodo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periodo", thePeriodo), currentHashCode, thePeriodo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://cnjuego.gob.es/sci/v2.13.xsd}Periodo">
     *       &lt;choice>
     *         &lt;element name="Dia" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaammdd"/>
     *         &lt;element name="Mes" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaamm"/>
     *       &lt;/choice>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dia",
        "mes"
    })
    @Entity(name = "RegistroPeriodicoBase$Periodo")
    @Table(name = "PERIODO_0", schema = "sgij")
    public static class Periodo
        extends com.thingtrack.training.vertica.sgij.domain.Periodo
        implements Equals, HashCode
    {

        @XmlElement(name = "Dia")
        protected String dia;
        @XmlElement(name = "Mes")
        protected String mes;

        /**
         * Gets the value of the dia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "DIA", length = 255)
        public String getDia() {
            return dia;
        }

        /**
         * Sets the value of the dia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDia(String value) {
            this.dia = value;
        }

        /**
         * Gets the value of the mes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "MES", length = 255)
        public String getMes() {
            return mes;
        }

        /**
         * Sets the value of the mes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMes(String value) {
            this.mes = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof RegistroPeriodicoBase.Periodo)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final RegistroPeriodicoBase.Periodo that = ((RegistroPeriodicoBase.Periodo) object);
            {
                String lhsDia;
                lhsDia = this.getDia();
                String rhsDia;
                rhsDia = that.getDia();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dia", lhsDia), LocatorUtils.property(thatLocator, "dia", rhsDia), lhsDia, rhsDia)) {
                    return false;
                }
            }
            {
                String lhsMes;
                lhsMes = this.getMes();
                String rhsMes;
                rhsMes = that.getMes();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mes", lhsMes), LocatorUtils.property(thatLocator, "mes", rhsMes), lhsMes, rhsMes)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = super.hashCode(locator, strategy);
            {
                String theDia;
                theDia = this.getDia();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dia", theDia), currentHashCode, theDia);
            }
            {
                String theMes;
                theMes = this.getMes();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mes", theMes), currentHashCode, theMes);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
