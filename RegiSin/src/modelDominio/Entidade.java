package modelDominio;

import java.io.Serializable;

public class Entidade extends Usuario implements Serializable {

    private static final long serialVersionUID = 123L;

    // variáveis do cadastro de Entidade
    private String setor;
    private String telefone;

    public Entidade(String email, String senha) {
        super(email, senha);
    }

    public Entidade(String setor, String telefone, int codUsuario, String nomeUsuario, String email, String senha) {
        super(codUsuario, nomeUsuario, email, senha);
        this.setor = setor;
        this.telefone = telefone;
    }

    public Entidade(String nomeUsuario, String email, String senha, int tipo, String setor, String telefone) {
        super(nomeUsuario, email, senha, tipo);
        this.setor = setor;
        this.telefone = telefone;
    }


    

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   

}
