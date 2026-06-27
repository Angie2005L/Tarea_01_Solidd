package com.pronosticos.infrastructura.adapter.out.notificacion;

import com.pronosticos.domain.model.Usuario;
import com.pronosticos.domain.port.out.NotificacionService;
import java.util.HashSet;
import java.util.Set;

public class EmailNotification implements NotificacionService {

    private String smtpHost;
    private final Set<String> suscriptores = new HashSet<>();

    public EmailNotification() {
    }

    public EmailNotification(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    @Override
    public void enviar(Usuario u, String msg) {
               System.out.println("...." );

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

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }
}
