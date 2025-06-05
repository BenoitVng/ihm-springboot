package com.mapper;

import com.model.SuiviEtapeDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SuiviEtapeRowMapper implements RowMapper<SuiviEtapeDTO> {
    @Override
    public SuiviEtapeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        SuiviEtapeDTO dto = new SuiviEtapeDTO();
        dto.setOrga(rs.getString("ORGA"));
        dto.setEtape(rs.getString("ETAPE"));
        dto.setCaisse(rs.getString("CAISSE"));
        dto.setDomaine(rs.getString("DOMAINE"));
        dto.setIncrFullHist(rs.getString("INCR_FULL_HIST"));
        dto.setNumLot(rs.getLong("NUM_LOT"));
        dto.setTopReemission(rs.getString("TOP_REEMISSION"));
        dto.setDatExt(rs.getTimestamp("DATEXT").toLocalDateTime());
        dto.setDateEff(rs.getDate("DATE_AFF").toLocalDate());
        dto.setDateTrtNiveau(rs.getTimestamp("DATE_TRT_NIVEAU").toLocalDateTime());
        dto.setNiveauOkKo(rs.getString("NIVEAU_OK_KO"));
        dto.setTraitement(rs.getString("TRAITEMENT"));
        dto.setTopDernier(rs.getString("TOP_DERNIER"));
        return dto;
    }
}

