package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Entidade;
import modelDominio.Pessoa;
import view.util.Criptografar;
import view.util.Vigenere;

public class TelaCadastrarPessoa extends javax.swing.JFrame {

    public TelaCadastrarPessoa() {
        initComponents();
        setTitle("Cadastro de Pessoa");
        setIcon();

        jLAvisoErroInsercao.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFundoTelaCadastrarPessoa = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLNomePessoa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNomePessoa = new javax.swing.JTextField();
        jTFEmailPessoa = new javax.swing.JTextField();
        jTFSenhaPessoa = new javax.swing.JTextField();
        jBCadastarPessoa = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLAvisoErroInsercao = new javax.swing.JLabel();
        jFTFFonePessoa = new javax.swing.JFormattedTextField();
        jFTFRGPessoa = new javax.swing.JFormattedTextField();
        jFTFCPFPessoa = new javax.swing.JFormattedTextField();
        jBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPFundoTelaCadastrarPessoa.setBackground(new java.awt.Color(72, 127, 52));
        jPFundoTelaCadastrarPessoa.setForeground(new java.awt.Color(72, 127, 52));
        jPFundoTelaCadastrarPessoa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 80, -1));

        jLNomePessoa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLNomePessoa.setForeground(new java.awt.Color(199, 253, 180));
        jLNomePessoa.setText("Nome:");
        jPFundoTelaCadastrarPessoa.add(jLNomePessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 253, 180));
        jLabel2.setText("E-mail:");
        jPFundoTelaCadastrarPessoa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 253, 180));
        jLabel3.setText("Senha:");
        jPFundoTelaCadastrarPessoa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        CPF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        CPF.setForeground(new java.awt.Color(199, 253, 180));
        CPF.setText("CPF:");
        jPFundoTelaCadastrarPessoa.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 253, 180));
        jLabel5.setText("RG:");
        jPFundoTelaCadastrarPessoa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 253, 180));
        jLabel6.setText("Fone:");
        jPFundoTelaCadastrarPessoa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
        jPFundoTelaCadastrarPessoa.add(jTFNomePessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 210, -1));
        jPFundoTelaCadastrarPessoa.add(jTFEmailPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 210, -1));

        jTFSenhaPessoa.setToolTipText("");
        jPFundoTelaCadastrarPessoa.add(jTFSenhaPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 210, -1));

        jBCadastarPessoa.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastarPessoa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jBCadastarPessoa.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastarPessoa.setText("Cadastrar");
        jBCadastarPessoa.setBorder(null);
        jBCadastarPessoa.setBorderPainted(false);
        jBCadastarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastarPessoaActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jBCadastarPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 130, 40));

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 120, 40));

        jLAvisoErroInsercao.setBackground(new java.awt.Color(255, 255, 255));
        jLAvisoErroInsercao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLAvisoErroInsercao.setForeground(new java.awt.Color(255, 255, 255));
        jLAvisoErroInsercao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/X.png"))); // NOI18N
        jLAvisoErroInsercao.setText("Erro no Cadastro de Pessoa!");
        jPFundoTelaCadastrarPessoa.add(jLAvisoErroInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        try {
            jFTFFonePessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFFonePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFFonePessoaActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jFTFFonePessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, -1));

        try {
            jFTFRGPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFRGPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFRGPessoaActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jFTFRGPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 210, -1));

        try {
            jFTFCPFPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPFundoTelaCadastrarPessoa.add(jFTFCPFPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 210, -1));

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPFundoTelaCadastrarPessoa.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundoTelaCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundoTelaCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaCadastrarUsuario telaCadastrarUsuario = new TelaCadastrarUsuario();
        telaCadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCadastarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarPessoaActionPerformed
        //verificando se o usuário informou os dados

        if (!jTFNomePessoa.getText().equals("")) {

            if (!jTFEmailPessoa.getText().equals("")) {

                if (!jTFSenhaPessoa.getText().equals("")) {

                    if (!jFTFFonePessoa.getText().equals("")) {

                        if (!jFTFRGPessoa.getText().equals("")) {

                            if (!jFTFFonePessoa.getText().equals("")) {

                                String senhaDescriptografada = jTFSenhaPessoa.getText();

                                //
                                String chaveReginSin = "AZ!*regisin2023";

                                Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                        Criptografar.retirarAcento(senhaDescriptografada));
                                String senha = vigenere.encriptar();

                                //
                                String nomeUsuario = jTFNomePessoa.getText();
                                String email = jTFEmailPessoa.getText();

                                String cpf = jFTFCPFPessoa.getText();
                                String rg = jFTFRGPessoa.getText();
                                String telefone = jFTFFonePessoa.getText();
                                int tipo = 0;

                                Pessoa pessoa = new Pessoa(cpf, rg, telefone, nomeUsuario, email, senha, tipo);

                                boolean resultado = RegiSinUsuario.ccont.pessoaRegistrar(pessoa);

                                if (resultado == true) {
                                    JOptionPane.showMessageDialog(rootPane, "Pessoa cadastrada com sucesso!");
                                    TelaPrincipal telaPrincipal = new TelaPrincipal();
                                    telaPrincipal.setVisible(true);
                                    dispose();
                                } else {
                                    jLAvisoErroInsercao.setVisible(true);
                                }

                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: informe o Fone da pessoa");
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: informe o CPF da pessoa");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe o setor da pessoa");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe a senha da pessoa");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe o email da pessoa");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome da pessoa");
        }
        dispose();
    }//GEN-LAST:event_jBCadastarPessoaActionPerformed

    private void jFTFFonePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFFonePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFFonePessoaActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jFTFRGPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFRGPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFRGPessoaActionPerformed
    public void limpaCampos() {
        jTFNomePessoa.setText("");
        jTFEmailPessoa.setText("");
        jTFSenhaPessoa.setText("");
        jFTFFonePessoa.setText("");
        jFTFRGPessoa.setText("");
        jFTFFonePessoa.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JButton jBCadastarPessoa;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JFormattedTextField jFTFCPFPessoa;
    private javax.swing.JFormattedTextField jFTFFonePessoa;
    private javax.swing.JFormattedTextField jFTFRGPessoa;
    private javax.swing.JLabel jLAvisoErroInsercao;
    private javax.swing.JLabel jLNomePessoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPFundoTelaCadastrarPessoa;
    private javax.swing.JTextField jTFEmailPessoa;
    private javax.swing.JTextField jTFNomePessoa;
    private javax.swing.JTextField jTFSenhaPessoa;
    // End of variables declaration//GEN-END:variables
}
