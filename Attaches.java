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
	private ArrayList<Operation> operationsavalider = new ArrayList<Operation>();
	
	public Attaches (int _idAttaches, String _nomAttaches){
		this.clients=new ArrayList<Client>();
		this.idAttaches=_idAttaches; 
		this.nomAttaches=_nomAttaches;
		this.operationsavalider= new ArrayList<Operation>();
	}
	
	public void ajouterClient(Client _clients){
		clients.add(_clients);
	}
	
	public String toString(){
		String listeClient = "";
		for (Client c : this.clients){
			listeClient += c+"\n";
		}
		return "Nom attache: "+this.nomAttaches+"\nListe des clients:\n"+listeClient;
	}
	
	public Client getClient(int numClient){
		return this.clients.get(numClient);
	}
	
	public void ajoutOperationAValider(Operation _operation){
			this.operationsavalider.add(_operation);
	}
	
	
}
