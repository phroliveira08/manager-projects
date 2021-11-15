/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Business;

import com.mycompany.DataAccess.RequisitoDataAccess;
import com.mycompany.Model.Requisito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kelvin
 */
public class RequisitoBusiness {
    
    private RequisitoDataAccess _requisitoDA;
    
    public RequisitoBusiness(){
        
        _requisitoDA = new RequisitoDataAccess();
    }
    
    public List<Requisito> Listar(int idProjeto){
        return _requisitoDA.Listar(idProjeto);
    }
    
    public List<Requisito> Listar(){
        return _requisitoDA.Listar();
    }
    
    public boolean Adicionar(Requisito requisito){
        boolean retorno = _requisitoDA.Adicionar(requisito);
        
        return retorno;
    }
    
    public boolean Atualizar(Requisito requisito){
        boolean retorno = _requisitoDA.Atualizar(requisito);
        
        return retorno;
    }
    
    public boolean Excluir(int id){
        boolean retorno = _requisitoDA.Excluir(id);
        
        return retorno;
    }
    
    public Requisito Consultar(int id){
        Requisito requisito = _requisitoDA.Consultar(id);
        
        return requisito;
    }
}
