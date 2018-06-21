/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upeu.edu.pe.portalAcademico.domain.Semestre;
import upeu.edu.pe.portalAcademico.repository.SemestreRepository;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api")
public class SemestreController {

    @Autowired
    SemestreRepository semestreRepository;

    @GetMapping("/semestre/all")
    public List<Semestre> semestres() {    
        return semestreRepository.findAll();
    }
    
  

}
