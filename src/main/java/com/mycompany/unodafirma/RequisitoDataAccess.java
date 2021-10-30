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
 * @author Kelvin
 */
public class RequisitoDataAccess {
    public List<Requisito> Listar(){
        List<Requisito> lstRequisitos = new ArrayList<Requisito>();
        
        //SELECT...
        
        return lstRequisitos;
    }
    
    public boolean Adicionar(Requisito requisito){
        //INSERT INTO...
        return true;
    }
    
    public boolean Atualizar(Requisito requisito){
        //UPDATE...
        return true;
    }
    
    public boolean Excluir(int id){
        //DELETE...
        return true;
    }
    
    public Requisito Consultar(int id){
        Requisito requisito = new Requisito();
        //SELECT * FROM TABELA WHERE ID = id
        
        return requisito;
    }
}
