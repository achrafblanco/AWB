package tn.esprit.commande.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.commande.Entity.Incident;
import tn.esprit.commande.Entity.Inspection;
import tn.esprit.commande.Repository.IncidentRepository;
import tn.esprit.commande.Repository.InspectionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionService implements IInspectionService {

    private final InspectionRepository inspectionRepository;
    private final IncidentRepository incidentRepository;


    @Override
    public Inspection addInspection(Inspection inspection, int incidentId) {
        Incident incident = incidentRepository.findById(incidentId).orElse(null);
        if (incident != null) {
            inspection.setIncident(incident);
            return inspectionRepository.save(inspection);
        }
        return null;
    }

    @Override
    public List<Inspection> getAllInspections() {
        return inspectionRepository.findAll();
    }

    @Override
    public List<Inspection> getInspectionsByIncidentId(int incidentId) {
        return inspectionRepository.findByIncidentId(incidentId);
    }

    @Override
    public Inspection getInspectionById(int id) {
        return inspectionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteInspection(int id) {
        inspectionRepository.deleteById(id);
    }

    @Override
    public Inspection updateInspection(Inspection inspection) {
        return inspectionRepository.save(inspection);
    }

}
