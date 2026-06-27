package com.pronosticos.domain.model.pronostico;

import com.pronosticos.domain.model.EstadoPronostico;


public class PronosticoTenis implements Pronostico {

    private String id;
    private String idEvento;
    private String ganador;
    private String sets;
    private EstadoPronostico estado;

    public PronosticoTenis() {
        this.estado = EstadoPronostico.PENDIENTE;
    }

    public PronosticoTenis(String id, String idEvento) {
        this.id = id;
        this.idEvento = idEvento;
        this.estado = EstadoPronostico.PENDIENTE;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getCategoria() {
        return "Tenis";
    }

    @Override
    public EstadoPronostico getEstado() {
        return estado;
    }

    @Override
    public void evaluar() {
       
        if (ganador == null || sets == null) {
            estado = EstadoPronostico.REVISANDO;
        } else if (!ganador.isEmpty() && !sets.isEmpty()) {
            estado = EstadoPronostico.GANADO;
        } else {
            estado = EstadoPronostico.PERDIDO;
        }
    }

    @Override
    public int calcularPuntos() {
        
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public void setEstado(EstadoPronostico estado) {
        this.estado = estado;
    }

   
}
