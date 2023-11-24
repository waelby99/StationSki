package tn.esprit.stationski.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.entities.Piste;
import tn.esprit.stationski.services.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PisteRestController {
    private IPisteService iPisteService;
  /*  @GetMapping("/r")
    public List<Piste> retrieveAllSkieurs()
    {return iPisteService.retrieveAllSkieurs();}

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }

    @DeleteMapping("/removeSkieur/{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur){
        skieurService.removeSkieur(numSkieur);}


    @GetMapping("/retrieveSkieur/{numSkieur}")
    public Skieur retrieveSkieur(@PathVariable Long numSkieur){
        return skieurService.retrieveSkieur(numSkieur);
    }*/
}