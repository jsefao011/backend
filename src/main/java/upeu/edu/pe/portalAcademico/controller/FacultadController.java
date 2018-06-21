/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upeu.edu.pe.portalAcademico.domain.Facultad;
import upeu.edu.pe.portalAcademico.repository.FacultadRepository;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api")
public class FacultadController {

    @Autowired
    FacultadRepository facultadRepository;

    @GetMapping("/facultad/all")
    public List<Facultad> facultad() {
        return facultadRepository.findAll();
    }

}
