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

    @GetMapping("/retrieveAllPistes")
    public List<Piste> retrieveAllPistes(){
        return iPisteService.getAllPiste();}

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return iPisteService.addPiste(piste);}

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);}

    @GetMapping("/retrievePiste/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste){
        return iPisteService.getPisteById(numPiste);}

    @DeleteMapping("removePiste/{numPiste}")
    public void removePiste(@PathVariable Long numPiste){
        iPisteService.deletePiste(numPiste);
    }


    @PostMapping("/AssignPisteToSkieur/{numPiste}/{numSkieur}")
    public Piste AssignPisteToSkieur(@PathVariable Long numPiste, @PathVariable Long numSkieur){
        return  iPisteService.assignPisteToSkieur(numPiste, numSkieur);
    }
}