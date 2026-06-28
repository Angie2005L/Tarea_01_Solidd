package com.example.domain.port.out;

import com.example.domain.model.Usuario;


public interface GestionIncidencias {

    void reportar(String inc);

    void resolver(String id);

    void escalar(String id);

    void ajustarPuntos(Usuario u);
}
