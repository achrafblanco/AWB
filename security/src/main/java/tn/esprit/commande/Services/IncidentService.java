package tn.esprit.commande.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.commande.Entity.Incident;
import tn.esprit.commande.Repository.IncidentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncidentService implements IIncidentService {

    private final IncidentRepository incidentRepository;
    @Autowired
    private EmailService emailService;

   @Override
   public Incident createIncidentNotif(Incident incident) {
       Incident saved = incidentRepository.save(incident);
       emailService.sendNotificationEmail(
               "classyy2023@gmail.com",
               "Incident créé",
               "Un nouvel incident a été créé avec l'ID : " + saved.getId()
       );
       return saved;
   }

   @Override
   public double calculerCoutIncident(int incidentId) {
        Incident incident = incidentRepository.findById(incidentId).orElseThrow(() -> new RuntimeException("Incident introuvable"));
        double coûtDeBase = 100;
        switch (incident.getGravite()) {
            case FORTE:
                return coûtDeBase * 2;
            case MOYENNE:
                return coûtDeBase * 1.5;
            default:
                return coûtDeBase;
        }
    }

    @Override
    public void notifierResponsable(int incidentId) {
        Incident incident = incidentRepository.findById(incidentId)
                .orElseThrow(() -> new RuntimeException("Incident introuvable"));

        String to = "responsable.incidents@exemple.com"; // email fixe ici
        String subject = "📢 Nouveau incident n°" + incidentId;
        String htmlBody = "<h2 style='color: #b30000;'>Alerte Incident</h2>"
                + "<p><strong>Description :</strong> " + incident.getDescription() + "</p>"
                + "<p><strong>Gravité :</strong> " + incident.getGravite() + "</p>"
                + "<p><strong>Date :</strong> " + incident.getDate() + "</p>"
                + "<p><strong>Responsable :</strong> " + incident.getResponsable() + "</p>"
                + "<hr><p>Merci de vérifier dans l'application dès que possible.</p>";

        emailService.sendHtmlEmail(to, subject, htmlBody);
    }



    @Override
    public Incident addIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    @Override
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    @Override
    public Incident getIncidentById(int id) {
        return incidentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteIncident(int id) {
        incidentRepository.deleteById(id);
    }

    @Override
    public Incident updateIncident(Incident incident) {
        return incidentRepository.save(incident);
    }
}
