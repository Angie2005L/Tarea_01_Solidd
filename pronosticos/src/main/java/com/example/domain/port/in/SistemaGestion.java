package com.example.domain.port.in;

import com.example.domain.model.Usuario;
import com.example.domain.model.evento.Evento;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.port.out.SportsFactory;

import java.util.List;

public interface SistemaGestion {
    Evento crearEvento(String id, String nombre);

    Pronostico crearPronostico(String idPronostico, String idEvento);

    void notificarUsuarios(Usuario usuario, String mensaje);

    void procesarIncidencia(String descripcionIncidencia);

    List<Evento> listarEventos();

    void setFactory(SportsFactory factory);
}
