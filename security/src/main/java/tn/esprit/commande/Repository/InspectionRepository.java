package tn.esprit.commande.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.commande.Entity.Inspection;

import java.util.List;

public interface InspectionRepository extends JpaRepository<Inspection, Integer> {
    List<Inspection> findByIncidentId(int incidentId);
}