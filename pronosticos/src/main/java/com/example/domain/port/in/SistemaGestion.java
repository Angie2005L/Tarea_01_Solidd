package com.pronosticos.domain.port.in;

import com.pronosticos.domain.model.Usuario;
import com.pronosticos.domain.model.evento.Evento;
import com.pronosticos.domain.model.pronostico.Pronostico;
import com.pronosticos.domain.port.out.SportsFactory;

import java.util.List;

public interface SistemaGestion {
    Evento crearEvento(String id, String nombre);

    Pronostico crearPronostico(String idPronostico, String idEvento);

    void notificarUsuarios(Usuario usuario, String mensaje);

    void procesarIncidencia(String descripcionIncidencia);

    List<Evento> listarEventos();

    void setFactory(SportsFactory factory);
}
