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
        List<Pessoa> lstPessoas = new ArrayList();
        
        //SELECT...
        
        return lstPessoas;
    }
    
    public boolean Adicionar(Pessoa pessoa){
        String sql = "INSERT INTO tb_pessoas(nomeCompleto, username, email, senha, telefone, cargo) VALUES (?, ?, ?, ?, ?, ?)";
        
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
        String nome = pessoa.getNomeCompleto();
        String senha = pessoa.getSenha();
        String email = pessoa.getEmail();
        String username = pessoa.getUsername();
        String telefone = pessoa.getTelefone();
        String cargo = pessoa.getCargo();
        //UPDATE...
        return true;
    }
    
    public boolean Excluir(String username){
        //DELETE...
        return true;
    }
    
    public boolean Consultar(String username){
        //SELECT * FROM TABELA WHERE ID = id
        String sql = "SELECT * FROM tb_pessoas WHERE username = ?";
        String nomeCompleto = null;
        String email = null;
        String senha = null;
        String telefone = null;
        String cargo = null;
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nomeCompleto = rs.getString("nomeCompleto");
                email = rs.getString("email");
                senha = rs.getString("senha");
                telefone = rs.getString("telefone");
                cargo = rs.getString("cargo");
            }
            Pessoa pessoaResultado = new Pessoa(nomeCompleto, username, email, senha, telefone, cargo);
            setPessoa(pessoaResultado);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
