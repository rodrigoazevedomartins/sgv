/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;

import br.edu.ifnmg.tads.trabalholtp3.DataAccess.FormaPagamentoDAO;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pagamento;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.BD;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Rodrigo
 */
public class frmEditarFormaPagamento extends javax.swing.JInternalFrame {
    private BD bd;
    private FormaPagamentoDAO pagamentodao;
    private Pagamento formapagamento;
    private Component RootPane;
    /**
     * Creates new form frmEditarFormaPagamento
     */
    public frmEditarFormaPagamento(int cod) {
        initComponents();
        pagamentodao = new FormaPagamentoDAO();
        formapagamento = pagamentodao.Abrir(cod);
        lblCodigoFormaPagamento.setText(Integer.toString(formapagamento.getCodpagamento()));
        txtForma.setText(formapagamento.getNomeTipo());
    
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
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCodFormaPagamento = new javax.swing.JLabel();
        lblCodigoFormaPagamento = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Editar Forma de Pagamento");

        lblForma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblForma.setText("FORMA DE PAGAMENTO:");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCodFormaPagamento.setText("CÓDIGO FORMA DE PAGAMENTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnAlterar)
                .addGap(69, 69, 69)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodFormaPagamento)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigoFormaPagamento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodFormaPagamento)
                    .addComponent(lblCodigoFormaPagamento))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(RootPane, "Deseja Alterar Forma de Pagamento?") == 0){
            formapagamento = new Pagamento(Integer.parseInt(lblCodigoFormaPagamento.getText()), txtForma.getText());
            if (pagamentodao.Salvar(formapagamento)){

                JOptionPane.showMessageDialog(RootPane, "Forma de Pagamento Alterada com Sucesso!");
                this.dispose();

            }
        } else {
            JOptionPane.showMessageDialog(RootPane, "Cadastro Cancelado");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(RootPane, "Deseja Cancelar o Cadastro?") == 0){
            JOptionPane.showMessageDialog(RootPane, "Cadastro Cancelado");
            this.dispose();
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblCodFormaPagamento;
    private javax.swing.JLabel lblCodigoFormaPagamento;
    private javax.swing.JLabel lblForma;
    private javax.swing.JTextField txtForma;
    // End of variables declaration//GEN-END:variables
}
