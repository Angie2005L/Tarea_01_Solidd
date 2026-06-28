package com.example.domain.model.pronostico;

import com.example.domain.model.EstadoPronostico;


public interface Pronostico {

    String getId();

    String getCategoria();

    EstadoPronostico getEstado();

   
    void evaluar();

    int calcularPuntos();
}
