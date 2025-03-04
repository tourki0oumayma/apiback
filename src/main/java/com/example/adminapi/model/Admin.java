package com.example.adminapi.model;

import javax.management.relation.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    */
    public Admin() {}

    public Admin(Long id, String nom, String prenom, String email, String motDePasse, String typeUtilisateur, Role role, Long idAdmin) {
        super(  );
     //   this.idAdmin = idAdmin;
    }

  //  public Long getIdAdmin() { return idAdmin; }
   // public void setIdAdmin(Long idAdmin) { this.idAdmin = idAdmin; }
    
    public void gestionUtilisateurs() {
        // Logique de gestion des utilisateurs
    }
    
    public void gestionLaboratoires() {
        // Logique de gestion des laboratoires
    }
}

