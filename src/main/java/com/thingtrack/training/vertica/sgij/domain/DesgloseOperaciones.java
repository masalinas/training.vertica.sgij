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
 * <p>Java class for DesgloseOperaciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesgloseOperaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
 *         &lt;element name="Operaciones" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fecha" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaammddhhmmssTZ"/>
 *                   &lt;element name="MedioPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TipoMedioPago" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoMedioPago"/>
 *                   &lt;element name="OtroTipoEspecificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
 *                   &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Dispositivo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="MO"/>
 *                         &lt;enumeration value="PC"/>
 *                         &lt;enumeration value="TB"/>
 *                         &lt;enumeration value="TF"/>
 *                         &lt;enumeration value="OT"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IdDispositivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DesgloseOperaciones", propOrder = {
    "total",
    "operaciones"
})
@Entity(name = "DesgloseOperaciones")
@Table(name = "DESGLOSEOPERACIONES", schema = "sgij")
@Inheritance(strategy = InheritanceType.JOINED)
public class DesgloseOperaciones
    implements Equals, HashCode
{

    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "Operaciones")
    protected List<DesgloseOperaciones.Operaciones> operaciones;
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
     * Gets the value of the operaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesgloseOperaciones.Operaciones }
     * 
     * 
     */
    @OneToMany(targetEntity = DesgloseOperaciones.Operaciones.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OPERACIONES_DESGLOSEOPERACIO_0")
    public List<DesgloseOperaciones.Operaciones> getOperaciones() {
        if (operaciones == null) {
            operaciones = new ArrayList<DesgloseOperaciones.Operaciones>();
        }
        return this.operaciones;
    }

    /**
     * 
     * 
     */
    public void setOperaciones(List<DesgloseOperaciones.Operaciones> operaciones) {
        this.operaciones = operaciones;
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
        if (!(object instanceof DesgloseOperaciones)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DesgloseOperaciones that = ((DesgloseOperaciones) object);
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
            List<DesgloseOperaciones.Operaciones> lhsOperaciones;
            lhsOperaciones = (((this.operaciones!= null)&&(!this.operaciones.isEmpty()))?this.getOperaciones():null);
            List<DesgloseOperaciones.Operaciones> rhsOperaciones;
            rhsOperaciones = (((that.operaciones!= null)&&(!that.operaciones.isEmpty()))?that.getOperaciones():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operaciones", lhsOperaciones), LocatorUtils.property(thatLocator, "operaciones", rhsOperaciones), lhsOperaciones, rhsOperaciones)) {
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
            List<DesgloseOperaciones.Operaciones> theOperaciones;
            theOperaciones = (((this.operaciones!= null)&&(!this.operaciones.isEmpty()))?this.getOperaciones():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operaciones", theOperaciones), currentHashCode, theOperaciones);
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
     *         &lt;element name="Fecha" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaammddhhmmssTZ"/>
     *         &lt;element name="MedioPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TipoMedioPago" type="{http://cnjuego.gob.es/sci/v2.13.xsd}TipoMedioPago"/>
     *         &lt;element name="OtroTipoEspecificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Importe" type="{http://cnjuego.gob.es/sci/v2.13.xsd}euros"/>
     *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Dispositivo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="MO"/>
     *               &lt;enumeration value="PC"/>
     *               &lt;enumeration value="TB"/>
     *               &lt;enumeration value="TF"/>
     *               &lt;enumeration value="OT"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IdDispositivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "fecha",
        "medioPago",
        "tipoMedioPago",
        "otroTipoEspecificar",
        "importe",
        "ip",
        "dispositivo",
        "idDispositivo"
    })
    @Entity(name = "DesgloseOperaciones$Operaciones")
    @Table(name = "OPERACIONES", schema = "sgij")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Operaciones
        implements Equals, HashCode
    {

        @XmlElement(name = "Fecha", required = true)
        protected String fecha;
        @XmlElement(name = "MedioPago", required = true)
        protected String medioPago;
        @XmlElement(name = "TipoMedioPago", required = true)
        protected String tipoMedioPago;
        @XmlElement(name = "OtroTipoEspecificar")
        protected String otroTipoEspecificar;
        @XmlElement(name = "Importe", required = true)
        protected BigDecimal importe;
        @XmlElement(name = "IP", required = true)
        protected String ip;
        @XmlElement(name = "Dispositivo", required = true)
        protected String dispositivo;
        @XmlElement(name = "IdDispositivo", required = true)
        protected String idDispositivo;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the fecha property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "FECHA", length = 255)
        public String getFecha() {
            return fecha;
        }

        /**
         * Sets the value of the fecha property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

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
         * Gets the value of the ip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "IP", length = 255)
        public String getIP() {
            return ip;
        }

        /**
         * Sets the value of the ip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIP(String value) {
            this.ip = value;
        }

        /**
         * Gets the value of the dispositivo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "DISPOSITIVO")
        public String getDispositivo() {
            return dispositivo;
        }

        /**
         * Sets the value of the dispositivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDispositivo(String value) {
            this.dispositivo = value;
        }

        /**
         * Gets the value of the idDispositivo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "IDDISPOSITIVO", length = 255)
        public String getIdDispositivo() {
            return idDispositivo;
        }

        /**
         * Sets the value of the idDispositivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdDispositivo(String value) {
            this.idDispositivo = value;
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
            if (!(object instanceof DesgloseOperaciones.Operaciones)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DesgloseOperaciones.Operaciones that = ((DesgloseOperaciones.Operaciones) object);
            {
                String lhsFecha;
                lhsFecha = this.getFecha();
                String rhsFecha;
                rhsFecha = that.getFecha();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fecha", lhsFecha), LocatorUtils.property(thatLocator, "fecha", rhsFecha), lhsFecha, rhsFecha)) {
                    return false;
                }
            }
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
            {
                String lhsIP;
                lhsIP = this.getIP();
                String rhsIP;
                rhsIP = that.getIP();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ip", lhsIP), LocatorUtils.property(thatLocator, "ip", rhsIP), lhsIP, rhsIP)) {
                    return false;
                }
            }
            {
                String lhsDispositivo;
                lhsDispositivo = this.getDispositivo();
                String rhsDispositivo;
                rhsDispositivo = that.getDispositivo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dispositivo", lhsDispositivo), LocatorUtils.property(thatLocator, "dispositivo", rhsDispositivo), lhsDispositivo, rhsDispositivo)) {
                    return false;
                }
            }
            {
                String lhsIdDispositivo;
                lhsIdDispositivo = this.getIdDispositivo();
                String rhsIdDispositivo;
                rhsIdDispositivo = that.getIdDispositivo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "idDispositivo", lhsIdDispositivo), LocatorUtils.property(thatLocator, "idDispositivo", rhsIdDispositivo), lhsIdDispositivo, rhsIdDispositivo)) {
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
                String theFecha;
                theFecha = this.getFecha();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fecha", theFecha), currentHashCode, theFecha);
            }
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
            {
                String theIP;
                theIP = this.getIP();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ip", theIP), currentHashCode, theIP);
            }
            {
                String theDispositivo;
                theDispositivo = this.getDispositivo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispositivo", theDispositivo), currentHashCode, theDispositivo);
            }
            {
                String theIdDispositivo;
                theIdDispositivo = this.getIdDispositivo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idDispositivo", theIdDispositivo), currentHashCode, theIdDispositivo);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}