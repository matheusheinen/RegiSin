package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Usuario;
import view.RegiSinUsuario;
import view.util.Criptografar;
import view.util.Vigenere;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        jLAviso.setVisible(false);
        jBEsqueciMinhaSenha.setVisible(false);
        jLCorrige.setText("   ");
        setIcon();
        setTitle("Tela Login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLAviso = new javax.swing.JLabel();
        jBEntrar = new javax.swing.JButton();
        jLEmail = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jPFSenhaUsuario = new javax.swing.JPasswordField();
        jTFEmail = new javax.swing.JTextField();
        jBFechar = new javax.swing.JButton();
        jBEsqueciMinhaSenha = new javax.swing.JButton();
        jLCorrige = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(72, 127, 52));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/LogoRegiSin.png"))); // NOI18N

        jLAviso.setBackground(new java.awt.Color(255, 51, 0));
        jLAviso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLAviso.setForeground(new java.awt.Color(255, 255, 51));
        jLAviso.setText("Usuário ou senha inválidos!");

        jBEntrar.setBackground(new java.awt.Color(199, 253, 180));
        jBEntrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(72, 127, 52));
        jBEntrar.setText("Entrar");
        jBEntrar.setBorder(null);
        jBEntrar.setBorderPainted(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jLEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLEmail.setText("Email:");

        jLSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLSenha.setText("Senha:");

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setToolTipText("");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jPFSenhaUsuario.setBackground(new java.awt.Color(199, 253, 180));

        jTFEmail.setBackground(new java.awt.Color(199, 253, 180));
        jTFEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setToolTipText("");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBEsqueciMinhaSenha.setBackground(new java.awt.Color(255, 255, 51));
        jBEsqueciMinhaSenha.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jBEsqueciMinhaSenha.setForeground(new java.awt.Color(102, 102, 255));
        jBEsqueciMinhaSenha.setText("Esqueci minha senha");
        jBEsqueciMinhaSenha.setBorder(null);
        jBEsqueciMinhaSenha.setBorderPainted(false);
        jBEsqueciMinhaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEsqueciMinhaSenhaActionPerformed(evt);
            }
        });

        jLCorrige.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLCorrige.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLEmail)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPFSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLSenha))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLAviso))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLCorrige)
                        .addGap(147, 147, 147)
                        .addComponent(jBEsqueciMinhaSenha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPFSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLSenha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLAviso)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEsqueciMinhaSenha)
                    .addComponent(jLCorrige))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(520, 288));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        
        //Validação das informações preenchidas nos campos
        String senhaDescriptografada = new String(jPFSenhaUsuario.getPassword());
        if (!jTFEmail.getText().equals("")) {
            if (!senhaDescriptografada.equals("")) {
                
                //Criptografando a senha
                String chaveRegiSin = "AZ!*regisin2023";

                Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveRegiSin),
                        Criptografar.retirarAcento(senhaDescriptografada));
                String senha = vigenere.encriptar();

                //Obtendo as informações preenchidas nos campos
                String login = jTFEmail.getText();

                //Criando o objeto da classe do usuário (com login e senha)
                Usuario usuario = new Usuario(login, senha);
                
                //Chamando o ConexaoController solicitando a efetuação do login para o servidor
                Usuario usuarioLogado = RegiSinUsuario.ccont.efetuarLogin(usuario);

                //Validando o usuário recebido
                if (usuarioLogado != null) {
                    //Caso o usuário seja cliente:
                    if (usuarioLogado.getTipo() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Erro: Você não tem permissão de acesso");
                        RegiSinUsuario.ccont.usuarioLogado = null;
                        TelaLogin telaLogin = new TelaLogin();
                        telaLogin.setVisible(true);
                        dispose();
                        //Caso seja administrador ou entidade:
                    } else {
                        //Instanciando o usuário logado
                        RegiSinUsuario.ccont.usuarioLogado = usuarioLogado;
                        //Chamando a tela principal
                        TelaPrincipal telaPrincipal = new TelaPrincipal();
                        telaPrincipal.setVisible(true);
                        dispose();
                    }
                    //Caso o usuário seja nulo:
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: usuário e senha inválidos.");
                    jLAviso.setVisible(true);
                    jBEsqueciMinhaSenha.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe a senha.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o usuário.");
        }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jBEsqueciMinhaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEsqueciMinhaSenhaActionPerformed
        TelaRecuperarSenha telaRecuperarSenha = new TelaRecuperarSenha();
        telaRecuperarSenha.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBEsqueciMinhaSenhaActionPerformed

    public void limpaCampos() {
        jTFEmail.setText("");
        jPFSenhaUsuario.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBEsqueciMinhaSenha;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLAviso;
    private javax.swing.JLabel jLCorrige;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPFSenhaUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFEmail;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }
}
