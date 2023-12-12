package model;

import factory.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelDominio.Evento;

public class EventoDao {

    private Connection con;
    PreparedStatement st;
    ResultSet rs;

    public EventoDao() {
        this.con = Conector.getConnection();
    }

    public boolean registrarEvento(Evento evento) {
        boolean resultado;
        PreparedStatement stmt = null;
        System.out.println("Vou registrar " + evento);
        try {
            System.out.println("Vou preparar o insert.");

            con.setAutoCommit(false);

            String sql = "insert into evento (nomeEvento, cidade, data, descricao, codusuario) values (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            System.out.println("Preparado o stmt");

            stmt.setString(1, evento.getNomeEvento());
            stmt.setString(2, evento.getCidadeEvento());
            stmt.setString(3, evento.getDataEvento());
            stmt.setString(4, evento.getDescricaoEvento());
            stmt.setInt(5, evento.getUsuario().getCodUsuario());

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

    public ArrayList<Evento> getListaEventos(String nome, String data, String cidade) {
        ArrayList<Evento> listaEventos = new ArrayList<>();
        PreparedStatement stmt = null;
        try {

            if (nome != null) {
                String sql = "select * from evento where nomeEvento like ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, "%" + nome + "%");

            } else if (data != null) {
                String sql = "select * from evento where data = ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, data);
            } else if (cidade != null) {
                String sql = "select * from evento where cidade like ?";
                stmt = con.prepareStatement(sql);

                stmt.setString(1, "%" + cidade + "%");
            } else {
            
                String sql = "select * from evento";
                stmt = con.prepareStatement(sql);
            }

            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                int codEvento = res.getInt("codEvento");
                String nomeEvento = res.getString("nomeEvento");
                String dataEvento = res.getString("data");
                String cidadeEvento = res.getString("cidade");
                String descricaoEvento = res.getString("descricao");
                int totalSinistros = res.getInt("totalSinistros");

                Evento evento = new Evento(codEvento, nomeEvento, cidadeEvento, dataEvento, descricaoEvento, totalSinistros);

                listaEventos.add(evento);
            }
            res.close();
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    public Evento dadosEvento(int codEvento) {

        Evento dadosEvento = new Evento();
        PreparedStatement stmt = null;
        try {

            st = con.prepareStatement("select * from evento where codEvento = ?");
            st.setInt(1, codEvento);
            rs = st.executeQuery();

            if (rs.next()) {

                dadosEvento.setNomeEventoDados(rs.getString("nomeEvento"));

                dadosEvento.setTotalSinistroDados(rs.getInt("totalsinistros"));

                return dadosEvento;
            } else {
                dadosEvento = null;
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            dadosEvento = null;
        }
        return dadosEvento;
    }

    public boolean alterarTotalSinistro(int totalSinistro, int codEvento) {
        boolean resultado;
        PreparedStatement stmt = null;
        try {

            con.setAutoCommit(false);

            String sql = "update evento set totalSinistros = ? where codEvento = ?;";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, totalSinistro);
            stmt.setInt(2, codEvento);

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
