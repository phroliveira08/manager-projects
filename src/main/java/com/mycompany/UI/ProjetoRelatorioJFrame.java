/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI;

import com.mycompany.Model.Projeto;
import com.mycompany.Business.ProjetoBusiness;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kelvin
 */
public class ProjetoRelatorioJFrame extends javax.swing.JFrame {

    private MenuPrincipalJFrame _menuPrincipal;
    private ProjetoBusiness _projetoBusiness;
    
    private List<Projeto> _lstProjetos;
    /**
     * Creates new form ProjetoRelatorioJFrame
     */
    public ProjetoRelatorioJFrame(MenuPrincipalJFrame menuPrincipal) {
        initComponents();
        
        _projetoBusiness = new ProjetoBusiness();
        this._menuPrincipal = menuPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProjetoRelatorio = new javax.swing.JTable();
        btnDetalhesProjeto = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 458));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableProjetoRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Projeto", "Descrição", "Usuário Proprietário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProjetoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProjetoRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProjetoRelatorio);

        btnDetalhesProjeto.setText("Detalhes do Projeto");
        btnDetalhesProjeto.setEnabled(false);
        btnDetalhesProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesProjetoActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar:");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetalhesProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalhesProjeto)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        _lstProjetos = _projetoBusiness.Listar();
        
        carregarTabela(_lstProjetos);
    }//GEN-LAST:event_formWindowOpened

    private void btnDetalhesProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesProjetoActionPerformed
        // TODO add your handling code here:
        int id = getIdProjetoSelecionado();
        
        RequisitosRelatorioJFrame telaRequisito = new RequisitosRelatorioJFrame(id, this);
        
        telaRequisito.setLocationRelativeTo(this);
        telaRequisito.setVisible(true);
    }//GEN-LAST:event_btnDetalhesProjetoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tableProjetoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProjetoRelatorioMouseClicked
        // TODO add your handling code here:
        int row = tableProjetoRelatorio.getSelectedRow();
        if(row == -1){
            btnDetalhesProjeto.setEnabled(false);
        } else{
            btnDetalhesProjeto.setEnabled(true);
        }
    }//GEN-LAST:event_tableProjetoRelatorioMouseClicked

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        // TODO add your handling code here:
        List<Projeto> lst = null;
        
        lst = _lstProjetos
                .stream()
                .filter(x -> 
                        x.getNomeProjeto().toLowerCase().contains(txtFiltro.getText().toLowerCase())
                        || x.getUsuarioProprietario().toLowerCase().contains(txtFiltro.getText().toLowerCase())
                        || x.getDescricao().toLowerCase().contains(txtFiltro.getText().toLowerCase())
//                        || x.getId_projeto() == Integer.parseInt(txtFiltro.getText())
                ).collect(Collectors.toList());
        
        carregarTabela(lst);
    }//GEN-LAST:event_txtFiltroKeyReleased
    
    private int getIdProjetoSelecionado(){
        int row = tableProjetoRelatorio.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)tableProjetoRelatorio.getModel();
        Object columnId = model.getValueAt(row, 0);
        Integer id = Integer.parseInt(columnId.toString());
        
        return id;
    }
    
    public void carregarTabela(List<Projeto> lst){
        DefaultTableModel model = (DefaultTableModel)tableProjetoRelatorio.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        
        for (Projeto item : lst) {
            rowData[0] = item.getId_projeto();
            rowData[1] = item.getNomeProjeto();
            rowData[2] = item.getDescricao();
            rowData[3] = item.getUsuarioProprietario();
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhesProjeto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProjetoRelatorio;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}