package Minibanque;

public class CompteEpargne extends CompteRemunere {

    public CompteEpargne(int _idCompte, String _libelle, float _tauxderemuneration, int _soldeplafond) {
   	 super(_idCompte, _libelle, _tauxderemuneration, _soldeplafond);
    }

    public String toString() {
   	 return "CompteEpargne [tauxderemuneration=" + tauxderemuneration
   			 + ", soldeplafond=" + soldeplafond + ", idCompte=" + idCompte
   			 + ", libelle=" + libelle + ", solde=" + solde + "]";
    }

}


