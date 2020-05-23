package DbInteraction;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;

import wspub.Client;
import wspub.Demandes;
import wspub.DemandesService;
import wspub.Livre;
import wspub.Panier;

public class demandes {
//=============================== affiche All ===========================
	public ArrayList<Livre> affichAll(){
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		List<Livre> L=d.afficheAll();
		
		ArrayList<Livre> A=new ArrayList<Livre>();
		
		for(Livre i : L) {
			A.add(i);
		}
		return A;
	}
//============================ getRec ===================================
	public ArrayList<Livre> getRec(String M){
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		List<Livre> L=d.getRec(M);
		
		ArrayList<Livre> A=new ArrayList<Livre>();
		
		for(Livre i : L) {
			A.add(i);
		}
		return A;
	}
	
	public int selectDernierPanier() {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.selectDernierPanier();
	}
	
	public int editLivre(Livre l) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.editLivre(l);
	}
	
	
	public Client recClient(String email,String password) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.recClient(email, password);
	}
	
	 public Livre selectLivreId(int id) {
		 DemandesService dd=new DemandesService();
		 Demandes d=dd.getDemandesPort();
		 
		 return d.selectLivreId(id);
			
	 }
	 
	 public int ajouterLivre(Livre l) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return ajouterLivre(l);
	 }
	
	 public void supprimerLivre( int id) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		d.supprimerLivre(id);
	 }
	 
	 public int ajouterP(int idc,int idl,int qte) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.ajouterP(idc, idl, qte);
	 }
	
	 public boolean ClientNewCompte(Client c) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
			
		return d.clientNewCompte(c);	
	 }
//================================= verif email ======================================
	 public int verifEmail(String email) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.verifEmail(email);
	 }
//================================= selectLivreC ====================================	
	 public ArrayList<Panier> selectLivreC(int idc){
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		
		List<Panier> P=d.selectLivreC(idc);
		
		ArrayList<Panier> A=new ArrayList<Panier>();
		
		for(Panier i : P) {
			A.add(i);
		}
		return A;
	 }
//========================================= verifCB =================================
	 public boolean verifCB(int cb) {
		DemandesService dd=new DemandesService();
		Demandes d=dd.getDemandesPort();
		
		return d.verifCB(cb);
	 }

	
	
}
