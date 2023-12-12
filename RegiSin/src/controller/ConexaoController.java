package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Entidade;
import modelDominio.Evento;
import modelDominio.Pessoa;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;

public class ConexaoController {

    private ObjectInputStream in;
    private ObjectOutputStream out;

    public Usuario usuarioLogado;

    public ConexaoController(ObjectInputStream in, ObjectOutputStream out) {
        this.in = in;
        this.out = out;
    }

    // -------- Usuário
    public Usuario efetuarLogin(Usuario usuario) {
        Usuario usuarioLogado;
        String mensagem;
        try {
            out.writeObject("UsuarioEfetuarLogin");
            mensagem = (String) in.readObject();
            out.writeObject(usuario);
            usuarioLogado = (Usuario) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            usuarioLogado = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            usuarioLogado = null;
        }
        return usuarioLogado;
    }

    public boolean alterarSenha(Usuario usuario) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("AlterarSenha");
            mensagem = (String) in.readObject();
            out.writeObject(usuario);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<Usuario> usuarioLista() {
        ArrayList<Usuario> listaUsuarios;
        try {
            out.writeObject("UsuarioLista");
            listaUsuarios = (ArrayList<Usuario>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaUsuarios = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaUsuarios = null;
        }
        return listaUsuarios;
    }

    public ArrayList<Usuario> usuarioListaNome(String nome) {
        ArrayList<Usuario> listaUsuarios;
        String mensagem;
        try {
            out.writeObject("UsuarioListaNome");
            mensagem = (String) in.readObject();
            out.writeObject(nome);
            listaUsuarios = (ArrayList<Usuario>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaUsuarios = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaUsuarios = null;
        }
        return listaUsuarios;
    }

    public boolean usuarioExcluir(int codUsuario) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("UsuarioExcluir");
            mensagem = (String) in.readObject();
            out.writeObject(codUsuario);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    // ------ Entidade -------
    public boolean entidadeRegistrar(Entidade entidade) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("EntidadeRegistrar");
            mensagem = (String) in.readObject();
            out.writeObject(entidade);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            resultado = false;
        }
        return resultado;
    }

