package com.aluracursos.forohub.domain.usuario;

public record DatosUsuario(
        Long id,
        String nombre,
        String correoElectronico,
        String contrasena,
        String perfiles
) {
}
