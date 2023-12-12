package modelDominio;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final long serialVersionUID = 123L;
    private int codUsuario;
    private String nomeUsuario;
    private String email;
    private String senha;
    private int tipo;

    // variáveis usuário pegar
    private int codUsuarioDados;
    private String emailUsuarioDados;
    private int codTipoUsuarioDados;
    private String cpfUsuarioDados;
    private String rgUsuarioDados;
    private String telefoneUsuarioDados;
    private String nomeUsuarioDados;

    // variaveis usuario para alterar email
    private int codUsuarioDadosEmail;
    private String emailUsuarioDadosEmail;
    private String senhaUsuarioDadosEmail;

    //variaveis na lista de visualizar usuário
    private String telefoneUsuarioLista;
    // variaveis alterar senha por verificação de email
    private String coduUsuarioEmailFinal;

    public Usuario() {

    }

    public Usuario(String coduUsuarioEmailFinal) {
        this.coduUsuarioEmailFinal = coduUsuarioEmailFinal;
    }


  //  public Usuario(int codUsuario, String nomeUsuario, String emailUsuario, String telefoneUsuario, int codTipoUsuario) {
     //   this.codUsuario = codUsuario;
       // this.nomeUsuario = nomeUsuario;
        //this.email = email;
       // this.telefoneUsuarioLista = telefoneUsuario;
       // this.tipo = tipo;
   // }

    public String getCoduUsuarioEmailFinal() {
        return coduUsuarioEmailFinal;
    }

    public void setCoduUsuarioEmailFinal(String coduUsuarioEmailFinal) {
        this.coduUsuarioEmailFinal = coduUsuarioEmailFinal;
    }

    public Usuario(int codUsuarioDados, String emailUsuarioDados, int codTipoUsuarioDados, String cpfUsuarioDados, String rgUsuarioDados, String telefoneUsuarioDados, String nomeUsuarioDados) {
        this.codUsuarioDados = codUsuarioDados;
        this.emailUsuarioDados = emailUsuarioDados;
        this.codTipoUsuarioDados = codTipoUsuarioDados;
        this.cpfUsuarioDados = cpfUsuarioDados;
        this.rgUsuarioDados = rgUsuarioDados;
        this.telefoneUsuarioDados = telefoneUsuarioDados;
        this.nomeUsuarioDados = nomeUsuarioDados;
    }

    public Usuario(int codUsuario, String nomeUsuario, String email, String senha, int tipo) {
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Usuario(int codUsuario, String nomeUsuario, String email, String senha) {
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nomeUsuario, String email, String senha, int tipo) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String senha, int codUsuario) {
        this.senha = senha;
        this.codUsuario = codUsuario;
    }

    public Usuario(int codUsuarioDadosEmail, String emailUsuarioDadosEmail, String senhaUsuarioDadosEmail) {
        this.codUsuarioDadosEmail = codUsuarioDadosEmail;
        this.emailUsuarioDadosEmail = emailUsuarioDadosEmail;
        this.senhaUsuarioDadosEmail = senhaUsuarioDadosEmail;
    }

    public int getCodUsuarioDadosEmail() {
        return codUsuarioDadosEmail;
    }

    public String getTelefoneUsuarioLista() {
        return telefoneUsuarioLista;
    }

    public void setTelefoneUsuarioLista(String telefoneUsuarioLista) {
        this.telefoneUsuarioLista = telefoneUsuarioLista;
    }

    
    public void setCodUsuarioDadosEmail(int codUsuarioDadosEmail) {
        this.codUsuarioDadosEmail = codUsuarioDadosEmail;
    }

    public String getEmailUsuarioDadosEmail() {
        return emailUsuarioDadosEmail;
    }

    public void setEmailUsuarioDadosEmail(String emailUsuarioDadosEmail) {
        this.emailUsuarioDadosEmail = emailUsuarioDadosEmail;
    }

    public String getSenhaUsuarioDadosEmail() {
        return senhaUsuarioDadosEmail;
    }

    public void setSenhaUsuarioDadosEmail(String senhaUsuarioDadosEmail) {
        this.senhaUsuarioDadosEmail = senhaUsuarioDadosEmail;
    }

    public int getCodUsuarioDados() {
        return codUsuarioDados;
    }

    public String getNomeUsuarioDados() {
        return nomeUsuarioDados;
    }

    public void setNomeUsuarioDados(String nomeUsuarioDados) {
        this.nomeUsuarioDados = nomeUsuarioDados;
    }

    public void setCodUsuarioDados(int codUsuarioDados) {
        this.codUsuarioDados = codUsuarioDados;
    }

    public String getEmailUsuarioDados() {
        return emailUsuarioDados;
    }

    public void setEmailUsuarioDados(String emailUsuarioDados) {
        this.emailUsuarioDados = emailUsuarioDados;
    }

    public int getCodTipoUsuarioDados() {
        return codTipoUsuarioDados;
    }

    public void setCodTipoUsuarioDados(int codTipoUsuarioDados) {
        this.codTipoUsuarioDados = codTipoUsuarioDados;
    }

    public String getCpfUsuarioDados() {
        return cpfUsuarioDados;
    }

    public void setCpfUsuarioDados(String cpfUsuarioDados) {
        this.cpfUsuarioDados = cpfUsuarioDados;
    }

    public String getRgUsuarioDados() {
        return rgUsuarioDados;
    }

    public void setRgUsuarioDados(String rgUsuarioDados) {
        this.rgUsuarioDados = rgUsuarioDados;
    }

    public String getTelefoneUsuarioDados() {
        return telefoneUsuarioDados;
    }

    public void setTelefoneUsuarioDados(String telefoneUsuarioDados) {
        this.telefoneUsuarioDados = telefoneUsuarioDados;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha=" + senha + ", tipo=" + tipo + ", codUsuarioDados=" + codUsuarioDados + ", emailUsuarioDados=" + emailUsuarioDados + ", codTipoUsuarioDados=" + codTipoUsuarioDados + ", cpfUsuarioDados=" + cpfUsuarioDados + ", rgUsuarioDados=" + rgUsuarioDados + ", telefoneUsuarioDados=" + telefoneUsuarioDados + ", nomeUsuarioDados=" + nomeUsuarioDados + ", codUsuarioDadosEmail=" + codUsuarioDadosEmail + ", emailUsuarioDadosEmail=" + emailUsuarioDadosEmail + ", senhaUsuarioDadosEmail=" + senhaUsuarioDadosEmail + '}';
    }

}
