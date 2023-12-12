package modelDominio;

import java.io.Serializable;

public class Pessoa extends Usuario implements Serializable {

    private static final long serialVersionUID = 123L;

    private String cpf;
    private String rg;
    private String telefone;

    public Pessoa(String cpf, String rg, String telefone, int codUsuario, String nomeUsuario, String email, String senha) {
        super(codUsuario, nomeUsuario, email, senha);
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public Pessoa(String cpf, String rg, String telefone, String nomeUsuario, String email, String senha, int tipo) {
        super(nomeUsuario, email, senha, tipo);
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public Pessoa(int codUsuario, String nomeUsuario, String email, String senha, int tipo) {
        super(codUsuario, nomeUsuario, email, senha, tipo);
    }

    public Pessoa(String email, String senha) {
        super(email, senha);
    }

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + '}';
    }

}
