package tn.esprit.stationski.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.stationski.entities.Moniteur;
import tn.esprit.stationski.services.IMoniteurService;

@RestController
@AllArgsConstructor
public class MoniteurRestController {
    private IMoniteurService iMoniteurService;
    @PostMapping("/addMoniteurAndAssignToCours/{numCours}")
    public Moniteur addMoniteurAndAssignToCours(@RequestBody Moniteur moniteur,@PathVariable Long numCours){
        return iMoniteurService.addMoniteurAssignToCours(moniteur,numCours);
    }
}
