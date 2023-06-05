package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Jorge");
        usuario.setApellidos("Ramirez");
        usuario.setEmail("jorgeramirezguti@gmail.com");
        usuario.setTelefono("653915239");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Andrea");
        usuario2.setApellidos("Casero");
        usuario2.setEmail("andrea@gmail.com");
        usuario2.setTelefono("653365569");

        Usuario usuario3 = new Usuario();
        usuario3.setId(456L);
        usuario3.setNombre("Victor");
        usuario3.setApellidos("Martin");
        usuario3.setEmail("victor@gmail.com");
        usuario3.setTelefono("623985231");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Jorge");
        usuario.setApellidos("Ramirez");
        usuario.setEmail("jorgeramirezguti@gmail.com");
        usuario.setTelefono("653915239");

        return usuario;
    }
        @RequestMapping(value="usuario567")
        public Usuario editar() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Jorge");
            usuario.setApellidos("Ramirez");
            usuario.setEmail("jorgeramirezguti@gmail.com");
            usuario.setTelefono("653915239");

            return usuario;
        }
            @RequestMapping(value="usuario345")
            public Usuario eliminar() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Jorge");
            usuario.setApellidos("Ramirez");
            usuario.setEmail("jorgeramirezguti@gmail.com");
            usuario.setTelefono("653915239");

            return usuario;
        }
                @RequestMapping(value="usuario123")
                public Usuario buscar() {
                    Usuario usuario = new Usuario();
                    usuario.setNombre("Jorge");
                    usuario.setApellidos("Ramirez");
                    usuario.setEmail("jorgeramirezguti@gmail.com");
                    usuario.setTelefono("653915239");

                    return usuario;

    }
}
