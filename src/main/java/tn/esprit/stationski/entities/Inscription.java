package tn.esprit.stationski.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Inscription implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;

    private int numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;
}
