package com.pronosticos.domain.port.out;

import com.pronosticos.domain.model.Usuario;

public interface NotificacionService {

    void enviar(Usuario u, String msg);

    void suscribir(Usuario u);

    boolean estaActivo(Usuario u);
}
