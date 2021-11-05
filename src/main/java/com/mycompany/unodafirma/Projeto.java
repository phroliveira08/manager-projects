/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

/**
 *
 * @author Luis Henrique
 */
public class Projeto {

    private int id_projeto;
    private String nomeProjeto;
    private String descricao;
    private String usuarioProprietario;
    private String fk_id_requisitos;

    public Projeto(int id_projeto, String nomeProjeto, String descricao, String usuarioProprietario, String fk_id_requisitos) {
        this.id_projeto = id_projeto;
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.usuarioProprietario = usuarioProprietario;
        this.fk_id_requisitos = fk_id_requisitos;
    }

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

    public String getFk_id_requisitos() {
        return fk_id_requisitos;
    }

    public void setFk_id_requisitos(String fk_id_requisitos) {
        this.fk_id_requisitos = fk_id_requisitos;
    }
}
