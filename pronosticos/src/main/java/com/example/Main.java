package com.example;

import com.example.infrastructura.adapter.out.factory.BaloncestoFactory;
import com.example.infrastructura.adapter.out.notificacion.EmailNotification;
import com.example.infrastructura.adapter.out.incidencias.EquipoDeCalidad;
import com.example.infrastructura.adapter.out.incidencias.EquipoDeSoporte;
import com.example.infrastructura.adapter.out.factory.FutbolFactory;
import com.example.infrastructura.adapter.out.datos.ProveedorDatos;
import com.example.infrastructura.adapter.out.notificacion.PushNotification;
import com.example.infrastructura.adapter.out.estadisticas.ServicioEstadisticasImpl;
import com.example.Application.service.SistemaGestionService;
import com.example.domain.model.Administrador;
import com.example.domain.model.Usuario;
import com.example.domain.model.evento.Evento;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.model.pronostico.PronosticoFutbol;
import com.example.domain.port.in.SistemaGestion;

public class Main {

    public static void main(String[] args) {

        ProveedorDatos proveedorDatos = new ProveedorDatos("https://api.datos-deportivos.com");
        ServicioEstadisticasImpl servicioEstadisticas = new ServicioEstadisticasImpl(proveedorDatos);

        EquipoDeCalidad equipoDeCalidad = new EquipoDeCalidad("Mariana Quality");
        EquipoDeSoporte equipoDeSoporte = new EquipoDeSoporte("Carlos Soporte", equipoDeCalidad);

        PushNotification pushNotification = new PushNotification("device-token-123");
        EmailNotification emailNotification = new EmailNotification("smtp.pronosticos.com");

        FutbolFactory futbolFactory = new FutbolFactory();
        BaloncestoFactory baloncestoFactory = new BaloncestoFactory();

        SistemaGestion sistemaGestion = new SistemaGestionService(
                futbolFactory, pushNotification, servicioEstadisticas, equipoDeSoporte);

        Administrador admin = new Administrador("A1", "Admin Principal", sistemaGestion);
        admin.configurarPronostico();
        admin.gestionarReglasYPuntos();
        admin.agregarDeporte(futbolFactory);

        Evento evento = sistemaGestion.crearEvento("EV-001", "Final Liga Local");
        System.out.println("Evento creado: " + evento);

        Usuario usuario = new Usuario("U1", "Laura Perez", "laura@example.com", sistemaGestion);

        System.out.println("Calendario disponible:");
        for (Evento e : usuario.verCalendario()) {
            System.out.println(" - " + e);
        }

        Pronostico pronostico = usuario.realizarPronostico("P-001", evento.getId());
        if (pronostico instanceof PronosticoFutbol) {
            PronosticoFutbol pf = (PronosticoFutbol) pronostico;
            pf.setResultado("2-1");
            pf.setMarcador("2-1");
        }
        pronostico.evaluar();
        int puntosGanados = pronostico.calcularPuntos();
        usuario.sumarPuntos(puntosGanados);

        System.out.println("Pronostico: " + pronostico);
        System.out.println("Puntos obtenidos: " + puntosGanados);

        sistemaGestion.notificarUsuarios(usuario, "Tu pronostico fue evaluado como " + pronostico.getEstado());

        System.out.println("Estadisticas disponibles: " + servicioEstadisticas.estaDisponible());
        System.out.println(servicioEstadisticas.obtenerEstadisticas(evento.getId()));

        sistemaGestion.procesarIncidencia("El marcador del evento EV-001 no coincide con la fuente oficial");
        equipoDeSoporte.escalar("INC-001");
        equipoDeCalidad.ajustarPuntos(usuario);

        System.out.println("Usuario final: " + usuario);
    }
}