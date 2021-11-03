/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

public class Main {
    public static void main(String args[]){
        System.out.println("UNO DA FIRMA 3.0");
        
        PessoaBusiness pessoaBusiness = new PessoaBusiness();
        
        //boolean response = pessoaBusiness.cadastrarPessoa("Pedro", "userpedro", "pedro@hotmail.com", "senhapedro", "senhapedro", "11999999999", "mortal");
        
        boolean response = pessoaBusiness.realizarLogin("userpedro123", "senhapedro");
        Pessoa pessoa = pessoaBusiness.getPessoaLogada();
        
        System.out.println("Rodou");
        System.out.println(pessoa);
        System.out.print(response);
        
        
    }
}
