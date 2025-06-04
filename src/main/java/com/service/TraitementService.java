package com.service;
import org.springframework.data.domain.Sort;

import com.model.Traitement;
import com.repository.TraitementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraitementService {

    @Autowired
    private TraitementRepository repo;
    public List<Traitement> getAll() {
        return repo.findAll();
    }
    public List<Traitement> getAllSorted(String sortBy, String order) {
        Sort sort = order.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        return repo.findAll(sort);
    }

}
