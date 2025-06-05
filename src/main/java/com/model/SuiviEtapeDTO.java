package com.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SuiviEtapeDTO {
    private String orga;
    private String etape;
    private String caisse;
    private String domaine;
    private String incrFullHist;
    private Long numLot;
    private String topReemission;
    private LocalDateTime datExt;
    private LocalDate dateEff;
    private LocalDateTime dateTrtNiveau;
    private String niveauOkKo;
    private String traitement;
    private String topDernier;

    public String getOrga() { return orga; }
    public void setOrga(String orga) { this.orga = orga; }

    public String getEtape() { return etape; }
    public void setEtape(String etape) { this.etape = etape; }

    public String getCaisse() { return caisse; }
    public void setCaisse(String caisse) { this.caisse = caisse; }

    public String getDomaine() { return domaine; }
    public void setDomaine(String domaine) { this.domaine = domaine; }

    public String getIncrFullHist() { return incrFullHist; }
    public void setIncrFullHist(String incrFullHist) { this.incrFullHist = incrFullHist; }

    public Long getNumLot() { return numLot; }
    public void setNumLot(Long numLot) { this.numLot = numLot; }

    public String getTopReemission() { return topReemission; }
    public void setTopReemission(String topReemission) { this.topReemission = topReemission; }

    public LocalDateTime getDatExt() { return datExt; }
    public void setDatExt(LocalDateTime datExt) { this.datExt = datExt; }

    public LocalDate getDateEff() { return dateEff; }
    public void setDateEff(LocalDate dateEff) { this.dateEff = dateEff; }

    public LocalDateTime getDateTrtNiveau() { return dateTrtNiveau; }
    public void setDateTrtNiveau(LocalDateTime dateTrtNiveau) { this.dateTrtNiveau = dateTrtNiveau; }

    public String getNiveauOkKo() { return niveauOkKo; }
    public void setNiveauOkKo(String niveauOkKo) { this.niveauOkKo = niveauOkKo; }

    public String getTraitement() { return traitement; }
    public void setTraitement(String traitement) { this.traitement = traitement; }

    public String getTopDernier() { return topDernier; }
    public void setTopDernier(String topDernier) { this.topDernier = topDernier; }
}
