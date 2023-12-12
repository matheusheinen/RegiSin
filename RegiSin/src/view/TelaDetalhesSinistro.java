package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelDominio.Pessoa;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;
import view.util.Imagem;

public class TelaDetalhesSinistro extends javax.swing.JFrame {

    Sinistro sinistro = new Sinistro();

    public TelaDetalhesSinistro(Sinistro sinistro) {
        initComponents();
        setIcon();
        this.sinistro = sinistro;
        int codTipoSinistro = sinistro.getCodTipoSinistro();
        setTitle("Detalhes Sinistro");
        TipoSinistro dadosTipoSinistro = RegiSinUsuario.ccont.dadosTipoSinistro(codTipoSinistro);
        String nomeLiteralTipoSinistro = dadosTipoSinistro.getNomeTipoSinistroDados();

        jLShowTipoSinistro.setText(nomeLiteralTipoSinistro);
        jLShowImagemSinistro.setText("");

        // INFORMAÇÕES SINISTRO 
        jLShowDataSinistro.setText(sinistro.getDataSinistro());
        jLShowCidadeSinistro.setText(sinistro.getCidadeSinistro());
        jLShowEnderecoSinistro.setText(sinistro.getEnderecoSinistro());
        jLShowSituacaoSinistro.setText(sinistro.getSituacaoSinistro());
        jTANecessidadesSinistro.setText(sinistro.getDescricaoSinistro());

        if (sinistro.getImagemSinistro() != null) {
            Imagem imagem = new Imagem(sinistro.getImagemSinistro());
            jLShowImagemSinistro.setIcon(imagem.getImageIcon());

        } else {
            jLImagem.setVisible(false);
        }

        int codUsuarioBuscar = sinistro.getCodUsuario();

        Usuario dadosUsuario = RegiSinUsuario.ccont.dadosUsuario(codUsuarioBuscar);
        // INFORMAÇÕES USUARIO QUE CADASTROU SINISTRO

        jLShowVitima.setText(dadosUsuario.getNomeUsuarioDados());
        jLShowEmail.setText(dadosUsuario.getEmailUsuarioDados());
        jLShowTelefone.setText(dadosUsuario.getTelefoneUsuarioDados());
        jLShowCPF.setText(dadosUsuario.getCpfUsuarioDados());
        jLShowRG.setText(dadosUsuario.getRgUsuarioDados());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBFechar = new javax.swing.JButton();
        jLInformacoesSinistro = new javax.swing.JLabel();
        jLTipoSinistro = new javax.swing.JLabel();
        jLDataSinistro = new javax.swing.JLabel();
        jLCidadeSinistro = new javax.swing.JLabel();
        jLEnderecoSinistro = new javax.swing.JLabel();
        jLSituacaoSinistro = new javax.swing.JLabel();
        jLNecessidadesSinistro = new javax.swing.JLabel();
        jLDadosVitima = new javax.swing.JLabel();
        jLNomeVitima = new javax.swing.JLabel();
        jLEmailVitima = new javax.swing.JLabel();
        jLTelefoneVitima = new javax.swing.JLabel();
        jLCPFVitima = new javax.swing.JLabel();
        jLRGVitima = new javax.swing.JLabel();
        jLShowTipoSinistro = new javax.swing.JLabel();
        jLShowDataSinistro = new javax.swing.JLabel();
        jLShowCidadeSinistro = new javax.swing.JLabel();
        jLShowEnderecoSinistro = new javax.swing.JLabel();
        jLShowSituacaoSinistro = new javax.swing.JLabel();
        jLShowVitima = new javax.swing.JLabel();
        jLShowEmail = new javax.swing.JLabel();
        jLShowTelefone = new javax.swing.JLabel();
        jLShowCPF = new javax.swing.JLabel();
        jLShowRG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTANecessidadesSinistro = new javax.swing.JTextArea();
        jLShowImagemSinistro = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();
        jBAlterarSituação = new javax.swing.JButton();
        jBExcluirSinistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(72, 127, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFechar.setBackground(new java.awt.Color(199, 253, 180));
        jBFechar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(72, 127, 52));
        jBFechar.setText("X");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 0, 40, 30));

        jLInformacoesSinistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLInformacoesSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLInformacoesSinistro.setText("Informações do Sinistro");
        jPanel1.add(jLInformacoesSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 85, -1, -1));

        jLTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLTipoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLTipoSinistro.setText("Tipo:");
        jPanel1.add(jLTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLDataSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLDataSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLDataSinistro.setText("Data:");
        jPanel1.add(jLDataSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLCidadeSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCidadeSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLCidadeSinistro.setText("Cidade:");
        jPanel1.add(jLCidadeSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLEnderecoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLEnderecoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLEnderecoSinistro.setText("Endereço:");
        jPanel1.add(jLEnderecoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLSituacaoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSituacaoSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLSituacaoSinistro.setText("Situação:");
        jPanel1.add(jLSituacaoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLNecessidadesSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNecessidadesSinistro.setForeground(new java.awt.Color(199, 253, 180));
        jLNecessidadesSinistro.setText("Necessidades:");
        jPanel1.add(jLNecessidadesSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 396, -1, -1));

        jLDadosVitima.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDadosVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLDadosVitima.setText("Dados da Vítima");
        jPanel1.add(jLDadosVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLNomeVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNomeVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLNomeVitima.setText("Nome:");
        jPanel1.add(jLNomeVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLEmailVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLEmailVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLEmailVitima.setText("E-mail:");
        jPanel1.add(jLEmailVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLTelefoneVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLTelefoneVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLTelefoneVitima.setText("Telefone:");
        jPanel1.add(jLTelefoneVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLCPFVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCPFVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLCPFVitima.setText("CPF:");
        jPanel1.add(jLCPFVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLRGVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLRGVitima.setForeground(new java.awt.Color(199, 253, 180));
        jLRGVitima.setText("RG:");
        jPanel1.add(jLRGVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLShowTipoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowTipoSinistro.setForeground(new java.awt.Color(143, 252, 104));
        jLShowTipoSinistro.setText("jLabel1");
        jPanel1.add(jLShowTipoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLShowDataSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowDataSinistro.setForeground(new java.awt.Color(143, 252, 104));
        jLShowDataSinistro.setText("jLabel2");
        jPanel1.add(jLShowDataSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLShowCidadeSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowCidadeSinistro.setForeground(new java.awt.Color(143, 252, 104));
        jLShowCidadeSinistro.setText("jLabel3");
        jPanel1.add(jLShowCidadeSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLShowEnderecoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowEnderecoSinistro.setForeground(new java.awt.Color(143, 252, 104));
        jLShowEnderecoSinistro.setText("jLabel4");
        jPanel1.add(jLShowEnderecoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLShowSituacaoSinistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowSituacaoSinistro.setForeground(new java.awt.Color(143, 252, 104));
        jLShowSituacaoSinistro.setText("jLabel5");
        jPanel1.add(jLShowSituacaoSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLShowVitima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowVitima.setForeground(new java.awt.Color(143, 252, 104));
        jLShowVitima.setText("jLabel6");
        jPanel1.add(jLShowVitima, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLShowEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowEmail.setForeground(new java.awt.Color(143, 252, 104));
        jLShowEmail.setText("jLabel7");
        jPanel1.add(jLShowEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        jLShowTelefone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowTelefone.setForeground(new java.awt.Color(143, 252, 104));
        jLShowTelefone.setText("jLabel8");
        jPanel1.add(jLShowTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        jLShowCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowCPF.setForeground(new java.awt.Color(143, 252, 104));
        jLShowCPF.setText("jLabel9");
        jPanel1.add(jLShowCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        jLShowRG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLShowRG.setForeground(new java.awt.Color(143, 252, 104));
        jLShowRG.setText("jLabel10");
        jPanel1.add(jLShowRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        jTANecessidadesSinistro.setEditable(false);
        jTANecessidadesSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jTANecessidadesSinistro.setColumns(20);
        jTANecessidadesSinistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTANecessidadesSinistro.setForeground(new java.awt.Color(72, 127, 52));
        jTANecessidadesSinistro.setLineWrap(true);
        jTANecessidadesSinistro.setRows(5);
        jTANecessidadesSinistro.setWrapStyleWord(true);
        jTANecessidadesSinistro.setBorder(null);
        jScrollPane1.setViewportView(jTANecessidadesSinistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 270, 120));

        jLShowImagemSinistro.setText("jLabel1");
        jPanel1.add(jLShowImagemSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 190, 120));

        jLImagem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLImagem.setForeground(new java.awt.Color(199, 253, 180));
        jLImagem.setText("Imagem do Sinistro");
        jPanel1.add(jLImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jBAlterarSituação.setBackground(new java.awt.Color(199, 253, 180));
        jBAlterarSituação.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jBAlterarSituação.setForeground(new java.awt.Color(153, 0, 0));
        jBAlterarSituação.setText("Alterar Situação");
        jBAlterarSituação.setBorder(null);
        jBAlterarSituação.setBorderPainted(false);
        jBAlterarSituação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarSituaçãoActionPerformed(evt);
            }
        });
        jPanel1.add(jBAlterarSituação, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 40));

        jBExcluirSinistro.setBackground(new java.awt.Color(199, 253, 180));
        jBExcluirSinistro.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jBExcluirSinistro.setForeground(new java.awt.Color(153, 0, 0));
        jBExcluirSinistro.setText("Excluir Sinistro");
        jBExcluirSinistro.setBorder(null);
        jBExcluirSinistro.setBorderPainted(false);
        jBExcluirSinistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirSinistroActionPerformed(evt);
            }
        });
        jPanel1.add(jBExcluirSinistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        TelaVisualizacaoSinistros telaVisualizacaoSinistros = new TelaVisualizacaoSinistros();
        telaVisualizacaoSinistros.setVisible(true);
        dispose();

    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBAlterarSituaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarSituaçãoActionPerformed

        TelaAlterarSituacaoSinistro telaAlterarSituacaoSinistro = new TelaAlterarSituacaoSinistro(sinistro);
        telaAlterarSituacaoSinistro.setVisible(true);
    }//GEN-LAST:event_jBAlterarSituaçãoActionPerformed

    private void jBExcluirSinistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirSinistroActionPerformed

        int codSinistro = sinistro.getCodSinistro();
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = "Sim";
        options[1] = "Não";
        int resposta = JOptionPane.showOptionDialog(frame.getContentPane(), "Deseja realmente excluir o sinistro?", "Confirmação", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        if (resposta == 0) {
            boolean resultado = RegiSinUsuario.ccont.sinistroExcluir(codSinistro);
            if (resultado == true) {
                JOptionPane.showMessageDialog(rootPane, "Sinistro excluído com sucesso!");
                TelaVisualizacaoSinistros telaVisualizacaoSinistros = new TelaVisualizacaoSinistros();
                telaVisualizacaoSinistros.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: não foi possível excluir o sinistro");
            }
        }

    }//GEN-LAST:event_jBExcluirSinistroActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../view.image/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarSituação;
    private javax.swing.JButton jBExcluirSinistro;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLCPFVitima;
    private javax.swing.JLabel jLCidadeSinistro;
    private javax.swing.JLabel jLDadosVitima;
    private javax.swing.JLabel jLDataSinistro;
    private javax.swing.JLabel jLEmailVitima;
    private javax.swing.JLabel jLEnderecoSinistro;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLInformacoesSinistro;
    private javax.swing.JLabel jLNecessidadesSinistro;
    private javax.swing.JLabel jLNomeVitima;
    private javax.swing.JLabel jLRGVitima;
    private javax.swing.JLabel jLShowCPF;
    private javax.swing.JLabel jLShowCidadeSinistro;
    private javax.swing.JLabel jLShowDataSinistro;
    private javax.swing.JLabel jLShowEmail;
    private javax.swing.JLabel jLShowEnderecoSinistro;
    private javax.swing.JLabel jLShowImagemSinistro;
    private javax.swing.JLabel jLShowRG;
    private javax.swing.JLabel jLShowSituacaoSinistro;
    private javax.swing.JLabel jLShowTelefone;
    private javax.swing.JLabel jLShowTipoSinistro;
    private javax.swing.JLabel jLShowVitima;
    private javax.swing.JLabel jLSituacaoSinistro;
    private javax.swing.JLabel jLTelefoneVitima;
    private javax.swing.JLabel jLTipoSinistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTANecessidadesSinistro;
    // End of variables declaration//GEN-END:variables
}
