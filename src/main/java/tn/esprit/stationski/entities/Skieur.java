package tn.esprit.stationski.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Skieur implements  Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numskieur;

    private  String nomS;


    private String prenomS;

    private LocalDate dateNaissance;

    private String ville;

    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;

    @ManyToMany(mappedBy="skieurs")
    private Set<Piste> pistes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skieur")
    private Set<Inscription> inscriptions;
}
