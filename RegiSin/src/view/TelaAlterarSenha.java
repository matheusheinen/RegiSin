package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Usuario;
import view.util.Criptografar;
import view.util.Vigenere;

public class TelaAlterarSenha extends javax.swing.JFrame {

    private Usuario usuario;

    public TelaAlterarSenha() {
        initComponents();
        setIcon();
        setTitle("Tela Alterar Senha");

        jLAvisoErroAlteracao.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLSenhaAtual = new javax.swing.JLabel();
        jLNovaSenha = new javax.swing.JLabel();
        jLConfirmarSenha = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jBAlterarSenha = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFNovaSenha = new javax.swing.JTextField();
        jTFConfirmarNovaSenha = new javax.swing.JTextField();
        jLAvisoErroAlteracao = new javax.swing.JLabel();
        jTFSenhaAtual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

        jLSenhaAtual.setBackground(new java.awt.Color(199, 253, 180));
        jLSenhaAtual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSenhaAtual.setForeground(new java.awt.Color(199, 253, 180));
        jLSenhaAtual.setText("Senha atual:");

        jLNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNovaSenha.setForeground(new java.awt.Color(199, 253, 180));
        jLNovaSenha.setText("Nova senha:");

        jLConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLConfirmarSenha.setForeground(new java.awt.Color(199, 253, 180));
        jLConfirmarSenha.setText("Confirme a nova senha:");

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

        jBAlterarSenha.setBackground(new java.awt.Color(199, 253, 180));
        jBAlterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBAlterarSenha.setForeground(new java.awt.Color(72, 127, 52));
        jBAlterarSenha.setText("Alterar Senha");
        jBAlterarSenha.setBorder(null);
        jBAlterarSenha.setBorderPainted(false);
        jBAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarSenhaActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLAvisoErroAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLAvisoErroAlteracao.setForeground(new java.awt.Color(255, 255, 102));
        jLAvisoErroAlteracao.setText("Erro na alteração de senha!");

        jTFSenhaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSenhaAtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLAvisoErroAlteracao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLSenhaAtual)
                        .addGap(15, 15, 15)
                        .addComponent(jTFSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLNovaSenha)
                        .addGap(25, 25, 25)
                        .addComponent(jTFNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jBAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLConfirmarSenha)
                            .addGap(10, 10, 10)
                            .addComponent(jTFConfirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVoltar)
                .addGap(18, 18, 18)
                .addComponent(jLAvisoErroAlteracao)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSenhaAtual)
                    .addComponent(jTFSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNovaSenha)
                    .addComponent(jTFNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLConfirmarSenha)
                    .addComponent(jTFConfirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarSenhaActionPerformed

        if (!jTFSenhaAtual.getText().equals("")) {
            if (!jTFNovaSenha.getText().equals("")) {
                if (!jTFConfirmarNovaSenha.getText().equals("")) {
                    String senhaAtual;

                    senhaAtual = RegiSinUsuario.ccont.usuarioLogado.getEmail();
                    String chaveRegiSin = "AZ!*regisin2023";
                    String senhaAtualInserida = jTFSenhaAtual.getText();
                    Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveRegiSin),
                            Criptografar.retirarAcento(senhaAtual));
                    String senhaAtualDescriptografada = vigenere.decriptar();
                    String novaSenha = jTFNovaSenha.getText();

                    if (senhaAtualInserida.equals(senhaAtualDescriptografada)) {

                        String confirmaSenha = jTFConfirmarNovaSenha.getText();

                        if (confirmaSenha.equals(novaSenha)) {

                            Vigenere vigenere2 = new Vigenere(Criptografar.retirarAcento(chaveRegiSin),
                                    Criptografar.retirarAcento(confirmaSenha));
                            String senha = vigenere2.encriptar();
                            
                            int codUsuario = RegiSinUsuario.ccont.usuarioLogado.getCodUsuario();
                            
                            Usuario usuario = new Usuario(senha, codUsuario);

                            boolean resultado = RegiSinUsuario.ccont.alterarSenha(usuario);

                            if (resultado == true) {
                                JOptionPane.showMessageDialog(rootPane, "Senha alterada com sucesso");
                                TelaLogin telaLogin = new TelaLogin();
                                telaLogin.setVisible(true);
                                dispose();
                            } else {
                                jLAvisoErroAlteracao.setVisible(true);
                            }

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: senhas não correspondem");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: Senha atual incorreta");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: Confirme a nova senha");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: Informe a nova senha");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: Informe sua senha atual");
        }
    }//GEN-LAST:event_jBAlterarSenhaActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jTFSenhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSenhaAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSenhaAtualActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarSenha;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLAvisoErroAlteracao;
    private javax.swing.JLabel jLConfirmarSenha;
    private javax.swing.JLabel jLNovaSenha;
    private javax.swing.JLabel jLSenhaAtual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFConfirmarNovaSenha;
    private javax.swing.JTextField jTFNovaSenha;
    private javax.swing.JTextField jTFSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
