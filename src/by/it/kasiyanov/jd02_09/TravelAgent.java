//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.06.15 at 06:26:19 AM GMT+03:00
//


package by.it.kasiyanov.jd02_09;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TravelAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pasword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TravelOffers" type="{http://jd02_09.kasiyanov.it.by}TravelOffers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgent", propOrder = {
        "name",
        "login",
        "pasword",
        "email",
        "travelOffers"
})
public class TravelAgent {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Login", required = true)
    protected String login;
    @XmlElement(name = "Pasword", required = true)
    protected String pasword;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "TravelOffers", required = true)
    protected TravelOffers travelOffers;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the pasword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * Sets the value of the pasword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPasword(String value) {
        this.pasword = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the travelOffers property.
     *
     * @return
     *     possible object is
     *     {@link TravelOffers }
     *
     */
    public TravelOffers getTravelOffers() {
        return travelOffers;
    }

    /**
     * Sets the value of the travelOffers property.
     *
     * @param value
     *     allowed object is
     *     {@link TravelOffers }
     *
     */
    public void setTravelOffers(TravelOffers value) {
        this.travelOffers = value;
    }

    @Override
    public String toString() {
        return "TravelAgent{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pasword='" + pasword + '\'' +
                ", email='" + email + '\'' +
                ", travelOffers=" + travelOffers +
                '}';
    }
}
