/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;

/**
 *
 * @author Rodrigo
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        MenuUsuarios = new javax.swing.JMenu();
        MenuListaUsuarios = new javax.swing.JMenuItem();
        MenuCadastrarUsuarios = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuListaClientes = new javax.swing.JMenuItem();
        MenuCadastrarClientes = new javax.swing.JMenuItem();
        MenuForma = new javax.swing.JMenu();
        MenuListaForma = new javax.swing.JMenuItem();
        MenuCadastrarForma = new javax.swing.JMenuItem();
        MenuProdutos = new javax.swing.JMenu();
        MenuListaProdutos = new javax.swing.JMenuItem();
        MenuCadastrarProdutos = new javax.swing.JMenuItem();
        MenuVendas = new javax.swing.JMenu();
        MenuListaVendas = new javax.swing.JMenuItem();
        MenuNovaVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Vendas - Principal");
        setName("frmPrincipal"); // NOI18N

        MenuUsuarios.setText("Usuários");
        MenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsuariosMouseClicked(evt);
            }
        });

        MenuListaUsuarios.setText("Lista Usuarios");
        MenuListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuListaUsuariosMouseClicked(evt);
            }
        });
        MenuListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(MenuListaUsuarios);

        MenuCadastrarUsuarios.setText("Cadastrar Usuarios");
        MenuCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(MenuCadastrarUsuarios);

        jMenuBar2.add(MenuUsuarios);

        MenuClientes.setText("Clientes");

        MenuListaClientes.setText("Lista Clientes");
        MenuListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuListaClientes);

        MenuCadastrarClientes.setText("Cadastrar Clientes");
        MenuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuCadastrarClientes);

        jMenuBar2.add(MenuClientes);

        MenuForma.setText("Formas de Pagamento");

        MenuListaForma.setText("Lista Formas");
        MenuListaForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaFormaActionPerformed(evt);
            }
        });
        MenuForma.add(MenuListaForma);

        MenuCadastrarForma.setText("Cadastrar Forma de Pagamento");
        MenuCadastrarForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFormaActionPerformed(evt);
            }
        });
        MenuForma.add(MenuCadastrarForma);

        jMenuBar2.add(MenuForma);

        MenuProdutos.setText("Produtos");

        MenuListaProdutos.setText("Lista Produtos");
        MenuListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaProdutosActionPerformed(evt);
            }
        });
        MenuProdutos.add(MenuListaProdutos);

        MenuCadastrarProdutos.setText("Cadastrar Produtos");
        MenuCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarProdutosActionPerformed(evt);
            }
        });
        MenuProdutos.add(MenuCadastrarProdutos);

        jMenuBar2.add(MenuProdutos);

        MenuVendas.setText("Vendas");

        MenuListaVendas.setText("Lista Vendas");
        MenuListaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListaVendasActionPerformed(evt);
            }
        });
        MenuVendas.add(MenuListaVendas);

        MenuNovaVenda.setText("Nova Venda");
        MenuNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovaVendaActionPerformed(evt);
            }
        });
        MenuVendas.add(MenuNovaVenda);

        jMenuBar2.add(MenuVendas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuListaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuListaUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuListaUsuariosMouseClicked

    private void MenuCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarUsuariosActionPerformed
        // TODO add your handling code here:
        frmCadUsuario janelaCadUsuario = new frmCadUsuario();
        add(janelaCadUsuario);
        janelaCadUsuario.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarUsuariosActionPerformed

    private void MenuListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaClientesActionPerformed
        // TODO add your handling code here:
        frmClientes janelaClientes = new frmClientes();
        add(janelaClientes);
        janelaClientes.setVisible(true);
    }//GEN-LAST:event_MenuListaClientesActionPerformed

    private void MenuCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarClientesActionPerformed
        // TODO add your handling code here:
        frmCadClientes janelaCadClientes = new frmCadClientes();
        add(janelaCadClientes);
        janelaCadClientes.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarClientesActionPerformed

    private void MenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsuariosMouseClicked
            // TODO add your handling code here:

    }//GEN-LAST:event_MenuUsuariosMouseClicked

    private void MenuListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaUsuariosActionPerformed
        // TODO add your handling code here:
        frmUsuarios janelaUsuario = new frmUsuarios();
        add(janelaUsuario);
        janelaUsuario.setVisible(true);
    }//GEN-LAST:event_MenuListaUsuariosActionPerformed

    private void MenuListaFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaFormaActionPerformed
        // TODO add your handling code here:
        frmFormasPagamento janelaForma = new frmFormasPagamento();
        add(janelaForma);
        janelaForma.setVisible(true);
    }//GEN-LAST:event_MenuListaFormaActionPerformed

    private void MenuListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaProdutosActionPerformed
        // TODO add your handling code here:
        frmProdutos janelaProdutos = new frmProdutos();
        add(janelaProdutos);
        janelaProdutos.setVisible(true);
    }//GEN-LAST:event_MenuListaProdutosActionPerformed

    private void MenuListaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListaVendasActionPerformed
        // TODO add your handling code here:
        frmVendas janelaVendas = new frmVendas();
        add(janelaVendas);
        janelaVendas.setVisible(true);
    }//GEN-LAST:event_MenuListaVendasActionPerformed

    private void MenuCadastrarFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFormaActionPerformed
        // TODO add your handling code here:
        frmCadFormaPagamento janelaCadForma = new frmCadFormaPagamento();
        add(janelaCadForma);
        janelaCadForma.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarFormaActionPerformed

    private void MenuCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarProdutosActionPerformed
        // TODO add your handling code here:
        frmCadProdutos janelaCadProduto = new frmCadProdutos();
        add(janelaCadProduto);
        janelaCadProduto.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarProdutosActionPerformed

    private void MenuNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovaVendaActionPerformed
        // TODO add your handling code here:
        frmCadVenda janelaCadVenda = new frmCadVenda();
        add(janelaCadVenda);
        janelaCadVenda.setVisible(true);
    }//GEN-LAST:event_MenuNovaVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadastrarClientes;
    private javax.swing.JMenuItem MenuCadastrarForma;
    private javax.swing.JMenuItem MenuCadastrarProdutos;
    private javax.swing.JMenuItem MenuCadastrarUsuarios;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuForma;
    private javax.swing.JMenuItem MenuListaClientes;
    private javax.swing.JMenuItem MenuListaForma;
    private javax.swing.JMenuItem MenuListaProdutos;
    private javax.swing.JMenuItem MenuListaUsuarios;
    private javax.swing.JMenuItem MenuListaVendas;
    private javax.swing.JMenuItem MenuNovaVenda;
    private javax.swing.JMenu MenuProdutos;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JMenu MenuVendas;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
