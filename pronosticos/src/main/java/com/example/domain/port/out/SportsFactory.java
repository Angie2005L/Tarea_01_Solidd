package com.example.domain.port.out;

import com.example.domain.model.evento.Evento;
import com.example.domain.model.pronostico.Pronostico;

public interface SportsFactory {

    Evento crearEvento(String id, String nombre);

    Pronostico crearPronostico(String id, String idEvento);
}
