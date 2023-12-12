package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import factory.Conector;
import java.sql.Connection;
import java.util.ArrayList;
import modelDominio.Pessoa;

public class PessoaDao {

    private Connection con;

    public PessoaDao() {
        this.con = Conector.getConnection();
    }

    public boolean registrar(Pessoa pessoa) {
        boolean resultado;
        PreparedStatement stmt = null;
        System.out.println("Vou registrar " + pessoa);
        try {
            System.out.println("Vou preparar o insert.");

            con.setAutoCommit(false);

            String sql = "insert into usuario (nomeUsuario, email, senha, tipo, cpf, rg, telefone) values (?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            System.out.println("Preparado o stmt");

            stmt.setString(1, pessoa.getNomeUsuario());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getSenha());
            stmt.setInt(4, 0);
            stmt.setString(5, pessoa.getCpf());
            stmt.setString(6, pessoa.getRg());
            stmt.setString(7, pessoa.getTelefone());

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

    public boolean alterarInformacoesContato(Pessoa pessoa) {
        boolean resultado;
        PreparedStatement stmt = null;
        System.out.println("Vou alterar " + pessoa);
        try {
            System.out.println("Vou preparar o update.");

            con.setAutoCommit(false);

            String sql = "update usuario set nomeUsuario = ?, email = ?, telefone = ?"
                    + "where codUsuario = ?";
            stmt = con.prepareStatement(sql);
            System.out.println("Preparado o stmt");

            stmt.setString(1, pessoa.getNomeUsuario());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setInt(4, pessoa.getCodUsuario());

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
