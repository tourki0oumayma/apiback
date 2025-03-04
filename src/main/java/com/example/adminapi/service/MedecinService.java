package com.example.adminapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminapi.Repository.MedecinRepository;
import com.example.adminapi.model.Medecin;

@Service
public class MedecinService {
    @Autowired
    private MedecinRepository medecinRepository;

    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    public Optional<Medecin> getMedecinById(int id) {
        return medecinRepository.findById(id);
    }

    public Medecin createMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    public void deleteMedecin(int id) {
        medecinRepository.deleteById(id);
    }
}
