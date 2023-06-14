package com.project.gidis.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String paginaInicial;
    private String paginaFinal;
    private String nombreRevista;
    private String tipoArticulo;
    private String volumen;
    private String fasciculoRevista;
    private String serieRevista;
    private String ciudad;
    private String digitalObjectIdentifierDOI;
    private String medioDivulgacion;
    private String coautores;
    private String idioma;
    @ManyToMany (mappedBy = "articulo")
    private Set<Usuario> usuario;

    public Articulo() {
    }

    public Articulo(Long id, String titulo, String paginaInicial, String paginaFinal, String nombreRevista, String tipoArticulo, String volumen, String fasciculoRevista, String serieRevista, String ciudad, String digitalObjectIdentifierDOI, String medioDivulgacion, String coautores, String idioma, Set<Usuario> usuario) {
        this.id = id;
        this.titulo = titulo;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.nombreRevista = nombreRevista;
        this.tipoArticulo = tipoArticulo;
        this.volumen = volumen;
        this.fasciculoRevista = fasciculoRevista;
        this.serieRevista = serieRevista;
        this.ciudad = ciudad;
        this.digitalObjectIdentifierDOI = digitalObjectIdentifierDOI;
        this.medioDivulgacion = medioDivulgacion;
        this.coautores = coautores;
        this.idioma = idioma;
        this.usuario = usuario;
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

    public String getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(String paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public String getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(String paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getFasciculoRevista() {
        return fasciculoRevista;
    }

    public void setFasciculoRevista(String fasciculoRevista) {
        this.fasciculoRevista = fasciculoRevista;
    }

    public String getSerieRevista() {
        return serieRevista;
    }

    public void setSerieRevista(String serieRevista) {
        this.serieRevista = serieRevista;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDigitalObjectIdentifierDOI() {
        return digitalObjectIdentifierDOI;
    }

    public void setDigitalObjectIdentifierDOI(String digitalObjectIdentifierDOI) {
        this.digitalObjectIdentifierDOI = digitalObjectIdentifierDOI;
    }

    public String getMedioDivulgacion() {
        return medioDivulgacion;
    }

    public void setMedioDivulgacion(String medioDivulgacion) {
        this.medioDivulgacion = medioDivulgacion;
    }

    public String getCoautores() {
        return coautores;
    }

    public void setCoautores(String coautores) {
        this.coautores = coautores;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Set<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<Usuario> usuario) {
        this.usuario = usuario;
    }
}
