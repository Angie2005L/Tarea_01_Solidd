package com.example.infrastructura.adapter.out.factory;

import com.example.domain.model.evento.Evento;
import com.example.domain.model.evento.EventoTenis;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.model.pronostico.PronosticoTenis;
import com.example.domain.port.out.SportsFactory;

import java.util.Date;


public class TenisFactory implements SportsFactory {

    @Override
    public Evento crearEvento(String id, String nombre) {
        return new EventoTenis(id, nombre, new Date(), "Jugador 1",
                "Jugador 2", ".....", true);
    }

    @Override
    public Pronostico crearPronostico(String id, String idEvento) {
        return new PronosticoTenis(id, idEvento);
    }
}
