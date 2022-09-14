#INSERT CONVENIOS
INSERT INTO convenios (nombre_convenio)
VALUES ('conv_institucion_elenita');

INSERT INTO convenios (nombre_convenio)
VALUES ('conv_institucion_eafit');

INSERT INTO convenios (nombre_convenio)
VALUES ('conv_institucion_item');

#INSERT INSTITUCION ALIDA
INSERT INTO institucion_aliada (nombre_institucion, direccion, id_convenio)
VALUES ('ELENITA', 'Robledo', 1);

INSERT INTO institucion_aliada (nombre_institucion, direccion, id_convenio)
VALUES ('EAFIT', 'Poblado', 2);

INSERT INTO institucion_aliada (nombre_institucion, direccion, id_convenio)
VALUES ('ITEM', 'las vegas', 3);


#INSERT PROGRAMAS
INSERT INTO programas (nombre_programa, id_institucion)
VALUES ('Cientifico de Datos', 1);

INSERT INTO programas (nombre_programa, id_institucion)
VALUES ('Inteligencia Artificial', 2);

INSERT INTO programas (nombre_programa, id_institucion)
VALUES ('Base de Datos', 3);


#INSERT PROFESORES
INSERT INTO profesores (primer_nombre_pro, segundo_nombre_pro, primer_apellido_pro, segundo_apellido_pro, id_programa)
VALUES ('Hernesto', 'no_aplica', 'Perez', 'Perez', 1);

INSERT INTO profesores (primer_nombre_pro, segundo_nombre_pro, primer_apellido_pro, segundo_apellido_pro, id_programa)
VALUES ('Gustavo', 'Gustavo', 'Petro', 'no_aplica', 2);

INSERT INTO profesores (primer_nombre_pro, segundo_nombre_pro, primer_apellido_pro, segundo_apellido_pro, id_programa)
VALUES ('Alvaro', 'no_aplica', 'Uribe', 'Velez', 3);


#INSERT GRADOS
INSERT INTO grado (nombre_grado)
VALUES ('Básica Primaria');

INSERT INTO grado (nombre_grado)
VALUES ('Básica Secundaria');

INSERT INTO grado (nombre_grado)
VALUES ('media técnica');


#INSERT ESTUDIANTES
INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('lucas', 'no_aplica', 'restrepo', 'marin', 1, 1);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('lucas', 'no_aplica', 'marin', 'restrepo', 1, 1);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('jimena', 'ximena', 'gonzalez', 'valencia', 2, 2);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('jimena', 'no_aplica', 'valencia', 'gonzalez', 2, 2);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('chiky', 'ñato', 'boom', 'puff', 3, 3);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('davinson', 'arley', 'castaño', 'castaño', 3, 3);

INSERT INTO estudiante (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, id_grado, id_programa)
VALUES ('brayan', 'no_aplica', 'alvarez', 'chepo', 3, 3);

#INSERT NOTAS
INSERT INTO notas (nota, id_estudiante)
VALUES (3, 1);

INSERT INTO notas (nota, id_estudiante)
VALUES (5, 2);

INSERT INTO notas (nota, id_estudiante)
VALUES (4, 3);
