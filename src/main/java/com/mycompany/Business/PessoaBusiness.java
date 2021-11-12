/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Business;

import com.mycompany.DataAccess.PessoaDataAccess;
import com.mycompany.Model.Pessoa;

/**
 *
 * @author Pedro
 */
public class PessoaBusiness {

    private PessoaDataAccess _pessoaDA = new PessoaDataAccess();
    private Pessoa pessoaLogada;

    public Pessoa getPessoaLogada() {
        return pessoaLogada;
    }

    private void setPessoaLogada(Pessoa pessoaLogada) {
        this.pessoaLogada = pessoaLogada;
    }

    public boolean cadastrarPessoa(String nome, String username, String email, String senha, String validaSenha, String telefone, String cargo) {
        if (senha.equals(validaSenha)) {
            Pessoa pessoa = new Pessoa(nome, username, email, senha, telefone, cargo);
            boolean response = _pessoaDA.Adicionar(pessoa);
            return response;
        } else {
            return false;
        }
    }
    
    public boolean trocarSenha(String senha, String validaSenha){
        if (senha.equals(validaSenha)) {
            this.pessoaLogada.setSenha(senha);
            boolean response = _pessoaDA.Atualizar(this.pessoaLogada);
            return response;
        } else {
            return false;
        }
    }

    public String realizarLogin(String username, String password) {
        boolean response = _pessoaDA.Consultar(username);

        if (response) {
            Pessoa pessoa = _pessoaDA.getPessoa();
            String senhaCadastrada = pessoa.getSenha();
            if (password.equals(senhaCadastrada)) {
                setPessoaLogada(pessoa);
                if(senhaCadastrada.equals("senha123")){
                    return "Sucesso-TrocarSenha";
                }else{
                    return "Sucesso";
                }
            }else{
                return "SenhaInvalida";
            }
        }
        
        return "UsuarioNaoEncontrado";
    }
}
