CREATE TABLE convenios (
    id_convenio int auto_increment NOT NULL,
    nombre_convenio varchar(255) NOT NULL,
    PRIMARY KEY (id_convenio)
);

CREATE TABLE institucion_aliada (
	id_institucion int auto_increment NOT NULL,
	nombre_institucion varchar(255) NOT NULL,
	direccion varchar(255) NOT NULL,
	id_convenio int NOT NULL,
	PRIMARY KEY (id_institucion),
	FOREIGN KEY (id_convenio) REFERENCES convenios(id_convenio)
);

CREATE TABLE programas (
	id_programa int auto_increment NOT NULL,
	nombre_programa varchar(255) NOT NULL,
	id_institucion int NOT NULL,
	PRIMARY KEY (id_programa),
	FOREIGN KEY (id_institucion) REFERENCES institucion_aliada(id_institucion)
);

CREATE TABLE profesores (
	id_profesor int auto_increment NOT NULL,
	primer_nombre_pro varchar(255) NOT NULL,
	segundo_nombre_pro varchar(255),
	primer_apellido_pro varchar(255) NOT NULL,
	segundo_apellido_pro varchar(255),
	id_programa int NOT NULL,
	PRIMARY KEY (id_profesor),
	FOREIGN KEY (id_programa) REFERENCES programas(id_programa)
);

CREATE TABLE grado (
	id_grado int auto_increment NOT NULL,
	nombre_grado varchar(255) NOT NULL,
	PRIMARY KEY (id_grado)
);

CREATE TABLE estudiante (
	id_estudiante int auto_increment NOT NULL,
	primer_nombre varchar(255) NOT NULL,
	segundo_nombre varchar(255),
	primer_apellido varchar(255) NOT NULL,
	segundo_apellido varchar(255),
	id_grado int NOT NULL,
	id_programa int NOT NULL,
	PRIMARY KEY (id_estudiante),
	FOREIGN KEY (id_grado) REFERENCES grado(id_grado),
	FOREIGN KEY (id_programa) REFERENCES programas(id_programa)
);


CREATE TABLE notas (
	id_notas int auto_increment NOT NULL,
	nota int NOT NULL,
	id_estudiante int NOT NULL,
	PRIMARY KEY (id_notas),
	FOREIGN KEY (id_estudiante) REFERENCES estudiante(id_estudiante)
);