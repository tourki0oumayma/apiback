package com.example.adminapi.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateEmission;
    
    @ManyToOne
    private Medecin medecin;
    
    @ManyToOne
    private Patient patient;
    
    private String listeMedicaments;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getDateEmission() { return dateEmission; }
    public void setDateEmission(Date dateEmission) { this.dateEmission = dateEmission; }
    public Medecin getMedecin() { return medecin; }
    public void setMedecin(Medecin medecin) { this.medecin = medecin; }
    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }
    public String getListeMedicaments() { return listeMedicaments; }
    public void setListeMedicaments(String listeMedicaments) { this.listeMedicaments = listeMedicaments; }
    
    public File genererPDF() throws IOException {
        File file = new File("ordonnance_" + id + ".pdf");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            String content = "Ordonnance ID: " + id + "\n" +
                             "Date: " + dateEmission + "\n" +
                             "Médecin: " + medecin.getNom() + "\n" +
                             "Patient: " + patient.getNom() + "\n" +
                             "Médicaments: " + listeMedicaments;
            fos.write(content.getBytes());
        }
        return file;
    }
}
