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
public class Abonnement  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;
}
