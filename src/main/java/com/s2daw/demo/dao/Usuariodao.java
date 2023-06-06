package com.s2daw.demo.dao;

import com.s2daw.demo.models.Usuario;


import java.util.List;


public interface Usuariodao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);
}
