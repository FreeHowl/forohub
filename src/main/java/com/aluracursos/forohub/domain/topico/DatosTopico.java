package com.aluracursos.forohub.domain.topico;

import com.aluracursos.forohub.domain.curso.Curso;
import com.aluracursos.forohub.domain.respuesta.Respuesta;
import com.aluracursos.forohub.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean status,
        String autor,
        String curso,
        String respuesta
) {
}
