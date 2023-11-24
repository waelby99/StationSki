package tn.esprit.stationski.restControllers;

import tn.esprit.stationski.entities.Inscription;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.services.IInscriptionService;


import java.util.List;
@RestController
@AllArgsConstructor
public class InscriptionRestController {

    private IInscriptionService iInscriptionService;

    @PostMapping("/addInsscriptioAndSkieur/{numSkieur}")
    public Inscription addInscriptionAndAssignToSkieur(@RequestBody Inscription inscription,@PathVariable long numSkieur){
        return  iInscriptionService.addInscriptionAndAssignToSkieur(inscription,numSkieur);

    }
    @PostMapping("/addInsscriptioAndCours/{numCours}")
    public Inscription addInscriptionAndAssignToCours(@RequestBody Inscription inscription,@PathVariable long numCours){
        return  iInscriptionService.addInscriptionAndAssignToCours(inscription,numCours);

    }
}
