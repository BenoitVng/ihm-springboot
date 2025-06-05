package com.controller;

import com.model.SuiviEtapeDTO;
import com.service.EtapeSuiviService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/suivi")
public class SuiviEtapeController {

    private final EtapeSuiviService suiviService;

    public SuiviEtapeController(EtapeSuiviService suiviService) {
        this.suiviService = suiviService;
    }

    @GetMapping("/{organisme}")
    public ResponseEntity<Map<String, List<SuiviEtapeDTO>>> getSuivi(@PathVariable String organisme) {
        return ResponseEntity.ok(suiviService.chargerToutesEtapes(organisme));
    }
}