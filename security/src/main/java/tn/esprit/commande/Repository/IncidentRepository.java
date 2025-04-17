package tn.esprit.commande.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.commande.Entity.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {
}
