/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Cliente;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.ClienteDAO;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pessoa;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Email;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Endereco;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Telefone;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.BD;

import br.edu.ifnmg.tads.trabalholtp3.DataAccess.PessoaDAO;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.EmailDAO;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.EnderecoDAO;
import br.edu.ifnmg.tads.trabalholtp3.DataAccess.TelefoneDAO;
import java.util.LinkedList;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class frmClientes extends javax.swing.JInternalFrame {
    private ClienteDAO clientedao;
    private PessoaDAO pessoadao;
    private EmailDAO emaildao;
    private EnderecoDAO enderecodao;
    private TelefoneDAO telefonedao;
    private Cliente cliente;
    private Pessoa pessoa;
    /**
     * Creates new form frmClientes
     */
    public frmClientes() {
        initComponents();
        clientedao = new ClienteDAO();
        pessoadao = new PessoaDAO();
        enderecodao = new EnderecoDAO();
        emaildao = new EmailDAO();
        telefonedao = new TelefoneDAO();
        
        List<Cliente> clientes = clientedao.listarClientes();
        
        
        preenchetabela(clientes);
    }

    private void preenchetabela(List<Cliente> clientes){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código");
        model.addColumn("Nome");
        model.addColumn("RG");
        model.addColumn("CPF");
        for (Cliente cliente : clientes){
            Vector v = new Vector();
            v.add(0, cliente.getCodcliente());
            v.add(1, cliente.getNome());
            v.add(2, cliente.getRg());
            v.add(3, cliente.getCpf());
            model.addRow(v);
        }
        
        tblClientes.setModel(model);
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
        tblClientes = new javax.swing.JTable();
        btnAlterarCliente = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        cbxfiltro = new javax.swing.JComboBox();
        txtFiltro = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Clientes");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setVisible(true);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "RG", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnRemoverCliente.setText("Remover");
        btnRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        cbxfiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "RG", "CPF" }));
        cbxfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxfiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemoverCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(cbxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAlterarCliente)
                        .addGap(35, 35, 35)
                        .addComponent(btnRemoverCliente)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        Pessoa pessoa = new Pessoa();
        try {
            if (cbxfiltro.getSelectedIndex() == 0){
                cliente.setCodcliente(Integer.parseInt(txtFiltro.getText()));
                cliente.setPessoa(pessoa);   
            }
            
            if (cbxfiltro.getSelectedIndex() == 1){
                cliente.setNome(txtFiltro.getText());
                cliente.setPessoa(pessoa);
            }
            
            if (cbxfiltro.getSelectedIndex() == 2){
                cliente.setRg(txtFiltro.getText());
                cliente.setPessoa(pessoa);
            }
            
            if (cbxfiltro.getSelectedIndex() == 3){
                cliente.setCpf(Integer.parseInt(txtFiltro.getText()));
                System.out.println(cliente.getCpf());
                cliente.setPessoa(pessoa);
            }
            
            
        } catch (ErroValidacaoException ex) {
            Logger.getLogger(frmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Cliente> Clientes = clientedao.buscarClientes(cliente);
        
        preenchetabela(Clientes);
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void cbxfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxfiltroActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        // TODO add your handling code here:
        int codcliente = (int) tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);
        frmEditarClientes janela = new frmEditarClientes(codcliente);
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverClienteActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Apagar esse Cliente?") == 0){
            int codcliente = (int) tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);      

            cliente = clientedao.Abrir(codcliente);
            pessoa = pessoadao.Abrir(cliente.getCodpessoa());  
            pessoa.setEmails(emaildao.Abrir(cliente.getCodpessoa()));
            pessoa.setEnderecos(enderecodao.Abrir(cliente.getCodpessoa()));
            pessoa.setTelefones(telefonedao.Abrir(cliente.getCodpessoa()));

            for (Endereco en : pessoa.getEnderecos()){
                enderecodao.Apagar(en.getCodendereco());
            }    

            for (Telefone tel : pessoa.getTelefones()){
                telefonedao.Apagar(tel.getCodtelefone());
            }

            for (Email em : pessoa.getEmails()){
                emaildao.Apagar(em.getCodemail());
            }

            if (clientedao.Apagar(cliente.getCodcliente()) && pessoadao.Apagar(pessoa.getCodpessoa())){
                JOptionPane.showMessageDialog(rootPane, "Cliente Removido com sucesso");
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ação cancelada");
        }

    }//GEN-LAST:event_btnRemoverClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JComboBox cbxfiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
