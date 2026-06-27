package com.pronosticos.domain.model.pronostico;

import com.pronosticos.domain.model.EstadoPronostico;

public class PronosticoFutbol implements Pronostico {

    private String id;
    private String idEvento;
    private String resultado;
    private String marcador;
    private EstadoPronostico estado;

    public PronosticoFutbol() {
        //ejemplo de estado
        this.estado = EstadoPronostico.PENDIENTE;
    }

    public PronosticoFutbol(String id, String idEvento) {
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
        return "Futbol";
    }

    @Override
    public EstadoPronostico getEstado() {
        return estado;
    }

    @Override
    public void evaluar() {
       
        if (resultado == null || marcador == null) {
            estado = EstadoPronostico.REVISANDO;
        } else if (resultado.equalsIgnoreCase(marcador)) {
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

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public void setEstado(EstadoPronostico estado) {
        this.estado = estado;
    }

 
}
