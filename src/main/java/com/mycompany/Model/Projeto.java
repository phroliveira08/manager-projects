/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

/**
 *
 * @author Luis Henrique
 */
public class Projeto {
    
    //criação das variaveis
    private int id_projeto;
    private String nomeProjeto;
    private String descricao;
    private String usuarioProprietario;
    
    //Construtor
    public Projeto(){
        
    }
    //Construtor
    public Projeto(int id_projeto, String nomeProjeto, String descricao, String usuarioProprietario, String fk_id_requisitos) {
        this.id_projeto = id_projeto;
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.usuarioProprietario = usuarioProprietario;
    }
    
    //Metodos getters e setter (acesso e modificação)
    public int getId_projeto() {
        return id_projeto;
    }

    public void setId_projeto(int id_projeto) {
        this.id_projeto = id_projeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUsuarioProprietario() {
        return usuarioProprietario;
    }

    public void setUsuarioProprietario(String usuarioProprietario) {
        this.usuarioProprietario = usuarioProprietario;
    }
}
