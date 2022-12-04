create database agenda;
use agenda;


CREATE TABLE usuario (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` TEXT NOT NULL,
  `nascimento` DATE NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` BIGINT(11) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE contato (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `nascimento` DATE NULL,
  `endereco` VARCHAR(45) NULL,
  `telefone` BIGINT(11) NOT NULL,
  `email` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE compromisso (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `horainicio` DATETIME NOT NULL,
  `horafim` DATETIME NOT NULL,
  `local` VARCHAR(45) NOT NULL,
  `participantes` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE compromissocontato(
   fkIDcompromisso INT NOT NULL,
  fkIDcont INT NOT NULL,
  FOREIGN KEY (fkIDcompromisso) REFERENCES compromisso(id),
  FOREIGN KEY (fkIDcont) REFERENCES contato(id)
  );
  
  CREATE TABLE agenda.grupo (
  idgrupo INT NOT NULL AUTO_INCREMENT,
  nomegrupo VARCHAR(60) NOT NULL,
  PRIMARY KEY (idgrupo));

  CREATE TABLE grupocontato(
  fkIDgrupo INT NOT NULL,
  fkIDcont INT NOT NULL,
  FOREIGN KEY (fkIDgrupo) REFERENCES grupo(idgrupo),
  FOREIGN KEY (fkIDcont) REFERENCES contato(id)
  );
  
  select * from contato;
  select * from compromisso;
  
  
  