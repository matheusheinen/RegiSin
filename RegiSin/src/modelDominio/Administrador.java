
package modelDominio;

import java.io.Serializable;

public class Administrador extends Usuario implements Serializable{
    private static final long serialVersionUID = 123L;

    public Administrador(int codUsuario, String nomeUsuario, String email, String senha) {
        super(codUsuario, nomeUsuario, email, senha);
    }

    public Administrador(String nomeUsuario, String email, String senha, int tipo) {
        super(nomeUsuario, email, senha, tipo);
    }

    public Administrador(String email, String senha) {
        super(email, senha);
    }

    

    

    
    
}