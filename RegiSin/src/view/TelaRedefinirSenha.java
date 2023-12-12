package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Usuario;
import view.util.Criptografar;
import view.util.Vigenere;

public class TelaRedefinirSenha extends javax.swing.JFrame {

    private int codUsuarioEmailFinal;
    private Usuario usuario;

    public TelaRedefinirSenha(int codUsuarioCodE) {
        initComponents();
        setIcon();
        this.codUsuarioEmailFinal = codUsuarioCodE;
        jLAvisoErroAlteracao.setVisible(false);
        setTitle("Redefinir Senha");
    }

    public void recebendo(int codUsuarioCodE) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLInserirNovaSenha = new javax.swing.JLabel();
        jLNovaSenha = new javax.swing.JLabel();
        jLConfirmaNovaSenha = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAlterarSenha = new javax.swing.JButton();
        jTFNovaSenha = new javax.swing.JTextField();
        jLAvisoErroAlteracao = new javax.swing.JLabel();
        jTFConfirmaNovaSenha = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setForeground(new java.awt.Color(72, 127, 52));

        jLInserirNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLInserirNovaSenha.setForeground(new java.awt.Color(143, 252, 104));
        jLInserirNovaSenha.setText("Insira sua nova senha");

        jLNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNovaSenha.setForeground(new java.awt.Color(199, 253, 180));
        jLNovaSenha.setText("Nova Senha:");

        jLConfirmaNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLConfirmaNovaSenha.setForeground(new java.awt.Color(199, 253, 180));
        jLConfirmaNovaSenha.setText("Confirme a nova senha:");

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
        jBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);

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

        jLAvisoErroAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAvisoErroAlteracao.setForeground(new java.awt.Color(255, 255, 51));
        jLAvisoErroAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/X.png"))); // NOI18N
        jLAvisoErroAlteracao.setText("Erro na alteração de senha!");

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
                        .addGap(110, 110, 110)
                        .addComponent(jLInserirNovaSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jBAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLConfirmaNovaSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNovaSenha)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNovaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTFConfirmaNovaSenha))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAvisoErroAlteracao)
                .addGap(5, 5, 5)
                .addComponent(jLInserirNovaSenha)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNovaSenha)
                    .addComponent(jTFNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConfirmaNovaSenha)
                    .addComponent(jTFConfirmaNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        TelaRecuperarSenha telaRecuperarSenha = new TelaRecuperarSenha();
        telaRecuperarSenha.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarSenhaActionPerformed

        if (!jTFNovaSenha.getText().equals("")) {
            if (!jTFConfirmaNovaSenha.getText().equals("")) {
                String senhaAtual;

                String chaveRegiSin = "AZ!*regisin2023";

                String novaSenha = jTFNovaSenha.getText();

                String confirmaSenha = jTFConfirmaNovaSenha.getText();

                if (confirmaSenha.equals(novaSenha)) {

                    Vigenere vigenere2 = new Vigenere(Criptografar.retirarAcento(chaveRegiSin),
                            Criptografar.retirarAcento(confirmaSenha));
                    String senha = vigenere2.encriptar();

                    int codUsuario = codUsuarioEmailFinal;
                    
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
                JOptionPane.showMessageDialog(rootPane, "Erro: Confirme a nova senha");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: Informe a nova senha");
        }

    }//GEN-LAST:event_jBAlterarSenhaActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    public void limpaCampos() {
        jTFNovaSenha.setText("");
        jTFConfirmaNovaSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarSenha;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLAvisoErroAlteracao;
    private javax.swing.JLabel jLConfirmaNovaSenha;
    private javax.swing.JLabel jLInserirNovaSenha;
    private javax.swing.JLabel jLNovaSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFConfirmaNovaSenha;
    private javax.swing.JTextField jTFNovaSenha;
    // End of variables declaration//GEN-END:variables
}
