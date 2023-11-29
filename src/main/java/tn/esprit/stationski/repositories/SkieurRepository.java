package tn.esprit.stationski.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {

        public List<Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement typeAbonnement);
}

