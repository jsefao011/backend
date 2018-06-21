/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.controller;

import java.util.ArrayList;
import java.util.List;

import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.util.InjectHibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.portalAcademico.domain.Alumno;
import upeu.edu.pe.portalAcademico.domain.Persona;
import upeu.edu.pe.portalAcademico.repository.AlumnoRepository;
import upeu.edu.pe.portalAcademico.util.Hibernate;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api")
public class AlumnoController {

    private final ConsultarPersonaController personaController;
    @Autowired
    private
    AlumnoRepository alumnoRepository;

    public AlumnoController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        this.personaController = InjectHibernate.injectPersonaControllerHibernate(factory);
    }

    @GetMapping("/alumno/todos")
    public List<Alumno> alumno() {
        List<Alumno> alumnos = new ArrayList<>();
        for (Alumno alumno: alumnoRepository.findAll()){
            alumno.setPersona(personaController.getObjeto(alumno.getF_tm_persona()));
            alumnos.add(alumno);
        }
        return alumnos;
    }

    @RequestMapping(value = "/alumno/all", method = RequestMethod.POST)
    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        for (Alumno alumno: alumnoRepository.findAll()){
            alumno.setPersona(personaController.getObjeto(alumno.getF_tm_persona()));
            alumnos.add(alumno);
        }
        return alumnos;
    }

    @RequestMapping(value = "/alumno/{id}", method = RequestMethod.POST)
    public Alumno obtenerAlumno(@PathVariable long id) {
        Alumno alumno = alumnoRepository.getOne(id);
        if(alumno != null)alumno.setPersona(personaController.getObjeto(alumno.getF_tm_persona()));
        return alumno;
    }

    @RequestMapping(value = "/alumno/save", method = RequestMethod.POST)
    public void guardarAlumno(@RequestBody Alumno alumno) {
        com.liquid.restApi.datos.model.Persona persona = new com.liquid.restApi.datos.model.Persona();
        if(alumno.getPersona() != null){
            persona = personaController.save(alumno.getPersona());
        }

        if(persona != null){
            alumno.setF_tm_persona(persona.getId());
        }

        alumnoRepository.save(alumno);
    }

}
