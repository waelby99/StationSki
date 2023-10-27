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
public class Piste  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    private int longueur;

    private int pente;

    @ManyToMany
    private Set<Skieur> skieurs;
}
