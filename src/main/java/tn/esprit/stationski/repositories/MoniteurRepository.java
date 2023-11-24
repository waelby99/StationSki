package tn.esprit.stationski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
