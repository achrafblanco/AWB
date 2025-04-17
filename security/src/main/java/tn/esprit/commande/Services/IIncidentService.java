package tn.esprit.commande.Services;



import tn.esprit.commande.Entity.Incident;

import java.util.List;

public interface IIncidentService {
    Incident addIncident(Incident incident);
    List<Incident> getAllIncidents();
    Incident getIncidentById(int id);
    void deleteIncident(int id);
    Incident updateIncident(Incident incident);
    Incident createIncidentNotif(Incident incident);
     double calculerCoutIncident(int incidentId);
     void notifierResponsable(int incidentId);
}
