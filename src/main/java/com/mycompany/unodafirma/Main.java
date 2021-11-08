/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("UNO DA FIRMA 3.0");

        PessoaBusiness pessoaBusiness = new PessoaBusiness();

        //boolean response = pessoaBusiness.cadastrarPessoa("Pedro", "userpedro", "pedro@hotmail.com", "senhapedro", "senhapedro", "11999999999", "mortal");
//        boolean response = pessoaBusiness.realizarLogin("userpedro123", "senhapedro");
//        Pessoa pessoa = pessoaBusiness.getPessoaLogada();
//        System.out.println("Rodou");
//        System.out.println(pessoa);
//        System.out.print(response);

 // <editor-fold defaultstate="collapsed" desc="TESTE CRUD REQUISITO">
        //TESTE CRUD REQUISITO
        Requisito requisito = new Requisito();
        RequisitoBusiness requisitoBusiness = new RequisitoBusiness();

        //ADICIONAR
//        requisito.setNome("teste");
//        requisito.setModulo("teste");
//        requisito.setFuncionalidade("teste");
//        requisito.setDataCriacao(new Date());
//        requisito.setAutor("kelvin");
//        requisito.setDataUltimaAlteracao(new Date());
//        requisito.setAutorUltimaModificacao("kelvin");
//        requisito.setVersao(1.0f);
//        requisito.setPrioridade("teste2");
//        requisito.setComplexidade("teste2");
//        requisito.setEsforcoEmHoras(7);
//        requisito.setEstado("em andamento");
//        requisito.setFase("teste");
//        requisito.setDescricao("teste2");
//        requisitoBusiness.Adicionar(requisito);

        //EXCLUIR
//        requisitoBusiness.Excluir(3);
        
        //ATUALIZAR
//        requisito.setId(2);
//        requisitoBusiness.Atualizar(requisito);

        //CONSULTAR
//        requisitoBusiness.Consultar(2);
//        System.out.println(
//                requisito.getNome() + " "
//                + requisito.getModulo() + " "
//                + requisito.getFuncionalidade() + " "
//                + requisito.getDataCriacao() + " "
//                + requisito.getAutor() + " "
//                + requisito.getDataUltimaAlteracao() + " "
//                + requisito.getAutorUltimaModificacao()+ " "
//                + requisito.getVersao() + " "
//                + requisito.getPrioridade() + " "
//                + requisito.getComplexidade() + " "
//                + requisito.getEsforcoEmHoras() + " "
//                + requisito.getEstado() + " "
//                    + requisito.getFase() + " "
//                + requisito.getDescricao()
//        );

        //LISTAR
        List<Requisito> lstRequisitos = requisitoBusiness.Listar();

        for (Requisito item : lstRequisitos) {
            System.out.println(
                    item.getNome() + " "
                    + item.getModulo() + " "
                    + item.getFuncionalidade() + " "
                    + item.getDataCriacao() + " "
                    + item.getAutor() + " "
                    + item.getDataUltimaAlteracao() + " "
                    + item.getAutorUltimaModificacao()+ " "
                    + item.getVersao() + " "
                    + item.getPrioridade() + " "
                    + item.getComplexidade() + " "
                    + item.getEsforcoEmHoras() + " "
                    + item.getEstado() + " "
                    + item.getFase() + " "
                    + item.getDescricao()
            );
        }
        // </editor-fold>
    }
}
