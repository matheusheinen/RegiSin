package model;

import factory.Conector;
import static java.lang.reflect.Array.get;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelDominio.Sinistro;
import modelDominio.Evento;
import modelDominio.Usuario;
import modelDominio.TipoSinistro;

public class SinistroDao {

    private Connection con;
    PreparedStatement st;
    ResultSet rs;

    public SinistroDao() {
        this.con = Conector.getConnection();
    }

    public boolean registrarSinistro(Sinistro sinistro) {
        boolean resultado;
        PreparedStatement stmt = null;
        System.out.println("Vou registrar " + sinistro);
        try {
            System.out.println("Vou preparar o insert.");

            con.setAutoCommit(false);

            String sql = "insert into sinistro (vitima, codTipoSinistro, cidade, endereco, situacao, descricaoNecessidades, data, codUsuario, codEvento, imagem) values (?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            System.out.println("Preparado o stmt");

            stmt.setString(1, sinistro.getUsuario().getNomeUsuario());
            stmt.setInt(2, sinistro.getTipoSinistro().getCodTipoSinistro());
            stmt.setString(3, sinistro.getCidadeSinistro());
            stmt.setString(4, sinistro.getEnderecoSinistro());
            stmt.setString(5, "Em análise");
            stmt.setString(6, sinistro.getDescricaoSinistro());
            stmt.setString(7, sinistro.getDataSinistro());
            stmt.setInt(8, sinistro.getUsuario().getCodUsuario());
            stmt.setInt(9, sinistro.getEvento().getCodEvento());
            stmt.setBytes(10, sinistro.getImagemSinistro());

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

    public ArrayList<Sinistro> getListaSinistro(String a, String vitima, String data, String cidade, String situacao) {
        ArrayList<Sinistro> listaSinistro = new ArrayList<>();
        PreparedStatement stmt = null;
        try {

            if (a != null) {
                String sql = "select * from sinistro";

                stmt = con.prepareStatement(sql);
            } else if (vitima != null) {
                String sql = "select * from sinistro where vitima like ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, "%" + vitima + "%");

            } else if (data != null) {
                String sql = "select * from sinistro where data = ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, data);
            } else if (cidade != null) {
                String sql = "select * from sinistro where cidade like ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, "%" + cidade + "%");
            } else if (situacao != null) {
                String sql = "select * from sinistro where situacao like ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, "%" + situacao + "%");
            } else {

                String sql = "select sinistro.*, tipoSinistro.nomeTipoSinistro from sinistro "
                        + "inner join tipoSinistro on (tipoSinistro.codTipoSinistro = sinistro.codTipoSinistro) ";
                stmt = con.prepareStatement(sql);
            }

            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                int codSinistro = res.getInt("codsinistro");
                String nomeVitima = res.getString("vitima");
                int codTipoSinistro = res.getInt("codTipoSinistro");
                String cidadeSinistro = res.getString("cidade");
                String enderecoSinistro = res.getString("endereco");
                String descricaoSinistro = res.getString("descricaonecessidades");
                String dataSinistro = res.getString("data");
                String situacaoSinistro = res.getString("situacao");
                int codEvento = res.getInt("codEvento");
                int codUsuario = res.getInt("codUsuario");
                byte[] imagem = res.getBytes("imagem");

                // aqui depois de criar o sinistro, cria o tipoSinistro e faz um set em sinistro
                Sinistro sinistro = new Sinistro(codSinistro, nomeVitima, codTipoSinistro, cidadeSinistro, enderecoSinistro, descricaoSinistro, dataSinistro, situacaoSinistro, codUsuario, codEvento, imagem);

                // pegar os dados do tiposinistro
                // criar o objeto tipoSInistro
                // definir no sisnistro o tipoSinistro
                // exemplo
                if (a == null && vitima == null && data == null && cidade == null && situacao == null) {
                    int codTipoSinistro1 = res.getInt("codTipoSinistro");
                    String nomeTipoSinistro = res.getString("nomeTipoSinistro");

                    TipoSinistro tipoSinistro = new TipoSinistro(codTipoSinistro, nomeTipoSinistro);
                    sinistro.setTipoSinistro(tipoSinistro);
                }

                listaSinistro.add(sinistro);
            }
            res.close();
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }

    public boolean alterarSituacaoSinistro(int codSinistro, String situacaoSinistro) {
        boolean resultado;
        PreparedStatement stmt = null;
        try {

            con.setAutoCommit(false);

            String sql = "update sinistro set situacao = ? where codSinistro = ?;";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, situacaoSinistro);
            stmt.setInt(2, codSinistro);

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

    public boolean excluirSinistro(int codSinistro) {
        boolean resultado;
        PreparedStatement stmt = null;
        try {
            con.setAutoCommit(false);
            String sql = "delete from sinistro where codsinistro = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, codSinistro);
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
