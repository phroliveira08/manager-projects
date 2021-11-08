/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author Kelvin
 */
public class RequisitoDataAccess {

    private ConexaoBD conexaoDB;

    public RequisitoDataAccess() {
        this.conexaoDB = new ConexaoBD();
    }

    public List<Requisito> Listar() {
        List<Requisito> lstRequisitos = new ArrayList<Requisito>();

        Requisito requisito = null;

        String query = "SELECT * FROM requisitos";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = conexaoDB.conectar();
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                requisito = new Requisito();
                requisito.setNome(rs.getString("nome"));
                requisito.setModulo(rs.getString("modulo"));
                requisito.setFuncionalidade(rs.getString("funcionalidades"));
                requisito.setDataCriacao(rs.getDate("dataCriação"));
                requisito.setAutor(rs.getString("autor"));
                requisito.setDataUltimaAlteracao(rs.getDate("dataUltimaAlteracao"));
                requisito.setAutorUltimaModificacao(rs.getString("autorUltimaModificacao"));
                requisito.setVersao(rs.getFloat("versao"));
                requisito.setPrioridade(rs.getString("prioridade"));
                requisito.setComplexidade(rs.getString("complexidade"));
                requisito.setEsforcoEmHoras(rs.getInt("esfoçoEmHoras"));
                requisito.setEstado(rs.getString("estado"));
                requisito.setFase(rs.getString("fase"));
                requisito.setDescricao(rs.getString("descrição"));
                
                lstRequisitos.add(requisito);
            }

            return lstRequisitos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean Adicionar(Requisito requisito) {

        String query = "INSERT INTO REQUISITOS VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = conexaoDB.conectar();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(query);

            pstm.setString(1, null);
            pstm.setString(2, requisito.getNome());
            pstm.setString(3, requisito.getModulo());
            pstm.setString(4, requisito.getFuncionalidade());
            pstm.setDate(5, new java.sql.Date(requisito.getDataCriacao().getTime()));
            pstm.setString(6, requisito.getAutor());
            pstm.setDate(7, new java.sql.Date(requisito.getDataUltimaAlteracao().getTime()));
            pstm.setString(8, requisito.getAutorUltimaModificacao());
            pstm.setFloat(9, requisito.getVersao());
            pstm.setString(10, requisito.getPrioridade());
            pstm.setString(11, requisito.getComplexidade());
            pstm.setInt(12, requisito.getEsforcoEmHoras());
            pstm.setString(13, requisito.getEstado());
            pstm.setString(14, requisito.getFase());
            pstm.setString(15, requisito.getDescricao());

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
        String query = "UPDATE REQUISITOS "
                + "SET dataUltimaAlteracao = ?, "
                + "autorUltimaModificacao = ?, "
                + "estado = ? "
                + "WHERE id_requisito = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = conexaoDB.conectar();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(query);

            pstm.setDate(1, new java.sql.Date(requisito.getDataUltimaAlteracao().getTime()));
            pstm.setString(2, requisito.getAutorUltimaModificacao());
            pstm.setString(3, requisito.getEstado());
            pstm.setInt(4, requisito.getId());

            //Executa a sql para inserção dos dados
            pstm.execute();

            conexaoDB.desconectar(conn);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Excluir(int id) {
        //DELETE...
        String query = "DELETE FROM REQUISITOS WHERE id_requisito = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = conexaoDB.conectar();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, id);

            //Executa a sql para inserção dos dados
            pstm.execute();

            conexaoDB.desconectar(conn);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Requisito Consultar(int id) {
        Requisito requisito = null;

        String query = "SELECT * FROM requisitos WHERE id_requisito = ? LIMIT 1";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = conexaoDB.conectar();
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                requisito = new Requisito();
                requisito.setNome(rs.getString("nome"));
                requisito.setModulo(rs.getString("modulo"));
                requisito.setFuncionalidade(rs.getString("funcionalidades"));
                requisito.setDataCriacao(rs.getDate("dataCriação"));
                requisito.setAutor(rs.getString("autor"));
                requisito.setDataUltimaAlteracao(rs.getDate("dataUltimaAlteracao"));
                requisito.setAutorUltimaModificacao(rs.getString("autorUltimaModificacao"));
                requisito.setVersao(rs.getFloat("versao"));
                requisito.setPrioridade(rs.getString("prioridade"));
                requisito.setComplexidade(rs.getString("complexidade"));
                requisito.setEsforcoEmHoras(rs.getInt("esfoçoEmHoras"));
                requisito.setEstado(rs.getString("estado"));
                requisito.setFase(rs.getString("fase"));
                requisito.setDescricao(rs.getString("descrição"));
            }

            return requisito;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
