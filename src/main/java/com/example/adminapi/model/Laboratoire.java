package com.example.adminapi.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Laboratoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
    private List<AnalyseMedicale> analyses;

    @OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
    private List<RendezVous> rendezVous;

    // Constructeurs
    public Laboratoire() {}

    public Laboratoire(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
}
