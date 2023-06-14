package com.project.gidis.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "capitulo")
public class CapituloLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paginaFinal;
    private String paginaInicial;
    private String tituloLibro;
    private String serieLibro;
    private String edicion;
    private String lugarPublicacion;
    private String disciplina;
    private String coautores;
    private String areaDeConocimiento;

    public CapituloLibro() {
    }

    public CapituloLibro(Long id, String paginaFinal, String paginaInicial, String tituloLibro, String serieLibro, String edicion, String lugarPublicacion, String disciplina, String coautores, String areaDeConocimiento) {
        this.id = id;
        this.paginaFinal = paginaFinal;
        this.paginaInicial = paginaInicial;
        this.tituloLibro = tituloLibro;
        this.serieLibro = serieLibro;
        this.edicion = edicion;
        this.lugarPublicacion = lugarPublicacion;
        this.disciplina = disciplina;
        this.coautores = coautores;
        this.areaDeConocimiento = areaDeConocimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(String paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public String getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(String paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getSerieLibro() {
        return serieLibro;
    }

    public void setSerieLibro(String serieLibro) {
        this.serieLibro = serieLibro;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public void setLugarPublicacion(String lugarPublicacion) {
        this.lugarPublicacion = lugarPublicacion;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCoautores() {
        return coautores;
    }

    public void setCoautores(String coautores) {
        this.coautores = coautores;
    }

    public String getAreaDeConocimiento() {
        return areaDeConocimiento;
    }

    public void setAreaDeConocimiento(String areaDeConocimiento) {
        this.areaDeConocimiento = areaDeConocimiento;
    }
}
