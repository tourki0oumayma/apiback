package com.example.adminapi.controller;
import java.util.List;
import com.example.adminapi.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.adminapi.model.Ordonnance;
import com.example.adminapi.service.OrdonnanceService;
@RestController
@RequestMapping("/ordonnances")
public class OrdonnanceController {
	@Autowired
    private OrdonnanceService service;
    
 
    @GetMapping
    public List<Ordonnance> getAllOrdonnances() {
        return service.findAll();
    }
    
    @PostMapping
    public Ordonnance createOrdonnance(@RequestBody Ordonnance ordonnance) {
        return service.save(ordonnance);
    }
    
    @GetMapping("/{id}")
    public Ordonnance getOrdonnanceById(@PathVariable int id) {
        return service.findById(id);
    }
}
