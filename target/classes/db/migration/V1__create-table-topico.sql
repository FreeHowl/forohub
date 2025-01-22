create table topico (
    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(3000) not null,
    fecha_creacion datetime not null,
    status tinyint,
    autor_id bigint not null,
    curso_id bigint not null,
    respuesta_id bigint,

    primary key(id)
)