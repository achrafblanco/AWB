package tn.esprit.commande.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private Gravite gravite;

    @Enumerated(EnumType.STRING)
    private EtatIncident etat;

    private String responsable;

    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Inspection> inspectionsList;
}
