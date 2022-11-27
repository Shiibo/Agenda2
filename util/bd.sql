create database agenda;
use agenda;


CREATE TABLE `agenda`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` TEXT NOT NULL,
  `nascimento` DATE NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` BIGINT(11) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `agenda`.`contato` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `nascimento` DATE NULL,
  `endereco` VARCHAR(45) NULL,
  `telefone` BIGINT(11) NOT NULL,
  `email` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `agenda`.`compromisso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `horainicio` DATETIME NOT NULL,
  `horafim` DATETIME NOT NULL,
  `local` VARCHAR(45) NOT NULL,
  `participantes` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));