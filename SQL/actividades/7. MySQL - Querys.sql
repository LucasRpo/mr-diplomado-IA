#1.	Listado de estudiantes ( nombre , apellido edad) que estudian medias técnicas.
SELECT primer_nombre, segundo_nombre, primer_nombre, segundo_apellido FROM estudiante
WHERE id_grado = 3;

#2.	Listado de estudiantes por programa de cada una de las medias técnicas.
SELECT * FROM estudiante #TODO: creo que es un join
WHERE id_programa = 1;

#3.	Mostrar el listado de las Instituciones aliadas.
SELECT * FROM institucion_aliada;

#4.	Mostrar el listado de los programas que ofrece las instituciones aliadas.
SELECT * FROM programas 
WHERE id_institucion = 1;

SELECT * FROM programas
WHERE id_institucion = 2;

SELECT * FROM programas
WHERE id_institucion = 3;

#5.	Listar el programa con mayor número de estudiantes inscritos
SELECT id_programa FROM estudiante
WHERE id_programa = (SELECT Max(id_programa) FROM estudiante) GROUP BY id_programa

#6.	Mostrar el listado de profesores que imparten clases en los programas de las medias técnicas ( Programas de las instituciones aliadas).
SELECT * FROM profesores
WHERE id_programa = 1;

#7.	Mostrar notas finales de los programas de los estudiantes de las medias técnicas.
SELECT primer_nombre, id_programa, AVG(n.nota) FROM estudiante
                  INNER JOIN notas n on estudiante.id_estudiante = n.id_estudiante;