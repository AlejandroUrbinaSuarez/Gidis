package com.project.gidis.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "proyectoInvestigacion")
public class ProyectoInvestigacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String tipoProyecto;
    private String mesInicio;
    private String mesFin;
    private String anioInicio;
    private String anioFin;
    private boolean financiado;
    private String fuenteFinanciacion;
    private String ambito;
    private String resumen;
    private String instituciones;

    public ProyectoInvestigacion() {
    }

    public ProyectoInvestigacion(Long id, String titulo, String tipoProyecto, String mesInicio, String mesFin, String anioInicio, String anioFin, boolean financiado, String fuenteFinanciacion, String ambito, String resumen, String instituciones) {
        this.id = id;
        this.titulo = titulo;
        this.tipoProyecto = tipoProyecto;
        this.mesInicio = mesInicio;
        this.mesFin = mesFin;
        this.anioInicio = anioInicio;
        this.anioFin = anioFin;
        this.financiado = financiado;
        this.fuenteFinanciacion = fuenteFinanciacion;
        this.ambito = ambito;
        this.resumen = resumen;
        this.instituciones = instituciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public String getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getMesFin() {
        return mesFin;
    }

    public void setMesFin(String mesFin) {
        this.mesFin = mesFin;
    }

    public String getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(String anioFin) {
        this.anioFin = anioFin;
    }

    public boolean isFinanciado() {
        return financiado;
    }

    public void setFinanciado(boolean financiado) {
        this.financiado = financiado;
    }

    public String getFuenteFinanciacion() {
        return fuenteFinanciacion;
    }

    public void setFuenteFinanciacion(String fuenteFinanciacion) {
        this.fuenteFinanciacion = fuenteFinanciacion;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(String instituciones) {
        this.instituciones = instituciones;
    }
}