    // ------ Pessoa -------
    public boolean pessoaRegistrar(Pessoa pessoa) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("PessoaRegistrar");
            mensagem = (String) in.readObject();
            out.writeObject(pessoa);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            resultado = false;
        }
        return resultado;
    }

    // ------ Evento -------
    public boolean eventoRegistrar(Evento evento) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("EventoRegistrar");
            mensagem = (String) in.readObject();
            out.writeObject(evento);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<Evento> eventoLista() {
        ArrayList<Evento> listaEventos;
        try {
            out.writeObject("EventoLista");
            listaEventos = (ArrayList<Evento>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaEventos = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    public ArrayList<Evento> eventoListaNome(String nome) {
        ArrayList<Evento> listaEventos;
        String mensagem;
        try {
            out.writeObject("EventoListaNome");
            mensagem = (String) in.readObject();
            out.writeObject(nome);
            listaEventos = (ArrayList<Evento>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaEventos = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    public ArrayList<Evento> eventoListaData(String data) {
        ArrayList<Evento> listaEventos;
        String mensagem;
        try {
            out.writeObject("EventoListaData");
            mensagem = (String) in.readObject();
            out.writeObject(data);
            listaEventos = (ArrayList<Evento>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaEventos = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    public ArrayList<Evento> eventoListaCidade(String cidade) {
        ArrayList<Evento> listaEventos;
        String mensagem;
        try {
            out.writeObject("EventoListaCidade");
            mensagem = (String) in.readObject();
            out.writeObject(cidade);
            listaEventos = (ArrayList<Evento>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaEventos = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    // ------ Tipo Sinistro -------
    public boolean tipoSinistroInserir(TipoSinistro tipoSinistro) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("TipoSinistroInserir");
            mensagem = (String) in.readObject();
            out.writeObject(tipoSinistro);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<TipoSinistro> tipoSinistroLista() {
        ArrayList<TipoSinistro> listaTipoSinistro;
        try {
            out.writeObject("TipoSinistroLista");
            listaTipoSinistro = (ArrayList<TipoSinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaTipoSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaTipoSinistro = null;
        }
        return listaTipoSinistro;
    }

    // ------ Sinistro -------
    public boolean sinistroRegistrar(Sinistro sinistro) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("SinistroRegistrar");
            mensagem = (String) in.readObject();
            out.writeObject(sinistro);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<Sinistro> sinistroLista() {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroLista");
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }
    public boolean sinistroExcluir(int codSinistro) {
        boolean resultado;
        String mensagem;
        try {
            out.writeObject("SinistroExcluir");
            mensagem = (String) in.readObject();
            out.writeObject(codSinistro);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<Sinistro> sinistroListaVitima(String vitima) {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroListaVitima");
            mensagem = (String) in.readObject();
            out.writeObject(vitima);
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }

    public ArrayList<Sinistro> sinistroListaData(String data) {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroListaData");
            mensagem = (String) in.readObject();
            out.writeObject(data);
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }
    
      public ArrayList<Sinistro> sinistroListaDesktop(String a) {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroListaDesktop");
            mensagem = (String) in.readObject();
            out.writeObject(a);
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }
    public ArrayList<Sinistro> sinistroListaCidade(String cidade) {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroListaCidade");
            mensagem = (String) in.readObject();
            out.writeObject(cidade);
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }

    public ArrayList<Sinistro> sinistroListaSituacao(String situacao) {
        ArrayList<Sinistro> listaSinistro;
        String mensagem;
        try {
            out.writeObject("SinistroListaSituacao");
            mensagem = (String) in.readObject();
            out.writeObject(situacao);
            listaSinistro = (ArrayList<Sinistro>) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }

    public Usuario dadosUsuario(int codUsuario) {
        Usuario dadosUsuario = new Usuario();
        String mensagem;
        try {
            out.writeObject("BuscarDadosUsuario");
            mensagem = (String) in.readObject();
            out.writeObject(codUsuario);
            dadosUsuario = (Usuario) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            dadosUsuario = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            dadosUsuario = null;
        }
        return dadosUsuario;
    }

    public Usuario buscarEmailUsuario(String emailUsuario) {
        Usuario dadosUsuarioEmail = new Usuario();
        String mensagem;
        try {
            out.writeObject("BuscarEmailUsuario");
            mensagem = (String) in.readObject();
            out.writeObject(emailUsuario);
            dadosUsuarioEmail = (Usuario) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            dadosUsuarioEmail = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            dadosUsuarioEmail = null;
        }
        return dadosUsuarioEmail;
    }

    public Evento dadosEvento(int codEvento) {
        Evento dadosEvento = new Evento();
        String mensagem;
        try {
            out.writeObject("BuscarDadosEvento");
            mensagem = (String) in.readObject();
            out.writeObject(codEvento);
            dadosEvento = (Evento) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            dadosEvento = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            dadosEvento = null;
        }
        return dadosEvento;
    }

    public TipoSinistro dadosTipoSinistro(int codTipoSinistro) {
        TipoSinistro dadosTipoSinistro = new TipoSinistro();
        String mensagem;
        try {
            out.writeObject("BuscarDadosTipoSinistro");
            mensagem = (String) in.readObject();
            out.writeObject(codTipoSinistro);
            dadosTipoSinistro = (TipoSinistro) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            dadosTipoSinistro = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            dadosTipoSinistro = null;
        }
        return dadosTipoSinistro;
    }

    public boolean alterarTotalSinistro(int totalSinistro, int codEvento) {
        boolean resultado;

        String mensagem;
        try {
            out.writeObject("AlterarTotalSinistro");
            mensagem = (String) in.readObject();
            out.writeObject(totalSinistro);
            mensagem = (String) in.readObject();
            out.writeObject(codEvento);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public boolean alterarSituacaoSinistro(int codSinistro, String situacaoSinistro) {
        boolean resultado;

        String mensagem;
        try {
            out.writeObject("AlterarSituacaoSinistro");
            mensagem = (String) in.readObject();
            out.writeObject(codSinistro);
            mensagem = (String) in.readObject();
            out.writeObject(situacaoSinistro);
            resultado = (Boolean) in.readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public void fim() {
        try {
            out.writeObject("fim");
            in.close();
            out.close();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        }
    }

}
