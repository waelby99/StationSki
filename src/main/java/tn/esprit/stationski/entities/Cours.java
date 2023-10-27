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
@Table(name="Cours")
public class Cours  implements  Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;

    private int niveau;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;

    private float prix;

    private int creneau;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private Set<Inscription> inscriptions;


}
