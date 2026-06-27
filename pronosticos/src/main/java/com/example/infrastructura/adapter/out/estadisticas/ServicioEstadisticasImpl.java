package com.pronosticos.infrastructura.adapter.out.estadisticas;

import com.pronosticos.domain.model.Estadistica;
import com.pronosticos.domain.port.out.ServicioEstadisticas;
import com.pronosticos.infrastructura.adapter.out.datos.ProveedorDatos;

import java.util.ArrayList;
import java.util.List;


public class ServicioEstadisticasImpl implements ServicioEstadisticas {
    
    private ProveedorDatos proveedorExterno;

    public ServicioEstadisticasImpl() {
    }

    public ServicioEstadisticasImpl(ProveedorDatos proveedorExterno) {
        this.proveedorExterno = proveedorExterno;
    }

    @Override
    public Estadistica obtenerHistoricoLocal(String id) {
        Estadistica estadistica = new Estadistica(id, true);
        estadistica.setDato("....", "....");
        return estadistica;
    }

    @Override
    public boolean estaDisponible() {
        return proveedorExterno != null;
    }

    @Override
    public Estadistica obtenerEstadisticas(String eventoId) {
        Object datosExternos = proveedorExterno.solicitarDatos(eventoId);
        Estadistica estadistica = new Estadistica(eventoId, false);
        estadistica.setDato("...", datosExternos);
        return estadistica;
    }

    @Override
    public List<Estadistica> obtenerTendencias(String id) {
        List<Estadistica> tendencias = new ArrayList<>();
        tendencias.add(obtenerHistoricoLocal(id));
        tendencias.add(obtenerEstadisticas(id));
        return tendencias;
    }

    public ProveedorDatos getProveedorExterno() {
        return proveedorExterno;
    }

    public void setProveedorExterno(ProveedorDatos proveedorExterno) {
        this.proveedorExterno = proveedorExterno;
    }
}
