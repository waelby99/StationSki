package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Abonnement;

import java.time.LocalDate;
import java.util.List;

public interface IAbonnementService {

    public List<Abonnement> retrieveAllAbonnements();

    public Abonnement addAbonnement(Abonnement abonnement);

    public Abonnement updateAbonnement(Abonnement abonnement);

    public Abonnement retrieveAbonnement(Long numAbon);

    public void removeAbonnement(Long numAbon);
    public List<Abonnement> retrieveAbonnementByDate(LocalDate startDate, LocalDate endDate) ;
}
