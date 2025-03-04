package com.example.adminapi.model;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Patient extends User {
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  private Long ID_patient;
    private String dateNaissance;
    private String adresse;
    private String numTel;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordonnance> ordonnances;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RendezVous> rendezVous;
    public Patient() {}
    
    public Patient(Long id, String nom, String prenon, String email, String role, String motdepasse, String typeutilisateur, Long ID_patient, String dateNaissance, String adresse, String numTel) {
        super();
 //       this.ID_patient = ID_patient;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numTel = numTel;
    }
    
    public boolean PrendreRendezvous(int idAnalyse, Date date) {
        // Logique de prise de rendez-vous
        return true;
    }
    
    // Getters et setters
  //  public Long getID_patient() { return ID_patient; }
  //  public void setID_patient(int ID_patient) { this.ID_patient = (long) ID_patient; }
    public String getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getNumTel() { return numTel; }
    public void setNumTel(String numTel) { this.numTel = numTel; }

	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Patient> getPatientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}
}


