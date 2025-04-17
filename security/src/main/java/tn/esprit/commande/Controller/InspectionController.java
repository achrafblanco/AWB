package tn.esprit.commande.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.commande.Entity.Inspection;
import tn.esprit.commande.Services.IInspectionService;

import java.util.List;

@RestController
@RequestMapping("/api/inspections")
@RequiredArgsConstructor
public class InspectionController {

    private final IInspectionService inspectionService;

    @PostMapping("/{incidentId}")
    public Inspection addInspection(@RequestBody Inspection inspection, @PathVariable int incidentId) {
        return inspectionService.addInspection(inspection, incidentId);
    }

    @GetMapping
    public List<Inspection> getAll() {
        return inspectionService.getAllInspections();
    }

    @GetMapping("/incident/{incidentId}")
    public List<Inspection> getByIncident(@PathVariable int incidentId) {
        return inspectionService.getInspectionsByIncidentId(incidentId);
    }

    @GetMapping("/{id}")
    public Inspection getById(@PathVariable int id) {
        return inspectionService.getInspectionById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        inspectionService.deleteInspection(id);
    }

    @PutMapping
    public Inspection update(@RequestBody Inspection inspection) {
        return inspectionService.updateInspection(inspection);
    }
}
