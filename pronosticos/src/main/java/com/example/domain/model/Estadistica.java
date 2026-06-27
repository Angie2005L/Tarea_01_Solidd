package com.pronosticos.domain.model;

import java.util.HashMap;
import java.util.Map;


public class Estadistica {

    private String eventoId;
    private boolean esLocal;
    private Map<String, Object> datos;

    public Estadistica() {
        this.datos = new HashMap<>();
    }

    public Estadistica(String eventoId, boolean esLocal) {
        this.eventoId = eventoId;
        this.esLocal = esLocal;
        this.datos = new HashMap<>();
    }

    public Object getDato(String clave) {
        return datos.get(clave);
    }
    public void setDato(String clave, Object valor) {
        datos.put(clave, valor);
    }

    
    public void actualizar() {
        System.out.println("[Estadistica] Actualizando estadísticas del evento " + eventoId);
    }

    public String getEventoId() {
        return eventoId;
    }

    public void setEventoId(String eventoId) {
        this.eventoId = eventoId;
    }

    public boolean isEsLocal() {
        return esLocal;
    }

    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }

    public Map<String, Object> getDatos() {
        return datos;
    }

    public void setDatos(Map<String, Object> datos) {
        this.datos = datos;
    }

   
}
