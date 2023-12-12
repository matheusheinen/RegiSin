package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class TelaInserirCodigoEmail extends javax.swing.JFrame {

    private int codRedefinirCrip;
    private int codUsuarioE;
    TelaRedefinirSenha infoCodEmail;

    public TelaInserirCodigoEmail(int codigoRedefinirSenhaCriptografado, int codUsuarioCodEmail) {
        initComponents();
        setIcon();
        setTitle("Inserir Código Email");
        this.codRedefinirCrip = codigoRedefinirSenhaCriptografado;
        this.codUsuarioE = codUsuarioCodEmail;
    }

    public void recebendo(int codigoRedefinirSenhaCriptografado, int codUsuarioCodEmail) {

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBFechar = new javax.swing.JButton();
        jLInserirCodigoEmail = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jBEnviarCodigoInserido = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFTFCodigoInserido = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

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

        jLInserirCodigoEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLInserirCodigoEmail.setForeground(new java.awt.Color(143, 252, 104));
        jLInserirCodigoEmail.setText("Insira o código recebido por email");

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

        jBEnviarCodigoInserido.setBackground(new java.awt.Color(199, 253, 180));
        jBEnviarCodigoInserido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBEnviarCodigoInserido.setForeground(new java.awt.Color(72, 127, 52));
        jBEnviarCodigoInserido.setText("Avançar");
        jBEnviarCodigoInserido.setBorder(null);
        jBEnviarCodigoInserido.setBorderPainted(false);
        jBEnviarCodigoInserido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarCodigoInseridoActionPerformed(evt);
            }
        });

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

        try {
            jFTFCodigoInserido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCodigoInserido.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLInserirCodigoEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jBEnviarCodigoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFechar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jFTFCodigoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVoltar)
                .addGap(18, 18, 18)
                .addComponent(jLInserirCodigoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jFTFCodigoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jBEnviarCodigoInserido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
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

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        TelaRecuperarSenha telaRecuperarSenha = new TelaRecuperarSenha();
        telaRecuperarSenha.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBEnviarCodigoInseridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarCodigoInseridoActionPerformed
        if (!jFTFCodigoInserido.getText().equals("")) {

            String codigoInserido = jFTFCodigoInserido.getText();
            String codRedefinirString = Integer.toString(codRedefinirCrip);
            if (codigoInserido.equals(codRedefinirString)) {

                infoCodEmail = new TelaRedefinirSenha(codUsuarioE);
                infoCodEmail.recebendo(codUsuarioE);
                TelaRedefinirSenha telaRedefinirSenha = new TelaRedefinirSenha(codUsuarioE);
                telaRedefinirSenha.setVisible(true);
                dispose();

            } else {

                JOptionPane.showMessageDialog(rootPane, "Erro: Código de verificação incorreto");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: Insira o código recebido por email");
        }
    }//GEN-LAST:event_jBEnviarCodigoInseridoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    public void limpaCampos() {
        jFTFCodigoInserido.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEnviarCodigoInserido;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JFormattedTextField jFTFCodigoInserido;
    private javax.swing.JLabel jLInserirCodigoEmail;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
