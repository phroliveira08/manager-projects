/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;


public class PessoaController {
    
    public boolean cadastrarPessoa(String nome, String username, String email, String senha, String validaSenha, String telefone, String cargo){
        if(senha != validaSenha){
            return false;
        }
        Pessoa pessoa = new Pessoa(nome, username, email, senha, telefone, cargo);
        salvarPessoaDB(pessoa);
        return true;
    }
    
    public void salvarPessoaDB(Pessoa pessoa){
        String nome = pessoa.getNomeCompleto();
        String senha = pessoa.getSenha();
        String email = pessoa.getEmail();
        String username = pessoa.getUsername();
        String telefone = pessoa.getTelefone();
        String cargo = pessoa.getCargo();
        System.out.println("Query Rodou");
        System.out.println("Cadastro salvo no banco");
    }
    
}
