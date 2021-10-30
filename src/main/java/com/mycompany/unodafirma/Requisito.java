/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

/**
 *
 * @author Kelvin
 */
public class Requisito {
    private String descricao;
    private boolean funcional;
    
    public Requisito(){
    }
    
    public Requisito(String descricao, boolean funcional){
        this.descricao = descricao;
        this.funcional = funcional;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getFuncional() {
        return this.funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
}
