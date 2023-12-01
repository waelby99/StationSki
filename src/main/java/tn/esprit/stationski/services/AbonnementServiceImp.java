package tn.esprit.stationski.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.stationski.entities.Abonnement;
import tn.esprit.stationski.repositories.AbonnementRepository;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AbonnementServiceImp implements IAbonnementService{

    private AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }

    @Override
    public void removeAbonnement(Long numAbon){
        abonnementRepository.deleteById(numAbon);
    }
    @Override
    public List<Abonnement> retrieveAbonnementByDate(LocalDate startDate, LocalDate endDate) {
        return abonnementRepository.findByDateDebutBetween(startDate, endDate);
    }



    @Scheduled(cron = "0 0 1 1 * ?")
    public void showMonthlyRecurringRevenue() {

        double mrr = 00; // Méthode pour calculer le MRR
        System.out.println("Monthly Recurring Revenue: " + mrr);
    }
}
