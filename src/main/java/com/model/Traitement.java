package com.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Traitement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String organisme;
    private int codeCaisse;
    private LocalDate dateTraitement;
    private LocalDate dateEffective;
    private String domaine;
    private String incrFullHist;
    private int nbReemission;
    private String ods;
    private String dwh;
    private String dtmDetail;

    public Traitement() {}

    public Traitement(String organisme, int codeCaisse, LocalDate dateTraitement, LocalDate dateEffective,
                      String domaine, String incrFullHist, int nbReemission,
                      String ods, String dwh, String dtmDetail) {
        this.organisme = organisme;
        this.codeCaisse = codeCaisse;
        this.dateTraitement = dateTraitement;
        this.dateEffective = dateEffective;
        this.domaine = domaine;
        this.incrFullHist = incrFullHist;
        this.nbReemission = nbReemission;
        this.ods = ods;
        this.dwh = dwh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public int getCodeCaisse() {
        return codeCaisse;
    }

    public void setCodeCaisse(int codeCaisse) {
        this.codeCaisse = codeCaisse;
    }

    public LocalDate getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(LocalDate dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public LocalDate getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(LocalDate dateEffective) {
        this.dateEffective = dateEffective;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getIncrFullHist() {
        return incrFullHist;
    }

    public void setIncrFullHist(String incrFullHist) {
        this.incrFullHist = incrFullHist;
    }

    public int getNbReemission() {
        return nbReemission;
    }

    public void setNbReemission(int nbReemission) {
        this.nbReemission = nbReemission;
    }

    public String getOds() {
        return ods;
    }

    public void setOds(String ods) {
        this.ods = ods;
    }

    public String getDwh() {
        return dwh;
    }

    public void setDwh(String dwh) {
        this.dwh = dwh;
    }

    public String getDtmDetail() {
        return dtmDetail;
    }

    public void setDtmDetail(String dtmDetail) {
        this.dtmDetail = dtmDetail;
    }

}
