
package wspub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wspub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SupprimerLivre_QNAME = new QName("http://wsPub/", "supprimerLivre");
    private final static QName _Livre_QNAME = new QName("http://wsPub/", "Livre");
    private final static QName _AfficheAllResponse_QNAME = new QName("http://wsPub/", "afficheAllResponse");
    private final static QName _ClientNewCompteResponse_QNAME = new QName("http://wsPub/", "ClientNewCompteResponse");
    private final static QName _SelectDernierPanierResponse_QNAME = new QName("http://wsPub/", "selectDernierPanierResponse");
    private final static QName _SelectLivreC_QNAME = new QName("http://wsPub/", "selectLivreC");
    private final static QName _SelectLivreId_QNAME = new QName("http://wsPub/", "selectLivreId");
    private final static QName _RecClientResponse_QNAME = new QName("http://wsPub/", "recClientResponse");
    private final static QName _EditLivre_QNAME = new QName("http://wsPub/", "editLivre");
    private final static QName _GetRecResponse_QNAME = new QName("http://wsPub/", "getRecResponse");
    private final static QName _SupprimerLivreResponse_QNAME = new QName("http://wsPub/", "supprimerLivreResponse");
    private final static QName _SelectLivreIdResponse_QNAME = new QName("http://wsPub/", "selectLivreIdResponse");
    private final static QName _GetRec_QNAME = new QName("http://wsPub/", "getRec");
    private final static QName _Client_QNAME = new QName("http://wsPub/", "Client");
    private final static QName _AjouterLivre_QNAME = new QName("http://wsPub/", "ajouterLivre");
    private final static QName _VerifEmailResponse_QNAME = new QName("http://wsPub/", "verifEmailResponse");
    private final static QName _AfficheAll_QNAME = new QName("http://wsPub/", "afficheAll");
    private final static QName _VerifCBResponse_QNAME = new QName("http://wsPub/", "verifCBResponse");
    private final static QName _VerifEmail_QNAME = new QName("http://wsPub/", "verifEmail");
    private final static QName _SelectLivreCResponse_QNAME = new QName("http://wsPub/", "selectLivreCResponse");
    private final static QName _EditLivreResponse_QNAME = new QName("http://wsPub/", "editLivreResponse");
    private final static QName _ClientNewCompte_QNAME = new QName("http://wsPub/", "ClientNewCompte");
    private final static QName _VerifCB_QNAME = new QName("http://wsPub/", "verifCB");
    private final static QName _AjouterP_QNAME = new QName("http://wsPub/", "ajouterP");
    private final static QName _RecClient_QNAME = new QName("http://wsPub/", "recClient");
    private final static QName _AjouterPResponse_QNAME = new QName("http://wsPub/", "ajouterPResponse");
    private final static QName _SelectDernierPanier_QNAME = new QName("http://wsPub/", "selectDernierPanier");
    private final static QName _AjouterLivreResponse_QNAME = new QName("http://wsPub/", "ajouterLivreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wspub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerLivre }
     * 
     */
    public SupprimerLivre createSupprimerLivre() {
        return new SupprimerLivre();
    }

    /**
     * Create an instance of {@link ClientNewCompteResponse }
     * 
     */
    public ClientNewCompteResponse createClientNewCompteResponse() {
        return new ClientNewCompteResponse();
    }

    /**
     * Create an instance of {@link SelectDernierPanierResponse }
     * 
     */
    public SelectDernierPanierResponse createSelectDernierPanierResponse() {
        return new SelectDernierPanierResponse();
    }

    /**
     * Create an instance of {@link SelectLivreC }
     * 
     */
    public SelectLivreC createSelectLivreC() {
        return new SelectLivreC();
    }

    /**
     * Create an instance of {@link SelectLivreId }
     * 
     */
    public SelectLivreId createSelectLivreId() {
        return new SelectLivreId();
    }

    /**
     * Create an instance of {@link RecClientResponse }
     * 
     */
    public RecClientResponse createRecClientResponse() {
        return new RecClientResponse();
    }

    /**
     * Create an instance of {@link AfficheAllResponse }
     * 
     */
    public AfficheAllResponse createAfficheAllResponse() {
        return new AfficheAllResponse();
    }

    /**
     * Create an instance of {@link SelectLivreIdResponse }
     * 
     */
    public SelectLivreIdResponse createSelectLivreIdResponse() {
        return new SelectLivreIdResponse();
    }

    /**
     * Create an instance of {@link GetRec }
     * 
     */
    public GetRec createGetRec() {
        return new GetRec();
    }

    /**
     * Create an instance of {@link EditLivre }
     * 
     */
    public EditLivre createEditLivre() {
        return new EditLivre();
    }

    /**
     * Create an instance of {@link GetRecResponse }
     * 
     */
    public GetRecResponse createGetRecResponse() {
        return new GetRecResponse();
    }

    /**
     * Create an instance of {@link SupprimerLivreResponse }
     * 
     */
    public SupprimerLivreResponse createSupprimerLivreResponse() {
        return new SupprimerLivreResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link AjouterLivre }
     * 
     */
    public AjouterLivre createAjouterLivre() {
        return new AjouterLivre();
    }

    /**
     * Create an instance of {@link VerifEmailResponse }
     * 
     */
    public VerifEmailResponse createVerifEmailResponse() {
        return new VerifEmailResponse();
    }

    /**
     * Create an instance of {@link AfficheAll }
     * 
     */
    public AfficheAll createAfficheAll() {
        return new AfficheAll();
    }

    /**
     * Create an instance of {@link SelectLivreCResponse }
     * 
     */
    public SelectLivreCResponse createSelectLivreCResponse() {
        return new SelectLivreCResponse();
    }

    /**
     * Create an instance of {@link VerifCBResponse }
     * 
     */
    public VerifCBResponse createVerifCBResponse() {
        return new VerifCBResponse();
    }

    /**
     * Create an instance of {@link VerifEmail }
     * 
     */
    public VerifEmail createVerifEmail() {
        return new VerifEmail();
    }

    /**
     * Create an instance of {@link AjouterP }
     * 
     */
    public AjouterP createAjouterP() {
        return new AjouterP();
    }

    /**
     * Create an instance of {@link RecClient }
     * 
     */
    public RecClient createRecClient() {
        return new RecClient();
    }

    /**
     * Create an instance of {@link EditLivreResponse }
     * 
     */
    public EditLivreResponse createEditLivreResponse() {
        return new EditLivreResponse();
    }

    /**
     * Create an instance of {@link ClientNewCompte }
     * 
     */
    public ClientNewCompte createClientNewCompte() {
        return new ClientNewCompte();
    }

    /**
     * Create an instance of {@link VerifCB }
     * 
     */
    public VerifCB createVerifCB() {
        return new VerifCB();
    }

    /**
     * Create an instance of {@link AjouterPResponse }
     * 
     */
    public AjouterPResponse createAjouterPResponse() {
        return new AjouterPResponse();
    }

    /**
     * Create an instance of {@link SelectDernierPanier }
     * 
     */
    public SelectDernierPanier createSelectDernierPanier() {
        return new SelectDernierPanier();
    }

    /**
     * Create an instance of {@link AjouterLivreResponse }
     * 
     */
    public AjouterLivreResponse createAjouterLivreResponse() {
        return new AjouterLivreResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Panier }
     * 
     */
    public Panier createPanier() {
        return new Panier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "supprimerLivre")
    public JAXBElement<SupprimerLivre> createSupprimerLivre(SupprimerLivre value) {
        return new JAXBElement<SupprimerLivre>(_SupprimerLivre_QNAME, SupprimerLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "Livre")
    public JAXBElement<Object> createLivre(Object value) {
        return new JAXBElement<Object>(_Livre_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "afficheAllResponse")
    public JAXBElement<AfficheAllResponse> createAfficheAllResponse(AfficheAllResponse value) {
        return new JAXBElement<AfficheAllResponse>(_AfficheAllResponse_QNAME, AfficheAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientNewCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ClientNewCompteResponse")
    public JAXBElement<ClientNewCompteResponse> createClientNewCompteResponse(ClientNewCompteResponse value) {
        return new JAXBElement<ClientNewCompteResponse>(_ClientNewCompteResponse_QNAME, ClientNewCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectDernierPanierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectDernierPanierResponse")
    public JAXBElement<SelectDernierPanierResponse> createSelectDernierPanierResponse(SelectDernierPanierResponse value) {
        return new JAXBElement<SelectDernierPanierResponse>(_SelectDernierPanierResponse_QNAME, SelectDernierPanierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectLivreC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectLivreC")
    public JAXBElement<SelectLivreC> createSelectLivreC(SelectLivreC value) {
        return new JAXBElement<SelectLivreC>(_SelectLivreC_QNAME, SelectLivreC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectLivreId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectLivreId")
    public JAXBElement<SelectLivreId> createSelectLivreId(SelectLivreId value) {
        return new JAXBElement<SelectLivreId>(_SelectLivreId_QNAME, SelectLivreId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "recClientResponse")
    public JAXBElement<RecClientResponse> createRecClientResponse(RecClientResponse value) {
        return new JAXBElement<RecClientResponse>(_RecClientResponse_QNAME, RecClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "editLivre")
    public JAXBElement<EditLivre> createEditLivre(EditLivre value) {
        return new JAXBElement<EditLivre>(_EditLivre_QNAME, EditLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "getRecResponse")
    public JAXBElement<GetRecResponse> createGetRecResponse(GetRecResponse value) {
        return new JAXBElement<GetRecResponse>(_GetRecResponse_QNAME, GetRecResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "supprimerLivreResponse")
    public JAXBElement<SupprimerLivreResponse> createSupprimerLivreResponse(SupprimerLivreResponse value) {
        return new JAXBElement<SupprimerLivreResponse>(_SupprimerLivreResponse_QNAME, SupprimerLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectLivreIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectLivreIdResponse")
    public JAXBElement<SelectLivreIdResponse> createSelectLivreIdResponse(SelectLivreIdResponse value) {
        return new JAXBElement<SelectLivreIdResponse>(_SelectLivreIdResponse_QNAME, SelectLivreIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "getRec")
    public JAXBElement<GetRec> createGetRec(GetRec value) {
        return new JAXBElement<GetRec>(_GetRec_QNAME, GetRec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "Client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ajouterLivre")
    public JAXBElement<AjouterLivre> createAjouterLivre(AjouterLivre value) {
        return new JAXBElement<AjouterLivre>(_AjouterLivre_QNAME, AjouterLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "verifEmailResponse")
    public JAXBElement<VerifEmailResponse> createVerifEmailResponse(VerifEmailResponse value) {
        return new JAXBElement<VerifEmailResponse>(_VerifEmailResponse_QNAME, VerifEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "afficheAll")
    public JAXBElement<AfficheAll> createAfficheAll(AfficheAll value) {
        return new JAXBElement<AfficheAll>(_AfficheAll_QNAME, AfficheAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifCBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "verifCBResponse")
    public JAXBElement<VerifCBResponse> createVerifCBResponse(VerifCBResponse value) {
        return new JAXBElement<VerifCBResponse>(_VerifCBResponse_QNAME, VerifCBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "verifEmail")
    public JAXBElement<VerifEmail> createVerifEmail(VerifEmail value) {
        return new JAXBElement<VerifEmail>(_VerifEmail_QNAME, VerifEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectLivreCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectLivreCResponse")
    public JAXBElement<SelectLivreCResponse> createSelectLivreCResponse(SelectLivreCResponse value) {
        return new JAXBElement<SelectLivreCResponse>(_SelectLivreCResponse_QNAME, SelectLivreCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "editLivreResponse")
    public JAXBElement<EditLivreResponse> createEditLivreResponse(EditLivreResponse value) {
        return new JAXBElement<EditLivreResponse>(_EditLivreResponse_QNAME, EditLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientNewCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ClientNewCompte")
    public JAXBElement<ClientNewCompte> createClientNewCompte(ClientNewCompte value) {
        return new JAXBElement<ClientNewCompte>(_ClientNewCompte_QNAME, ClientNewCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifCB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "verifCB")
    public JAXBElement<VerifCB> createVerifCB(VerifCB value) {
        return new JAXBElement<VerifCB>(_VerifCB_QNAME, VerifCB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ajouterP")
    public JAXBElement<AjouterP> createAjouterP(AjouterP value) {
        return new JAXBElement<AjouterP>(_AjouterP_QNAME, AjouterP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "recClient")
    public JAXBElement<RecClient> createRecClient(RecClient value) {
        return new JAXBElement<RecClient>(_RecClient_QNAME, RecClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ajouterPResponse")
    public JAXBElement<AjouterPResponse> createAjouterPResponse(AjouterPResponse value) {
        return new JAXBElement<AjouterPResponse>(_AjouterPResponse_QNAME, AjouterPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectDernierPanier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "selectDernierPanier")
    public JAXBElement<SelectDernierPanier> createSelectDernierPanier(SelectDernierPanier value) {
        return new JAXBElement<SelectDernierPanier>(_SelectDernierPanier_QNAME, SelectDernierPanier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPub/", name = "ajouterLivreResponse")
    public JAXBElement<AjouterLivreResponse> createAjouterLivreResponse(AjouterLivreResponse value) {
        return new JAXBElement<AjouterLivreResponse>(_AjouterLivreResponse_QNAME, AjouterLivreResponse.class, null, value);
    }

}
