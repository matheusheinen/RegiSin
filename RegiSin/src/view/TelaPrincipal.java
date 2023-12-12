package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import modelDominio.Evento;
import modelDominio.Sinistro;
import modelDominio.Usuario;
import view.tablemodel.EventoTableModel;
import view.tablemodel.SinistroTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private EventoTableModel eventoTableModel;
    private SinistroTableModel sinistroTableModel;
    
    public TelaPrincipal() {
        initComponents();
        setTitle("Tela principal");
        
        setIcon();
        
        ArrayList<Evento> listaEventos = RegiSinUsuario.ccont.eventoLista();
        eventoTableModel = new EventoTableModel(listaEventos);
        String a = "Teste";
        ArrayList<Sinistro> listaSinistro = RegiSinUsuario.ccont.sinistroListaDesktop(a);
        sinistroTableModel = new SinistroTableModel(listaSinistro);
        
        String saudacao = "Seja bem vindo, " + RegiSinUsuario.ccont.usuarioLogado.getNomeUsuario();
        jLSaudacao.setText(saudacao);
        
        eventoTableModel = new EventoTableModel(listaEventos);
        jLEchooTotalEventos.setText(listaEventos.size() + "");
        sinistroTableModel = new SinistroTableModel(listaSinistro);
        jLEchooTotalSinistros.setText(listaSinistro.size() + "");
        
        if (RegiSinUsuario.ccont.usuarioLogado.getTipo() == 1) {
            jMCadastrarUsuario.setVisible(false);
            jMCadastrarSinistro.setVisible(false);
            jMCadastrarTipoSinistro.setVisible(false);
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLSaudacao = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLNomeLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLTotalEventos = new javax.swing.JLabel();
        jLTotalSinistros = new javax.swing.JLabel();
        jLEchoTotalEventos = new javax.swing.JLabel();
        jLEchoTotalSinistros = new javax.swing.JLabel();
        jLEchooTotalEventos = new javax.swing.JLabel();
        jLEchooTotalSinistros = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLogoMenu = new javax.swing.JLabel();
        JLEmailParaContato = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMCadastrarUsuario = new javax.swing.JMenuItem();
        jMCadastrarEvento = new javax.swing.JMenuItem();
        jMCadastrarTipoSinistro = new javax.swing.JMenuItem();
        jMCadastrarSinistro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMVisualizarEventos = new javax.swing.JMenuItem();
        jMVisualizarSinistros = new javax.swing.JMenuItem();
        jMVisualizarUsuarios = new javax.swing.JMenuItem();
        jMOpcoes = new javax.swing.JMenu();
        jMAlterarSenha = new javax.swing.JMenuItem();
        jMSobreAEmpresa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(98, 125, 89));

        jLSaudacao.setBackground(new java.awt.Color(199, 253, 180));
        jLSaudacao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLSaudacao.setForeground(new java.awt.Color(199, 253, 180));
        jLSaudacao.setText("*");

        jPanel2.setBackground(new java.awt.Color(114, 201, 83));

        jPanel3.setBackground(new java.awt.Color(72, 127, 52));

        jLNomeLogo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLNomeLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLNomeLogo.setText("RegiSin");

        jLTotalEventos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLTotalEventos.setForeground(new java.awt.Color(255, 255, 255));
        jLTotalEventos.setText("Total de Eventos:");

        jLTotalSinistros.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLTotalSinistros.setForeground(new java.awt.Color(255, 255, 255));
        jLTotalSinistros.setText("Total de Sinistros:");

        jLEchoTotalEventos.setToolTipText("");

        jLEchooTotalEventos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLEchooTotalEventos.setForeground(new java.awt.Color(114, 201, 83));
        jLEchooTotalEventos.setText("jLabel1");

        jLEchooTotalSinistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLEchooTotalSinistros.setForeground(new java.awt.Color(114, 201, 83));
        jLEchooTotalSinistros.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLNomeLogo)
                .addGap(43, 43, 43))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLTotalEventos)
                        .addGap(12, 12, 12)
                        .addComponent(jLEchooTotalEventos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLEchoTotalEventos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLTotalSinistros)
                        .addGap(12, 12, 12)
                        .addComponent(jLEchooTotalSinistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLEchoTotalSinistros)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLNomeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTotalEventos)
                    .addComponent(jLEchoTotalEventos)
                    .addComponent(jLEchooTotalEventos))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTotalSinistros)
                    .addComponent(jLEchoTotalSinistros)
                    .addComponent(jLEchooTotalSinistros))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel4.setBackground(new java.awt.Color(72, 127, 52));

        jLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/LogoRegiSin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLogoMenu))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLogoMenu))
        );

        JLEmailParaContato.setBackground(new java.awt.Color(72, 127, 52));
        JLEmailParaContato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLEmailParaContato.setForeground(new java.awt.Color(72, 127, 52));
        JLEmailParaContato.setText("Email para contato: regisin2023@gmail.com");
        JLEmailParaContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLEmailParaContato)
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLEmailParaContato)
                .addGap(20, 20, 20))
        );

        Fechar.setBackground(new java.awt.Color(72, 127, 52));
        Fechar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(199, 253, 180));
        Fechar.setText("X");
        Fechar.setBorder(null);
        Fechar.setBorderPainted(false);
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        jBSair.setBackground(new java.awt.Color(72, 127, 52));
        jBSair.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jBSair.setForeground(new java.awt.Color(199, 253, 180));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconSair.png"))); // NOI18N
        jBSair.setText(" Sair");
        jBSair.setBorder(null);
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLSaudacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jMenuBar1.setBackground(new java.awt.Color(98, 125, 89));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(98, 125, 89));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconCadastrar.png"))); // NOI18N
        jMenu1.setText("Cadastrar");

        jMCadastrarUsuario.setForeground(new java.awt.Color(72, 127, 52));
        jMCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconCadastrarUsuario.png"))); // NOI18N
        jMCadastrarUsuario.setText("Cadastrar Usuário");
        jMCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMCadastrarUsuario);

        jMCadastrarEvento.setForeground(new java.awt.Color(72, 127, 52));
        jMCadastrarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconCadastrarEvento.png"))); // NOI18N
        jMCadastrarEvento.setText("Cadastrar Evento");
        jMCadastrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarEventoActionPerformed(evt);
            }
        });
        jMenu1.add(jMCadastrarEvento);

        jMCadastrarTipoSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jMCadastrarTipoSinistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconCadastrarTipoSinistro.png"))); // NOI18N
        jMCadastrarTipoSinistro.setText("Cadastrar Tipo Sinistro");
        jMCadastrarTipoSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarTipoSinistroActionPerformed(evt);
            }
        });
        jMenu1.add(jMCadastrarTipoSinistro);

        jMCadastrarSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jMCadastrarSinistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconCadastrarSinistro.png"))); // NOI18N
        jMCadastrarSinistro.setText("Cadastrar Sinistro");
        jMCadastrarSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarSinistroActionPerformed(evt);
            }
        });
        jMenu1.add(jMCadastrarSinistro);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconVisualizar.png"))); // NOI18N
        jMenu2.setText("Visualizar");

        jMVisualizarEventos.setForeground(new java.awt.Color(72, 127, 52));
        jMVisualizarEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconVisualizarEventos.png"))); // NOI18N
        jMVisualizarEventos.setText("Visualizar Eventos");
        jMVisualizarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVisualizarEventosActionPerformed(evt);
            }
        });
        jMenu2.add(jMVisualizarEventos);

        jMVisualizarSinistros.setForeground(new java.awt.Color(72, 127, 52));
        jMVisualizarSinistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconVisualizarSinistros.png"))); // NOI18N
        jMVisualizarSinistros.setText("Visualizar Sinistros");
        jMVisualizarSinistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVisualizarSinistrosActionPerformed(evt);
            }
        });
        jMenu2.add(jMVisualizarSinistros);

        jMVisualizarUsuarios.setForeground(new java.awt.Color(72, 127, 52));
        jMVisualizarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconVisualizarUsuarios.png"))); // NOI18N
        jMVisualizarUsuarios.setText("Visualizar Usuários");
        jMVisualizarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVisualizarUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMVisualizarUsuarios);

        jMenuBar1.add(jMenu2);

        jMOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        jMOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconOpcoes.png"))); // NOI18N
        jMOpcoes.setText("Opções");

        jMAlterarSenha.setForeground(new java.awt.Color(72, 127, 52));
        jMAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconAlterarSenha.png"))); // NOI18N
        jMAlterarSenha.setText("Alterar senha");
        jMAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarSenhaActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMAlterarSenha);

        jMSobreAEmpresa.setForeground(new java.awt.Color(72, 127, 52));
        jMSobreAEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.image/iconSobreAEmpresa.png"))); // NOI18N
        jMSobreAEmpresa.setText("Sobre");
        jMSobreAEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSobreAEmpresaActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMSobreAEmpresa);

        jMenuBar1.add(jMOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(744, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarUsuarioActionPerformed
        TelaCadastrarUsuario telaCadastrarUsuario = new TelaCadastrarUsuario();
        telaCadastrarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCadastrarUsuarioActionPerformed

    private void jMVisualizarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVisualizarEventosActionPerformed
        TelaVisualizacaoEventos telaVisualizacaoEventos = new TelaVisualizacaoEventos();
        telaVisualizacaoEventos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMVisualizarEventosActionPerformed

    private void jMCadastrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarEventoActionPerformed
        TelaCadastrarEvento telaCadastrarEvento = new TelaCadastrarEvento();
        telaCadastrarEvento.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCadastrarEventoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        //RegiSinUsuario.ccont.fim();
        RegiSinUsuario.ccont.usuarioLogado = null;
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void jMVisualizarSinistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVisualizarSinistrosActionPerformed
        TelaVisualizacaoSinistros telaVisualizacaoSinistros = new TelaVisualizacaoSinistros();
        telaVisualizacaoSinistros.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMVisualizarSinistrosActionPerformed

    private void jMCadastrarTipoSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarTipoSinistroActionPerformed
        TelaCadastrarTipoSinistro telaCadastrarTipoSinistro = new TelaCadastrarTipoSinistro();
        telaCadastrarTipoSinistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCadastrarTipoSinistroActionPerformed

    private void jMCadastrarSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarSinistroActionPerformed
        TelaCadastroSinistro telaCadastroSinistro = new TelaCadastroSinistro();
        telaCadastroSinistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCadastrarSinistroActionPerformed

    private void jMAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarSenhaActionPerformed
        
        TelaAlterarSenha telaAlterarSenha = new TelaAlterarSenha();
        telaAlterarSenha.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMAlterarSenhaActionPerformed

    private void jMSobreAEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSobreAEmpresaActionPerformed
        TelaSobreAEmpresa telaSobreAEmpresa = new TelaSobreAEmpresa();
        telaSobreAEmpresa.setVisible(true);
        
    }//GEN-LAST:event_jMSobreAEmpresaActionPerformed

    private void jMVisualizarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVisualizarUsuariosActionPerformed
        TelaVisualizacaoUsuarios telaVisualizacaoUsuarios = new TelaVisualizacaoUsuarios();
        telaVisualizacaoUsuarios.setVisible(true);
    }//GEN-LAST:event_jMVisualizarUsuariosActionPerformed
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel JLEmailParaContato;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLEchoTotalEventos;
    private javax.swing.JLabel jLEchoTotalSinistros;
    private javax.swing.JLabel jLEchooTotalEventos;
    private javax.swing.JLabel jLEchooTotalSinistros;
    private javax.swing.JLabel jLNomeLogo;
    private javax.swing.JLabel jLSaudacao;
    private javax.swing.JLabel jLTotalEventos;
    private javax.swing.JLabel jLTotalSinistros;
    private javax.swing.JLabel jLogoMenu;
    private javax.swing.JMenuItem jMAlterarSenha;
    private javax.swing.JMenuItem jMCadastrarEvento;
    private javax.swing.JMenuItem jMCadastrarSinistro;
    private javax.swing.JMenuItem jMCadastrarTipoSinistro;
    private javax.swing.JMenuItem jMCadastrarUsuario;
    private javax.swing.JMenu jMOpcoes;
    private javax.swing.JMenuItem jMSobreAEmpresa;
    private javax.swing.JMenuItem jMVisualizarEventos;
    private javax.swing.JMenuItem jMVisualizarSinistros;
    private javax.swing.JMenuItem jMVisualizarUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
