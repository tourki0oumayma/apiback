package com.example.adminapi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminapi.Repository.LaboratoireRepository;
import com.example.adminapi.model.Laboratoire;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class LaboratoireService {
	 @Autowired
    private  LaboratoireRepository laboratoireRepository;
    private final Map<Integer, Float> analyseTarifs = new HashMap<>(); // Stocke les tarifs des analyses

    // Ajouter un laboratoire
    public Laboratoire ajouterLaboratoire(Laboratoire laboratoire) {
        return laboratoireRepository.save(laboratoire);
    }

    // Ajouter une analyse (stocker uniquement le tarif par ID)
    public boolean ajouterAnalyse(int idAnalyse, float tarif) {
        if (!analyseTarifs.containsKey(idAnalyse)) {
            analyseTarifs.put(idAnalyse, tarif);
            return true;
        }
        return false; // L'analyse existe déjà
    }

    // Modifier le tarif d'une analyse
    public boolean modifierTarif(int idAnalyse, float nouveauTarif) {
        if (analyseTarifs.containsKey(idAnalyse)) {
            analyseTarifs.put(idAnalyse, nouveauTarif);
            return true;
        }
        return false; // L'analyse n'existe pas
    }
}

