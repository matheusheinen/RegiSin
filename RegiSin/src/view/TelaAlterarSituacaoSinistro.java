package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Sinistro;

public class TelaAlterarSituacaoSinistro extends javax.swing.JFrame {

    private Sinistro sinistro;

    public TelaAlterarSituacaoSinistro(Sinistro sinistro) {
        initComponents();
        setIcon();
        this.sinistro = sinistro;
        setTitle("Alterar Situação Sinistro");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLSelecioneASituacaoAtualSinistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLSituacoesSinistro = new javax.swing.JList<>();
        jBAlterarSituacaoSinistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

        jLSelecioneASituacaoAtualSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jLSelecioneASituacaoAtualSinistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLSelecioneASituacaoAtualSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLSelecioneASituacaoAtualSinistro.setText("Situação atual do sinistro");

        jLSituacoesSinistro.setBackground(new java.awt.Color(143, 252, 104));
        jLSituacoesSinistro.setBorder(null);
        jLSituacoesSinistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLSituacoesSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jLSituacoesSinistro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Em Análise", "Em Atendimento", "Concluído", "Cancelado" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLSituacoesSinistro);

        jBAlterarSituacaoSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jBAlterarSituacaoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBAlterarSituacaoSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jBAlterarSituacaoSinistro.setText("Alterar");
        jBAlterarSituacaoSinistro.setBorder(null);
        jBAlterarSituacaoSinistro.setBorderPainted(false);
        jBAlterarSituacaoSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarSituacaoSinistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLSelecioneASituacaoAtualSinistro)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jBAlterarSituacaoSinistro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLSelecioneASituacaoAtualSinistro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jBAlterarSituacaoSinistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void jBAlterarSituacaoSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarSituacaoSinistroActionPerformed

        String situacaoSinistroAtual = sinistro.getSituacaoSinistro();
        String situacaoSinistro;
        int linhaSelecionada = jLSituacoesSinistro.getSelectedIndex();

        if (linhaSelecionada == 0) {
            situacaoSinistro = "Em Análise";
        } else if (linhaSelecionada == 1) {
            situacaoSinistro = "Em Atendimento";
        } else if (linhaSelecionada == 2) {
            situacaoSinistro = "Concluído";
        } else {
            situacaoSinistro = "Cancelado";
        }

        int codSinistro = sinistro.getCodSinistro();
        boolean resultado = RegiSinUsuario.ccont.alterarSituacaoSinistro(codSinistro, situacaoSinistro);

        if (resultado == true) {
            JOptionPane.showMessageDialog(rootPane, "Situação de sinistro alterada com sucesso");
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: Não foi possível alterar o status do sinistro");
        }



    }//GEN-LAST:event_jBAlterarSituacaoSinistroActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarSituacaoSinistro;
    private javax.swing.JLabel jLSelecioneASituacaoAtualSinistro;
    private javax.swing.JList<String> jLSituacoesSinistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
