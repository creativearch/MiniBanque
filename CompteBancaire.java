package Minibanque;

import java.util.ArrayList;

/**
 *Represente un comptebancaire (classe mère)
 *@author Rama
 *@version 1.0
 */	

public class CompteBancaire {

	protected int idCompte; 
	protected String libelle;
	protected double solde; 
	ArrayList<Operation> operations = new ArrayList<Operation>();
	
	/**
	 * Construit le Compte
	 * @since version 1.0
	 */
	
	public CompteBancaire (int _idCompte, String _libelle){
		this.idCompte=_idCompte;
		this.libelle=_libelle;
		this.solde=0;
		this.operations=new ArrayList<Operation>();
	}
	
	public void setSolde(float _solde){
		this.solde=_solde;
	}
	
	public double getSolde(){
		return this.solde;
	}


	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", libelle=" + libelle
				+ ", solde=" + solde + "]";
	}
	
	/**
	 * debite le compte d'une somme donnée en paramètre
	 * @since version 1.0
	 */
	
	public boolean debiterCompte (double _montant) throws OperationBancaireException{
		this.operations.add(new Operation("Debit",this.operations.size(),"",_montant,this));
		if(_montant<=0){
			this.operations.get(this.operations.size()-1).setStatut("KO");
			throw new OperationBancaireException("Le montant demandé est négatif.");
		}
		if(_montant>this.solde){
			this.operations.get(this.operations.size()-1).setStatut("KO");
			throw new OperationBancaireException("Le montant demandé est négatif.");
		}
		this.solde-= _montant; 
		this.operations.get(this.operations.size()-1).setStatut("OK");
		return true;
	}
	
	/**
	 * crédite le compte d'une somme donnée en paramètre
	 * @since version 1.0
	 */
	
	public boolean crediterCompte(double _montant) throws OperationBancaireException{
		this.operations.add(new Operation("Credit",this.operations.size(),"",_montant,this));
		if(_montant<=0){
			this.operations.get(this.operations.size()-1).setStatut("KO");
			throw new OperationBancaireException("Le montant demandé est négatif.");
		}
		this.solde += _montant;
		this.operations.get(this.operations.size()-1).setStatut("OK");
		return true;
	}
	
	/**
	 * Consulter le solde, à enlever si StringtoString suffisant
	 * @since version 1.0
	 */
	
	public double consulterSolde(){
		return this.solde;
	}
	
	public String operationsToString(){
		String listeCompte = "";
		for (Operation op: this.operations){
			listeCompte += op+"\n";
		}
		return listeCompte;
	}
	
	
}
