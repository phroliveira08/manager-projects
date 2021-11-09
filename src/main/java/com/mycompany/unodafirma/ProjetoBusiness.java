/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Henrique
 */
public class ProjetoBusiness {
    private ProjetoDataAccess _projetoDA;
    
    public ProjetoBusiness(){
        
        _projetoDA = new ProjetoDataAccess();
    }
    
    public List<Projeto> Listar(){
        return _projetoDA.Listar();
    }
    
    public boolean Adicionar(Projeto projeto){
        boolean retorno = _projetoDA.Adicionar(projeto);
        
        return retorno;
    }
    
    public boolean Atualizar(Projeto projeto){
        boolean retorno = _projetoDA.Atualizar(projeto);
        
        return retorno;
    }
    
    public boolean Excluir(int id){
        boolean retorno = _projetoDA.Excluir(id);
        
        return retorno;
    }
    
    public Requisito Consultar(int id){
        Requisito requisito = _projetoDA.Consultar(id);
        
        return requisito;
    }
}
