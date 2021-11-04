/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kelvin
 */
public class RequisitoDataAccess {

    private ConexaoBD conexaoDB;
    
    public RequisitoDataAccess(){
        this.conexaoDB = new ConexaoBD();
    }
    
    public List<Requisito> Listar() {
        List<Requisito> lstRequisitos = new ArrayList<Requisito>();

        //SELECT...
        return lstRequisitos;
    }

    public boolean Adicionar(Requisito requisito) {

        String query = "INSERT INTO REQUISITOS(descricao, funcional) VALUES(?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = conexaoDB.conectar();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(query);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, requisito.getDescricao());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setBoolean(2, requisito.getFuncional());

            //Executa a sql para inserção dos dados
            pstm.execute();
            
            conexaoDB.desconectar(conn);
            
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Atualizar(Requisito requisito) {
        //UPDATE...
        return true;
    }

    public boolean Excluir(int id) {
        //DELETE...
        return true;
    }

    public Requisito Consultar(int id) {
        Requisito requisito = new Requisito();
        //SELECT * FROM TABELA WHERE ID = id

        return requisito;
    }
}
