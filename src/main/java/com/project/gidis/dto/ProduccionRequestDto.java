package com.project.gidis.dto;

import lombok.*;

@Builder
public class ProduccionRequestDto {

    private String titulo;
    private String anio;
    private String mes;
    private String medioDivulgacion;
    private String documentoEvidencia;

    public String getTitulo() {
        return titulo;
    }

    public ProduccionRequestDto() {
    }

    public ProduccionRequestDto(String titulo, String anio, String mes, String medioDivulgacion, String documentoEvidencia) {
        this.titulo = titulo;
        this.anio = anio;
        this.mes = mes;
        this.medioDivulgacion = medioDivulgacion;
        this.documentoEvidencia = documentoEvidencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMedioDivulgacion() {
        return medioDivulgacion;
    }

    public void setMedioDivulgacion(String medioDivulgacion) {
        this.medioDivulgacion = medioDivulgacion;
    }

    public String getDocumentoEvidencia() {
        return documentoEvidencia;
    }

    public void setDocumentoEvidencia(String documentoEvidencia) {
        this.documentoEvidencia = documentoEvidencia;
    }
}
