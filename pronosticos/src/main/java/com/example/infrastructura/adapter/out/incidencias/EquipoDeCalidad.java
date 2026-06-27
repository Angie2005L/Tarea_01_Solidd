package com.pronosticos.infrastructura.adapter.out.incidencias;

import com.pronosticos.domain.model.Usuario;
import com.pronosticos.domain.port.out.GestionIncidencias;


public class EquipoDeCalidad implements GestionIncidencias {

    private String revisor;

    public EquipoDeCalidad() {
    }

    public EquipoDeCalidad(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void ajustarPuntos(Usuario u) {
        System.out.println("...")
    }

    @Override
    public void reportar(String inc) {
        System.out.println("....");
    }

    @Override
    public void resolver(String id) {
        System.out.println(".....");
    }

    @Override
    public void escalar(String id) {
        System.out.println("...");
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
}
