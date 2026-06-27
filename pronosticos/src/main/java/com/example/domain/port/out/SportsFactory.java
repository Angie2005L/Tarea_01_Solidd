package com.pronosticos.domain.port.out;

import com.pronosticos.domain.model.evento.Evento;
import com.pronosticos.domain.model.pronostico.Pronostico;

public interface SportsFactory {

    Evento crearEvento(String id, String nombre);

    Pronostico crearPronostico(String id, String idEvento);
}
