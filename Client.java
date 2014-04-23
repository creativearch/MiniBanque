package Minibanque;

import java.util.Arrays;

/**
 *Represente un client
 *@author Rama
 *@version 1.0
 */    


public class Client {
    
    private int idClient;
    private String nomClient;
    private CompteBancaire []comptes = new comptes[0];
    
    /**
     * Construit le client
     * @since version 1.0
     */
    
    public Client (int _idClient, String _nomClient){
   	 this.idClient=_idClient;
   	 this.nomClient=_nomClient;
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
   	 int i=0;
   	 boolean test=false;
   	 while (!test){
   		 if (this.comptes[i]==null){
   			 this.comptes[i]=num;
   			 test=true;
   		 }
   	 i++;
   	 }
    }

    public String toString() {
   	 return "Client [idClient=" + idClient + ", nomClient=" + nomClient
   			 + ", comptes=" + Arrays.toString(comptes) + "]";
    }
}


