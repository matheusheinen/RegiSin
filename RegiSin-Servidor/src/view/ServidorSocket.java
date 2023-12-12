package view;

import controller.TrataClienteController;
import factory.Conector;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

public class ServidorSocket {

    public static void main(String[] args) {
        try {

            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor inicializado. Aguardando conexão...");
            int idUnico = 0;
            while (true) {

                Socket cliente = servidor.accept();
                System.out.println("Um novo usuario se conectou: " + cliente);
                idUnico++;
                System.out.println("Iniciando uma nova thread para o usuario: " + idUnico);
                TrataClienteController trataCliente = new TrataClienteController(cliente, idUnico);
            }
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        }
    }

}
