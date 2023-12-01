package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.*;
import tn.esprit.stationski.repositories.AbonnementRepository;
import tn.esprit.stationski.repositories.CoursRepository;
import tn.esprit.stationski.repositories.InscriptionRepository;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class SkieurServiceImp implements  ISkieurService {
        private SkieurRepository skieurRepository;
        private CoursRepository coursRepository;
        private InscriptionRepository inscriptionRepository;
        private AbonnementRepository abonnementRepository;
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

    @Override
    public Skieur addSkieurAbbon(Skieur sk) {
        Abonnement abonnement= abonnementRepository.save(sk.getAbonnement());
        return skieurRepository.save(sk);}

    @Override
    public List<Skieur> retrieveSkieurByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnement_TypeAbonnement(typeAbonnement);
    }
    @Scheduled(fixedRate = 60000)
    public  void fixedRateMethod(){
        log.info("salut");
    }
}