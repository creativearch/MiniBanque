package Minibanque;


/**
 * Banque est la classe représentant la banque contenant le main
 *
 * @author Rama DESPLATS
 */

public class Banque
{

	/**
	 * Main permettant de tester les différents exemples
	 *
	 *
	 */
	public static void main(String[] args)
	{
		Attaches ac1 = new Attaches(0,"ac1");
		Attaches ac2 = new Attaches(1,"ac2");

		Client c1 = new Client(0, "Client 1", ac1);
		Client c2 = new Client(1, "C", ac2);
		CompteCourant cc1 = new CompteCourant(0,"Compte courant de C");
		CompteEpargne ce2 = new CompteEpargne(1,"Compte epargne de C",2,700);
		c2.ajouterCompte(cc1);
		c2.ajouterCompte(ce2);
		
		ac2.ajouterClient(c1);
		ac2.ajouterClient(c2);

		System.out.println(ac1);
		System.out.println(ac2);
		try
		{
			ac2.getClient(1).getCompte(0).crediterCompte(2000);
			ac2.getClient(1).getCompte(1).crediterCompte(33);
			ac2.getClient(1).getCompte(0).debiterCompte(500);
		}
		catch(OperationBancaireException e)	{}
		try
		{
			ac2.getClient(1).getCompte(0).debiterCompte(2500);
		}
		catch(OperationBancaireException e)	{}
		try
		{
			ac2.getClient(1).getCompte(0).debiterCompte(123);
			ac2.getClient(1).getCompte(0).crediterCompte(1.55);
		}
		catch(OperationBancaireException e)	{}
		try
		{
			c2.passerOrdreVirement(cc1,ce2,666);
		}
		catch(OperationBancaireException e)	{}
		try
		{
			c2.passerOrdreVirement(cc1,ce2,10000);
		}
		catch(OperationBancaireException e)	{}
		try
		{
			c2.passerOrdreVirement(cc1,ce2,10);
		}
		catch(OperationBancaireException e)	{}
		/*
		try
		{
			ac2.forcerOperation(ac2.getOperationAValider());
		}
		//catch(PersonnelNonAutoriseException e)	{}
		 * */
		System.out.println(c2);
		System.out.println(cc1.operationsToString());
		System.out.println(ce2.operationsToString());
		//System.out.println(ac2.operationsAValiderToString());
	}
}

