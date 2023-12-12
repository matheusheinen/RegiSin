package modelDominio;

import java.io.Serializable;

public class Evento implements Serializable {

    private static final long serialVersionUID = 123L;

    private int codEvento;
    private String nomeEvento;
    private String cidadeEvento;
    private String dataEvento;
    private String descricaoEvento;
    private Usuario usuario;
    private int totalSinistros;
      private byte[] imagemEvento;

    // novas variáveis para consulta no lista eventos
    
    private String nomeEventoDados;
    private int totalSinistroDados;

    public Evento(int codEvento, String nomeEvento, String cidadeEvento, String dataEvento, String descricaoEvento, Usuario usuario) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.cidadeEvento = cidadeEvento;
        this.dataEvento = dataEvento;
        this.descricaoEvento = descricaoEvento;
        this.usuario = usuario;
    }

    public Evento(String nomeEvento, String cidadeEvento, String dataEvento, String descricaoEvento, Usuario usuario) {
        this.nomeEvento = nomeEvento;
        this.cidadeEvento = cidadeEvento;
        this.dataEvento = dataEvento;
        this.descricaoEvento = descricaoEvento;
        this.usuario = usuario;
    }

    public Evento(int codEvento, String nomeEvento) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
    }

    public Evento(int codEvento) {
        this.codEvento = codEvento;
    }

    public Evento(String nomeEvento, String cidadeEvento, String dataEvento, String descricaoEvento, int totalSinistros) {
        this.nomeEvento = nomeEvento;
        this.cidadeEvento = cidadeEvento;
        this.dataEvento = dataEvento;
        this.descricaoEvento = descricaoEvento;
        this.totalSinistros = totalSinistros;
    }

    public Evento(int codEvento, String nomeEvento, String cidadeEvento, String dataEvento, String descricaoEvento, int totalSinistros) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.cidadeEvento = cidadeEvento;
        this.dataEvento = dataEvento;
        this.descricaoEvento = descricaoEvento;
        this.totalSinistros = totalSinistros;
    }

    public Evento(int codEvento, String nomeEvento, String cidadeEvento, String dataEvento) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.cidadeEvento = cidadeEvento;
        this.dataEvento = dataEvento;
    }

    public Evento() {

    }

    public int getTotalSinistroDados() {
        return totalSinistroDados;
    }

    public void setTotalSinistroDados(int totalSinistroDados) {
        this.totalSinistroDados = totalSinistroDados;
    }
    
    
    
    

    public byte[] getImagemEvento() {
        return imagemEvento;
    }

    public void setImagemEvento(byte[] imagemEvento) {
        this.imagemEvento = imagemEvento;
    }
    
    
    


    public int getTotalSinistros() {
        return totalSinistros;
    }

    public void setTotalSinistros(int totalSinistros) {
        this.totalSinistros = totalSinistros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCidadeEvento() {
        return cidadeEvento;
    }

    public void setCidadeEvento(String cidadeEvento) {
        this.cidadeEvento = cidadeEvento;
    }

    public Evento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getNomeEventoDados() {
        return nomeEventoDados;
    }

    public void setNomeEventoDados(String nomeEventoDados) {
        this.nomeEventoDados = nomeEventoDados;
    }

    
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    @Override
    public String toString() {
        return "Evento{" + "codEvento=" + codEvento + ", nomeEvento=" + nomeEvento + ", cidadeEvento=" + cidadeEvento + ", dataEvento=" + dataEvento + ", descricaoEvento=" + descricaoEvento + ", usuario=" + usuario + ", totalSinistros=" + totalSinistros + ", imagemEvento=" + imagemEvento + ", nomeEventoDados=" + nomeEventoDados + '}';
    }

  

}
