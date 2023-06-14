package com.project.gidis.entities;

import com.project.gidis.util.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "persona")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @Column(unique = true, length = 15)
    private String documento;
    @Column(unique = true)
    private String email;
    private String clave;
    private String telefono;
    @Enumerated(value = EnumType.STRING)
    private Rol rol;
    @ManyToMany
    @JoinTable (name = "usuario_articulo", joinColumns = @JoinColumn(name = "articulo_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Set<Articulo> articulo;

    @ManyToMany
    @JoinTable (name = "usuario_libro", joinColumns = @JoinColumn(name = "libro_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Set<Libro> libro;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String documento, String email, String clave, String telefono, Rol rol, Set<Articulo> articulo, Set<Libro> libro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.rol = rol;
        this.articulo = articulo;
        this.libro = libro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Set<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(Set<Articulo> articulo) {
        this.articulo = articulo;
    }

    public Set<Libro> getLibro() {
        return libro;
    }

    public void setLibro(Set<Libro> libro) {
        this.libro = libro;
    }
}
