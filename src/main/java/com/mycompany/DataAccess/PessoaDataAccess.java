/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DataAccess;

import com.mycompany.Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class PessoaDataAccess {
    
    private ConexaoBD conexaoDB = new ConexaoBD();
    private Connection c;
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    private void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public PessoaDataAccess(){
        try{
            this.c = conexaoDB.conectar();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Pessoa> Listar(){
        List<Pessoa> lstPessoa = new ArrayList<Pessoa>();
        
        Pessoa pessoa = null;

        String query = "SELECT * FROM usuario";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = conexaoDB.conectar();
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setUsername(rs.getString("username"));
                pessoa.setNomeCompleto(rs.getString("nomeCompleto"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setCargo(rs.getString("cargo"));
                
                lstPessoa.add(pessoa);
            }

            return lstPessoa;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean Adicionar(Pessoa pessoa){
        String sql = "INSERT INTO Usuario(nomeCompleto, username, email, senha, telefone, cargo) VALUES (?, ?, ?, ?, ?, ?)";
        
        String nomeCompleto = pessoa.getNomeCompleto();
        String username = pessoa.getUsername();
        String email = pessoa.getEmail();
        String senha = pessoa.getSenha();
        String telefone = pessoa.getTelefone();
        String cargo = pessoa.getCargo();
        
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nomeCompleto);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, senha);
            ps.setString(5, telefone);
            ps.setString(6, cargo);
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean Atualizar(Pessoa pessoa){
        String sqlUpdate = "update usuario set nomeCompleto = ?, senha = ?, email = ?, telefone = ?, cargo = ? where username = ?";
        
        String nome = pessoa.getNomeCompleto();
        String senha = pessoa.getSenha();
        String email = pessoa.getEmail();
        String username = pessoa.getUsername();
        String telefone = pessoa.getTelefone();
        String cargo = pessoa.getCargo();
        //UPDATE...
        //return true;
        try{
            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setString(1, nome);
            ps.setString(2, senha);
            ps.setString(3, email);
            ps.setString(4, telefone);
            ps.setString(5, cargo);
            ps.setString(6, username);
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean AtualizarPessoa(Pessoa pessoa){
        String sqlUpdate = "update usuario set nomeCompleto = ?, email = ?, telefone = ?, cargo = ? where username = ?";
        
        try{
            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setString(1, pessoa.getNomeCompleto());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getTelefone());
            ps.setString(4, pessoa.getCargo());
            ps.setString(5, pessoa.getUsername());
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean Excluir(String username){
        String sqlDelete = "delete from usuario where username = ?;";
        
        //DELETE...
        //return true;
        try{
            PreparedStatement ps = c.prepareStatement(sqlDelete);
            ps.setString(1, username);
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean Consultar(String username){
        //SELECT * FROM TABELA WHERE ID = id
        String sql = "SELECT * FROM usuario WHERE username = ?";
        String nomeCompleto = null;
        String email = null;
        String senha = null;
        String telefone = null;
        String cargo = null;
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            int numPessoas = 0;
            while(rs.next()){
                nomeCompleto = rs.getString("nomeCompleto");
                email = rs.getString("email");
                senha = rs.getString("senha");
                telefone = rs.getString("telefone");
                cargo = rs.getString("cargo");
                numPessoas++;
            }
            if(numPessoas == 0){
                return false;
            }
            Pessoa pessoaResultado = new Pessoa(nomeCompleto, username, email, senha, telefone, cargo);
            setPessoa(pessoaResultado);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public Pessoa ConsultarAtualiza(String username){
        //SELECT * FROM TABELA WHERE ID = id
        String sql = "SELECT * FROM usuario WHERE username = ?";
        String nomeCompleto = null;
        String email = null;
        String senha = null;
        String telefone = null;
        String cargo = null;
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            int numPessoas = 0;
            while(rs.next()){
                nomeCompleto = rs.getString("nomeCompleto");
                email = rs.getString("email");
                senha = rs.getString("senha");
                telefone = rs.getString("telefone");
                cargo = rs.getString("cargo");
                numPessoas++;
            }
            if(numPessoas == 0){
                return null;
            }
            Pessoa pessoaResultado = new Pessoa(nomeCompleto, username, email, senha, telefone, cargo);
            setPessoa(pessoaResultado);
            return pessoaResultado;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
