package com.repository;

import com.model.SuiviEtapeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SuiviEtapeRepository {

    private final NamedParameterJdbcTemplate jdbc;

    public SuiviEtapeRepository(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<SuiviEtapeDTO> getSuiviEtapePourEtape(
            String organisme, String etape,
            int xDernierMensuel, int xDernierHebdo,
            int xDernierQuot, int xDernierTrimestriel
    ) {
        // Charge un SQL dynamique basé sur l'étape (ODS, DWH, DTM-DET, etc.)
        String sql = "SELECT ... WHERE ..."; // À remplir avec les requêtes Oracle migrées

        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("organisme", organisme)
                .addValue("etape", etape)
                .addValue("xDernierMensuel", xDernierMensuel)
                .addValue("xDernierHebdo", xDernierHebdo)
                .addValue("xDernierQuot", xDernierQuot)
                .addValue("xDernierTrimestriel", xDernierTrimestriel);

        return jdbc.query(sql, params, new BeanPropertyRowMapper<>(SuiviEtapeDTO.class));
    }
}
