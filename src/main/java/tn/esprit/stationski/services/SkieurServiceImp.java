package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Inscription;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.repositories.CoursRepository;
import tn.esprit.stationski.repositories.InscriptionRepository;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class SkieurServiceImp implements  ISkieurService {
        private SkieurRepository skieurRepository;
        private CoursRepository coursRepository;
        private InscriptionRepository inscriptionRepository;
    @Override
    public  Skieur addSkieur( Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getSkieurById(long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public void deleteSkieur(long numskieur) {
        skieurRepository.deleteById(numskieur);
    }

    @Override
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
        Skieur skieurAjoute=skieurRepository.save(skieur);
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Set<Inscription> inscriptions=skieurAjoute.getInscriptions();
        for (Inscription inscription:inscriptions){
            inscription.setSkieur(skieurAjoute);
            inscription.setCours(cours);
            inscriptionRepository.save(inscription);
        }
        return skieurRepository.save(skieurAjoute);
    }
}