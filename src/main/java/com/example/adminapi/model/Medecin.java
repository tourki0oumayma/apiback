package com.example.adminapi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medecin extends User {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_medecin;*/
    private String specialite;
    private String matricule;
    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnalyseMedicale> analysesMedicales;

    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordonnance> ordonnances;
    public Medecin() {}

    public Medecin(Long id, String nom, String prenom, String email, String motDePasse, String typeUtilisateur, Role role,
                   Long ID_medecin, String specialite, String matricule) {
        super(id ,nom ,prenom ,email ,motDePasse ,typeUtilisateur ,role );
    //    this.ID_medecin = ID_medecin;
        this.specialite = specialite;
        this.matricule = matricule;
    }

  //  public Long getID_medecin() { return ID_medecin; }
  //  public void setID_medecin(int ID_medecin) { this.ID_medecin = (long) ID_medecin; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
}
