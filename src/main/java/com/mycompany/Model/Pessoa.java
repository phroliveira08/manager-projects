/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;
/**
 *
 * @author Pedro
 */
public class Pessoa {
    private String nomeCompleto;
    private String username;
    private String email;
    private String senha;
    private String telefone;
    private String cargo;
    
    public Pessoa(String nomeCompleto, String username, String email, String senha, String telefone, String cargo){
        this.nomeCompleto = nomeCompleto;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
