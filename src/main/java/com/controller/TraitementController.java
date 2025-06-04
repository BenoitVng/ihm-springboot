package com.controller;

import com.model.Traitement;
import com.service.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TraitementController {

    @Autowired
    private TraitementService service;  // Injection du service

    @GetMapping("/dashboard")
    public String dashboard(
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String order,
            Model model
    ) {
        System.out.println("SortBy: " + sortBy + ", Order: " + order);
        List<Traitement> traitements = service.getAllSorted(sortBy, order);
        model.addAttribute("traitements", traitements);
        model.addAttribute("sortBy", sortBy);
        model.addAttribute("order", order);
        return "dashboard";
    }
}
