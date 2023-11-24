package tn.esprit.stationski.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.services.ISkieurService;

import java.util.List;
@RestController
@AllArgsConstructor
public class SkieurRestController {
    private ISkieurService iSkieurService;
    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
    @PutMapping("/modifierSkieur")
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return iSkieurService.updateSkieur(skieur);
    }
    @GetMapping("/getAllSkieur")
    public List<Skieur> getAllSkieur(){
        return iSkieurService.getAllSkieur();
    }
    @GetMapping("/getSkieur/{numSkieur}")
    public Skieur findById(@PathVariable long numSkieur){
        return iSkieurService.getSkieurById( numSkieur);
    }
    @DeleteMapping("/supprimerSkieur/{numSkieur}")
    public void deleteSkieur(@PathVariable long  numSkieur){
        iSkieurService.deleteSkieur( numSkieur);
    }

    @PostMapping("/addSkieurAndAssignToCours/{numCours}")
    public Skieur addSkieurAndAssignToCours(@RequestBody Skieur skieur,@PathVariable Long numCours){
        return  iSkieurService.addSkieurAndAssignToCours(skieur,numCours);
    }
}