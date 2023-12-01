package tn.esprit.stationski.restControllers;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stationski.services.IAbonnementService;
import tn.esprit.stationski.entities.Abonnement;

@RestController
@AllArgsConstructor
public class AbonnementRestController {
    private IAbonnementService iAbonnementService;

    @GetMapping("/retrieveAllAbonnements")
    public List<Abonnement> retrieveAllAbonnements(){
        return iAbonnementService.retrieveAllAbonnements();}


    @PostMapping("/addAbonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnementService.addAbonnement(abonnement);
    }


    @PutMapping("/updateAbonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnementService.updateAbonnement(abonnement);}

    @GetMapping("/retrieveAbonnement/{numAbon}")
    public Abonnement retrieveAbonnement(@PathVariable Long numAbon){
        return iAbonnementService.retrieveAbonnement(numAbon);
    }

    @DeleteMapping("removeAbonnement/{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon){
        iAbonnementService.removeAbonnement(numAbon);
    }
}
