package view;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelDominio.Evento;
import modelDominio.Usuario;

public class TelaCadastrarEvento extends javax.swing.JFrame {

    public TelaCadastrarEvento() {
        initComponents();
        setIcon();
        setTitle("Cadastro de Evento");

        jLAvisoErroInsercao.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLTipoEvento = new javax.swing.JLabel();
        jLCidadeEvento = new javax.swing.JLabel();
        jLDataEvento = new javax.swing.JLabel();
        jLDescricaoEvento = new javax.swing.JLabel();
        jTFNomeEvento = new javax.swing.JTextField();
        jTFCidadeEvento = new javax.swing.JTextField();
        jBCadastrarEvento = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jTFDataEvento = new javax.swing.JFormattedTextField();
        jLAvisoErroInsercao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricaoEvento = new javax.swing.JTextArea();
        jBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBVoltar.setBackground(new java.awt.Color(199, 253, 180));
        jBVoltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBVoltar.setForeground(new java.awt.Color(72, 127, 52));
        jBVoltar.setText("Voltar");
        jBVoltar.setBorder(null);
        jBVoltar.setBorderPainted(false);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, -1));

        jLTipoEvento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLTipoEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLTipoEvento.setText("Evento:");
        jPanel1.add(jLTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLCidadeEvento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLCidadeEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLCidadeEvento.setText("Cidade:");
        jPanel1.add(jLCidadeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLDataEvento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLDataEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLDataEvento.setText("Data:");
        jPanel1.add(jLDataEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLDescricaoEvento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLDescricaoEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLDescricaoEvento.setText("Descrição:");
        jPanel1.add(jLDescricaoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jTFNomeEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeEventoActionPerformed(evt);
            }
        });
        jPanel1.add(jTFNomeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 192, -1));
        jPanel1.add(jTFCidadeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 192, -1));

        jBCadastrarEvento.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarEvento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBCadastrarEvento.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarEvento.setText("Cadastrar");
        jBCadastrarEvento.setBorder(null);
        jBCadastrarEvento.setBorderPainted(false);
        jBCadastrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(jBCadastrarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 120, 40));

        jBCancelar.setBackground(new java.awt.Color(199, 253, 180));
        jBCancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(72, 127, 52));
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 110, 40));

        try {
            jTFDataEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTFDataEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 80, -1));

        jLAvisoErroInsercao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLAvisoErroInsercao.setForeground(new java.awt.Color(255, 255, 255));
        jLAvisoErroInsercao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/X.png"))); // NOI18N
        jLAvisoErroInsercao.setText("Erro no Cadastro de Evento!");
        jPanel1.add(jLAvisoErroInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jTADescricaoEvento.setColumns(20);
        jTADescricaoEvento.setLineWrap(true);
        jTADescricaoEvento.setRows(5);
        jScrollPane1.setViewportView(jTADescricaoEvento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 120));

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFNomeEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeEventoActionPerformed

    }//GEN-LAST:event_jTFNomeEventoActionPerformed

    private void jBCadastrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarEventoActionPerformed
        // verificando se o usuário informou os dados do evento

        if (!jTFNomeEvento.getText().equals("")) {
            if (!jTFCidadeEvento.getText().equals("")) {
                if (!jTFDataEvento.getText().equals("")) {
                    if (!jTADescricaoEvento.getText().equals("")) {

                        String nomeEvento = jTFNomeEvento.getText();
                        String cidadeEvento = jTFCidadeEvento.getText();
                        String descricaoEvento = jTADescricaoEvento.getText();
                        String dataEvento = jTFDataEvento.getText();
                        Evento evento = new Evento(nomeEvento, cidadeEvento, dataEvento, descricaoEvento, RegiSinUsuario.ccont.usuarioLogado);

                        boolean resultado = RegiSinUsuario.ccont.eventoRegistrar(evento);

                        if (resultado == true) {
                            JOptionPane.showMessageDialog(rootPane, "Evento cadastrado com sucesso!");
                            TelaPrincipal telaPrincipal = new TelaPrincipal();
                            telaPrincipal.setVisible(true);
                            dispose();
                        } else {
                            jLAvisoErroInsercao.setVisible(true);
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe uma descrição para o evento");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe a data do evento");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe a cidade do evento");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome do evento");
        }
    }//GEN-LAST:event_jBCadastrarEventoActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    public void limpaCampos() {
        jTFNomeEvento.setText("");
        jTFCidadeEvento.setText("");
        jTFDataEvento.setText("");
        jTADescricaoEvento.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarEvento;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLAvisoErroInsercao;
    private javax.swing.JLabel jLCidadeEvento;
    private javax.swing.JLabel jLDataEvento;
    private javax.swing.JLabel jLDescricaoEvento;
    private javax.swing.JLabel jLTipoEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescricaoEvento;
    private javax.swing.JTextField jTFCidadeEvento;
    private javax.swing.JFormattedTextField jTFDataEvento;
    private javax.swing.JTextField jTFNomeEvento;
    // End of variables declaration//GEN-END:variables
}
