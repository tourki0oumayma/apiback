package com.example.adminapi.service;

import com.example.adminapi.model.AnalyseMedicale;
import com.example.adminapi.Repository.AnalyseMedicaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalyseMedicaleService {

    @Autowired
    private AnalyseMedicaleRepository Repository;

    public List<AnalyseMedicale> getAllAnalyses() {
        return Repository.findAll();
    }

    public Optional<AnalyseMedicale> getAnalyseById(Long id) {
        return Repository.findById(id);
    }

    public AnalyseMedicale saveAnalyse(AnalyseMedicale analyse) {
        return Repository.save(analyse);
    }

    public void deleteAnalyse(Long id) {
        Repository.deleteById(id);
    }
}
