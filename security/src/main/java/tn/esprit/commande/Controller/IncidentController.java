package tn.esprit.commande.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.commande.Entity.Incident;
import tn.esprit.commande.Services.IIncidentService;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
@RequiredArgsConstructor
public class IncidentController {

    private final IIncidentService incidentService;

    @PostMapping
    public Incident addIncident(@RequestBody Incident incident) {
        return incidentService.addIncident(incident);
    }

    @GetMapping
    public List<Incident> getAll() {
        return incidentService.getAllIncidents();
    }

    @GetMapping("/{id}")
    public Incident getById(@PathVariable int id) {
        return incidentService.getIncidentById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        incidentService.deleteIncident(id);
    }

    @PutMapping
    public Incident update(@RequestBody Incident incident) {
        return incidentService.updateIncident(incident);
    }


    @PostMapping("/createNotif")
    public Incident createIncidentNotif(@RequestBody Incident incident) {
        return incidentService.createIncidentNotif(incident);
    }

    @GetMapping("/{id}/cout")
    public double getCoutIncident(@PathVariable int id) {
        return incidentService.calculerCoutIncident(id);
    }

    @PostMapping("/{id}/notify")
    public void notifyResponsable(@PathVariable int id) {
        incidentService.notifierResponsable(id);
    }
}
