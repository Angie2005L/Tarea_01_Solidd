package com.pronosticos.infrastructura.adapter.out.factory;

import com.pronosticos.domain.model.evento.Evento;
import com.pronosticos.domain.model.evento.EventoTenis;
import com.pronosticos.domain.model.pronostico.Pronostico;
import com.pronosticos.domain.model.pronostico.PronosticoTenis;
import com.pronosticos.domain.port.out.SportsFactory;

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
