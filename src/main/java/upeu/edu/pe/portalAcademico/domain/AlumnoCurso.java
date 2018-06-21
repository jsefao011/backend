/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.portalAcademico.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author USUARIO
 */
@Entity
public class AlumnoCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double nota;
    @ManyToOne
    @JoinColumn(name = "rubroEvaluacionId")
    private RubroEvaluacion rubroEvaluacion;
    @ManyToOne
    @JoinColumn(name = "alumnoId")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "cursoId")
    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public RubroEvaluacion getRubroEvaluacion() {
        return rubroEvaluacion;
    }

    public void setRubroEvaluacion(RubroEvaluacion rubroEvaluacion) {
        this.rubroEvaluacion = rubroEvaluacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
