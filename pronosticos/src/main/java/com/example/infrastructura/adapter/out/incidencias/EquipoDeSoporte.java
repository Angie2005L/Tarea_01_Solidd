package com.pronosticos.infrastructura.adapter.out.incidencias;

import com.pronosticos.domain.model.Usuario;
import com.pronosticos.domain.port.out.GestionIncidencias;


public class EquipoDeSoporte implements GestionIncidencias {

    private String agente;
    private EquipoDeCalidad equipoDeCalidad;

    public EquipoDeSoporte() {
    }

    public EquipoDeSoporte(String agente, EquipoDeCalidad equipoDeCalidad) {
        this.agente = agente;
        this.equipoDeCalidad = equipoDeCalidad;
    }

    @Override
    public void ajustarPuntos(Usuario u) {
        System.out.println("...." );
        u.sumarPuntos(1);
    }

    @Override
    public void reportar(String inc) {
        System.out.println("...." );
    }

    @Override
    public void resolver(String id) {
        System.out.println("...." );
    }

    @Override
    public void escalar(String id) {
        System.out.println("...." );

        if (equipoDeCalidad != null) {
            equipoDeCalidad.resolver(id);
        }
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public EquipoDeCalidad getEquipoDeCalidad() {
        return equipoDeCalidad;
    }

    public void setEquipoDeCalidad(EquipoDeCalidad equipoDeCalidad) {
        this.equipoDeCalidad = equipoDeCalidad;
    }
}
