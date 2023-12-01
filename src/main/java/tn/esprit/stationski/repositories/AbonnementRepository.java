package tn.esprit.stationski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Abonnement;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
    public List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

}
