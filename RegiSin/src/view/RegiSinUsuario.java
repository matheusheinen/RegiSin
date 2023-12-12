package view;

import controller.ConexaoController;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RegiSinUsuario {
    public static ConexaoController ccont;
   
    public static void main(String[] args) {
        
        try {
         
            Socket socket = new Socket("127.0.0.1", 12345);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            
        
           ccont = new ConexaoController(in, out);
           
           TelaLogin telaLogin = new TelaLogin();
           telaLogin.setVisible(true);
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        }
    }
    
}
