package com.example.domain.model;
import com.example.domain.model.evento.Evento;
import com.example.domain.model.pronostico.Pronostico;
import com.example.domain.port.in.SistemaGestion;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private int puntos;
    private int ranking;
    private List<Pronostico> pronosticosRealizados;
    private SistemaGestion sistemaGestion;

    public Usuario() {
        this.pronosticosRealizados = new ArrayList<>();
    }

    public Usuario(String id, String nombre, String email, SistemaGestion sistemaGestion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.puntos = 0;
        this.ranking = 0;
        this.pronosticosRealizados = new ArrayList<>();
        this.sistemaGestion = sistemaGestion;
    }

  
    public Pronostico realizarPronostico(String idPronostico, String idEvento) {
        Pronostico pronostico = sistemaGestion.crearPronostico(idPronostico, idEvento);
        pronosticosRealizados.add(pronostico);
        System.out.println("[Usuario " + nombre + "] Pronóstico realizado: " + pronostico);
        return pronostico;
    }

    
    public List<Evento> verCalendario() {
        return sistemaGestion.listarEventos();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public List<Pronostico> getPronosticosRealizados() {
        return pronosticosRealizados;
    }

    public void setPronosticosRealizados(List<Pronostico> pronosticosRealizados) {
        this.pronosticosRealizados = pronosticosRealizados;
    }

    public SistemaGestion getSistemaGestion() {
        return sistemaGestion;
    }

    public void setSistemaGestion(SistemaGestion sistemaGestion) {
        this.sistemaGestion = sistemaGestion;
    }

}
