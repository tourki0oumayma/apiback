package com.example.adminapi.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class AnalyseMedicale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomAnalyse;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateResultat;

    @Enumerated(EnumType.STRING)
    private TypeAnalyse typeAnalyse;
    @ManyToOne
    @JoinColumn(name = "laboratoire_id", nullable = false)
    private Laboratoire laboratoire;
    @ManyToOne
    Medecin medecin;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomAnalyse() {
        return nomAnalyse;
    }

    public void setNomAnalyse(String nomAnalyse) {
        this.nomAnalyse = nomAnalyse;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDateResultat() {
        return dateResultat;
    }

    public void setDateResultat(Date dateResultat) {
        this.dateResultat = dateResultat;
    }

    public TypeAnalyse getTypeAnalyse() {
        return typeAnalyse;
    }

    public void setTypeAnalyse(TypeAnalyse typeAnalyse) {
        this.typeAnalyse = typeAnalyse;
    }
}

