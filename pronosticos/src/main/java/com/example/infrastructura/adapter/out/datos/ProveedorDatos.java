package com.example.infrastructura.adapter.out.datos;

public class ProveedorDatos {

    private String url;

    public ProveedorDatos() {
    }

    public ProveedorDatos(String url) {
        this.url = url;
    }

    public Object solicitarDatos(String eventoId) {
        System.out.println(".....");
        return "datos-simulados-evento-" + eventoId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
