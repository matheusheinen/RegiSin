package view;

import java.awt.Toolkit;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import java.util.Properties;
import modelDominio.Usuario;
import view.util.Criptografar;
import view.util.Vigenere;

public class TelaRecuperarSenha extends javax.swing.JFrame {

    private Usuario usuario;
    TelaInserirCodigoEmail infoCodEmail;

    public TelaRecuperarSenha() {
        initComponents();
        setIcon();

        setTitle("Recuperar senha");
        String emailUsuarioRecuperandoSenha = jTFEmailInserido.getText();
    }

    private void enviarEmail() {

        Random gerador = new Random();
        int codigoRedefinir = (gerador.nextInt(999999) + 10000);

        String remetente = "regisin2023@gmail.com";
        String senhaRemetente = new String("exlp zgjp zzjr mfvn");
        String destinatario = jTFEmailInserido.getText();
        String assunto = "Recuperação de senha RegiSin";
        String mensagem = "Foi solicitada uma alteração de senha para seu usuário."
                + "Seu código de redefinição é o seguinte: " + codigoRedefinir;

        System.out.println(senhaRemetente);

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        //properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.ssl.enable", "true");

        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente, senhaRemetente);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remetente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(assunto);
            message.setText(mensagem);

            Transport.send(message);

            JOptionPane.showMessageDialog(this, "E-mail enviado com sucesso!");
            Usuario dadosUsuarioEmail = RegiSinUsuario.ccont.buscarEmailUsuario(destinatario);
            int codUsuarioCodEmail = dadosUsuarioEmail.getCodUsuarioDadosEmail();

            infoCodEmail = new TelaInserirCodigoEmail(codigoRedefinir, codUsuarioCodEmail);
            infoCodEmail.recebendo(codigoRedefinir, codUsuarioCodEmail);

            TelaInserirCodigoEmail telaInserirCodigoEmail = new TelaInserirCodigoEmail(codigoRedefinir, codUsuarioCodEmail);
            telaInserirCodigoEmail.setVisible(true);
            dispose();

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar e-mail: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBFechar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLRecuperacaoSenha = new javax.swing.JLabel();
        jBEnviarEmail = new javax.swing.JButton();
        jLEmailInserido = new javax.swing.JLabel();
        jTFEmailInserido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 0, 31, -1));

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
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 31, 57, -1));

        jLRecuperacaoSenha.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLRecuperacaoSenha.setForeground(new java.awt.Color(199, 253, 180));
        jLRecuperacaoSenha.setText("Recuperação de senha");
        jPanel1.add(jLRecuperacaoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, -1, -1));

        jBEnviarEmail.setBackground(new java.awt.Color(199, 253, 180));
        jBEnviarEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBEnviarEmail.setForeground(new java.awt.Color(72, 127, 52));
        jBEnviarEmail.setText("Enviar Código");
        jBEnviarEmail.setToolTipText("");
        jBEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jBEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 255, 181, 64));

        jLEmailInserido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLEmailInserido.setForeground(new java.awt.Color(143, 252, 104));
        jLEmailInserido.setText("Insira seu email:");
        jPanel1.add(jLEmailInserido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        jPanel1.add(jTFEmailInserido, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 195, 253, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarEmailActionPerformed
        if (!jLEmailInserido.getText().equals("")) {
            String emailUsuarioBuscar = jTFEmailInserido.getText();
// VERIFICANDO SE EXISTE ALGUM USUÁRIO CADASTRADO COM ESSE EMAIL NO BANCO
            Usuario dadosUsuarioEmail = RegiSinUsuario.ccont.buscarEmailUsuario(emailUsuarioBuscar);

            if (dadosUsuarioEmail != null) {
               // String retornoEmailInserido = dadosUsuarioEmail.getEmailUsuarioDadosEmail();
// SE EXISTE ALGUM USUÁRIO COM ESSE EMAIL, CHAMAMOS A FUNÇÃO ENVIAR EMAIL
                enviarEmail();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: Nenhum usuário encontrado com este email");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: Informe seu email");
        }

    }//GEN-LAST:event_jBEnviarEmailActionPerformed
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEnviarEmail;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLEmailInserido;
    private javax.swing.JLabel jLRecuperacaoSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFEmailInserido;
    // End of variables declaration//GEN-END:variables
}
