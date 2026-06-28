package com.example.infrastructura.adapter.out.factory;

import com.example.domain.model.evento.Evento;
import com.example.domain.model.evento.EventoBaloncesto;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.model.pronostico.PronosticoBaloncesto;
import com.example.domain.port.out.SportsFactory;

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
