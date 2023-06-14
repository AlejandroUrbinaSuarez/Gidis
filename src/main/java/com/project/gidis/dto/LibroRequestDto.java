package com.project.gidis.dto;

import lombok.*;

@Builder
public class LibroRequestDto {

    private String isbn;
    private String titulo;
    private String lugarPublicacion;
    private String editorial;
    private String disciplina;
    private String certificadoCreditos;
    private String certificadoInstitucionAvala;

    public LibroRequestDto() {
    }

    public LibroRequestDto(String isbn, String titulo, String lugarPublicacion, String editorial, String disciplina, String certificadoCreditos, String certificadoInstitucionAvala) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.lugarPublicacion = lugarPublicacion;
        this.editorial = editorial;
        this.disciplina = disciplina;
        this.certificadoCreditos = certificadoCreditos;
        this.certificadoInstitucionAvala = certificadoInstitucionAvala;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public void setLugarPublicacion(String lugarPublicacion) {
        this.lugarPublicacion = lugarPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCertificadoCreditos() {
        return certificadoCreditos;
    }

    public void setCertificadoCreditos(String certificadoCreditos) {
        this.certificadoCreditos = certificadoCreditos;
    }

    public String getCertificadoInstitucionAvala() {
        return certificadoInstitucionAvala;
    }

    public void setCertificadoInstitucionAvala(String certificadoInstitucionAvala) {
        this.certificadoInstitucionAvala = certificadoInstitucionAvala;
    }
}
