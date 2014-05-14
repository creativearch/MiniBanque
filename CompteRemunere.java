package Minibanque;

/**
 *Represente un compte remunéré qui hérite de compte bancaire
 *@author Rama
 *@version 1.0
 */	

public class CompteRemunere extends CompteBancaire {

	protected float tauxderemuneration;
	protected double soldeplafond; 
	
	public CompteRemunere(int _idCompte, String _libelle, float _tauxderumeneration, double _soldeplafond) {
		super(_idCompte, _libelle);
		this.tauxderemuneration=_tauxderumeneration;
		this.soldeplafond=_soldeplafond;
	}
	
	public double getSolde() { 
		return this.solde; 
	} 
	
	
	public boolean crediterCompte(double _montant) throws OperationBancaireException{
		this.operations.add(new Operation("Credit",this.operations.size(),"",_montant,this));
		if(_montant<=0){
			this.operations.get(this.operations.size()-1).setStatut("KO");
			throw new OperationBancaireException("Le montant demandé est négatif.");
		}
		if(this.solde+_montant>this.soldeplafond)
		{
			this.operations.get(this.operations.size()-1).setStatut("KO");
			throw new PlafondException("Le plafond est dépassé en ajoutant ce montant.");
		}
		this.solde += _montant;
		this.operations.get(this.operations.size()-1).setStatut("OK");
		return true;
	}
	
	public String toString() {
		return "CompteRemunere [tauxderemuneration=" + tauxderemuneration
				+ ", soldeplafond=" + soldeplafond + ", idCompte=" + idCompte
				+ ", libelle=" + libelle + ", solde=" + solde + "]";
	}
	
	

}
