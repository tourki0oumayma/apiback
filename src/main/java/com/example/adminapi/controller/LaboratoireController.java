package com.example.adminapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.adminapi.model.Laboratoire;
import com.example.adminapi.service.LaboratoireService;

@RestController
@RequestMapping("/laboratoires")
public class LaboratoireController {
	 @Autowired
    private LaboratoireService laboratoireService;

    // Ajouter un laboratoire
    @PostMapping
    public ResponseEntity<Laboratoire> ajouterLaboratoire(@RequestBody Laboratoire laboratoire) {
        Laboratoire savedLaboratoire = laboratoireService.ajouterLaboratoire(laboratoire);
        return ResponseEntity.ok(savedLaboratoire);
    }

    // Ajouter une analyse
    @PostMapping("/analyses/{idAnalyse}")
    public ResponseEntity<String> ajouterAnalyse(@PathVariable int idAnalyse, @RequestParam float tarif) {
        boolean added = laboratoireService.ajouterAnalyse(idAnalyse, tarif);
        if (added) {
            return ResponseEntity.ok("Analyse ajoutée avec succès !");
        }
        return ResponseEntity.badRequest().body("Échec : l'analyse existe déjà.");
    }

    // Modifier le tarif d'une analyse
    @PutMapping("/analyses/{idAnalyse}/tarif")
    public ResponseEntity<String> modifierTarif(@PathVariable int idAnalyse, @RequestParam float tarif) {
        boolean updated = laboratoireService.modifierTarif(idAnalyse, tarif);
        if (updated) {
            return ResponseEntity.ok("Tarif modifié avec succès !");
        }
        return ResponseEntity.badRequest().body("Échec : l'analyse n'existe pas.");
    }
}

