/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Business.PessoaBusiness;
import com.mycompany.DataAccess.PessoaDataAccess;
import com.mycompany.Model.Pessoa;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Henrique
 */
public class UsuarioJFrame extends javax.swing.JFrame {

    private MenuPrincipalJFrame _menuPrincipal;
    private CadastrarUsuario _cadastro;
    private PessoaBusiness _pessoaBusiness;
    private PessoaDataAccess _pessoaDA;

    /**
     * Creates new form UsuarioJFrame
     */
    public UsuarioJFrame(MenuPrincipalJFrame menuPrincipal) {
        initComponents();
        this._menuPrincipal = menuPrincipal;
        _cadastro = new CadastrarUsuario(this);
        _pessoaBusiness = new PessoaBusiness();
        _pessoaDA = new PessoaDataAccess();
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
        voltar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Nome Completo", "Telefone", "E-mail", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(cadastrar)
                        .addGap(34, 34, 34)
                        .addComponent(alterar)
                        .addGap(36, 36, 36)
                        .addComponent(excluir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(voltar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario("Cadastrar");
        _cadastro.setVisible(true);
        _cadastro.setLocationRelativeTo(null);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        _menuPrincipal.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
        
        String username = getUsernameSelecionado();
        Pessoa pessoa = _pessoaBusiness.ConsultarAtualiza(username);
        CadastrarUsuario alterarUsuario = new CadastrarUsuario("Atualizar",pessoa);
        alterarUsuario.setLocationRelativeTo(this);
        alterarUsuario.setVisible(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        List<Pessoa> lstPessoa = _pessoaBusiness.Listar();

        DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
        Object rowData[] = new Object[5];

        model.setRowCount(0);

        for (Pessoa item : lstPessoa) {
            rowData[0] = item.getUsername();
            rowData[1] = item.getNomeCompleto();
            rowData[2] = item.getTelefone();
            rowData[3] = item.getEmail();
            rowData[4] = item.getCargo();
            model.addRow(rowData);
        }
        int row = tabelaUsuario.getSelectedRow();
        if(row == -1){
            alterar.setEnabled(false);
            excluir.setEnabled(false);
        } else{
            alterar.setEnabled(true);
            excluir.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        int row = tabelaUsuario.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tabelaUsuario.getModel();
        Object columnUsername = model.getValueAt(row, 0);
        String username = columnUsername.toString();
        model.removeRow(row);
        _pessoaBusiness.Excluir(username);
    }//GEN-LAST:event_excluirActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        // TODO add your handling code here:
        int row = tabelaUsuario.getSelectedRow();
        if(row == -1){
            alterar.setEnabled(false);
            excluir.setEnabled(false);
        } else{
            alterar.setEnabled(true);
            excluir.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private String getUsernameSelecionado(){
        int row = tabelaUsuario.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)tabelaUsuario.getModel();
        Object columnUsername = model.getValueAt(row, 0);
        String username = columnUsername.toString();
        
        return columnUsername.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
