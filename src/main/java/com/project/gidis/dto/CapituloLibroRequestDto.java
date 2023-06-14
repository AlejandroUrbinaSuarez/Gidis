package com.project.gidis.dto;

import lombok.*;

@Builder
public class CapituloLibroRequestDto {

    private String coautores;
    private String areaDeConocimiento;

    public CapituloLibroRequestDto() {
    }

    public CapituloLibroRequestDto(String coautores, String areaDeConocimiento) {
        this.coautores = coautores;
        this.areaDeConocimiento = areaDeConocimiento;
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
