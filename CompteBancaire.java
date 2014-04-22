package Minibanque;

/**
 *Represente un comptebancaire (classe mère)
 *@author Rama
 *@version 1.0
 */    

public class CompteBancaire {

    protected int idCompte;
    protected String libelle;
    protected float solde;
    
    /**
     * Construit le Compte
     * @since version 1.0
     */
    
    public CompteBancaire (int _idCompte, String _libelle){
   	 this.idCompte=_idCompte;
   	 this.libelle=_libelle;
   	 this.solde=0;
    }
    
    public void setSolde(float _solde){
   	 this.solde=_solde;
    }


    public String toString() {
   	 return "CompteBancaire [idCompte=" + idCompte + ", libelle=" + libelle
   			 + ", solde=" + solde + "]";
    }
    
    /**
     * debite le compte d'une somme donnée en paramètre
     * @since version 1.0
     */
    
    public void debiterCompte(float _solde){
   	 this.solde=-_solde;
    }
    
    /**
     * crédite le compte d'une somme donnée en paramètre
     * @since version 1.0
     */
    
    public void crediterCompte(float _solde){
   	 this.solde=+_solde;
    }
    
    /**
     * Consulter le solde, à enlever si StringtoString suffisante
     * @since version 1.0
     */
    
    public void consulterSolde(){
   	 System.out.println(this.solde);
    }
    
}


