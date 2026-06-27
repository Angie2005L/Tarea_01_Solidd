package com.pronosticos.infrastructura.adapter.out.factory;

import com.pronosticos.domain.model.evento.Evento;
import com.pronosticos.domain.model.evento.EventoBaloncesto;
import com.pronosticos.domain.model.pronostico.Pronostico;
import com.pronosticos.domain.model.pronostico.PronosticoBaloncesto;
import com.pronosticos.domain.port.out.SportsFactory;

import java.util.Date;

public class BaloncestoFactory implements SportsFactory {

    @Override
    public Evento crearEvento(String id, String nombre) {
        return new EventoBaloncesto(id, nombre, new Date(), "Equipo Local",
                "Equipo Visitante", "...", true);
    }

    @Override
    public Pronostico crearPronostico(String id, String idEvento) {
        return new PronosticoBaloncesto(id, idEvento);
    }
}
