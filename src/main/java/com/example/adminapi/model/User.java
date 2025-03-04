package com.example.adminapi.model;

import com.example.adminapi.model.Role;  


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String typeUtilisateur;
    
    @Enumerated(EnumType.STRING)
	protected Role role;

    public User() {}

    public User(Long id, String nom, String prenom, String email, String motDePasse, String typeUtilisateur, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.typeUtilisateur = typeUtilisateur;
        this.role = role;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }
    public String getTypeUtilisateur() { return typeUtilisateur; }
    public void setTypeUtilisateur(String typeUtilisateur) { this.typeUtilisateur = typeUtilisateur; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public boolean seConnecter() {
        // Logique de connexion
        return true;
    }

    public boolean seDeconnecter() {
        // Logique de déconnexion
        return true;
    }
}
