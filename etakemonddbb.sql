DROP DATABASE IF EXISTS etakemonddbb;
CREATE DATABASE etakemonddbb;
USE etakemonddbb;

CREATE TABLE usuario(
idusuario	INTEGER NOT NULL AUTO_INCREMENT,
nombre		VARCHAR(40) NOT NULL,
nick		VARCHAR(40) NOT NULL,
email		VARCHAR(40) NOT NULL,
password	VARCHAR(40) NOT NULL,
batallasjugadas	INTEGER,
batallasganadas	INTEGER,
experiencia		INTEGER,
PRIMARY KEY(idusuario)
);

CREATE TABLE etakemon(
idetakemon	INTEGER NOT NULL AUTO_INCREMENT,
nombre	VARCHAR(40) NOT NULL,
PRIMARY KEY(idetakemon)
);

CREATE TABLE captura(
idcaptura		INTEGER NOT NULL AUTO_INCREMENT, PK
idusuario		INTEGER,
idetakemon		INTEGER,
idhabilidad		INTEGER,
vida			INTEGER NOT NULL,
ataque			INTEGER NOT NULL,
defensa			INTEGER NOT NULL,
fecha			DATE,
nivelcaptura	INTEGER NOT NULL,
PRIMARY KEY(idcaptura),
FOREIGN KEY(idusuario),
FOREIGN KEY(idetakemon),
FOREIGN KEY(idhabilidad)
);

CREATE TABLE habilidades(
idhabilidad INTEGER NOT NULL AUTO_INCREMENT,
nombre VARCHAR(40),
potencia INTEGER,
descripcion VARCHAR(100),
PRIMARY KEY(idhabilidad)
);

CREATE TABLE batalla(
idbatalla INTEGER NOT NULL AUTO_INCREMENT,
idusuario INTEGER,
victoria INTEGER NOT NULL,
fecha DATE, 
PRIMARY KEY(idbatalla),
FOREIGN KEY(idusuario)
);

CREATE TABLE logros(
idlogro INTEGER NOT NULL AUTO_INCREMENT,
nombre VARCHAR(40) NOT NULL,
descripcion VARCHAR(40) NOT NULL,
experiencia INTEGER,
PRIMARY KEY(idlogro)
);

CREATE TABLE logrosusuario(
idlogro INTEGER,
idusuario INTEGER,
FOREIGN KEY(idlogro),
FOREIGN KEY(idusuario)
);

CREATE TABLE objetos(
idobjeto INTEGER NOT NULL AUTO_INCREMENT,
nombre VARCHAR(40),
descripcion VARCHAR(100),
PRIMARY KEY(idobjeto)
);

CREATE TABLE objetosusuario(
idobjeto INTEGER,
idusuario INTEGER,
FOREIGN KEY(idobjeto),
FOREIGN KEY(idusuario)
);

CREATE TABLE cuestionario(
idcuestionario INTEGER NOT NULL,
pregunta VARCHAR(100),
respuesta VARCHAR(100),
PRIMARY KEY(idcuestionario)
);

CREATE TABLE etakestop(
idetakestop INTEGER NOT NULL,
nombre VARCHAR(40),
idcuestionario INTEGER,
idobjeto INTEGER,
FOREIGN KEY(idcuestionario),
FOREIGN KEY(idobjeto)
);

CREATE TABLE creditosusuarioetakemon(
idusuario INTEGER,
idetakemon INTEGER,
numcreditos INTEGER NOT NULL,
FOREIGN KEY(idusuario),
FOREIGN KEY(idetakemon)
);
