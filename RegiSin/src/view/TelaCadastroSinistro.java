package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelDominio.Evento;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import view.util.ComboBoxEvento;
import view.util.ComboBoxTipoSinistro;
import view.util.Imagem;

public class TelaCadastroSinistro extends javax.swing.JFrame {

    Imagem imagem = null;

    public TelaCadastroSinistro() {
        initComponents();

        setIcon();
        setTitle("Cadastro de Sinistro");
        preencheComboBoxEvento();
        preencheComboBoxTipoSinistro();

        jLShowImagem.setVisible(false);
        jLAvisoErroInsercao.setVisible(false);

    }

    public void preencheComboBoxEvento() {
        ArrayList<Evento> listaEvento = RegiSinUsuario.ccont.eventoLista();
        ComboBoxEvento.preencheComboBoxEvento(-1, jCBEventoSinistro, listaEvento, false);
    }

    public void preencheComboBoxTipoSinistro() {
        ArrayList<TipoSinistro> listaTipoSinistro = RegiSinUsuario.ccont.tipoSinistroLista();
        ComboBoxTipoSinistro.preencheComboBoxTipoSinistro(-1, jCBTipoSinistro, listaTipoSinistro, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jFCImagemSinistro = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jBCadastrarSinistro = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jLMensagemCadastroSinistro = new javax.swing.JLabel();
        jLTipoSinistro = new javax.swing.JLabel();
        jLDataSinistro = new javax.swing.JLabel();
        jLNecessidadesSinistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTANecessidadesSinistros = new javax.swing.JTextArea();
        jCBTipoSinistro = new javax.swing.JComboBox<>();
        jFTFDataSinistro = new javax.swing.JFormattedTextField();
        jLEventoSinistro = new javax.swing.JLabel();
        jCBEventoSinistro = new javax.swing.JComboBox<>();
        jLCidadeSinistro = new javax.swing.JLabel();
        jLEnderecoSinistro = new javax.swing.JLabel();
        jTFCidadeSinistro = new javax.swing.JTextField();
        jTFEnderecoSinistro = new javax.swing.JTextField();
        jLAvisoErroInsercao = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jBCarregarImagem = new javax.swing.JButton();
        jLShowImagem = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCadastrarSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jBCadastrarSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCadastrarSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jBCadastrarSinistro.setText("Cadastrar");
        jBCadastrarSinistro.setBorder(null);
        jBCadastrarSinistro.setBorderPainted(false);
        jBCadastrarSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarSinistroActionPerformed(evt);
            }
        });
        jPanel1.add(jBCadastrarSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 517, 150, 47));

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
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 517, 150, 47));

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
        jPanel1.add(jBVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 81, 33));

        jLMensagemCadastroSinistro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLMensagemCadastroSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLMensagemCadastroSinistro.setText("Cadastrar Sinistro");
        jPanel1.add(jLMensagemCadastroSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 57, -1, -1));

        jLTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLTipoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLTipoSinistro.setText("Tipo:");
        jPanel1.add(jLTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 302, -1, -1));

        jLDataSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLDataSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLDataSinistro.setText("Data do ocorrido:");
        jPanel1.add(jLDataSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, -1, -1));

        jLNecessidadesSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNecessidadesSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLNecessidadesSinistro.setText("Necessidades:");
        jPanel1.add(jLNecessidadesSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 389, -1, -1));

        jTANecessidadesSinistros.setColumns(20);
        jTANecessidadesSinistros.setLineWrap(true);
        jTANecessidadesSinistros.setRows(5);
        jTANecessidadesSinistros.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTANecessidadesSinistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 389, -1, -1));

        jCBTipoSinistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", " " }));
        jCBTipoSinistro.setBorder(null);
        jPanel1.add(jCBTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 307, -1, -1));

        try {
            jFTFDataSinistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFTFDataSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 349, 78, -1));

        jLEventoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLEventoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLEventoSinistro.setText("Evento do Sinistro:");
        jPanel1.add(jLEventoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 169, -1, -1));

        jCBEventoSinistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", " " }));
        jCBEventoSinistro.setBorder(null);
        jPanel1.add(jCBEventoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 174, -1, -1));

        jLCidadeSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCidadeSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLCidadeSinistro.setText("Cidade:");
        jPanel1.add(jLCidadeSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 226, -1, -1));

        jLEnderecoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLEnderecoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLEnderecoSinistro.setText("Endereço:");
        jPanel1.add(jLEnderecoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 270, -1, -1));

        jTFCidadeSinistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTFCidadeSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 230, 184, -1));
        jPanel1.add(jTFEnderecoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 274, 239, -1));

        jLAvisoErroInsercao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAvisoErroInsercao.setForeground(new java.awt.Color(255, 255, 102));
        jLAvisoErroInsercao.setText("Erro na inserção de sinistro!");
        jPanel1.add(jLAvisoErroInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 127, -1, -1));

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
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, -1));

        jBCarregarImagem.setBackground(new java.awt.Color(199, 253, 180));
        jBCarregarImagem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCarregarImagem.setForeground(new java.awt.Color(72, 127, 52));
        jBCarregarImagem.setText("Enviar Imagem");
        jBCarregarImagem.setBorder(null);
        jBCarregarImagem.setBorderPainted(false);
        jBCarregarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarregarImagemActionPerformed(evt);
            }
        });
        jPanel1.add(jBCarregarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, 40));

        jLShowImagem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(jLShowImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 130, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBCadastrarSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarSinistroActionPerformed
        // verificando se o usuário informou os dados do evento

        if (!jTFCidadeSinistro.getText().equals("")) {
            if (!jTFEnderecoSinistro.getText().equals("")) {
                if (!jFTFDataSinistro.getText().equals("")) {
                    if (!jTANecessidadesSinistros.getText().equals("")) {

                        int codEventoSinistro = ComboBoxEvento.getSelectedIndex(jCBEventoSinistro);
                        int codTipoSinistro = ComboBoxTipoSinistro.getSelectedIndex(jCBTipoSinistro);

                        String cidadeSinistro = jTFCidadeSinistro.getText();
                        String enderecoSinistro = jTFEnderecoSinistro.getText();
                        String dataSinistro = jFTFDataSinistro.getText();
                        String situacao = "";
                        String descricaoSinistro = jTANecessidadesSinistros.getText();

                        Evento evento = new Evento(codEventoSinistro);
                        TipoSinistro tipoSinistro = new TipoSinistro(codTipoSinistro);

                        int codEvento = codEventoSinistro;
                        Evento dadosEvento = RegiSinUsuario.ccont.dadosEvento(codEvento);
                        int totalSinistro = dadosEvento.getTotalSinistroDados();
                        totalSinistro++;

                        boolean resultadoAlterarTotalSinisro = RegiSinUsuario.ccont.alterarTotalSinistro(totalSinistro, codEvento);
                        if (resultadoAlterarTotalSinisro == false) {
                            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar total de sinistros para este evento");
                        }

                        if (imagem == null) {
                            Sinistro sinistro = new Sinistro(codTipoSinistro, RegiSinUsuario.ccont.usuarioLogado, tipoSinistro, cidadeSinistro, enderecoSinistro, descricaoSinistro, descricaoSinistro, dataSinistro, evento);

                            boolean resultado = RegiSinUsuario.ccont.sinistroRegistrar(sinistro);
                            if (resultado == true) {
                                JOptionPane.showMessageDialog(rootPane, "Sinistro cadastrado com sucesso!");
                                TelaPrincipal telaPrincipal = new TelaPrincipal();
                                telaPrincipal.setVisible(true);
                                dispose();
                            } else {
                                jLAvisoErroInsercao.setVisible(true);
                            }
                        } else {
                            byte[] imagem = this.imagem.getImagem();;
                            Sinistro sinistro = new Sinistro(codTipoSinistro, RegiSinUsuario.ccont.usuarioLogado, tipoSinistro, cidadeSinistro, enderecoSinistro, descricaoSinistro, descricaoSinistro, dataSinistro, evento, imagem);
                            boolean resultado = RegiSinUsuario.ccont.sinistroRegistrar(sinistro);
                            if (resultado == true) {
                                JOptionPane.showMessageDialog(rootPane, "Sinistro cadastrado com sucesso!");
                                TelaPrincipal telaPrincipal = new TelaPrincipal();
                                telaPrincipal.setVisible(true);
                                dispose();
                            } else {
                                jLAvisoErroInsercao.setVisible(true);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: Informe as necessidades para o sinistro");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: Informe uma data para o sinistro");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe uma endereço para o sinistro");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe uma cidade para o sinistro");
        }
    }//GEN-LAST:event_jBCadastrarSinistroActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCarregarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCarregarImagemActionPerformed
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        jFCImagemSinistro.addChoosableFileFilter(imageFilter);
        if (jFCImagemSinistro.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            imagem = new Imagem(jFCImagemSinistro.getSelectedFile());
            jLShowImagem.setIcon(imagem.getImageIcon());
            jLShowImagem.setVisible(true);
        }
    }//GEN-LAST:event_jBCarregarImagemActionPerformed

    public void limpaCampos() {
        jTFCidadeSinistro.setText("");
        jTFEnderecoSinistro.setText("");
        jFTFDataSinistro.setText("");
        jTANecessidadesSinistros.setText("");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarSinistro;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCarregarImagem;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCBEventoSinistro;
    private javax.swing.JComboBox<String> jCBTipoSinistro;
    private javax.swing.JFileChooser jFCImagemSinistro;
    private javax.swing.JFormattedTextField jFTFDataSinistro;
    private javax.swing.JLabel jLAvisoErroInsercao;
    private javax.swing.JLabel jLCidadeSinistro;
    private javax.swing.JLabel jLDataSinistro;
    private javax.swing.JLabel jLEnderecoSinistro;
    private javax.swing.JLabel jLEventoSinistro;
    private javax.swing.JLabel jLMensagemCadastroSinistro;
    private javax.swing.JLabel jLNecessidadesSinistro;
    private javax.swing.JLabel jLShowImagem;
    private javax.swing.JLabel jLTipoSinistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTANecessidadesSinistros;
    private javax.swing.JTextField jTFCidadeSinistro;
    private javax.swing.JTextField jTFEnderecoSinistro;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
