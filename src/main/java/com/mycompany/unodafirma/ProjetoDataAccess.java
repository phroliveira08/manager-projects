/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Henrique
 */
public class ProjetoDataAccess {

    private ConexaoBD conexaoDB = new ConexaoBD();
    private Connection c;
    private Projeto projeto;

    public Projeto getProjeto() {
        return projeto;
    }

    private void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public ProjetoDataAccess() {
        try {
            this.c = conexaoDB.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Projeto> Listar() {
        List<Projeto> lstProjeto = new ArrayList<Projeto>();

        //SELECT...
        return lstProjeto;
    }

    public boolean Adicionar(Requisito requisito) {
        //INSERT INTO...
        String sql = "INSERT INTO projeto(nomeProjeto, descricao, usuarioProprietario, fk_id_requisitos) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, projeto.getNomeProjeto());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getUsuarioProprietario());
            ps.setString(4, projeto.getFk_id_requisitos());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Atualizar(Requisito requisito) {
        //UPDATE...
        String sqlUpdate = "update projeto set nomeProjeto = ?, descricao = ? where id_projeto = ?";
        
        try{
            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setString(1, projeto.getNomeProjeto());
            ps.setString(2, projeto.getDescricao());
            ps.setInt(3, projeto.getId_projeto());
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean Excluir(int id) {
        //DELETE...
        String sqlDelete = "delete from projeto where id_projeto = ?;";
        
        try{
            PreparedStatement ps = c.prepareStatement(sqlDelete);
            ps.setInt(1, projeto.getId_projeto());
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public Requisito Consultar(int id) {
        Requisito requisito = new Requisito();
        //SELECT * FROM TABELA WHERE ID = id

        return requisito;
    }
}
