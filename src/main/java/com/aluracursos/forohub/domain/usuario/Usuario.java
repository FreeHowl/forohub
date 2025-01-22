package com.aluracursos.forohub.domain.usuario;

public class Usuario {

    private Long id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private String perfiles;

    public Usuario(){}

    public Usuario(DatosUsuario usuario) {
        this.id = usuario.id();
        this.nombre = usuario.nombre();
        this.correoElectronico = usuario.correoElectronico();
        this.contrasena = usuario.contrasena();
        this.perfiles = usuario.perfiles();
    }
}
