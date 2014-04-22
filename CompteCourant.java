package Minibanque;

/**
 *Represente un compte courant qui hérite de comptebancaire
 *@author Rama
 *@version 1.0
 */    

public class CompteCourant extends CompteBancaire {

    public CompteCourant(int _idCompte, String _libelle) {
   	 super(_idCompte, _libelle);
    }

    public String toString() {
   	 return "CompteCourant [idCompte=" + idCompte + ", libelle=" + libelle
   			 + ", solde=" + solde + "]";
    }

}


