package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.TipoSinistro;

public class TelaCadastrarTipoSinistro extends javax.swing.JFrame {

    public TelaCadastrarTipoSinistro() {
        initComponents();
        setIcon();
        setTitle("Cadastrar Tipo Sinistro");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLAvisoCadastroTipoSinistro = new javax.swing.JLabel();
        jLNomeTipoSinistro = new javax.swing.JLabel();
        jTFNomeTipoSinistro = new javax.swing.JTextField();
        jBCadastrarTipoSinistro = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Tipo Sinistro");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 69, -1));

        jLAvisoCadastroTipoSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jLAvisoCadastroTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLAvisoCadastroTipoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLAvisoCadastroTipoSinistro.setText("Cadastro Tipo de Sinistro");
        jPanel1.add(jLAvisoCadastroTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 55, -1, -1));

        jLNomeTipoSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jLNomeTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNomeTipoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLNomeTipoSinistro.setText("Nome:");
        jPanel1.add(jLNomeTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 146, -1, -1));
        jPanel1.add(jTFNomeTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 150, 194, -1));

        jBCadastrarTipoSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCadastrarTipoSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarTipoSinistro.setText("Cadastrar");
        jBCadastrarTipoSinistro.setBorder(null);
        jBCadastrarTipoSinistro.setBorderPainted(false);
        jBCadastrarTipoSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarTipoSinistroActionPerformed(evt);
            }
        });
        jPanel1.add(jBCadastrarTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 294, 123, 50));

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
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 294, 123, 50));

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 0, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCadastrarTipoSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarTipoSinistroActionPerformed
        if (!jTFNomeTipoSinistro.getText().equals("")) {

            String nomeTipoSinistro = jTFNomeTipoSinistro.getText();

            TipoSinistro tipoSinistro = new TipoSinistro(nomeTipoSinistro);

            boolean resultado = RegiSinUsuario.ccont.tipoSinistroInserir(tipoSinistro);
            if (resultado == true) {
                JOptionPane.showMessageDialog(rootPane, "Tipo de Sinistro inserido com sucesso!");
                limpaCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: tipo de inistro não cadastrado");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome do tipo de sinistro");
        }
    }//GEN-LAST:event_jBCadastrarTipoSinistroActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    public void limpaCampos() {
        jTFNomeTipoSinistro.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarTipoSinistro;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLAvisoCadastroTipoSinistro;
    private javax.swing.JLabel jLNomeTipoSinistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNomeTipoSinistro;
    // End of variables declaration//GEN-END:variables
}
