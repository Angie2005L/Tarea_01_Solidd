package com.pronosticos.domain.port.out;

import com.pronosticos.domain.model.Usuario;


public interface GestionIncidencias {

    void reportar(String inc);

    void resolver(String id);

    void escalar(String id);

    void ajustarPuntos(Usuario u);
}
