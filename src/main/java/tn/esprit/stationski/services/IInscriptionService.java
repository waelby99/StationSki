package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    public Inscription addInscription (Inscription inscription );
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> getAllInscription();
    public Inscription getInscriptionById(long numInscription);
    public void deleteInscription(long numInscription);
    public  Inscription addInscriptionAndAssignToSkieur(Inscription inscription, long numSkieur);
    public Inscription addInscriptionAndAssignToCours(Inscription inscription,long numCours);
}
