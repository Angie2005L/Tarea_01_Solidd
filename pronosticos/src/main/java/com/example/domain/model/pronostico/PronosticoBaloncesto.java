package com.pronosticos.domain.model.pronostico;

import com.pronosticos.domain.model.EstadoPronostico;


public class PronosticoBaloncesto implements Pronostico {

    private String id;
    private String idEvento;
    private String resultado;
    private String puntuacion;
    private EstadoPronostico estado;

    public PronosticoBaloncesto() {
        this.estado = EstadoPronostico.PENDIENTE;
    }

    public PronosticoBaloncesto(String id, String idEvento) {
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
        return "Baloncesto";
    }

    @Override
    public EstadoPronostico getEstado() {
        return estado;
    }

    @Override
    public void evaluar() {
        if (resultado == null || puntuacion == null) {
            estado = EstadoPronostico.REVISANDO;
        } else if (resultado.equalsIgnoreCase(puntuacion)) {
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setEstado(EstadoPronostico estado) {
        this.estado = estado;
    }

  
}
