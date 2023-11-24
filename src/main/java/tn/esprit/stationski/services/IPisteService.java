package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Piste;

import java.util.List;

public interface IPisteService {
    public Piste addPiste (Piste piste );
    public Piste updatePiste(Piste piste);
    public List<Piste> getAllPiste();
    public Piste getPisteById(long numPiste);
    public void deletePiste(long numPiste);
    public Piste assignPisteToSkieur(long numPiste,long numSkieur);
}
