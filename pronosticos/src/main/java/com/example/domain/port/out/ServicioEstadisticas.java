package com.example.domain.port.out;

import com.example.domain.model.Estadistica;

import java.util.List;

public interface ServicioEstadisticas {

    Estadistica obtenerHistoricoLocal(String id);

    boolean estaDisponible();

    Estadistica obtenerEstadisticas(String eventoId);

    List<Estadistica> obtenerTendencias(String id);
}
