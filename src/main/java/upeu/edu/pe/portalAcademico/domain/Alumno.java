/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.util.InjectHibernate;
import org.hibernate.SessionFactory;
import upeu.edu.pe.portalAcademico.util.Hibernate;

import javax.persistence.*;

/**
 *
 * @author USUARIO
 */
@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigoAlumno;
    private int f_tm_persona;
    @Transient
    private com.liquid.restApi.datos.model.Persona persona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public int getF_tm_persona() {
        return f_tm_persona;
    }

    public void setF_tm_persona(int f_tm_persona) {
        this.f_tm_persona = f_tm_persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
