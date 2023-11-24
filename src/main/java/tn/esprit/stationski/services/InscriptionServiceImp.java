package tn.esprit.stationski.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.Cours;
import tn.esprit.stationski.entities.Inscription;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.repositories.CoursRepository;
import tn.esprit.stationski.repositories.InscriptionRepository;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionServiceImp implements IInscriptionService{
    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getInscriptionById(long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscription, long numSkieur) {
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, long numCours) {
        Cours cours=coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }
}
