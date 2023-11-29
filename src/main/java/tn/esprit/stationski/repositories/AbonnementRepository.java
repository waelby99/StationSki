package tn.esprit.stationski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
