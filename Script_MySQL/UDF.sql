CREATE DATABASE UDF;

USE UDF;

CREATE TABLE usuario(
	username varchar(20) primary key not null,
    	nomeCompleto varchar(255),
    	telefone varchar(15),
    	email varchar(255),
    	cargo varchar(255),
    	senha varchar(20)
);

CREATE TABLE projeto(
	idProjeto int auto_increment primary key not null,
    	nomeProjeto varchar(255),
    	descricao varchar(255),
    	usuarioProprietario varchar(20) not null,
		foreign key (usuarioProprietario) references usuario(username)
);

CREATE TABLE requisitos(
	idRequisito int auto_increment primary key not null,
	nome varchar(255),
	modulo varchar(255),
	funcionalidades varchar(255),
	dataCriacao date,
	autor varchar(255),
	dataUltimaAlteracao date,
	autorUltimaModificacao varchar(20),
	versao float,
	prioridade varchar(255),
	complexidade varchar(255),
	esforcoEmHoras int, 
	estado varchar(255), #(Especificado, Em andamento, Finalizado, ...)
	fase varchar(255),
	descricao varchar(255),
    	fk_idProjeto int not null,
		foreign key (fk_idProjeto) references projeto(idProjeto)
);
