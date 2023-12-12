package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelDominio.Evento;
import view.tablemodel.EventoTableModel;

public class TelaVisualizacaoEventos extends javax.swing.JFrame {

    private EventoTableModel eventoTableModel;

    public TelaVisualizacaoEventos() {
        initComponents();
        setIcon();
        atualizaTabela();
        setTitle("Visualização Eventos");
        jLAvisoDataFormatacao.setVisible(false);
        jTableEventos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTableEventos.getTableHeader().setOpaque(false);
        jTableEventos.getTableHeader().setBackground(new Color(143, 252, 104));
        jTableEventos.getTableHeader().setForeground(Color.DARK_GRAY);
        jTableEventos.setRowHeight(25);

    }

    private void atualizaTabela() {

        if (jCBFiltroPesquisa.getSelectedIndex() == 0) {
            ArrayList<Evento> listaEventos = RegiSinUsuario.ccont.eventoLista();
            eventoTableModel = new EventoTableModel(listaEventos);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 1) {
            String nomeEventoFiltro = jTFFiltro.getText();
            ArrayList<Evento> listaEventos = RegiSinUsuario.ccont.eventoListaNome(nomeEventoFiltro);
            eventoTableModel = new EventoTableModel(listaEventos);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 2) {
            jLAvisoDataFormatacao.setVisible(true);
            String dataEventoFiltro = jTFFiltro.getText();
            ArrayList<Evento> listaEventos = RegiSinUsuario.ccont.eventoListaData(dataEventoFiltro);
            eventoTableModel = new EventoTableModel(listaEventos);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 3) {
            String cidadeEventoFiltro = jTFFiltro.getText();
            ArrayList<Evento> listaEventos = RegiSinUsuario.ccont.eventoListaCidade(cidadeEventoFiltro);
            eventoTableModel = new EventoTableModel(listaEventos);
        }
        jTableEventos.setModel(eventoTableModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPFundo = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLHeaderEvento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jBFechar = new javax.swing.JButton();
        jCBFiltroPesquisa = new javax.swing.JComboBox<>();
        jLAvisoDataFormatacao = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setUndecorated(true);
        setResizable(false);

        jPFundo.setBackground(new java.awt.Color(72, 127, 52));
        jPFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPFundo.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 32, 79, -1));

        jLHeaderEvento.setBackground(new java.awt.Color(199, 253, 180));
        jLHeaderEvento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLHeaderEvento.setForeground(new java.awt.Color(199, 253, 180));
        jLHeaderEvento.setText("Eventos");
        jPFundo.add(jLHeaderEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 28, -1, -1));

        jLabel2.setBackground(new java.awt.Color(199, 253, 180));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 253, 180));
        jLabel2.setText("Campo de Busca:");
        jPFundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 108, -1, -1));

        jTFFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFiltroKeyReleased(evt);
            }
        });
        jPFundo.add(jTFFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 109, 216, -1));

        jTableEventos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Evento", "Número de Sinistros", "Data", "Cidade", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEventos);

        jPFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 629, -1));

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
        jPFundo.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 0, 48, 26));

        jCBFiltroPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Evento", "Data", "Cidade" }));
        jPFundo.add(jCBFiltroPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 110, 128, -1));

        jLAvisoDataFormatacao.setForeground(new java.awt.Color(255, 255, 51));
        jLAvisoDataFormatacao.setText("Ex: 03/12/2004");
        jPFundo.add(jLAvisoDataFormatacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 86, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jTableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            Evento evento = eventoTableModel.getEvento(jTableEventos.getSelectedRow());

            TelaDetalhesEvento telaDetalhesEvento = new TelaDetalhesEvento(evento);
            telaDetalhesEvento.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableEventosMouseClicked

    private void jTFFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltroKeyReleased
        atualizaTabela();
    }//GEN-LAST:event_jTFFiltroKeyReleased

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCBFiltroPesquisa;
    private javax.swing.JLabel jLAvisoDataFormatacao;
    private javax.swing.JLabel jLHeaderEvento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTable jTableEventos;
    // End of variables declaration//GEN-END:variables
}
