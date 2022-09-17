package com.Programmeurs.Empresa.Entities;

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
