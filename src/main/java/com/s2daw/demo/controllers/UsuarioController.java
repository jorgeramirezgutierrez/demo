package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.Usuariodao;
import com.s2daw.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {


    @Autowired
    private Usuariodao usuariodao;
    @RequestMapping(value="api/usuarios/{id}" , method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Jorge");
        usuario.setApellidos("Ramirez");
        usuario.setEmail("jorgeramirezguti@gmail.com");
        usuario.setTelefono("653915239");

        return usuario;
    }
    @RequestMapping(value="api/usuarios" , method = RequestMethod.GET)
    public void registrarUsuario(@RequestBody Usuario usuario) {
    usuariodao.registrar(usuario);
    }
    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public List<Usuario> getUsuarios() {
        return usuariodao.getUsuarios();
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

    @RequestMapping(value="api/usuarios/{id}" , method = RequestMethod.DELETE)
            public void eliminar(@PathVariable Long id) {
        usuariodao.eliminar(id);

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
