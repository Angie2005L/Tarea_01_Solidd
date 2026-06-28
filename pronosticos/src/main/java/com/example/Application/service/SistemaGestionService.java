package com.example.Application.service;

import com.example.domain.model.Usuario;
import com.example.domain.model.evento.Evento;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.port.in.SistemaGestion;
import com.example.domain.port.out.GestionIncidencias;
import com.example.domain.port.out.NotificacionService;
import com.example.domain.port.out.ServicioEstadisticas;
import com.example.domain.port.out.SportsFactory;

import java.util.ArrayList;
import java.util.List;


public class SistemaGestionService implements SistemaGestion {
    private SportsFactory factory;
    private NotificacionService notificacion;
    private ServicioEstadisticas estadisticas;
    private GestionIncidencias incidencias;
    private List<Evento> eventos;
    public SistemaGestionService(SportsFactory factory, NotificacionService notificacion, ServicioEstadisticas estadisticas,GestionIncidencias incidencias) {
        this.factory = factory;
        this.notificacion = notificacion;
        this.estadisticas = estadisticas;
        this.incidencias = incidencias;
        this.eventos = new ArrayList<>();
    }
    @Override
    public Evento crearEvento(String id, String nombre) {
        Evento evento = factory.crearEvento(id, nombre);
        eventos.add(evento);
        System.out.println(" ----" + evento);
        return evento;}
    @Override
    public Pronostico crearPronostico(String idPronostico, String idEvento) {
        Pronostico pronostico = factory.crearPronostico(idPronostico, idEvento);
        System.out.println(" -.---- " + pronostico);
        return pronostico;
    }
    @Override
    public void notificarUsuarios(Usuario usuario, String mensaje) {
        notificacion.suscribir(usuario);
        if (notificacion.estaActivo(usuario)) {
            notificacion.enviar(usuario, mensaje);
        }
    }
    @Override
    public void procesarIncidencia(String descripcionIncidencia) {
        incidencias.reportar(descripcionIncidencia);
    }
    @Override
    public List<Evento> listarEventos() {
        return eventos;
    }
    @Override
    public void setFactory(SportsFactory factory) {
        this.factory = factory;
    }
    public SportsFactory getFactory() {
        return factory;
    }
    public NotificacionService getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(NotificacionService notificacion) {
        this.notificacion = notificacion;
    }
    public ServicioEstadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(ServicioEstadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public GestionIncidencias getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(GestionIncidencias incidencias) {
        this.incidencias = incidencias;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
