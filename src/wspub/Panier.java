
package wspub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for panier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="panier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Livre" type="{http://wsPub/}livre" minOccurs="0"/>
 *         &lt;element name="qte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "panier", propOrder = {
    "idp",
    "livre",
    "qte"
})
public class Panier {

    protected int idp;
    @XmlElement(name = "Livre")
    protected Livre livre;
    protected int qte;

    public Panier(Livre l, int qte) {
		this.livre=l;
		this.qte=qte;	}

	public Panier() {
		// TODO Auto-generated constructor stub
	}

	public Panier(int idp, Livre l, int qte) {
		this.idp=idp;
		this.livre=l;
		this.qte=qte;
	}

	/**
     * Gets the value of the idp property.
     * 
     */
    public int getIdp() {
        return idp;
    }

    /**
     * Sets the value of the idp property.
     * 
     */
    public void setIdp(int value) {
        this.idp = value;
    }

    /**
     * Gets the value of the livre property.
     * 
     * @return
     *     possible object is
     *     {@link Livre }
     *     
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     * Sets the value of the livre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Livre }
     *     
     */
    public void setLivre(Livre value) {
        this.livre = value;
    }

    /**
     * Gets the value of the qte property.
     * 
     */
    public int getQte() {
        return qte;
    }

    /**
     * Sets the value of the qte property.
     * 
     */
    public void setQte(int value) {
        this.qte = value;
    }

}
