package com.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Traitement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String statut;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    public Traitement() {}

    public Traitement(Long id, String nom, String statut, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.nom = nom;
        this.statut = statut;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
