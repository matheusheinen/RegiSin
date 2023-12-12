package modelDominio;

import java.io.Serializable;
import modelDominio.Evento;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;

public class Sinistro implements Serializable {

    private static final long serialVersionUID = 123L;

    private int codSinistro;
    private String vitima;
    private Usuario usuario;
    private TipoSinistro tipoSinistro;
    private String cidadeSinistro;
    private String enderecoSinistro;
    private String situacaoSinistro;
    private String descricaoSinistro;
    private String dataSinistro;
    private Evento evento;
    private int codEvento;
    private int codUsuario;
    private byte[] imagemSinistro;
    private int codTipoSinistro;

//    RegiSinUsuario.ccont.usuarioLogado, tipoSinistro, cidadeSinistro, enderecoSinistro, descricaoNecessidadesSinistro, dataSinistro, evento);
    public Sinistro(int codSinistro, Usuario usuario, TipoSinistro tipoSinistro, String cidadeSinistro, String enderecoSinistro, String situacaoSinistro, String descricaoSinistro, String dataSinistro, Evento evento, byte[] imagem) {
        this.codSinistro = codSinistro;
        this.usuario = usuario;
        this.tipoSinistro = tipoSinistro;
        this.cidadeSinistro = cidadeSinistro;
        this.enderecoSinistro = enderecoSinistro;
        this.situacaoSinistro = situacaoSinistro;
        this.descricaoSinistro = descricaoSinistro;
        this.dataSinistro = dataSinistro;
        this.evento = evento;
        this.imagemSinistro = imagem;
    }

    public Sinistro(int codSinistro, String vitima, TipoSinistro tipoSinistro, String cidadeSinistro, String enderecoSinistro, String descricaoSinistro, String dataSinistro, String situacaoSinistro, int codUsuario, int codEvento, byte[] imagem) {
        this.codSinistro = codSinistro;
        this.vitima = vitima;
        this.tipoSinistro = tipoSinistro;
        this.cidadeSinistro = cidadeSinistro;
        this.enderecoSinistro = enderecoSinistro;
        this.descricaoSinistro = descricaoSinistro;
        this.dataSinistro = dataSinistro;
        this.situacaoSinistro = situacaoSinistro;
        this.codUsuario = codUsuario;
        this.codEvento = codEvento;
        this.imagemSinistro = imagem;
    }

    public Sinistro(int codSinistro, String vitima, TipoSinistro tipoSinistro, String cidadeSinistro, String enderecoSinistro, String descricaoSinistro, String dataSinistro, String situacaoSinistro, int codUsuario, int codEvento) {
        this.codSinistro = codSinistro;
        this.vitima = vitima;
        this.tipoSinistro = tipoSinistro;
        this.cidadeSinistro = cidadeSinistro;
        this.enderecoSinistro = enderecoSinistro;
        this.descricaoSinistro = descricaoSinistro;
        this.dataSinistro = dataSinistro;
        this.situacaoSinistro = situacaoSinistro;
        this.codUsuario = codUsuario;
        this.codEvento = codEvento;
    }

    public Sinistro(String vitima, String cidadeSinistro, String situacaoSinistro, String dataSinistro, int codEvento) {
        this.vitima = vitima;
        this.cidadeSinistro = cidadeSinistro;
        this.situacaoSinistro = situacaoSinistro;
        this.dataSinistro = dataSinistro;
        this.codEvento = codEvento;
    }

    public Sinistro(byte[] imagemSinistro) {
        this.imagemSinistro = imagemSinistro;
    }

    public Sinistro() {

    }

    public Sinistro(TipoSinistro tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

    public Sinistro(String situacaoSinistro) {
        this.situacaoSinistro = situacaoSinistro;
    }

    public Sinistro(int codSinistro, String nomeVitima, int codTipoSinistro, String cidadeSinistro, String enderecoSinistro, String descricaoSinistro, String dataSinistro, String situacaoSinistro, int codUsuario, int codEvento, byte[] imagem) {
        this.codSinistro = codSinistro;
        this.vitima = nomeVitima;
        this.codTipoSinistro = codTipoSinistro;
        this.cidadeSinistro = cidadeSinistro;
        this.enderecoSinistro = enderecoSinistro;
        this.descricaoSinistro = descricaoSinistro;
        this.dataSinistro = dataSinistro;
        this.situacaoSinistro = situacaoSinistro;

        this.codUsuario = codUsuario;
        this.codEvento = codEvento;
        this.imagemSinistro = imagem;
    }
    // construtor cadastrar sinistro sem imagem

    public Sinistro(int codTipoSinistro, Usuario usuario, TipoSinistro tipoSinistro, String cidadeSinistro, String enderecoSinistro, String descricaoSinistro, String descricaoSinistro0, String dataSinistro, Evento evento) {
        this.codSinistro = codSinistro;
        this.usuario = usuario;
        this.tipoSinistro = tipoSinistro;
        this.cidadeSinistro = cidadeSinistro;
        this.enderecoSinistro = enderecoSinistro;
        this.situacaoSinistro = situacaoSinistro;
        this.descricaoSinistro = descricaoSinistro;
        this.dataSinistro = dataSinistro;
        this.evento = evento;
    }

    public TipoSinistro getTipoSinistro() {
        return tipoSinistro;
    }

    public void setTipoSinistro(TipoSinistro tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

    public byte[] getImagemSinistro() {
        return imagemSinistro;
    }

    public void setImagemSinistro(byte[] imagemSinistro) {
        this.imagemSinistro = imagemSinistro;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getDataSinistro() {
        return dataSinistro;
    }

    public void setDataSinistro(String dataSinistro) {
        this.dataSinistro = dataSinistro;
    }

    public int getCodTipoSinistro() {
        return codTipoSinistro;
    }

    public void setCodTipoSinistro(int codTipoSinistro) {
        this.codTipoSinistro = codTipoSinistro;
    }

    public Sinistro(Evento evento) {
        this.evento = evento;
    }

    public String getVitima() {
        return vitima;
    }

    public void setVitima(String vitima) {
        this.vitima = vitima;
    }

    public Sinistro(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodSinistro() {
        return codSinistro;
    }

    public void setCodSinistro(int codSinistro) {
        this.codSinistro = codSinistro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCidadeSinistro() {
        return cidadeSinistro;
    }

    public void setCidadeSinistro(String cidadeSinistro) {
        this.cidadeSinistro = cidadeSinistro;
    }

    public String getEnderecoSinistro() {
        return enderecoSinistro;
    }

    public void setEnderecoSinistro(String enderecoSinistro) {
        this.enderecoSinistro = enderecoSinistro;
    }

    public String getSituacaoSinistro() {
        return situacaoSinistro;
    }

    public void setSituacaoSinistro(String situacaoSinistro) {
        this.situacaoSinistro = situacaoSinistro;
    }

    public String getDescricaoSinistro() {
        return descricaoSinistro;
    }

    public void setDescricaoSinistro(String descricaoSinistro) {
        this.descricaoSinistro = descricaoSinistro;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Sinistro{" + "codSinistro=" + codSinistro + ", vitima=" + vitima + ", usuario=" + usuario + ", tipoSinistro=" + tipoSinistro + ", cidadeSinistro=" + cidadeSinistro + ", enderecoSinistro=" + enderecoSinistro + ", situacaoSinistro=" + situacaoSinistro + ", descricaoSinistro=" + descricaoSinistro + ", dataSinistro=" + dataSinistro + ", evento=" + evento + ", codEvento=" + codEvento + ", codUsuario=" + codUsuario + ", imagemSinistro=" + imagemSinistro + '}';
    }

}
