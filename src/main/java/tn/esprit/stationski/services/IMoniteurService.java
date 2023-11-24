package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Moniteur;

public interface IMoniteurService {
    public Moniteur addMoniteurAssignToCours(Moniteur moniteur,Long numCours);
}
