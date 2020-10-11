DROP DATABASE IF EXISTS Rutinas;
CREATE DATABASE Rutinas;
USE Rutinas;

create table TIPO_EJERCICIO (
ID_TIPO_EJERCICIO    SMALLINT             not null,
DSC_TIPO_EJERCICIO   VARCHAR(50),
primary key (ID_TIPO_EJERCICIO)
);

create table EJERCICIO (
ID_EJERCICIO         INTEGER              not null,
ID_TIPO_EJERCICIO    SMALLINT,
NOMBRE_EJERCICIO     VARCHAR(50),
DSC_EJERCICIO        VARCHAR(200),
primary key (ID_EJERCICIO),
foreign key (ID_TIPO_EJERCICIO)
      references TIPO_EJERCICIO (ID_TIPO_EJERCICIO)
);

create table ESPECIALISTA (
ID_ESPECIALISTA      INTEGER              not null,
NOMBRE               VARCHAR(50)          not null,
FECHA_NACIMIENTO     DATE                 not null,
TARJETA_PROFESIONAL  VARCHAR(12)          not null,
primary key (ID_ESPECIALISTA)
);

create table GRUPO_DEPORTIVO (
CSC_INTENTOS         INTEGER              not null,
ID_ESPECIALISTA      INTEGER              not null,
ESP_ID_ESPECIALISTA  INTEGER              not null,
INTENTO              INTEGER              not null,
primary key (CSC_INTENTOS),
foreign key (ID_ESPECIALISTA)
      references ESPECIALISTA (ID_ESPECIALISTA),
foreign key (ESP_ID_ESPECIALISTA)
      references ESPECIALISTA (ID_ESPECIALISTA)
);


create table PARTE_CUERPO (
ID_MUSCULO           INTEGER              not null,
PAR_ID_MUSCULO       INTEGER,
DSC_MUSCULO          VARCHAR(50)          not null,
primary key (ID_MUSCULO),
foreign key (PAR_ID_MUSCULO)
      references PARTE_CUERPO (ID_MUSCULO)
);


create table MUSCULO_EJERCICIO (
ID_MUSCULO           INTEGER              not null,
ID_EJERCICIO         INTEGER              not null,
primary key (ID_MUSCULO, ID_EJERCICIO),
foreign key (ID_EJERCICIO)
      references EJERCICIO (ID_EJERCICIO),
foreign key (ID_MUSCULO)
      references PARTE_CUERPO (ID_MUSCULO)
);


create table REGISTRO (
ID_REGISTRO          INTEGER              not null,
FECHA_REGISTRO       DATE,
primary key (ID_REGISTRO),
foreign key (ID_REGISTRO)
      references ESPECIALISTA (ID_ESPECIALISTA)
);

create table RUTINA (
ID_ESPECIALISTA      INTEGER              not null,
DIA                  VARCHAR(3)           not null,
ID_EJERCICIO         INTEGER              not null,
REPETICIONES         SMALLINT             not null,
DURACION             TIME                 not null,
primary key (DIA, ID_EJERCICIO, ID_ESPECIALISTA),
foreign key (ID_EJERCICIO)
      references EJERCICIO (ID_EJERCICIO),
foreign key (ID_ESPECIALISTA)
      references ESPECIALISTA (ID_ESPECIALISTA)
);