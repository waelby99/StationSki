package tn.esprit.stationski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stationski.entities.Cours;
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
