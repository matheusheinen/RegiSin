package view;

import java.awt.Toolkit;

public class TelaCadastrarUsuario extends javax.swing.JFrame {

    public TelaCadastrarUsuario() {
        initComponents();
        setIcon();
        setTitle("Cadastro Usuário");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBCadastrarPessoa = new javax.swing.JButton();
        jBCadastrarEntidade = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLDuvida = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

        jBCadastrarPessoa.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarPessoa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jBCadastrarPessoa.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconPessoa.png"))); // NOI18N
        jBCadastrarPessoa.setText("Pessoa");
        jBCadastrarPessoa.setBorder(null);
        jBCadastrarPessoa.setBorderPainted(false);
        jBCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarPessoaActionPerformed(evt);
            }
        });

        jBCadastrarEntidade.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarEntidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jBCadastrarEntidade.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconEntidade.png"))); // NOI18N
        jBCadastrarEntidade.setText("Entidade");
        jBCadastrarEntidade.setBorder(null);
        jBCadastrarEntidade.setBorderPainted(false);
        jBCadastrarEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarEntidadeActionPerformed(evt);
            }
        });

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jLDuvida.setBackground(new java.awt.Color(199, 253, 180));
        jLDuvida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDuvida.setForeground(new java.awt.Color(199, 253, 180));
        jLDuvida.setText("Que tipo de cadastro deseja realizar?");

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDuvida)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCadastrarEntidade, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jBCadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLDuvida)
                .addGap(54, 54, 54)
                .addComponent(jBCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCadastrarEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarPessoaActionPerformed
        TelaCadastrarPessoa telaCadastrarPessoa = new TelaCadastrarPessoa();
        telaCadastrarPessoa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBCadastrarPessoaActionPerformed

    private void jBCadastrarEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarEntidadeActionPerformed
        TelaCadastrarEntidade telaCadastrarEntidade = new TelaCadastrarEntidade();
        telaCadastrarEntidade.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBCadastrarEntidadeActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarEntidade;
    private javax.swing.JButton jBCadastrarPessoa;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLDuvida;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
