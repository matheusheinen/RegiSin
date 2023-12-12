package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelDominio.Usuario;
import view.tablemodel.UsuarioTableModel;

public class TelaVisualizacaoUsuarios extends javax.swing.JFrame {

    private UsuarioTableModel usuarioTableModel;

    public TelaVisualizacaoUsuarios() {
        initComponents();
        atualizaTabela();
        setTitle("Visualização Usuários");
        jTableUsuarios.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTableUsuarios.getTableHeader().setOpaque(false);
        jTableUsuarios.getTableHeader().setBackground(new Color(143, 252, 104));
        jTableUsuarios.getTableHeader().setForeground(Color.DARK_GRAY);
        jTableUsuarios.setRowHeight(25);
    }

    private void atualizaTabela() {
        //
        if (jCBFiltro.getSelectedIndex() == 0) {
            ArrayList<Usuario> listaUsuarios = RegiSinUsuario.ccont.usuarioLista();
            usuarioTableModel = new UsuarioTableModel(listaUsuarios);
        } else if (jCBFiltro.getSelectedIndex() == 1) {
            String nomeUsuario = jTFFiltro.getText();
            ArrayList<Usuario> listaUsuarios = RegiSinUsuario.ccont.usuarioListaNome(nomeUsuario);
            usuarioTableModel = new UsuarioTableModel(listaUsuarios);

        }

        jTableUsuarios.setModel(usuarioTableModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLCampoDeBusca = new javax.swing.JLabel();
        jCBFiltro = new javax.swing.JComboBox<>();
        jTFFiltro = new javax.swing.JTextField();
        jLUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Email", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        jLCampoDeBusca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCampoDeBusca.setForeground(new java.awt.Color(199, 253, 180));
        jLCampoDeBusca.setText("Busca:");

        jCBFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome" }));

        jTFFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFiltroKeyReleased(evt);
            }
        });

        jLUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLUsuarios.setForeground(new java.awt.Color(199, 253, 180));
        jLUsuarios.setText("Lista de Usuários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCampoDeBusca)
                                .addGap(18, 18, 18)
                                .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLUsuarios)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLUsuarios)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCampoDeBusca)
                    .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltroKeyReleased
        atualizaTabela();
    }//GEN-LAST:event_jTFFiltroKeyReleased

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        if (evt.getClickCount() == 2) {
            if (RegiSinUsuario.ccont.usuarioLogado.getTipo() == 2) {
                JFrame frame = new JFrame();
                String[] options = new String[2];
                options[0] = "Sim";
                options[1] = "Não";
                int resposta = JOptionPane.showOptionDialog(frame.getContentPane(), "Deseja realmente excluir o usuário?", "Confirmação", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);

                if (resposta == 0) {

                    Usuario usuario = usuarioTableModel.getUsuario(jTableUsuarios.getSelectedRow());
                    int codUsuario = usuario.getCodUsuario();
                    boolean resultado = RegiSinUsuario.ccont.usuarioExcluir(codUsuario);
                    if (resultado == true) {
                        JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: não foi possível excluir o usuário");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para excluir um usuário!");

            }

        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBFiltro;
    private javax.swing.JLabel jLCampoDeBusca;
    private javax.swing.JLabel jLUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
