package Minibanque;

/**
 *Represente un compte remunéré qui hérite de compte bancaire
 *@author Rama
 *@version 1.0
 */    

public class CompteRemunere extends CompteBancaire {

    protected float tauxderemuneration;
    protected int soldeplafond;
    
    public CompteRemunere(int _idCompte, String _libelle, float _tauxderumeneration, int _soldeplafond) {
   	 super(_idCompte, _libelle);
   	 this.tauxderemuneration=_tauxderumeneration;
   	 this.soldeplafond=_soldeplafond;
    }
    
    public float getSolde() {
   	 return this.solde;
    }
    
    public void crediterCompte(float _solde){
   	 if (_solde>this.soldeplafond){
   		 System.out.println("Vous avez saisi un solde supérieur au solde plafond");
   	 }
   	 else {
   		 this.solde=+_solde;
   	 }
    }
    
    public String toString() {
   	 return "CompteRemunere [tauxderemuneration=" + tauxderemuneration
   			 + ", soldeplafond=" + soldeplafond + ", idCompte=" + idCompte
   			 + ", libelle=" + libelle + ", solde=" + solde + "]";
    }
    
    

}


