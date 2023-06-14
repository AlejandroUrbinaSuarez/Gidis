package com.project.gidis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
public class UsuarioRequestDto {

    private String nombre;
    private String telefono;
    private String clave;

    public UsuarioRequestDto() {
    }

    public UsuarioRequestDto(String nombre, String telefono, String clave) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
