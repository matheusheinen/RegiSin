package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelDominio.Entidade;
import view.util.Criptografar;
import view.util.Vigenere;

public class TelaCadastrarEntidade extends javax.swing.JFrame {

    public TelaCadastrarEntidade() {
        initComponents();
        setIcon();
        setTitle("Cadastro de Entidade");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLNomeEntidade = new javax.swing.JLabel();
        jLEmailEntidade = new javax.swing.JLabel();
        jLSenhaEntidade = new javax.swing.JLabel();
        jLTelefoneEntidade = new javax.swing.JLabel();
        jBCadastrarEntidade = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFNomeEntidade = new javax.swing.JTextField();
        jTFEmailEntidade = new javax.swing.JTextField();
        jTFSenhaEntidade = new javax.swing.JTextField();
        jTFSetorEntidade = new javax.swing.JTextField();
        jLSetorEntidade1 = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jFTFTelefoneEntidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jLNomeEntidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLNomeEntidade.setForeground(new java.awt.Color(199, 253, 180));
        jLNomeEntidade.setText("Nome:");
        jPanel1.add(jLNomeEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLEmailEntidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLEmailEntidade.setForeground(new java.awt.Color(199, 253, 180));
        jLEmailEntidade.setText("E-mail:");
        jPanel1.add(jLEmailEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLSenhaEntidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLSenhaEntidade.setForeground(new java.awt.Color(199, 253, 180));
        jLSenhaEntidade.setText("Senha:");
        jPanel1.add(jLSenhaEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLTelefoneEntidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTelefoneEntidade.setForeground(new java.awt.Color(199, 253, 180));
        jLTelefoneEntidade.setText("Telefone:");
        jPanel1.add(jLTelefoneEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jBCadastrarEntidade.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarEntidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBCadastrarEntidade.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarEntidade.setText("Cadastrar");
        jBCadastrarEntidade.setBorder(null);
        jBCadastrarEntidade.setBorderPainted(false);
        jBCadastrarEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarEntidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jBCadastrarEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, 50));

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 130, 50));
        jPanel1.add(jTFNomeEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 160, -1));

        jTFEmailEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailEntidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jTFEmailEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));
        jPanel1.add(jTFSenhaEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));
        jPanel1.add(jTFSetorEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, -1));

        jLSetorEntidade1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLSetorEntidade1.setForeground(new java.awt.Color(199, 253, 180));
        jLSetorEntidade1.setText("Setor");
        jPanel1.add(jLSetorEntidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 40, 40));

        try {
            jFTFTelefoneEntidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFTFTelefoneEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaCadastrarUsuario telaCadastrarUsuario = new TelaCadastrarUsuario();
        telaCadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCadastrarEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarEntidadeActionPerformed
        //verificando se o usuário informou os dados
        if (!jTFNomeEntidade.getText().equals("")) {

            if (!jTFEmailEntidade.getText().equals("")) {

                if (!jTFSenhaEntidade.getText().equals("")) {

                    if (!jFTFTelefoneEntidade.getText().equals("")) {

                        String senhaDescriptografada = jTFSenhaEntidade.getText();

                        //
                        String chaveReginSin = "AZ!*regisin2023";

                        Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                Criptografar.retirarAcento(senhaDescriptografada));
                        String senhaCriptografada = vigenere.encriptar();

                        String nomeUsuario = jTFNomeEntidade.getText();
                        String email = jTFEmailEntidade.getText();
                        String senha = senhaCriptografada;
                        String setor = jTFSetorEntidade.getText();
                        String telefone = jFTFTelefoneEntidade.getText();
                        int tipo = 1;

                        Entidade entidade = new Entidade(nomeUsuario, email, senha, tipo, setor, telefone);

                        boolean resultado = RegiSinUsuario.ccont.entidadeRegistrar(entidade);
                        if (resultado == true) {
                            JOptionPane.showMessageDialog(rootPane, "Entidade cadastrada com sucesso");
                            TelaPrincipal telaPrincipal = new TelaPrincipal();
                            telaPrincipal.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: Entidade não cadastrada");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe o setor da entidade");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe a senha da entidade");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe o email da entidade");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome da entidade");
        }
        dispose();
    }//GEN-LAST:event_jBCadastrarEntidadeActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFEmailEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailEntidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailEntidadeActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    public void limpaCampos() {
        jTFNomeEntidade.setText("");
        jTFEmailEntidade.setText("");
        jTFSenhaEntidade.setText("");
        jTFSetorEntidade.setText("");
        jFTFTelefoneEntidade.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarEntidade;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JFormattedTextField jFTFTelefoneEntidade;
    private javax.swing.JLabel jLEmailEntidade;
    private javax.swing.JLabel jLNomeEntidade;
    private javax.swing.JLabel jLSenhaEntidade;
    private javax.swing.JLabel jLSetorEntidade1;
    private javax.swing.JLabel jLTelefoneEntidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFEmailEntidade;
    private javax.swing.JTextField jTFNomeEntidade;
    private javax.swing.JTextField jTFSenhaEntidade;
    private javax.swing.JTextField jTFSetorEntidade;
    // End of variables declaration//GEN-END:variables
}
