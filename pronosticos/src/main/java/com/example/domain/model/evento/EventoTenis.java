package com.example.domain.model.evento;

import java.util.Date;


public class EventoTenis implements Evento {

    private String id;
    private String nombre;
    private Date fecha;
    private String jugador1;
    private String jugador2;
    private String superficie;
    private boolean abierto;

    public EventoTenis() {
    }

    public EventoTenis(String id, String nombre, Date fecha, String jugador1,
                        String jugador2, String superficie, boolean abierto) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.superficie = superficie;
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
        return "Tenis";
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

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

   
}
