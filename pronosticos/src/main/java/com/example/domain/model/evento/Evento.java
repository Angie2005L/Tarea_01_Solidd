package com.example.domain.model.evento;

import java.util.Date;

public interface Evento {

    String getId();

    String getNombre();

    Date getFecha();

    String getDeporte();

    boolean estaAbierto();
}
