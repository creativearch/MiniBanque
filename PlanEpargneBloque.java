package Minibanque;

import java.util.Date;

/**
 *Represente un Plan Epargne Bloqué qui hérite de compte remunéré
 *@author Rama
 *@version 1.0
 */    

public class PlanEpargneBloque extends CompteRemunere {

    protected Date miseADispo;
    
    public PlanEpargneBloque(int _idCompte, String _libelle, float _tauxderemuneration, int _solde, Date _miseADispo) {
   	 super(_idCompte, _libelle, _tauxderemuneration, _solde);
   	 this.miseADispo=_miseADispo;
    }

    public String toString() {
   	 return "PlanEpargneBloque [miseADispo=" + miseADispo
   			 + ", tauxderemuneration=" + tauxderemuneration
   			 + ", soldeplafond=" + soldeplafond + ", idCompte=" + idCompte
   			 + ", libelle=" + libelle + ", solde=" + solde + "]";
    }

    
}


