package model;

import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;

public class TipoSinistroDao {

    private Connection con;
    public ArrayList<TipoSinistro> getListaTipoSinistro;
    PreparedStatement st;
    ResultSet rs;

    public TipoSinistroDao() {
        this.con = Conector.getConnection();
    }

    public boolean inserir(TipoSinistro tipoSinistro) {
        boolean resultado;
        PreparedStatement stmt = null;
        try {

            con.setAutoCommit(false);

            String sql = "insert into tiposinistro(nometiposinistro) values (?)";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, tipoSinistro.getNomeTipoSinistro());

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

    public ArrayList<TipoSinistro> getListaTipoSinistro() {
        ArrayList<TipoSinistro> listaTipoSinistro = new ArrayList<>();

        PreparedStatement stmt = null;
        try {

            String sql = "select * from tiposinistro";
            stmt = con.prepareStatement(sql);

            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                int codTipoSinistro = res.getInt("codTipoSinistro");
                String nomeTipoSinistro = res.getString("nomeTipoSinistro");

                TipoSinistro tipoSinistro = new TipoSinistro(codTipoSinistro, nomeTipoSinistro);

                listaTipoSinistro.add(tipoSinistro);
            }
            res.close();
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            listaTipoSinistro = null;
        }
        return listaTipoSinistro;
    }

    public TipoSinistro nomeTipoSinistroLiteral(int codTipoSinistro) {

        TipoSinistro dadosTipoSinistro = new TipoSinistro();
        PreparedStatement stmt = null;
        try {

            st = con.prepareStatement("select * from tiposinistro where codtiposinistro = ?");
            st.setInt(1, codTipoSinistro);
            rs = st.executeQuery();

            if (rs.next()) {
                dadosTipoSinistro.setCodTipoSinistroDados(codTipoSinistro);
                dadosTipoSinistro.setNomeTipoSinistroDados(rs.getString("nometiposinistro"));

                return dadosTipoSinistro;
            } else {
                dadosTipoSinistro = null;
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            dadosTipoSinistro = null;
        }
        return dadosTipoSinistro;
    }

}
