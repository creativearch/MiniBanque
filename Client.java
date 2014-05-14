package Minibanque;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Represente un client 
 *@author Rama
 *@version 1.0
 */	


public class Client {
	
	private int idClient;
	private String nomClient;
	private ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
	private Attaches attachesClient;
	
	/**
	 * Construit le client
	 * @since version 1.0
	 */
	
	public Client (int _idClient, String _nomClient, Attaches _attachesClient){
		this.idClient=_idClient;
		this.nomClient=_nomClient;
		this.attachesClient=_attachesClient;
		this.comptes = new ArrayList<CompteBancaire>();
	}
	
	
	/**
	 * Retourne l'identifiant du client courant
	 * @return Identifiant de l'autre
	 * @since version 1.0
	 */
	
	public int getClient(){
		return this.idClient;
	}
	
	/**
	 * Ajoute un compte au client
	 * @since version 1.0
	 */
	
	public void ajouterCompte(CompteBancaire num){
		comptes.add(num);
	}

	
	public String getNom(){
		return this.nomClient;
	}
	
	public String toString(){
		String listeCompte = "";
		for (CompteBancaire c: this.comptes){
			listeCompte += c+"\n";
		}
		return "Numero client: "+this.idClient+"\nNom client: "+this.nomClient+"\nListe des comptes: \n"+listeCompte;
	}
	
	public CompteBancaire getCompte(int _idCompte)
	{
		return this.comptes.get(_idCompte);
	}
	
	public boolean possedeCompte(CompteBancaire _comptes)
	{
		return this.comptes.contains(_comptes);
	}
	
	
	public boolean passerOrdreVirement(CompteBancaire compteOrigine, CompteBancaire compteDestinataire, double montant) throws OperationBancaireException{
		boolean res = false;
		
		if ((!this.possedeCompte(compteOrigine)) || (!this.possedeCompte(compteDestinataire))){
			throw new OperationBancaireException ("Un des comptes n'appartient pas au client");
		}
		else {
			try{
				if(compteOrigine.consulterSolde()>=montant){
					try{
						compteDestinataire.crediterCompte(montant);
					}
					catch(PlafondException e){
						Operation operation_credit = compteDestinataire.operations.get(compteDestinataire.operations.size()-1);
						compteOrigine.operations.add(new Operation("debit",compteOrigine.operations.size(),"",montant,compteOrigine));
						Operation operation_debit = compteOrigine.operations.get(compteOrigine.operations.size()-1);
						//operation_debit.setComplementaire(operation_credit);
						//operation_credit.setComplementaire(operation_debit);
						//this.attachesClient.ajoutOperationAValider(operation_debit);
					}
					res=true;
				}
				else{
					res=false;
				}
			}
			catch(OperationBancaireException e){
				
			}
		}
		return res;
	}
	
}
