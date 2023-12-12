package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelDominio.Sinistro;
import view.tablemodel.SinistroTableModel;

public class TelaVisualizacaoSinistros extends javax.swing.JFrame {

    private SinistroTableModel sinistroTableModel;

    public TelaVisualizacaoSinistros() {
        initComponents();
        setIcon();
        jLAlertaDataFormatacao.setVisible(false);
        atualizaTabela();
        setTitle("Visualização Sinistros");

        jTableSinistros.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTableSinistros.getTableHeader().setOpaque(false);
        jTableSinistros.getTableHeader().setBackground(new Color(143, 252, 104));
        jTableSinistros.getTableHeader().setForeground(Color.DARK_GRAY);
        jTableSinistros.setRowHeight(25);
    }

    private void atualizaTabela() {

        if (jCBFiltroPesquisa.getSelectedIndex() == 0) {
            String a = "Teste";
            ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaDesktop(a);
            sinistroTableModel = new SinistroTableModel(listaSinistro);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 1) {
            String vitimaSinistroFiltro = jTFFiltro.getText();
            ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaVitima(vitimaSinistroFiltro);
            sinistroTableModel = new SinistroTableModel(listaSinistro);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 2) {
            jLAlertaDataFormatacao.setVisible(true);
            String data = jTFFiltro.getText();
            ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaData(data);
            sinistroTableModel = new SinistroTableModel(listaSinistro);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 3) {
            String cidade = jTFFiltro.getText();
            ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaCidade(cidade);
            sinistroTableModel = new SinistroTableModel(listaSinistro);
        } else if (jCBFiltroPesquisa.getSelectedIndex() == 4) {
            String situacao = jTFFiltro.getText();
            ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaSituacao(situacao);
            sinistroTableModel = new SinistroTableModel(listaSinistro);
        }

        jTableSinistros.setModel(sinistroTableModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jLSinistroHeader = new javax.swing.JLabel();
        jLCampoDeBusca = new javax.swing.JLabel();
        jTFFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSinistros = new javax.swing.JTable();
        jBFechar = new javax.swing.JButton();
        jCBFiltroPesquisa = new javax.swing.JComboBox<>();
        jLAlertaDataFormatacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

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

        jLSinistroHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLSinistroHeader.setForeground(new java.awt.Color(199, 253, 180));
        jLSinistroHeader.setText("Sinistro");

        jLCampoDeBusca.setBackground(new java.awt.Color(199, 253, 180));
        jLCampoDeBusca.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLCampoDeBusca.setForeground(new java.awt.Color(199, 253, 180));
        jLCampoDeBusca.setText("Campo de busca:");

        jTFFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFiltroKeyReleased(evt);
            }
        });

        jTableSinistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vítima", "Evento", "Data", "Cidade", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableSinistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSinistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSinistros);

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

        jCBFiltroPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Vítima", "Data", "Cidade", "Situação" }));

        jLAlertaDataFormatacao.setBackground(new java.awt.Color(255, 255, 51));
        jLAlertaDataFormatacao.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLAlertaDataFormatacao.setForeground(new java.awt.Color(255, 255, 51));
        jLAlertaDataFormatacao.setText("Ex: 03/12/2004");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLCampoDeBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBFiltroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAlertaDataFormatacao)
                            .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLSinistroHeader)
                        .addGap(231, 231, 231)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar)
                    .addComponent(jLSinistroHeader))
                .addGap(44, 44, 44)
                .addComponent(jLAlertaDataFormatacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCampoDeBusca)
                    .addComponent(jCBFiltroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jTableSinistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSinistrosMouseClicked

        if (evt.getClickCount() == 2) {
            Sinistro sinistro = sinistroTableModel.getSinistro(jTableSinistros.getSelectedRow());

            TelaDetalhesSinistro telaDetalhesSinistro = new TelaDetalhesSinistro(sinistro);
            telaDetalhesSinistro.setVisible(true);
            dispose();

        }

    }//GEN-LAST:event_jTableSinistrosMouseClicked

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
    private javax.swing.JLabel jLAlertaDataFormatacao;
    private javax.swing.JLabel jLCampoDeBusca;
    private javax.swing.JLabel jLSinistroHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTable jTableSinistros;
    // End of variables declaration//GEN-END:variables
}
