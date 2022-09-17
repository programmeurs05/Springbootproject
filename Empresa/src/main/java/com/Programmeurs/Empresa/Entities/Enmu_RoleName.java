package com.Programmeurs.Empresa.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Enmu_RoleName {
    private String rol;

    public Enmu_RoleName(String rol) {
        if(rol.equals("Admin") || rol.equals("Operario")){
        this.rol = rol;}
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        if(rol.equals("Admin") || rol.equals("Operario")){
            this.rol = rol;}
    }
}
