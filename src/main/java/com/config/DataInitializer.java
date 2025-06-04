package com.config;

import com.model.Traitement;
import com.repository.TraitementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(TraitementRepository repository) {
        return args -> {
            repository.save(new Traitement(
                    "Organisme A", 101, LocalDate.now().minusDays(3), LocalDate.now(), "Domaine 1",
                    "OUI", 2, "ODS A", "DWH A", "DTM Detail A"));

            repository.save(new Traitement(
                    "Organisme B", 102, LocalDate.now().minusDays(10), LocalDate.now().minusDays(5), "Domaine 2",
                    "NON", 1, "ODS B", "DWH B", "DTM Detail B"));

            repository.save(new Traitement(
                    "Organisme C", 103, LocalDate.now().minusDays(7), LocalDate.now().minusDays(2), "Domaine 3",
                    "OUI", 0, "ODS C", "DWH C", "DTM Detail C"));

            repository.save(new Traitement(
                    "Organisme D", 104, LocalDate.now().minusDays(1), LocalDate.now(), "Domaine 4",
                    "OUI", 3, "ODS D", "DWH D", "DTM Detail D"));

            repository.save(new Traitement(
                    "Organisme E", 105, LocalDate.now().minusDays(4), LocalDate.now().minusDays(1), "Domaine 5",
                    "NON", 1, "ODS E", "DWH E", "DTM Detail E"));
        };
    }
}
