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
            repository.save(new Traitement(null, "Traitement A", "OK", LocalDate.now().minusDays(3), LocalDate.now()));
            repository.save(new Traitement(null, "Traitement B", "KO", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5)));
            repository.save(new Traitement(null, "Traitement C", "EN_ATTENTE", LocalDate.now().minusDays(7), LocalDate.now().minusDays(2)));
            repository.save(new Traitement(null, "Traitement D", "OK", LocalDate.now().minusDays(1), LocalDate.now()));
            repository.save(new Traitement(null, "Traitement E", "KO", LocalDate.now().minusDays(4), LocalDate.now().minusDays(1)));
        };
    }
}
