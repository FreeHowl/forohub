package com.aluracursos.forohub.domain.respuesta;

import java.time.LocalDateTime;

public record DatosRespuesta(Long id,
                             String mensaje,
                             String topico,
                             LocalDateTime fechaCreacion,
                             String autor,
                             String solucion) {
}
