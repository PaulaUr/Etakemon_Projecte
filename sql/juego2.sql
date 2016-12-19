DROP DATABASE IF EXISTS juego2;
CREATE DATABASE juego2;
USE juego2;


CREATE TABLE `juego2`.`etakemon` (
  `idetakemon` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idetakemon`));

CREATE TABLE `juego2`.`lugares` (
  `idlugares` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `latitud` INT NOT NULL,
  `longitud` INT NOT NULL,
  PRIMARY KEY (`idlugares`));

CREATE TABLE `juego2`.`habilidades` (
  `idhabilidades` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `potencia` INT NOT NULL,
  `descripcion` VARCHAR(70) NULL,
  PRIMARY KEY (`idhabilidades`));

CREATE TABLE `juego2`.`Usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `nick` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `batganadas` INT NULL,
  `batjugadas` INT NULL,
  `experiecia` INT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));

CREATE TABLE `juego2`.`captura` (
  `idcaptura` INT NOT NULL AUTO_INCREMENT,
  `idusuarios` INT NOT NULL,
  `idetakemons` INT NOT NULL,
  `idhabilidads` INT NOT NULL,
  `vida` INT NOT NULL,
  `ataque` INT NOT NULL,
  `defensa` INT NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`idcaptura`),
  INDEX `idusuarios_idx` (`idusuarios` ASC),
  INDEX `idetakemons_idx` (`idetakemons` ASC),
  INDEX `idhabilidads_idx` (`idhabilidads` ASC),
  CONSTRAINT `idusuarios`
    FOREIGN KEY (`idusuarios`)
    REFERENCES `juego2`.`Usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idetakemons`
    FOREIGN KEY (`idetakemons`)
    REFERENCES `juego2`.`etakemon` (`idetakemon`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idhabilidads`
    FOREIGN KEY (`idhabilidads`)
    REFERENCES `juego2`.`habilidades` (`idhabilidades`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `juego2`.`objetos` (
  `idobjetos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idobjetos`));

CREATE TABLE `juego2`.`objetosusuario` (
  `idobjetos` INT NOT NULL,
  `idusuarioss` INT NOT NULL,
  INDEX `idobjetos_idx` (`idobjetos` ASC),
  INDEX `idusuarios_idx` (`idusuarioss` ASC),
  CONSTRAINT `idobjetos`
    FOREIGN KEY (`idobjetos`)
    REFERENCES `juego2`.`objetos` (`idobjetos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idusuarioss`
    FOREIGN KEY (`idusuarioss`)
    REFERENCES `juego2`.`Usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);