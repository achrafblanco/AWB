package tn.esprit.commande.Services;


import tn.esprit.commande.Entity.Inspection;

import java.util.List;

public interface IInspectionService {
    Inspection addInspection(Inspection inspection, int incidentId);
    List<Inspection> getAllInspections();
    List<Inspection> getInspectionsByIncidentId(int incidentId);
    Inspection getInspectionById(int id);
    void deleteInspection(int id);
    Inspection updateInspection(Inspection inspection);
}
