package tn.esprit.stationski.services;

import tn.esprit.stationski.entities.Cours;

import java.util.List;

public interface ICoursService {
    public List<Cours> retrieveAllCourses();
    public Cours addCours(Cours cours);
    public Cours updateCours(Cours cours);

    public Cours retrieveCours(Long numCours);
    public void removeCours(Long numCours);
}
