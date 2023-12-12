package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    public static Connection getConnection() {
        Connection con;
        try {

            String url = "jdbc:mysql://localhost:3306/";
            String banco = "regisin";
            String usuario = "root";
            String senha = "";

            con = DriverManager.getConnection(url + banco, usuario, senha);
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            con = null;
        }
        return con;
    }

}
