package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelDominio.Evento;

public class TelaDetalhesEvento extends javax.swing.JFrame {

    private Evento evento;

    public TelaDetalhesEvento(Evento evento) {
        initComponents();
        setIcon();

        jLShowNomeEvento.setText(evento.getNomeEvento());
        jLShowDataEvento.setText(evento.getDataEvento());
        jLShowCidadeEvento.setText(evento.getCidadeEvento());
        jTAShowDescricaoEvento.setText(evento.getDescricaoEvento());

        this.evento = evento;
        setTitle("Detalhes Evento");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBFechar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLNomeEvento = new javax.swing.JLabel();
        jLDataEvento = new javax.swing.JLabel();
        jLCidadeEvento = new javax.swing.JLabel();
        jLDescricaoEvento = new javax.swing.JLabel();
        jLMensagemInformacoesEvento = new javax.swing.JLabel();
        jLShowNomeEvento = new javax.swing.JLabel();
        jLShowDataEvento = new javax.swing.JLabel();
        jLShowCidadeEvento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAShowDescricaoEvento = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setForeground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 0, -1, -1));

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 43, -1, -1));

        jLNomeEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLNomeEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLNomeEvento.setText("Evento:");
        jPanel1.add(jLNomeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLDataEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDataEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLDataEvento.setText("Data:");
        jPanel1.add(jLDataEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLCidadeEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLCidadeEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLCidadeEvento.setText("Cidade:");
        jPanel1.add(jLCidadeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLDescricaoEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDescricaoEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLDescricaoEvento.setText("Descrição:");
        jPanel1.add(jLDescricaoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 341, -1, -1));

        jLMensagemInformacoesEvento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLMensagemInformacoesEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLMensagemInformacoesEvento.setText("Informações do evento:");
        jPanel1.add(jLMensagemInformacoesEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 43, -1, -1));

        jLShowNomeEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLShowNomeEvento.setForeground(new java.awt.Color(143, 252, 104));
        jLShowNomeEvento.setText("jLabel1");
        jPanel1.add(jLShowNomeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLShowDataEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLShowDataEvento.setForeground(new java.awt.Color(143, 252, 104));
        jLShowDataEvento.setText("jLabel2");
        jPanel1.add(jLShowDataEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLShowCidadeEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLShowCidadeEvento.setForeground(new java.awt.Color(143, 252, 104));
        jLShowCidadeEvento.setText("jLabel3");
        jPanel1.add(jLShowCidadeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jTAShowDescricaoEvento.setEditable(false);
        jTAShowDescricaoEvento.setBackground(new java.awt.Color(199, 253, 180));
        jTAShowDescricaoEvento.setColumns(20);
        jTAShowDescricaoEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTAShowDescricaoEvento.setForeground(new java.awt.Color(72, 127, 52));
        jTAShowDescricaoEvento.setLineWrap(true);
        jTAShowDescricaoEvento.setRows(5);
        jTAShowDescricaoEvento.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTAShowDescricaoEvento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 330, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaVisualizacaoEventos telaVisualizacaoEventos = new TelaVisualizacaoEventos();
        telaVisualizacaoEventos.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLCidadeEvento;
    private javax.swing.JLabel jLDataEvento;
    private javax.swing.JLabel jLDescricaoEvento;
    private javax.swing.JLabel jLMensagemInformacoesEvento;
    private javax.swing.JLabel jLNomeEvento;
    private javax.swing.JLabel jLShowCidadeEvento;
    private javax.swing.JLabel jLShowDataEvento;
    private javax.swing.JLabel jLShowNomeEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAShowDescricaoEvento;
    // End of variables declaration//GEN-END:variables
}
