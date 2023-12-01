package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.entities.TypeAbonnement;

import java.util.List;
public interface ISkieurService {
    public Skieur addSkieur (Skieur skieur );
    public Skieur updateSkieur(Skieur skieur);
    public List<Skieur> getAllSkieur();
    public Skieur getSkieurById(long numSkieur);
    public void deleteSkieur(long numSkieur);
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
    public Skieur addSkieurAbbon(Skieur sk);
    public List<Skieur> retrieveSkieurByTypeAbonnement(TypeAbonnement typeAbonnement);

}