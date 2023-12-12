package model;

import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.plaf.synth.Region;
import modelDominio.Administrador;
import modelDominio.Pessoa;
import modelDominio.Usuario;

public class UsuarioDao {

    private Connection con;
    private Usuario usuario;
    PreparedStatement st;
    ResultSet rs;

    public UsuarioDao() {
        this.con = Conector.getConnection();
    }

    public Usuario efetuarLogin(Usuario usuario) {
        Usuario usuarioLogado = null;
        PreparedStatement stmt = null;
        try {

            String sql = "select * from usuario where email = ? and senha = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());

            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                int codUsuario = res.getInt("codusuario");
                String nomeUsuario = res.getString("nomeusuario");
                String email = res.getString("email");
                String senha = res.getString("senha");
                int tipo = res.getInt("tipo");

                if (tipo == 0) {
                    usuarioLogado = new Pessoa(codUsuario, nomeUsuario, email, senha, tipo);
                } else {
                    usuarioLogado = new Administrador(codUsuario, nomeUsuario, senha, email, tipo);
                }

                System.out.println("Logado - " + usuarioLogado.toString());
            }

            res.close();
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            usuarioLogado = null;
        }
        return usuarioLogado;
    }

    public boolean alterarSenha(Usuario usuario) {
        boolean resultado;
        PreparedStatement stmt = null;

        try {

            con.setAutoCommit(false);

            String sql = "update usuario set senha = ? where codusuario= ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getSenha());
            stmt.setInt(2, usuario.getCodUsuario());

            stmt.execute();

            con.commit();

            resultado = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            resultado = false;
            try {
                con.rollback();
            } catch (SQLException exc2) {
                System.out.println("Erro: " + exc2.getMessage());
            }
        } finally {
            try {
                stmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
                resultado = false;
            }
        }
        return resultado;
    }

    public Usuario dadosUsuario(int codUsuario) {

        Usuario dadosUsuario = new Usuario();
        PreparedStatement stmt = null;
        try {

            st = con.prepareStatement("select * from usuario where codusuario = ?");
            st.setInt(1, codUsuario);
            rs = st.executeQuery();

            if (rs.next()) {
                dadosUsuario.setCodUsuarioDados(codUsuario);
                dadosUsuario.setEmailUsuarioDados(rs.getString("email"));
                dadosUsuario.setCodTipoUsuarioDados(rs.getInt("tipo"));
                dadosUsuario.setCpfUsuarioDados(rs.getString("cpf"));
                dadosUsuario.setRgUsuarioDados(rs.getString("rg"));
                dadosUsuario.setTelefoneUsuarioDados(rs.getString("telefone"));
                dadosUsuario.setNomeUsuarioDados(rs.getString("nomeUsuario"));
                return dadosUsuario;
            } else {
                dadosUsuario = null;
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            dadosUsuario = null;
        }
        return dadosUsuario;
    }

    public Usuario buscarEmailUsuario(String emailUsuario) {

        String emailUsuarioBuscar = emailUsuario;
        Usuario dadosUsuarioEmail = new Usuario();
        PreparedStatement stmt = null;
        try {

            st = con.prepareStatement("select * from usuario where email = ?");
            st.setString(1, emailUsuarioBuscar);
            rs = st.executeQuery();
            if (rs.next()) {
                dadosUsuarioEmail.setCodUsuarioDadosEmail(rs.getInt("codUsuario"));
                dadosUsuarioEmail.setEmailUsuarioDadosEmail(rs.getString("email"));
                dadosUsuarioEmail.setSenhaUsuarioDadosEmail(rs.getString("senha"));
                return dadosUsuarioEmail;
            } else {
                dadosUsuarioEmail = null;
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            dadosUsuarioEmail = null;
        }
        return dadosUsuarioEmail;
    }

    public ArrayList<Usuario> getListaUsuarios(String nome) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        PreparedStatement stmt = null;
        try {

            if (nome != null) {
                String sql = "select * from usuario where nomeUsuario like ?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, "%" + nome + "%");

            } else {

                String sql = "select * from usuario";
                stmt = con.prepareStatement(sql);
            }

            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                int codUsuario = res.getInt("codUsuario");
                String nomeUsuario = res.getString("nomeUsuario");
                String emailUsuario = res.getString("email");
                String telefoneUsuario = res.getString("telefone");
                int codTipoUsuario = res.getInt("tipo");

                Usuario usuario = new Usuario(codUsuario, nomeUsuario, emailUsuario, telefoneUsuario, codTipoUsuario);

                listaUsuarios.add(usuario);
            }
            res.close();
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            listaUsuarios = null;
        }
        return listaUsuarios;
    }

    public boolean excluirUsuario(int codUsuario) {
        boolean resultado;
        PreparedStatement stmt = null;
        try {
            con.setAutoCommit(false);
            String sql = "delete from usuario where codusuario = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, codUsuario);
            stmt.execute();
            con.commit();
            resultado = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            resultado = false;
            try {
                con.rollback();
            } catch (SQLException exc2) {
                System.out.println("Erro: " + exc2.getMessage());
            }
        } finally {
            try {
                stmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
                resultado = false;
            }
        }
        return resultado;
    }

}
