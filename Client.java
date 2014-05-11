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

	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient
				+ ", comptes=" + Arrays.toString(comptes) + "]";
	}
	
	public String getNom(){
		return this.nomClient;
	}
	
	public String toStringcompte(){
		String listeCompte = "";
		for (CompteBancaire c: this.comptes)
		{
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
}
