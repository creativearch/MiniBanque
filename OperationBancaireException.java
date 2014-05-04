package Minibanque;

public class OperationBancaireException extends Exception {

    public OperationBancaireException(Throwable cause) {
   	 System.out.println("Votre montant est nul ou négatif ! Impossible d'effectuer l'opération");
    }
    
    public OperationBancaireException(){
   	 System.out.println("Le solde est insufisant. Impossible d'effectuer l'opération");
    }
    
    public OperationBancaireException(){
   	 System.out.println("Le solde plafond est atteint. Impossible d'effectuer l'opération ");
    }

}


