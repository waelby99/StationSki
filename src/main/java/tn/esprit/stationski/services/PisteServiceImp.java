package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stationski.entities.Piste;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.repositories.PisteRepository;
import tn.esprit.stationski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImp implements IPisteService{
    private PisteRepository pisteRepository;
    private SkieurRepository skieurRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> getAllPiste() {
        return  pisteRepository.findAll();
    }

    @Override
    public Piste getPisteById(long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
    @Override
    public Piste assignPisteToSkieur(long numPiste, long numSkieur) {
        Piste piste=pisteRepository.findById(numPiste).orElse(null);
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null);
        piste.getSkieurs().add(skieur);
        return pisteRepository.save(piste);
    }

}
