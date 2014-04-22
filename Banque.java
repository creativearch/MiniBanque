package Minibanque;

public class Banque {

    public static void main(String[] args) {
   	 Attaches a= new Attaches (01,"Dupond");
   	 Attaches b= new Attaches (02,"Dupont");
   	 Client c = new Client (01, "C");
   	 Client d = new Client (02, "Douteau");
   	 CompteCourant e = new CompteCourant(01, "compte courant");
   	 CompteEpargne f = new CompteEpargne(01, "compte epargne", 50, 700);
   	 c.ajouterCompte(e);
   	 c.ajouterCompte(f);
   	 c.toString();
    }

}


