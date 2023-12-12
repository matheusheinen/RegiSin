package modelDominio;

import java.io.Serializable;

public class TipoSinistro implements Serializable {

    private static final long serialVersionUID = 123L;
    private int codTipoSinistro;
    private String nomeTipoSinistro;
    private Sinistro sinistro;

    // variáveis para tipo literal
    private int codTipoSinistroDados;
    private String nomeTipoSinistroDados;

    public TipoSinistro(int codTipoSinistro, String nomeTipoSinistro) {
        this.codTipoSinistro = codTipoSinistro;
        this.nomeTipoSinistro = nomeTipoSinistro;
    }

    public TipoSinistro(int codTipoSinistro, Sinistro sinistro) {
        this.codTipoSinistro = codTipoSinistro;
        this.sinistro = sinistro;
    }

    public TipoSinistro(String nomeTipoSinistro) {
        this.nomeTipoSinistro = nomeTipoSinistro;
    }

    public TipoSinistro(int codTipoSinistro) {
        this.codTipoSinistro = codTipoSinistro;
    }

    public TipoSinistro() {

    }

    public int getCodTipoSinistroDados() {
        return codTipoSinistroDados;
    }

    public void setCodTipoSinistroDados(int codTipoSinistroDados) {
        this.codTipoSinistroDados = codTipoSinistroDados;
    }

    public String getNomeTipoSinistroDados() {
        return nomeTipoSinistroDados;
    }

    public void setNomeTipoSinistroDados(String nomeTipoSinistroDados) {
        this.nomeTipoSinistroDados = nomeTipoSinistroDados;
    }

    public String getNomeTipoSinistro() {
        return nomeTipoSinistro;
    }

    public void setNomeTipoSinistro(String nomeTipoSinistro) {
        this.nomeTipoSinistro = nomeTipoSinistro;
    }

    public TipoSinistro(Sinistro sinistro) {
        this.sinistro = sinistro;
    }

    public Sinistro getSinistro() {
        return sinistro;
    }

    public int getCodTipoSinistro() {
        return codTipoSinistro;
    }

    public void setCodTipoSinistro(int codTipoSinistro) {
        this.codTipoSinistro = codTipoSinistro;
    }

    public void setSinistro(Sinistro sinistro) {
        this.sinistro = sinistro;
    }

    @Override
    public String toString() {
        return "TipoSinistro{" + "codTipoSinistro=" + codTipoSinistro + ", nomeTipoSinistro=" + nomeTipoSinistro + ", sinistro=" + sinistro + ", codTipoSinistroDados=" + codTipoSinistroDados + ", nomeTipoSinistroDados=" + nomeTipoSinistroDados + '}';
    }

}