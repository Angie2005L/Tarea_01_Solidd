package com.pronosticos.domain.model.pronostico;

import com.pronosticos.domain.model.EstadoPronostico;


public interface Pronostico {

    String getId();

    String getCategoria();

    EstadoPronostico getEstado();

   
    void evaluar();

    int calcularPuntos();
}
