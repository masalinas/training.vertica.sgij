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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for RegistroJUA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistroJUA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cnjuego.gob.es/sci/v2.13.xsd}RegistroMensualBase">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="EventoId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="TicketApuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://cnjuego.gob.es/sci/v2.13.xsd}ID"/>
 *         &lt;element name="FechaAjuste" type="{http://cnjuego.gob.es/sci/v2.13.xsd}date-aaaammddhhmmssTZ"/>
 *         &lt;element name="MotivoAjuste" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImporteAjuste" type="{http://cnjuego.gob.es/sci/v2.13.xsd}Importe"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroJUA", propOrder = {
    "eventoIdAndTicketApuestaAndID"
})
@Entity(name = "RegistroJUA")
@Table(name = "REGISTROJUA", schema = "sgij")
public class RegistroJUA
    extends RegistroMensualBase
    implements Equals, HashCode
{

    @XmlElementRefs({
        @XmlElementRef(name = "TicketApuesta", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "MotivoAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "ID", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "EventoId", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "ImporteAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "FechaAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> eventoIdAndTicketApuestaAndID;
    protected transient List<RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem> eventoIdAndTicketApuestaAndIDItems;

    /**
     * Gets the value of the eventoIdAndTicketApuestaAndID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventoIdAndTicketApuestaAndID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventoIdAndTicketApuestaAndID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ID }{@code >}
     * {@link JAXBElement }{@code <}{@link Importe }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    @Transient
    public List<JAXBElement<?>> getEventoIdAndTicketApuestaAndID() {
        if (eventoIdAndTicketApuestaAndID == null) {
            eventoIdAndTicketApuestaAndID = new ArrayList<JAXBElement<?>>();
        }
        return this.eventoIdAndTicketApuestaAndID;
    }

    /**
     * 
     * 
     */
    public void setEventoIdAndTicketApuestaAndID(List<JAXBElement<?>> eventoIdAndTicketApuestaAndID) {
        this.eventoIdAndTicketApuestaAndID = eventoIdAndTicketApuestaAndID;
    }

    @OneToMany(targetEntity = RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENTOIDANDTICKETAPUESTAANDI_1")
    public List<RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem> getEventoIdAndTicketApuestaAndIDItems() {
        if (this.eventoIdAndTicketApuestaAndIDItems == null) {
            this.eventoIdAndTicketApuestaAndIDItems = new ArrayList<RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.eventoIdAndTicketApuestaAndID)) {
            this.eventoIdAndTicketApuestaAndID = ItemUtils.wrap(this.eventoIdAndTicketApuestaAndID, this.eventoIdAndTicketApuestaAndIDItems, RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem.class);
        }
        return this.eventoIdAndTicketApuestaAndIDItems;
    }

    public void setEventoIdAndTicketApuestaAndIDItems(List<RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem> value) {
        this.eventoIdAndTicketApuestaAndID = null;
        this.eventoIdAndTicketApuestaAndIDItems = null;
        this.eventoIdAndTicketApuestaAndIDItems = value;
        if (this.eventoIdAndTicketApuestaAndIDItems == null) {
            this.eventoIdAndTicketApuestaAndIDItems = new ArrayList<RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.eventoIdAndTicketApuestaAndID)) {
            this.eventoIdAndTicketApuestaAndID = ItemUtils.wrap(this.eventoIdAndTicketApuestaAndID, this.eventoIdAndTicketApuestaAndIDItems, RegistroJUA.RegistroJUAEventoIdAndTicketApuestaAndIDItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RegistroJUA)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegistroJUA that = ((RegistroJUA) object);
        {
            List<JAXBElement<?>> lhsEventoIdAndTicketApuestaAndID;
            lhsEventoIdAndTicketApuestaAndID = (((this.eventoIdAndTicketApuestaAndID!= null)&&(!this.eventoIdAndTicketApuestaAndID.isEmpty()))?this.getEventoIdAndTicketApuestaAndID():null);
            List<JAXBElement<?>> rhsEventoIdAndTicketApuestaAndID;
            rhsEventoIdAndTicketApuestaAndID = (((that.eventoIdAndTicketApuestaAndID!= null)&&(!that.eventoIdAndTicketApuestaAndID.isEmpty()))?that.getEventoIdAndTicketApuestaAndID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventoIdAndTicketApuestaAndID", lhsEventoIdAndTicketApuestaAndID), LocatorUtils.property(thatLocator, "eventoIdAndTicketApuestaAndID", rhsEventoIdAndTicketApuestaAndID), lhsEventoIdAndTicketApuestaAndID, rhsEventoIdAndTicketApuestaAndID)) {
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
            List<JAXBElement<?>> theEventoIdAndTicketApuestaAndID;
            theEventoIdAndTicketApuestaAndID = (((this.eventoIdAndTicketApuestaAndID!= null)&&(!this.eventoIdAndTicketApuestaAndID.isEmpty()))?this.getEventoIdAndTicketApuestaAndID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventoIdAndTicketApuestaAndID", theEventoIdAndTicketApuestaAndID), currentHashCode, theEventoIdAndTicketApuestaAndID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "RegistroJUA$RegistroJUAEventoIdAndTicketApuestaAndIDItem")
    @Table(name = "REGISTROJUAEVENTOIDANDTICKET_0", schema = "sgij")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class RegistroJUAEventoIdAndTicketApuestaAndIDItem
        implements Item<JAXBElement<?>>
    {

        @XmlElementRefs({
            @XmlElementRef(name = "TicketApuesta", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
            @XmlElementRef(name = "MotivoAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
            @XmlElementRef(name = "ID", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
            @XmlElementRef(name = "EventoId", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
            @XmlElementRef(name = "ImporteAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class),
            @XmlElementRef(name = "FechaAjuste", namespace = "http://cnjuego.gob.es/sci/v2.13.xsd", type = JAXBElement.class)
        })
        protected JAXBElement<?> item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link ID }{@code >}
         *     {@link JAXBElement }{@code <}{@link Importe }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        @Transient
        public JAXBElement<?> getItem() {
            return item;
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     {@link JAXBElement }{@code <}{@link ID }{@code >}
         *     {@link JAXBElement }{@code <}{@link Importe }{@code >}
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setItem(JAXBElement<?> value) {
            this.item = ((JAXBElement<?> ) value);
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

        @Basic
        @Column(name = "ITEMTICKETAPUESTA", length = 255)
        public String getItemTicketApuesta() {
            if (XmlAdapterUtils.isJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "TicketApuesta"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemTicketApuesta(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "TicketApuesta"), RegistroJUA.class, target));
            }
        }

        @Basic
        @Column(name = "ITEMMOTIVOAJUSTE", length = 255)
        public String getItemMotivoAjuste() {
            if (XmlAdapterUtils.isJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "MotivoAjuste"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemMotivoAjuste(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "MotivoAjuste"), RegistroJUA.class, target));
            }
        }

        @ManyToOne(targetEntity = ID.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMID_REGISTROJUAEVENTOIDAN_0")
        public ID getItemID() {
            if (XmlAdapterUtils.isJAXBElement(ID.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "ID"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends ID> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemID(ID target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(ID.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "ID"), RegistroJUA.class, target));
            }
        }

        @Basic
        @Column(name = "ITEMEVENTOID", length = 255)
        public String getItemEventoId() {
            if (XmlAdapterUtils.isJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "EventoId"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemEventoId(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "EventoId"), RegistroJUA.class, target));
            }
        }

        @ManyToOne(targetEntity = Importe.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMIMPORTEAJUSTE_REGISTROJU_0")
        public Importe getItemImporteAjuste() {
            if (XmlAdapterUtils.isJAXBElement(Importe.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "ImporteAjuste"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends Importe> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemImporteAjuste(Importe target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(Importe.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "ImporteAjuste"), RegistroJUA.class, target));
            }
        }

        @Basic
        @Column(name = "ITEMFECHAAJUSTE", length = 255)
        public String getItemFechaAjuste() {
            if (XmlAdapterUtils.isJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "FechaAjuste"), RegistroJUA.class, this.getItem())) {
                return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemFechaAjuste(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://cnjuego.gob.es/sci/v2.13.xsd", "FechaAjuste"), RegistroJUA.class, target));
            }
        }

    }

}
