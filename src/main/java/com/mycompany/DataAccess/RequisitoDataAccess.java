/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DataAccess;

import com.mycompany.Model.Requisito;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author Kelvin
 */
public class RequisitoDataAccess {

    private ConexaoBD conexaoDB = new ConexaoBD();
    private Connection c;

    public RequisitoDataAccess() {
         try {
            this.c = conexaoDB.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Requisito> Listar(int idProjeto) {
        List<Requisito> lstRequisitos = new ArrayList<Requisito>();

        Requisito requisito = null;

        String query = "SELECT * FROM requisitos WHERE fk_idProjeto = ?";
        
        try {
            
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, idProjeto);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                requisito = new Requisito();
                requisito.setId(rs.getInt("idRequisito"));
                requisito.setNome(rs.getString("nome"));
                requisito.setModulo(rs.getString("modulo"));
                requisito.setFuncionalidade(rs.getString("funcionalidades"));
                requisito.setDataCriacao(rs.getDate("dataCriacao"));
                requisito.setAutor(rs.getString("autor"));
                requisito.setDataUltimaAlteracao(rs.getDate("dataUltimaAlteracao"));
                requisito.setAutorUltimaModificacao(rs.getString("autorUltimaModificacao"));
                requisito.setVersao(rs.getFloat("versao"));
                requisito.setPrioridade(rs.getString("prioridade"));
                requisito.setComplexidade(rs.getString("complexidade"));
                requisito.setEsforcoEmHoras(rs.getInt("esforcoEmHoras"));
                requisito.setEstado(rs.getString("estado"));
                requisito.setFase(rs.getString("fase"));
                requisito.setDescricao(rs.getString("descricao"));
                requisito.setIdProjeto(rs.getInt("fk_idProjeto"));
                
                lstRequisitos.add(requisito);
            }

            return lstRequisitos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Requisito> Listar() {
        List<Requisito> lstRequisitos = new ArrayList<Requisito>();

        Requisito requisito = null;

        String query = "SELECT * FROM requisitos";
        
        
        try {
            
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                requisito = new Requisito();
                requisito.setId(rs.getInt("idRequisito"));
                requisito.setNome(rs.getString("nome"));
                requisito.setModulo(rs.getString("modulo"));
                requisito.setFuncionalidade(rs.getString("funcionalidades"));
                requisito.setDataCriacao(rs.getDate("dataCriacao"));
                requisito.setAutor(rs.getString("autor"));
                requisito.setDataUltimaAlteracao(rs.getDate("dataUltimaAlteracao"));
                requisito.setAutorUltimaModificacao(rs.getString("autorUltimaModificacao"));
                requisito.setVersao(rs.getFloat("versao"));
                requisito.setPrioridade(rs.getString("prioridade"));
                requisito.setComplexidade(rs.getString("complexidade"));
                requisito.setEsforcoEmHoras(rs.getInt("esforcoEmHoras"));
                requisito.setEstado(rs.getString("estado"));
                requisito.setFase(rs.getString("fase"));
                requisito.setDescricao(rs.getString("descricao"));
                requisito.setIdProjeto(rs.getInt("fk_idProjeto"));
                
                lstRequisitos.add(requisito);
            }

            return lstRequisitos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean Adicionar(Requisito requisito) {

        String query = "INSERT INTO REQUISITOS(nome, modulo, funcionalidades, dataCriacao, autor, dataUltimaAlteracao, autorUltimaModificacao, versao, prioridade, complexidade, esforcoEmHoras, estado, fase, descricao, fk_idProjeto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            
            //Cria um PreparedStatment, classe usada para executar a query
            PreparedStatement pstm = c.prepareStatement(query);

            pstm.setString(1, requisito.getNome());
            pstm.setString(2, requisito.getModulo());
            pstm.setString(3, requisito.getFuncionalidade());
            pstm.setDate(4, new java.sql.Date(requisito.getDataCriacao().getTime()));
            pstm.setString(5, requisito.getAutor());
            pstm.setDate(6, new java.sql.Date(requisito.getDataUltimaAlteracao().getTime()));
            pstm.setString(7, requisito.getAutorUltimaModificacao());
            pstm.setFloat(8, requisito.getVersao());
            pstm.setString(9, requisito.getPrioridade());
            pstm.setString(10, requisito.getComplexidade());
            pstm.setInt(11, requisito.getEsforcoEmHoras());
            pstm.setString(12, requisito.getEstado());
            pstm.setString(13, requisito.getFase());
            pstm.setString(14, requisito.getDescricao());
            pstm.setInt(15, requisito.getIdProjeto());

            //Executa a sql para inserção dos dados
            pstm.execute();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Atualizar(Requisito requisito) {
        //UPDATE...
        String query = "UPDATE REQUISITOS set nome = ?, modulo = ?, funcionalidades = ?, dataCriacao = ?, autor = ?, dataUltimaAlteracao = ?, autorUltimaModificacao = ?, versao = ?, prioridade = ?, complexidade = ?, esforcoEmHoras = ?, estado = ?, fase = ?, descricao = ?, fk_idProjeto = ?  WHERE idRequisito = ?";

        try {
            
            //Cria um PreparedStatment, classe usada para executar a query
            PreparedStatement pstm = c.prepareStatement(query);

            pstm.setString(1, requisito.getNome());
            pstm.setString(2, requisito.getModulo());
            pstm.setString(3, requisito.getFuncionalidade());
            pstm.setDate(4, new java.sql.Date(requisito.getDataCriacao().getTime()));
            pstm.setString(5, requisito.getAutor());
            pstm.setDate(6, new java.sql.Date(requisito.getDataUltimaAlteracao().getTime()));
            pstm.setString(7, requisito.getAutorUltimaModificacao());
            pstm.setFloat(8, requisito.getVersao());
            pstm.setString(9, requisito.getPrioridade());
            pstm.setString(10, requisito.getComplexidade());
            pstm.setInt(11, requisito.getEsforcoEmHoras());
            pstm.setString(12, requisito.getEstado());
            pstm.setString(13, requisito.getFase());
            pstm.setString(14, requisito.getDescricao());
            pstm.setInt(15, requisito.getIdProjeto());
            pstm.setInt(16, requisito.getId());

            //Executa a sql para inserção dos dados
            pstm.execute();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Excluir(int id) {
        //DELETE...
        String query = "DELETE FROM REQUISITOS WHERE idRequisito = ?";

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

        String query = "SELECT * FROM requisitos WHERE idRequisito = ? LIMIT 1";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = conexaoDB.conectar();
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                requisito = new Requisito();
                requisito.setId(rs.getInt("idRequisito"));
                requisito.setNome(rs.getString("nome"));
                requisito.setModulo(rs.getString("modulo"));
                requisito.setFuncionalidade(rs.getString("funcionalidades"));
                requisito.setDataCriacao(rs.getDate("dataCriacao"));
                requisito.setAutor(rs.getString("autor"));
                requisito.setDataUltimaAlteracao(rs.getDate("dataUltimaAlteracao"));
                requisito.setAutorUltimaModificacao(rs.getString("autorUltimaModificacao"));
                requisito.setVersao(rs.getFloat("versao"));
                requisito.setPrioridade(rs.getString("prioridade"));
                requisito.setComplexidade(rs.getString("complexidade"));
                requisito.setEsforcoEmHoras(rs.getInt("esforcoEmHoras"));
                requisito.setEstado(rs.getString("estado"));
                requisito.setFase(rs.getString("fase"));
                requisito.setDescricao(rs.getString("descricao"));
                requisito.setIdProjeto(rs.getInt("fk_idProjeto"));
            }

            return requisito;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
