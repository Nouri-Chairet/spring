package com.example.demo.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricule;
    private String identifiantUnique;
    private String identifiantCarte;
    private String nom;
    private String prenom;
    private String nomPrenomArabe;
    private LocalDate dateNaissance;
    private String lieuNaissance;
    private String sexe;
    private String etablissementProvenance;
    private String adresse;
    private String niveau;
    private String classe;
    private String etatSante;
    private String descriptionSante;

    // Getters and Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setIdentifiantUnique(String identifiantUnique) {
        this.identifiantUnique = identifiantUnique;
    }

    public void setIdentifiantCarte(String identifiantCarte) {
        this.identifiantCarte = identifiantCarte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomPrenomArabe(String nomPrenomArabe) {
        this.nomPrenomArabe = nomPrenomArabe;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setEtablissementProvenance(String etablissementProvenance) {
        this.etablissementProvenance = etablissementProvenance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setEtatSante(String etatSante) {
        this.etatSante = etatSante;
    }

    public void setDescriptionSante(String descriptionSante) {
        this.descriptionSante = descriptionSante;
    }

    public Long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getIdentifiantUnique() {
        return identifiantUnique;
    }

    public String getIdentifiantCarte() {
        return identifiantCarte;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomPrenomArabe() {
        return nomPrenomArabe;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public String getEtablissementProvenance() {
        return etablissementProvenance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getClasse() {
        return classe;
    }

    public String getEtatSante() {
        return etatSante;
    }

    public String getDescriptionSante() {
        return descriptionSante;
    }
}
