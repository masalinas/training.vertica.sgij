//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 09:48:48 PM CEST 
//


package com.thingtrack.training.vertica.sgij.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DesgloseMedioPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesgloseMedioPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
 *         &lt;element name="Desglose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MedioPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TipoMedioPago" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoMedioPago"/>
 *                   &lt;element name="OtroTipoEspecificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
 *                 &lt;/sequence>
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
@XmlType(name = "DesgloseMedioPago", propOrder = {
    "total",
    "desglose"
})
@Entity(name = "DesgloseMedioPago")
@Table(name = "DESGLOSEMEDIOPAGO", schema = "sgij")
@Inheritance(strategy = InheritanceType.JOINED)
public class DesgloseMedioPago
    implements Equals, HashCode
{

    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "Desglose")
    protected List<DesgloseMedioPago.Desglose> desglose;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "TOTAL", precision = 20, scale = 2)
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the desglose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desglose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesglose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesgloseMedioPago.Desglose }
     * 
     * 
     */
    @OneToMany(targetEntity = DesgloseMedioPago.Desglose.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESGLOSE_DESGLOSEMEDIOPAGO_H_0")
    public List<DesgloseMedioPago.Desglose> getDesglose() {
        if (desglose == null) {
            desglose = new ArrayList<DesgloseMedioPago.Desglose>();
        }
        return this.desglose;
    }

    /**
     * 
     * 
     */
    public void setDesglose(List<DesgloseMedioPago.Desglose> desglose) {
        this.desglose = desglose;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DesgloseMedioPago)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DesgloseMedioPago that = ((DesgloseMedioPago) object);
        {
            BigDecimal lhsTotal;
            lhsTotal = this.getTotal();
            BigDecimal rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                return false;
            }
        }
        {
            List<DesgloseMedioPago.Desglose> lhsDesglose;
            lhsDesglose = (((this.desglose!= null)&&(!this.desglose.isEmpty()))?this.getDesglose():null);
            List<DesgloseMedioPago.Desglose> rhsDesglose;
            rhsDesglose = (((that.desglose!= null)&&(!that.desglose.isEmpty()))?that.getDesglose():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desglose", lhsDesglose), LocatorUtils.property(thatLocator, "desglose", rhsDesglose), lhsDesglose, rhsDesglose)) {
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
        int currentHashCode = 1;
        {
            BigDecimal theTotal;
            theTotal = this.getTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        {
            List<DesgloseMedioPago.Desglose> theDesglose;
            theDesglose = (((this.desglose!= null)&&(!this.desglose.isEmpty()))?this.getDesglose():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desglose", theDesglose), currentHashCode, theDesglose);
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MedioPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TipoMedioPago" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoMedioPago"/>
     *         &lt;element name="OtroTipoEspecificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
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
        "medioPago",
        "tipoMedioPago",
        "otroTipoEspecificar",
        "importe"
    })
    @Entity(name = "DesgloseMedioPago$Desglose")
    @Table(name = "DESGLOSE_3", schema = "sgij")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Desglose
        implements Equals, HashCode
    {

        @XmlElement(name = "MedioPago", required = true)
        protected String medioPago;
        @XmlElement(name = "TipoMedioPago", required = true)
        protected String tipoMedioPago;
        @XmlElement(name = "OtroTipoEspecificar")
        protected String otroTipoEspecificar;
        @XmlElement(name = "Importe", required = true)
        protected BigDecimal importe;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the medioPago property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "MEDIOPAGO", length = 255)
        public String getMedioPago() {
            return medioPago;
        }

        /**
         * Sets the value of the medioPago property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedioPago(String value) {
            this.medioPago = value;
        }

        /**
         * Gets the value of the tipoMedioPago property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "TIPOMEDIOPAGO", length = 255)
        public String getTipoMedioPago() {
            return tipoMedioPago;
        }

        /**
         * Sets the value of the tipoMedioPago property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoMedioPago(String value) {
            this.tipoMedioPago = value;
        }

        /**
         * Gets the value of the otroTipoEspecificar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "OTROTIPOESPECIFICAR", length = 255)
        public String getOtroTipoEspecificar() {
            return otroTipoEspecificar;
        }

        /**
         * Sets the value of the otroTipoEspecificar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtroTipoEspecificar(String value) {
            this.otroTipoEspecificar = value;
        }

        /**
         * Gets the value of the importe property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Basic
        @Column(name = "IMPORTE", precision = 20, scale = 2)
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Sets the value of the importe property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DesgloseMedioPago.Desglose)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DesgloseMedioPago.Desglose that = ((DesgloseMedioPago.Desglose) object);
            {
                String lhsMedioPago;
                lhsMedioPago = this.getMedioPago();
                String rhsMedioPago;
                rhsMedioPago = that.getMedioPago();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "medioPago", lhsMedioPago), LocatorUtils.property(thatLocator, "medioPago", rhsMedioPago), lhsMedioPago, rhsMedioPago)) {
                    return false;
                }
            }
            {
                String lhsTipoMedioPago;
                lhsTipoMedioPago = this.getTipoMedioPago();
                String rhsTipoMedioPago;
                rhsTipoMedioPago = that.getTipoMedioPago();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tipoMedioPago", lhsTipoMedioPago), LocatorUtils.property(thatLocator, "tipoMedioPago", rhsTipoMedioPago), lhsTipoMedioPago, rhsTipoMedioPago)) {
                    return false;
                }
            }
            {
                String lhsOtroTipoEspecificar;
                lhsOtroTipoEspecificar = this.getOtroTipoEspecificar();
                String rhsOtroTipoEspecificar;
                rhsOtroTipoEspecificar = that.getOtroTipoEspecificar();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "otroTipoEspecificar", lhsOtroTipoEspecificar), LocatorUtils.property(thatLocator, "otroTipoEspecificar", rhsOtroTipoEspecificar), lhsOtroTipoEspecificar, rhsOtroTipoEspecificar)) {
                    return false;
                }
            }
            {
                BigDecimal lhsImporte;
                lhsImporte = this.getImporte();
                BigDecimal rhsImporte;
                rhsImporte = that.getImporte();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "importe", lhsImporte), LocatorUtils.property(thatLocator, "importe", rhsImporte), lhsImporte, rhsImporte)) {
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
            int currentHashCode = 1;
            {
                String theMedioPago;
                theMedioPago = this.getMedioPago();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medioPago", theMedioPago), currentHashCode, theMedioPago);
            }
            {
                String theTipoMedioPago;
                theTipoMedioPago = this.getTipoMedioPago();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tipoMedioPago", theTipoMedioPago), currentHashCode, theTipoMedioPago);
            }
            {
                String theOtroTipoEspecificar;
                theOtroTipoEspecificar = this.getOtroTipoEspecificar();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otroTipoEspecificar", theOtroTipoEspecificar), currentHashCode, theOtroTipoEspecificar);
            }
            {
                BigDecimal theImporte;
                theImporte = this.getImporte();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importe", theImporte), currentHashCode, theImporte);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}