package com.example.adminapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminapi.Repository.OrdonnanceRepository;
import com.example.adminapi.model.Ordonnance;

@Service
public class OrdonnanceService {
	@Autowired
    private  OrdonnanceRepository Repository;
   
    
    public List<Ordonnance> findAll() {
        return Repository.findAll();
    }
    
    public Ordonnance save(Ordonnance ordonnance) {
        return Repository.save(ordonnance);
    }
    
    public Ordonnance findById(int id) {
        return (Ordonnance) Repository.findById(id);
    }
}