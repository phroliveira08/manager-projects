/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DataAccess;

import com.mycompany.Model.Requisito;
import com.mycompany.Model.Projeto;
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
        List<Projeto> lstProjetos = new ArrayList<Projeto>();

        Projeto projeto = null;

        String query = "SELECT * FROM projeto";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = conexaoDB.conectar();

            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                projeto = new Projeto();
                projeto.setId_projeto(rs.getInt("idProjeto"));
                projeto.setNomeProjeto(rs.getString("nomeProjeto"));
                projeto.setUsuarioProprietario(rs.getString("usuarioProprietario"));
                projeto.setDescricao(rs.getString("descricao"));

                lstProjetos.add(projeto);
            }

            return lstProjetos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Projeto> ListarEstado() {
        List<Projeto> lstProjetos = new ArrayList<Projeto>();

        Projeto projeto = null;

        String query = "SELECT\n"
                + "PRO.nomeProjeto\n"
                + ", PRO.usuarioProprietario\n"
                + ", CASE\n"
                + "WHEN (SELECT REQ.ESTADO\n"
                + "      FROM REQUISITOS REQ\n"
                + "     WHERE PRO.IDPROJETO = REQ.FK_IDPROJETO\n"
                + "       AND REQ.ESTADO = 'EM ANDAMENTO'\n"
                + "     LIMIT 1\n"
                + "   ) = 'em andamento'\n"
                + "   THEN 'em andamento'\n"
                + "   WHEN (SELECT REQ.ESTADO\n"
                + "      FROM REQUISITOS REQ\n"
                + "     WHERE PRO.IDPROJETO = REQ.FK_IDPROJETO\n"
                + "       AND REQ.ESTADO != 'FINALIZADO'\n"
                + "     LIMIT 1\n"
                + "   ) IS NULL AND (SELECT COUNT(REQ.ESTADO) FROM REQUISITOS REQ WHERE REQ.FK_IDPROJETO = PRO.IDPROJETO) > 0\n"
                + "   THEN 'finalizado'\n"
                + "	ELSE 'a iniciar' END AS 'estado'\n"
                + "FROM PROJETO PRO;";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = conexaoDB.conectar();

            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                projeto = new Projeto();
                projeto.setNomeProjeto(rs.getString("nomeProjeto"));
                projeto.setUsuarioProprietario(rs.getString("usuarioProprietario"));
                projeto.setEstado(rs.getString("estado"));

                lstProjetos.add(projeto);
            }

            return lstProjetos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean Adicionar(Projeto projeto) {
        //INSERT INTO...
        String sql = "INSERT INTO projeto(nomeProjeto, descricao, usuarioProprietario) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, projeto.getNomeProjeto());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getUsuarioProprietario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Atualizar(Projeto projeto) {
        //UPDATE...
        String sqlUpdate = "update projeto set nomeProjeto = ?, descricao = ? where idProjeto = ?";

        try {
            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setString(1, projeto.getNomeProjeto());
            ps.setString(2, projeto.getDescricao());
            ps.setInt(3, projeto.getId_projeto());
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Excluir(int id) {
        //DELETE...
        String sqlDelete = "delete from projeto where idProjeto = ?;";

        try {
            PreparedStatement ps = c.prepareStatement(sqlDelete);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Projeto Consultar(int id) {
        Projeto projeto = new Projeto();
        //SELECT * FROM TABELA WHERE ID = id
        String query = "SELECT * FROM projeto WHERE idProjeto = ? LIMIT 1";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = conexaoDB.conectar();

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                projeto.setId_projeto(rs.getInt("idProjeto"));
                projeto.setNomeProjeto(rs.getString("nomeProjeto"));
                projeto.setDescricao(rs.getString("descricao"));
                projeto.setUsuarioProprietario(rs.getString("usuarioProprietario"));
            }

            return projeto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
