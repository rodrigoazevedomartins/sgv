/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pagamento;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.FormaPagamentoDAO;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.BD;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Rodrigo
 */
public class frmCadFormaPagamento extends javax.swing.JInternalFrame {
    private Component RootPane;
    Pagamento formapagamento;
    FormaPagamentoDAO pagamentodao = new FormaPagamentoDAO();
    /**
     * Creates new form frmCadFormaPagamento
     */
    public frmCadFormaPagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblForma = new javax.swing.JLabel();
        txtForma = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Forma de Pagamento");
        setVisible(true);

        lblForma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblForma.setText("FORMA DE PAGAMENTO:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblForma, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnCadastrar)
                .addGap(69, 69, 69)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(RootPane, "Deseja Cadastrar Forma de Pagamento?") == 0){
            formapagamento = new Pagamento(0, txtForma.getText());
            System.out.print(formapagamento.toString());
            if (pagamentodao.Salvar(formapagamento)){
            
            JOptionPane.showMessageDialog(RootPane, "Forma de Pagamento Cadastrada com Sucesso!");
            this.dispose();
            
            }
        } else {
            JOptionPane.showMessageDialog(RootPane, "Cadastro Cancelado");
        } 
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
       
        if (JOptionPane.showConfirmDialog(RootPane, "Deseja Cancelar o Cadastro?") == 0){
            JOptionPane.showMessageDialog(RootPane, "Cadastro Cancelado");
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblForma;
    private javax.swing.JTextField txtForma;
    // End of variables declaration//GEN-END:variables
}
