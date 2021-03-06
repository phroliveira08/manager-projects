/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Business.PessoaBusiness;
import com.mycompany.Business.ProjetoBusiness;
import com.mycompany.Business.RequisitoBusiness;
import com.mycompany.Model.Projeto;
import com.mycompany.Model.Requisito;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Familia
 */
public class RequisitoJFrame extends javax.swing.JFrame {

    private PessoaBusiness _pessoaBusiness;
    private RequisitoBusiness _requisitoBusiness;
    private Projeto _projeto;
    
    /**
     * Creates new form ProjetoJFrame
     */
    public RequisitoJFrame(PessoaBusiness pessoaBusiness, Projeto projeto) {
        initComponents();
        this._pessoaBusiness = pessoaBusiness;
        this._requisitoBusiness = new RequisitoBusiness();
        this._projeto = projeto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NovojButton = new javax.swing.JButton();
        AlterarjButton = new javax.swing.JButton();
        ExcluirjButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requisitojTable = new javax.swing.JTable();
        VoltarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Requisitos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        NovojButton.setText("Novo Requisito");
        NovojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovojButtonActionPerformed(evt);
            }
        });

        AlterarjButton.setText("Alterar Requsito");
        AlterarjButton.setEnabled(false);
        AlterarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarjButtonActionPerformed(evt);
            }
        });

        ExcluirjButton.setText("Excluir Requsito");
        ExcluirjButton.setEnabled(false);
        ExcluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirjButtonActionPerformed(evt);
            }
        });

        requisitojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requisitojTable.getTableHeader().setReorderingAllowed(false);
        requisitojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requisitojTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(requisitojTable);

        VoltarjButton.setText("Voltar");
        VoltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NovojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlterarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExcluirjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VoltarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(NovojButton)
                .addGap(18, 18, 18)
                .addComponent(AlterarjButton)
                .addGap(18, 18, 18)
                .addComponent(ExcluirjButton)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(VoltarjButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void NovojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovojButtonActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        
        GerenciarRequisitoJFrame telaGerenciaRequisito = new GerenciarRequisitoJFrame("Criar", _projeto, _pessoaBusiness);
        
        telaGerenciaRequisito.setLocationRelativeTo(this);
        telaGerenciaRequisito.setVisible(true);
    }//GEN-LAST:event_NovojButtonActionPerformed

    private void AlterarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarjButtonActionPerformed
        // TODO add your handling code here:
        int idRequisito = getIdRequisitoSelecionado();
        Requisito requisito = _requisitoBusiness.Consultar(idRequisito);

        GerenciarRequisitoJFrame telaGerenciaRequisito = new GerenciarRequisitoJFrame("Atualizar", _projeto, _pessoaBusiness, requisito);
        telaGerenciaRequisito.setLocationRelativeTo(this);
        telaGerenciaRequisito.setVisible(true);
    }//GEN-LAST:event_AlterarjButtonActionPerformed

    private void ExcluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirjButtonActionPerformed
        // TODO add your handling code here:
        int row = requisitojTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)requisitojTable.getModel();
        Object columnId = model.getValueAt(row, 0);
        Integer id = Integer.parseInt(columnId.toString());
        model.removeRow(row);
        _requisitoBusiness.Excluir(id);
    }//GEN-LAST:event_ExcluirjButtonActionPerformed

    private void VoltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarjButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_VoltarjButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        int idProjeto = _projeto.getId_projeto();
        List<Requisito> lstRequisitos = _requisitoBusiness.Listar(idProjeto);
        
        DefaultTableModel model = (DefaultTableModel)requisitojTable.getModel();
        Object rowData[] = new Object[3];
        
        model.setRowCount(0);
        
        for (Requisito item : lstRequisitos) {
            rowData[0] = item.getId();
            rowData[1] = item.getNome();
            rowData[2] = item.getEstado();
            model.addRow(rowData);
        }
        int row = requisitojTable.getSelectedRow();
        if(row == -1){
            AlterarjButton.setEnabled(false);
            ExcluirjButton.setEnabled(false);
        } else{
            AlterarjButton.setEnabled(true);
            ExcluirjButton.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void requisitojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requisitojTableMouseClicked
        // TODO add your handling code here:
        int row = requisitojTable.getSelectedRow();
        if(row != -1){
            AlterarjButton.setEnabled(true);
            ExcluirjButton.setEnabled(true);
        }
    }//GEN-LAST:event_requisitojTableMouseClicked

    private int getIdRequisitoSelecionado(){
        int row = requisitojTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)requisitojTable.getModel();
        Object columnId = model.getValueAt(row, 0);
        Integer id = Integer.parseInt(columnId.toString());
        
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarjButton;
    private javax.swing.JButton ExcluirjButton;
    private javax.swing.JButton NovojButton;
    private javax.swing.JButton VoltarjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable requisitojTable;
    // End of variables declaration//GEN-END:variables
}
