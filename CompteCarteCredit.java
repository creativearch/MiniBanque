package Minibanque;

/**
 *Represente un compte carte de crédit qui hérite de compte bancaire
 *@author Rama
 *@version 1.0
 */    

public class CompteCarteCredit extends CompteBancaire {

    public CompteCarteCredit(int _idCompte, String _libelle) {
   	 super(_idCompte, _libelle);
    }

    public String toString() {
   	 return "CompteCarteCredit [idCompte=" + idCompte + ", libelle="
   			 + libelle + ", solde=" + solde + "]";
    }

}



