package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

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
