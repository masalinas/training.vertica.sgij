//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 09:48:48 PM CEST 
//


package com.thingtrack.training.vertica.sgij.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * <p>Java class for DesgloseOperadorTipoJuego complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesgloseOperadorTipoJuego">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://cnjuego.gob.es/sci/v2.13.xsd}Importe"/>
 *         &lt;element name="Desglose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OperadorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TipoJuego" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoJuego"/>
 *                   &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}Importe"/>
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
@XmlType(name = "DesgloseOperadorTipoJuego", propOrder = {
    "total",
    "desglose"
})
@Entity(name = "DesgloseOperadorTipoJuego")
@Table(name = "DESGLOSEOPERADORTIPOJUEGO", schema = "sgij")
@Inheritance(strategy = InheritanceType.JOINED)
public class DesgloseOperadorTipoJuego
    implements Equals, HashCode
{

    @XmlElement(name = "Total", required = true)
    protected Importe total;
    @XmlElement(name = "Desglose")
    protected List<DesgloseOperadorTipoJuego.Desglose> desglose;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Importe }
     *     
     */
    @ManyToOne(targetEntity = Importe.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TOTAL_DESGLOSEOPERADORTIPOJU_0")
    public Importe getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Importe }
     *     
     */
    public void setTotal(Importe value) {
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
     * {@link DesgloseOperadorTipoJuego.Desglose }
     * 
     * 
     */
    @OneToMany(targetEntity = DesgloseOperadorTipoJuego.Desglose.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESGLOSE_DESGLOSEOPERADORTIP_0")
    public List<DesgloseOperadorTipoJuego.Desglose> getDesglose() {
        if (desglose == null) {
            desglose = new ArrayList<DesgloseOperadorTipoJuego.Desglose>();
        }
        return this.desglose;
    }

    /**
     * 
     * 
     */
    public void setDesglose(List<DesgloseOperadorTipoJuego.Desglose> desglose) {
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
        if (!(object instanceof DesgloseOperadorTipoJuego)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DesgloseOperadorTipoJuego that = ((DesgloseOperadorTipoJuego) object);
        {
            Importe lhsTotal;
            lhsTotal = this.getTotal();
            Importe rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                return false;
            }
        }
        {
            List<DesgloseOperadorTipoJuego.Desglose> lhsDesglose;
            lhsDesglose = (((this.desglose!= null)&&(!this.desglose.isEmpty()))?this.getDesglose():null);
            List<DesgloseOperadorTipoJuego.Desglose> rhsDesglose;
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
            Importe theTotal;
            theTotal = this.getTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        {
            List<DesgloseOperadorTipoJuego.Desglose> theDesglose;
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
     *         &lt;element name="OperadorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TipoJuego" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoJuego"/>
     *         &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}Importe"/>
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
        "operadorId",
        "tipoJuego",
        "importe"
    })
    @Entity(name = "DesgloseOperadorTipoJuego$Desglose")
    @Table(name = "DESGLOSE_0", schema = "sgij")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Desglose
        implements Equals, HashCode
    {

        @XmlElement(name = "OperadorId", required = true)
        protected String operadorId;
        @XmlElement(name = "TipoJuego", required = true)
        protected TipoJuego tipoJuego;
        @XmlElement(name = "Importe", required = true)
        protected Importe importe;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the operadorId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "OPERADORID", length = 255)
        public String getOperadorId() {
            return operadorId;
        }

        /**
         * Sets the value of the operadorId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperadorId(String value) {
            this.operadorId = value;
        }

        /**
         * Gets the value of the tipoJuego property.
         * 
         * @return
         *     possible object is
         *     {@link TipoJuego }
         *     
         */
        @Basic
        @Column(name = "TIPOJUEGO", length = 255)
        @Enumerated(EnumType.STRING)
        public TipoJuego getTipoJuego() {
            return tipoJuego;
        }

        /**
         * Sets the value of the tipoJuego property.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoJuego }
         *     
         */
        public void setTipoJuego(TipoJuego value) {
            this.tipoJuego = value;
        }

        /**
         * Gets the value of the importe property.
         * 
         * @return
         *     possible object is
         *     {@link Importe }
         *     
         */
        @ManyToOne(targetEntity = Importe.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "IMPORTE_DESGLOSE_0_HJID")
        public Importe getImporte() {
            return importe;
        }

        /**
         * Sets the value of the importe property.
         * 
         * @param value
         *     allowed object is
         *     {@link Importe }
         *     
         */
        public void setImporte(Importe value) {
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
            if (!(object instanceof DesgloseOperadorTipoJuego.Desglose)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DesgloseOperadorTipoJuego.Desglose that = ((DesgloseOperadorTipoJuego.Desglose) object);
            {
                String lhsOperadorId;
                lhsOperadorId = this.getOperadorId();
                String rhsOperadorId;
                rhsOperadorId = that.getOperadorId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "operadorId", lhsOperadorId), LocatorUtils.property(thatLocator, "operadorId", rhsOperadorId), lhsOperadorId, rhsOperadorId)) {
                    return false;
                }
            }
            {
                TipoJuego lhsTipoJuego;
                lhsTipoJuego = this.getTipoJuego();
                TipoJuego rhsTipoJuego;
                rhsTipoJuego = that.getTipoJuego();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tipoJuego", lhsTipoJuego), LocatorUtils.property(thatLocator, "tipoJuego", rhsTipoJuego), lhsTipoJuego, rhsTipoJuego)) {
                    return false;
                }
            }
            {
                Importe lhsImporte;
                lhsImporte = this.getImporte();
                Importe rhsImporte;
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
                String theOperadorId;
                theOperadorId = this.getOperadorId();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operadorId", theOperadorId), currentHashCode, theOperadorId);
            }
            {
                TipoJuego theTipoJuego;
                theTipoJuego = this.getTipoJuego();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tipoJuego", theTipoJuego), currentHashCode, theTipoJuego);
            }
            {
                Importe theImporte;
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
