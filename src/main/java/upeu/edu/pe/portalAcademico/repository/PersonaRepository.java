/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.portalAcademico.domain.Persona;

/**
 *
 * @author USUARIO
 */
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
