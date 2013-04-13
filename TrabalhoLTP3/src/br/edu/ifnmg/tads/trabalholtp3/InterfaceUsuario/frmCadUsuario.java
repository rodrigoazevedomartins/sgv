/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Usuario;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Email;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Endereco;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Telefone;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class frmCadUsuario extends javax.swing.JInternalFrame {
    private Component RootPane;

    /**
     * Creates new form frmCadUsuario
     */
    public frmCadUsuario() {
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

        tbdUsuario = new javax.swing.JTabbedPane();
        PanelDadosGerais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblNomePai = new javax.swing.JLabel();
        lblNomeMae = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNaturalidade = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomeMae = new javax.swing.JTextField();
        txtNomePai = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtNaturalidade = new javax.swing.JTextField();
        PanelEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        PanelTelefone = new javax.swing.JPanel();
        lblCodigoArea = new javax.swing.JLabel();
        lblNumeroTelefone = new javax.swing.JLabel();
        txtNumeroTelefone = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        PanelEmail = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        PanelDadosAcesso = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Cadastrar Usuario");

        PanelDadosGerais.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNome.setText("NOME:");

        lblNomePai.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNomePai.setText("NOME DO PAI: ");

        lblNomeMae.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNomeMae.setText("NOME DA MÃE:");

        lblRg.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRg.setText("RG:");

        lblCpf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCpf.setText("CPF:");

        lblNaturalidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNaturalidade.setText("NATURALIDADE:");

        lblDataNasc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDataNasc.setText("DATA NASCIMENTO: ");

        javax.swing.GroupLayout PanelDadosGeraisLayout = new javax.swing.GroupLayout(PanelDadosGerais);
        PanelDadosGerais.setLayout(PanelDadosGeraisLayout);
        PanelDadosGeraisLayout.setHorizontalGroup(
            PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(lblDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDadosGeraisLayout.createSequentialGroup()
                        .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNomeMae, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(lblNomePai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelDadosGeraisLayout.createSequentialGroup()
                                .addComponent(txtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome)
                            .addComponent(txtNomePai)
                            .addComponent(txtNomeMae))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelDadosGeraisLayout.setVerticalGroup(
            PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosGeraisLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tbdUsuario.addTab("Dados Gerais", PanelDadosGerais);

        lblRua.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRua.setText("RUA:");

        lblNumero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNumero.setText("NUMERO:");

        lblComplemento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblComplemento.setText("COMPLEMENTO: ");

        lblCidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCidade.setText("CIDADE:");

        lblEstado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEstado.setText("ESTADO: ");

        lblBairro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBairro.setText("BAIRRO:");

        lblPais.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPais.setText("PAIS:");

        lblCep.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCep.setText("CEP:");

        javax.swing.GroupLayout PanelEnderecoLayout = new javax.swing.GroupLayout(PanelEndereco);
        PanelEndereco.setLayout(PanelEnderecoLayout);
        PanelEnderecoLayout.setHorizontalGroup(
            PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEnderecoLayout.createSequentialGroup()
                        .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtBairro))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                        .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelEnderecoLayout.createSequentialGroup()
                                        .addComponent(lblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRua)))
                .addGap(83, 83, 83))
        );
        PanelEnderecoLayout.setVerticalGroup(
            PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnderecoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        tbdUsuario.addTab("Endereco", PanelEndereco);

        lblCodigoArea.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCodigoArea.setText("CODIGO AREA: ");

        lblNumeroTelefone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNumeroTelefone.setText("NÚMERO:");

        javax.swing.GroupLayout PanelTelefoneLayout = new javax.swing.GroupLayout(PanelTelefone);
        PanelTelefone.setLayout(PanelTelefoneLayout);
        PanelTelefoneLayout.setHorizontalGroup(
            PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTelefoneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTelefoneLayout.createSequentialGroup()
                        .addComponent(lblNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTelefoneLayout.createSequentialGroup()
                        .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        PanelTelefoneLayout.setVerticalGroup(
            PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTelefoneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        tbdUsuario.addTab("Telefone", PanelTelefone);

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmail.setText("EMAIL:");

        javax.swing.GroupLayout PanelEmailLayout = new javax.swing.GroupLayout(PanelEmail);
        PanelEmail.setLayout(PanelEmailLayout);
        PanelEmailLayout.setHorizontalGroup(
            PanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmailLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        PanelEmailLayout.setVerticalGroup(
            PanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmailLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        tbdUsuario.addTab("Email", PanelEmail);

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSenha.setText("SENHA:");

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsuario.setText("USUÁRIO: ");

        pfSenha.setText("jPasswordField1");

        javax.swing.GroupLayout PanelDadosAcessoLayout = new javax.swing.GroupLayout(PanelDadosAcesso);
        PanelDadosAcesso.setLayout(PanelDadosAcessoLayout);
        PanelDadosAcessoLayout.setHorizontalGroup(
            PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosAcessoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        PanelDadosAcessoLayout.setVerticalGroup(
            PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosAcessoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDadosAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        tbdUsuario.addTab("Dados de Acesso", PanelDadosAcesso);

        btnCadastrar.setText("Cadastrar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tbdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btnCadastrar)
                        .addGap(53, 53, 53)
                        .addComponent(btnCancelar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(tbdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario usuarios = new Usuario();
        Endereco enderecos = new Endereco();
        Telefone telefones = new Telefone();
        Email emails = new Email();
        
        String nome = txtNome.getText();
        String nomemae = txtNomeMae.getText();
        String nomepai = txtNomePai.getText();
        String rg = txtRg.getText();
        int cpf = Integer.parseInt(txtCpf.getText());
        String datanascimento = txtDataNasc.getText(); 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date datanasc = sdf.parse(datanascimento);
        } catch (ParseException ex) {
            Logger.getLogger(frmCadClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        String naturalidade = txtNaturalidade.getText();
        String rua = txtRua.getText();
        int numero = Integer.parseInt(txtNumero.getText());
        String complemento = txtComplemento.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        int cep = Integer.parseInt(txtCep.getText());
        String pais = txtPais.getText();
        int codarea = Integer.parseInt(txtArea.getText());
        int numerotelefone = Integer.parseInt(txtNumeroTelefone.getText());
        String email = txtEmail.getText();
        String nomeusuario = txtUsuario.getText();
        String senhausuario = pfSenha.getText();
        
        try {
            usuarios.setNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(frmCadClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuarios.setNomemae(nomemae);
        usuarios.setNomepai(nomepai);
        usuarios.setRg(rg);
        usuarios.setCpf(cpf);
        //usuarios.setDatanasc(datanasc);
        usuarios.setNaturalidade(naturalidade);
        usuarios.setNomeUsuario(nomeusuario);
        usuarios.setSenhaUsuario(senhausuario);
        
        enderecos.setRua(rua);
        enderecos.setNumero(numero);
        enderecos.setComplemento(complemento);
        enderecos.setBairro(bairro);
        enderecos.setCidade(cidade);
        enderecos.setCep(cep);
        enderecos.setEstado(estado);
        enderecos.setPais(pais);
        
        telefones.setArea(codarea);
        telefones.setNumero(numerotelefone);
        
        emails.setEndereco(email);
        
        JOptionPane.showMessageDialog(RootPane, "Usuario Cadastrado com Sucesso");
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDadosAcesso;
    private javax.swing.JPanel PanelDadosGerais;
    private javax.swing.JPanel PanelEmail;
    private javax.swing.JPanel PanelEndereco;
    private javax.swing.JPanel PanelTelefone;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMae;
    private javax.swing.JLabel lblNomePai;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroTelefone;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTabbedPane tbdUsuario;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroTelefone;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
