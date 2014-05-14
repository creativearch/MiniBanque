package Minibanque;

import java.util.Date;

public class Operation {

	protected String nature; 
	protected int id; 
	protected String libelle;
	protected String statut; 
	protected Date date; 
	private double montant;
	private CompteBancaire pere;
	
	public Operation (String _nature, int _id, String _libelle, double _montant, CompteBancaire _pere) {
		this.nature=_nature; 
		this.id=_id; 
		this.libelle=_libelle; 
		this.statut="ATTENTE"; 
		this.date=new Date(); 
		this.montant=_montant;
		this.pere=_pere;
	}
	
	public void setStatut (String _statut){
		this.statut=_statut; 
		if(this.statut=="OK"){
			this.date=new Date();
		}
	}
	
	public void setDate (Date _date){
		this.date=_date; 
	}
	
	public CompteBancaire getCompte(){
		return this.pere;
	}
	
	public double getMontant(){
		return this.montant;
	}
	
	public String getStatus(){
		return this.statut;
	}
	
	public String getNature()
	{
		return this.nature;
	}
	
	
	
}
