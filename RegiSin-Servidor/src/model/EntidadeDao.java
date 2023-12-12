package model;

import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelDominio.Entidade;

public class EntidadeDao {

    private Connection con;

    public EntidadeDao() {
        this.con = Conector.getConnection();
    }

    public boolean registrar(Entidade entidade) {
        boolean resultado;
        PreparedStatement stmt = null;
        System.out.println("Vou registrar " + entidade);
        try {
            System.out.println("Vou preparar o insert.");

            con.setAutoCommit(false);

            String sql = "insert into usuario (nomeUsuario, email, senha, tipo, setor, telefone) values (?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            System.out.println("Preparado o stmt");

            stmt.setString(1, entidade.getNomeUsuario());
            stmt.setString(2, entidade.getEmail());
            stmt.setString(3, entidade.getSenha());
            stmt.setInt(4, 1);
            stmt.setString(5, entidade.getSetor());
            stmt.setString(6, entidade.getTelefone());

            stmt.execute();
            System.out.println("Executado.");

            con.commit();
            System.out.println("Comitado");

            resultado = true;

        } catch (SQLException exc) {
            exc.printStackTrace();
            System.out.println("Erro 1: " + exc.getMessage());
            resultado = false;
            try {
                con.rollback();
            } catch (SQLException exc2) {
                exc2.printStackTrace();
                System.out.println("Erro: " + exc2.getMessage());
            }

        } finally {
            try {
                stmt.close();
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException exc) {
                exc.printStackTrace();
                System.out.println("Erro 2: " + exc.getMessage());
                resultado = false;
            }
        }

        return resultado;

    }

}
