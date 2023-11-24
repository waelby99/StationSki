package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Moniteur;
import tn.esprit.stationski.repositories.CoursRepository;
import tn.esprit.stationski.repositories.MoniteurRepository;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class MoniteurServiceImp implements IMoniteurService{
    private MoniteurRepository moniteurRepositorys;
    private CoursRepository coursRepository;
    @Override
    public Moniteur addMoniteurAssignToCours(Moniteur moniteur, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Set<Cours> coursSet= new HashSet<>();
        coursSet.add(cours);
        moniteur.setCours(coursSet);
        return moniteurRepositorys.save(moniteur);
    }
}
