package com.example.domain.model.evento;

import java.util.Date;


public class EventoBaloncesto implements Evento {

    private String id;
    private String nombre;
    private Date fecha;
    private String equipoLocal;
    private String equipoVisitante;
    private String cancha;
    private boolean abierto;

    public EventoBaloncesto() {
    }

    public EventoBaloncesto(String id, String nombre, Date fecha, String equipoLocal,
                             String equipoVisitante, String cancha, boolean abierto) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cancha = cancha;
        this.abierto = abierto;
    }

    @Override
    public boolean estaAbierto() {
        return abierto;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDeporte() {
        return "Baloncesto";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getCancha() {
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

   
}
