package com.pronosticos.domain.model;

import com.pronosticos.domain.port.in.SistemaGestion;
import com.pronosticos.domain.port.out.SportsFactory;

public class Administrador {

    private String id;
    private String nombre;
    private SistemaGestion sistemaGestion;

    public Administrador() {
    }

    public Administrador(String id, String nombre, SistemaGestion sistemaGestion) {
        this.id = id;
        this.nombre = nombre;
        this.sistemaGestion = sistemaGestion;
    }

    public void configurarPronostico() {
        System.out.println("[Administrador " + nombre + "] Configurando parámetros de pronóstico...");
    }

    public void gestionarReglasYPuntos() {
        System.out.println("[Administrador " + nombre + "] Gestionando reglas y puntos del sistema...");
    }

 
    public void agregarDeporte(SportsFactory f) {
        System.out.println("[Administrador " + nombre + "] Configurando nuevo deporte en el sistema...");
        sistemaGestion.setFactory(f);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SistemaGestion getSistemaGestion() {
        return sistemaGestion;
    }

    public void setSistemaGestion(SistemaGestion sistemaGestion) {
        this.sistemaGestion = sistemaGestion;
    }
}
