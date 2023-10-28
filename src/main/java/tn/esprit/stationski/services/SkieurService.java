package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SkieurService implements  ISkieurService {
    private SkieurRepository skieurRepository;
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
}