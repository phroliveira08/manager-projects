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

CREATE TABLE requisitos(
	id_requisito int auto_increment primary key not null,
	nome varchar(255),
	modulo varchar(255),
	funcionalidades varchar(255),
	dataCriação date,
	autor varchar(255),
	dataUltimaAlteracao date,
	autorUltimaModificacao varchar(20),
	versao float,
	prioridade varchar(255),
	complexidade varchar(255),
	esfoçoEmHoras int, 
	estado varchar(255), #(Especificado, Em andamento, Finalizado, ...)
	fase varchar(255),
	descrição varchar(255),
    		foreign key (autorUltimaModificacao) references usuario(username),
            foreign key (autor) references usuario(username)
);

CREATE TABLE projeto(
	id_projeto int auto_increment primary key not null,
    	nomeProjeto varchar(255),
    	descricao varchar(255),
    	usuarioProprietario varchar(20),
    		foreign key (usuarioProprietario) references usuario(username),
    	fk_id_requisitos int,
    		foreign key (fk_id_Requisitos) references requisitos(id_requisito)
);
