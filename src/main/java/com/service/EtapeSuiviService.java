package com.service;

import com.model.SuiviEtapeDTO;
import com.repository.SuiviEtapeRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EtapeSuiviService {

    private final SuiviEtapeRepository repository;

    @Value("${delais.dernierMensuel:-1}")
    private int dernierMensuel;
    @Value("${delais.dernierHebdo:7}")
    private int dernierHebdo;
    @Value("${delais.dernierQuot:2}")
    private int dernierQuot;
    @Value("${delais.dernierTrimestriel:-3}")
    private int dernierTrimestriel;

    public EtapeSuiviService(SuiviEtapeRepository repository) {
        this.repository = repository;
    }

    public Map<String, List<SuiviEtapeDTO>> chargerToutesEtapes(String organisme) {
        String[] etapes = {"ODS", "DWH", "DTM-DET", "DTM-CONSO"};
        Map<String, List<SuiviEtapeDTO>> result = new LinkedHashMap<>();

        for (String etape : etapes) {
            List<SuiviEtapeDTO> etapeData = repository.getSuiviEtapePourEtape(
                    organisme, etape, dernierMensuel, dernierHebdo, dernierQuot, dernierTrimestriel
            );
            result.put(etape, etapeData);
        }

        return result;
    }
}
