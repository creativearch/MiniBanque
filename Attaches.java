package Minibanque;

import java.util.ArrayList;

/**
 *Represente un attaché 
 *@author Rama
 *@version 1.0
 */	

public class Attaches {
	
	protected int idAttaches; 
	protected String nomAttaches; 
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public Attaches (int _idAttaches, String _nomAttaches){
		this.idAttaches=_idAttaches; 
		this.nomAttaches=_nomAttaches;
	}
	
	public void ajouterClient(Client _clients){
		clients.add(_clients);
	}
	
	public String toString(){
		String listeClient = "";
		for (Client c : this.clients)
		{
			listeClient += c+"\n";
		}
		return "Nom attache: "+this.nomAttaches+"\nListe des clients:\n"+listeClient;
	}
	
	public Client getClient(int numClient){
		return this.clients.get(numClient);
	}
	
	
}
