tb_pessoa;

USE DB001;

CREATE TABLE PESSOA (
nomeCompleto VARCHAR(100),
userName VARCHAR(30),
email VARCHAR(50),
senha VARCHAR(20),
telefone INT,
cargo VARCHAR(30)
);

SELECT * FROM PESSOA;

CREATE TABLE REQUISITOS (
descricao VARCHAR(100),
funcional boolean
);

drop table requisitos;
INSERT INTO USUARIO VALUES ('kelvin', 'Kelvin Lima', '123456789', 'kelvin@usjt.com', 'XXX', 'senha123');
INSERT INTO USUARIO VALUES ('pedro', 'Pedro Henrique Oliveira', '123456789', 'pedro@usjt.com', 'YYY', 'senha123');
INSERT INTO USUARIO VALUES ('luis', 'Luis Henrique Oliveira', '123456789', 'luis@usjt.com', 'ZZZ', 'senha123');
INSERT INTO USUARIO VALUES ('barbara', 'Barbara Nery', '123456789', 'barbara@usjt.com', 'XXX', 'senha123');
INSERT INTO USUARIO VALUES ('luiz', 'Luiz', '123456789', 'luiz@usjt.com', 'YYY', 'senha123');
INSERT INTO USUARIO VALUES ('vinicius', 'Vinicius Ferreira', '123456789', 'vinicius@usjt.com', 'ZZZ', 'senha123');
INSERT INTO USUARIO VALUES ('leonardo', 'Leonardo Santos', '123456789', 'leonardo@usjt.com', 'XXX', 'senha123');
INSERT INTO USUARIO VALUES ('rhuan', 'Rhuan', '123456789', 'rhuan@usjt.com', 'YYY', 'senha123');
INSERT INTO USUARIO VALUES ('thiago', 'Thiago', '123456789', 'thiago@usjt.com', 'ZZZ', 'senha123');

INSERT INTO PROJETO VALUES('0', 'Controle Financeiro', 'Sistema para controle financeiro', 'kelvin');
INSERT INTO PROJETO VALUES('0', 'Lançamento de Notas', 'Sistema para lançamento de notas', 'pedro');
INSERT INTO PROJETO VALUES('0', 'Portal do Aluno', 'Sistema para acesso dos alunos', 'luis');
INSERT INTO PROJETO VALUES('0', 'Biblioteca', 'Sistema para consulta de livros', 'barbara');
INSERT INTO PROJETO VALUES('0', 'Sistema X', 'Sistema X', 'leonardo');

INSERT INTO REQUISITOS VALUES('0', 'Diagrama de casos de uso', '1', 'xxx', '2021-10-10', 'kelvin', '2021-11-03', 'pedro', '2.1', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de casos de uso', 11);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de implementação', '1', 'xxx', '2021-10-11', 'kelvin', '2021-11-10', 'kelvin', '2.1', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de implementação', 11);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de sequencia', '1', 'xxx', CURDATE(), 'kelvin', null, null, '1.0', 'alta', 'media', '8', 'em andamento', '1', 'Desenho do diagrama de sequencia', 11);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de sequencia', '1', 'xxx', CURDATE(), 'kelvin', null, null, '1.0', 'alta', 'media', '8', 'a iniciar', '1', 'Desenho do diagrama de sequencia', 11);

INSERT INTO REQUISITOS VALUES('0', 'Diagrama de casos de uso', '1', 'xxx', '2021-10-10', 'pedro', '2021-11-03', 'pedro', '3.1', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de casos de uso', 12);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de implementação', '1', 'xxx', '2021-10-11', 'pedro', '2021-11-10', 'luis', '4.5', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de implementação', 12);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de sequencia', '1', 'xxx', CURDATE(), 'pedro', null, null, '1.1', 'alta', 'media', '8', 'em andamento', '1', 'Desenho do diagrama de sequencia', 12);

INSERT INTO REQUISITOS VALUES('0', 'Diagrama de casos de uso', '1', 'xxx', '2021-10-10', 'luis', '2021-11-03', 'pedro', '2.0', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de casos de uso', 13);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de implementação', '1', 'xxx', '2021-10-11', 'luis', '2021-11-10', 'kelvin', '2.0', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de implementação', 13);
INSERT INTO REQUISITOS VALUES('0', 'Diagrama de sequencia', '1', 'xxx', '2021-11-10', 'luis', '2021-11-10', 'luis', '1.0', 'alta', 'media', '8', 'finalizado', '1', 'Desenho do diagrama de sequencia', 13);

INSERT INTO REQUISITOS VALUES('0', 'Diagrama de sequencia', '1', 'xxx', '2021-11-10', 'luis', '2021-11-10', 'luis', '1.0', 'alta', 'media', '8', 'a iniciar', '1', 'Desenho do diagrama de sequencia', 14);