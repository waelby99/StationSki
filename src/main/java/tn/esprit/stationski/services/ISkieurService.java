package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;

import tn.esprit.stationski.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    public Skieur addSkieur (Skieur skieur );
    public Skieur updateSkieur(Skieur skieur);
    public List<Skieur> getAllSkieur();
    public Skieur getSkieurById(long numSkieur);
    public void deleteSkieur(long numSkieur);
}