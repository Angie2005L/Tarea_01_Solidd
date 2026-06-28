package com.example.infrastructura.adapter.out.notificacion;

import com.example.domain.model.Usuario;
import com.example.domain.port.out.NotificacionService;

import java.util.HashSet;
import java.util.Set;


public class PushNotification implements NotificacionService {

    private String deviceToken;
    private final Set<String> suscriptores = new HashSet<>();

    public PushNotification() {
    }

    public PushNotification(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Override
    public void enviar(Usuario u, String msg) {
        System.out.println("....");
    }

    @Override
    public void suscribir(Usuario u) {
        suscriptores.add(u.getId());
        System.out.println("...." );
    }

    @Override
    public boolean estaActivo(Usuario u) {
        return suscriptores.contains(u.getId());
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
