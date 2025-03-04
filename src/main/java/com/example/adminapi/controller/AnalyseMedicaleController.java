package com.example.adminapi.controller;
import com.example.adminapi.model.AnalyseMedicale;
import com.example.adminapi.service.AnalyseMedicaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/analyses")
public class AnalyseMedicaleController {

    @Autowired
    private AnalyseMedicaleService service;

    @GetMapping
    public List<AnalyseMedicale> getAllAnalyses() {
        return service.getAllAnalyses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnalyseMedicale> getAnalyseById(@PathVariable Long id) {
        Optional<AnalyseMedicale> analyse = service.getAnalyseById(id);
        return analyse.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public AnalyseMedicale createAnalyse(@RequestBody AnalyseMedicale analyse) {
        return service.saveAnalyse(analyse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnalyse(@PathVariable Long id) {
        service.deleteAnalyse(id);
        return ResponseEntity.noContent().build();
    }
}
