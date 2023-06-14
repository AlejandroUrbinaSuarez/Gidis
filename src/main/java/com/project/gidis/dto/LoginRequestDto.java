package com.project.gidis.dto;

import lombok.*;

@Builder
public class LoginRequestDto {

    private String email;
    private String clave;

    public LoginRequestDto() {
    }

    public LoginRequestDto(String email, String clave) {
        this.email = email;
        this.clave = clave;
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
}
