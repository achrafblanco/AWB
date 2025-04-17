package tn.esprit.commande.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String responsable;

    @Column(nullable = false)
    private String objet;

    @Column(nullable = false)
    private LocalDate dateInspection;

    @Column(nullable = false)
    private String resultat;

    @ManyToOne
    @JoinColumn(name = "incident_id")
    @JsonIgnore
    private Incident incident;
}
