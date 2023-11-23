package tn.esprit.gestionfoyer_ibtihel.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity

public class skieur {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long numSkieur;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private  String ville;


}
