package Minibanque;

import java.util.Date;

public class Operation {

    protected String nature;
    protected int id;
    protected String libelle;
    protected String statut;
    protected Date date;
    protected Double montant;
    
    public Operation (String _nature, int _id, String _libelle, String _statut, Date _date) {
   	 this.nature=_nature;
   	 this.id=_id;
   	 this.libelle=_libelle;
   	 this.statut=_statut;
   	 this.date=_date;
    }
    
    public void setStatut (String _statut){
   	 this.statut=_statut;
    }
    
    public void setDate (Date _date){
   	 this.date=_date;
    }
    
    public void effectuer() throws OperationBancaireException{
     try{
       this.debiteur.debiter(this.montant);
       this.crediteur.crediter(this.montant);
       this.statut=1;
     }
     catch(SoldeInsuffisantException|PlafondDepasseException|MontantInvalidException e){
       this.statut=-1;
       throw new OperationBancaireException(e);
     }  
  }
}


