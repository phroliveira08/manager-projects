/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Kelvin
 */
public class Requisito {
    private int id;
    private String nome;
    private String modulo;
    private String funcionalidade;
    private Date dataCriacao;
    private String autor;
    private Date dataUltimaAlteracao;
    private String autorUltimaModificacao;
    private float versao;
    private String prioridade;
    private String complexidade;
    private int esforcoEmHoras;
    private String estado;
    private String fase;
    private String descricao;
    private int idProjeto;

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Requisito(){
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public String getAutorUltimaModificacao() {
        return autorUltimaModificacao;
    }

    public void setAutorUltimaModificacao(String autorUltimaModificacao) {
        this.autorUltimaModificacao = autorUltimaModificacao;
    }

    public float getVersao() {
        return versao;
    }

    public void setVersao(float versao) {
        this.versao = versao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public int getEsforcoEmHoras() {
        return esforcoEmHoras;
    }

    public void setEsforcoEmHoras(int esforcoEmHoras) {
        this.esforcoEmHoras = esforcoEmHoras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
