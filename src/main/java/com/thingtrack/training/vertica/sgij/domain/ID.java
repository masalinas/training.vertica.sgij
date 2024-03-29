//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 09:48:48 PM CEST 
//


package com.thingtrack.training.vertica.sgij.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for ID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperadorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JugadorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID", propOrder = {
    "operadorId",
    "jugadorId"
})
@Entity(name = "ID")
@Table(name = "ID", schema = "sgij")
@Inheritance(strategy = InheritanceType.JOINED)
public class ID implements Equals, HashCode
{

    @XmlElement(name = "OperadorId", required = true)
    protected String operadorId;
    @XmlElement(name = "JugadorId", required = true)
    protected String jugadorId;
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
     * Gets the value of the jugadorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "JUGADORID", length = 255)
    public String getJugadorId() {
        return jugadorId;
    }

    /**
     * Sets the value of the jugadorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJugadorId(String value) {
        this.jugadorId = value;
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
        if (!(object instanceof ID)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ID that = ((ID) object);
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
            String lhsJugadorId;
            lhsJugadorId = this.getJugadorId();
            String rhsJugadorId;
            rhsJugadorId = that.getJugadorId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jugadorId", lhsJugadorId), LocatorUtils.property(thatLocator, "jugadorId", rhsJugadorId), lhsJugadorId, rhsJugadorId)) {
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
            String theJugadorId;
            theJugadorId = this.getJugadorId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jugadorId", theJugadorId), currentHashCode, theJugadorId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
