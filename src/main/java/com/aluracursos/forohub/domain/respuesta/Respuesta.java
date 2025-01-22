package com.aluracursos.forohub.domain.respuesta;

import java.time.LocalDateTime;

public class Respuesta {

    private Long id;
    private String mensaje;
    private String topico;
    private LocalDateTime fechaCreacion;
    private String autor;
    private String solucion;

    public Respuesta(){}

    public Respuesta(DatosRespuesta respuesta){
        this.id = respuesta.id();
        this.mensaje = respuesta.mensaje();
        this.topico = respuesta.topico();
        this.fechaCreacion = respuesta.fechaCreacion();
        this.autor = respuesta.autor();
        this.solucion = respuesta.solucion();
    }

}
