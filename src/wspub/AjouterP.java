
package wspub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ajouterP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ajouterP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idl" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ajouterP", propOrder = {
    "idc",
    "idl",
    "qte"
})
public class AjouterP {

    protected int idc;
    protected int idl;
    protected int qte;

    /**
     * Gets the value of the idc property.
     * 
     */
    public int getIdc() {
        return idc;
    }

    /**
     * Sets the value of the idc property.
     * 
     */
    public void setIdc(int value) {
        this.idc = value;
    }

    /**
     * Gets the value of the idl property.
     * 
     */
    public int getIdl() {
        return idl;
    }

    /**
     * Sets the value of the idl property.
     * 
     */
    public void setIdl(int value) {
        this.idl = value;
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
