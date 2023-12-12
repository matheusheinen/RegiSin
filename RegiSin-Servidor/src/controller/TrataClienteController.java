package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import model.EntidadeDao;
import model.EventoDao;
import model.UsuarioDao;
import model.PessoaDao;
import model.SinistroDao;
import model.TipoSinistroDao;
import modelDominio.Entidade;
import modelDominio.Evento;
import modelDominio.Pessoa;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;

public class TrataClienteController extends Thread {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int idUnico;

    public TrataClienteController(Socket socket, int idUnico) {
        this.socket = socket;
        this.idUnico = idUnico;
        try {
            this.in = new ObjectInputStream(this.socket.getInputStream());
            this.out = new ObjectOutputStream(this.socket.getOutputStream());
            this.start();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        }
    }

    @Override
    public void run() {

        String comando;
        System.out.println("Esperando comandos do cliente: " + idUnico);

        try {
            comando = (String) in.readObject();
            while (!comando.equalsIgnoreCase("fim")) {
                System.out.println("Cliente " + idUnico + " enviou o comando: " + comando);
                if (comando.equalsIgnoreCase("UsuarioEfetuarLogin")) {
                    out.writeObject("ok");
                    Usuario usuario = (Usuario) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    Usuario usuarioLogado = usuarioDao.efetuarLogin(usuario);
                    out.writeObject(usuarioLogado);
                } else if (comando.equalsIgnoreCase("PessoaRegistrar")) {
                    out.writeObject("ok");
                    Pessoa pessoa = (Pessoa) in.readObject();
                    PessoaDao pessoaDao = new PessoaDao();
                    boolean resultado = pessoaDao.registrar(pessoa);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("PessoaAlterarInformacoesContato")) {
                    out.writeObject("ok");
                    Pessoa pessoa = (Pessoa) in.readObject();
                    PessoaDao pessoaDao = new PessoaDao();
                    boolean resultado = pessoaDao.alterarInformacoesContato(pessoa);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("EventoRegistrar")) {
                    out.writeObject("ok");
                    Evento evento = (Evento) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    boolean resultado = eventoDao.registrarEvento(evento);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("EventoLista")) {
                    EventoDao eventoDao = new EventoDao();
                    ArrayList<Evento> listaEventos = eventoDao.getListaEventos(null, null, null);
                    out.writeObject(listaEventos);
                } else if (comando.equalsIgnoreCase("TipoSinistroInserir")) {
                    out.writeObject("ok");
                    TipoSinistro tipoSinistro = (TipoSinistro) in.readObject();
                    TipoSinistroDao tipoSinistroDao = new TipoSinistroDao();
                    boolean resultado = tipoSinistroDao.inserir(tipoSinistro);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("TipoSinistroLista")) {
                    TipoSinistroDao tipoSinistroDao = new TipoSinistroDao();
                    ArrayList<TipoSinistro> listaTipoSinistro = tipoSinistroDao.getListaTipoSinistro();
                    out.writeObject(listaTipoSinistro);
                } else if (comando.equalsIgnoreCase("SinistroRegistrar")) {
                    out.writeObject("ok");
                    Sinistro sinistro = (Sinistro) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    boolean resultado = sinistroDao.registrarSinistro(sinistro);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("SinistroLista")) {
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(null, null, null, null, null);
                    out.writeObject(listaSinistro);
                } else if (comando.equalsIgnoreCase("EntidadeRegistrar")) {
                    out.writeObject("ok");
                    Entidade entidade = (Entidade) in.readObject();
                    EntidadeDao entidadeDao = new EntidadeDao();
                    boolean resultado = entidadeDao.registrar(entidade);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("AlterarSenha")) {
                    out.writeObject("ok");
                    Usuario usuario = (Usuario) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    boolean resultado = usuarioDao.alterarSenha(usuario);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("BuscarDadosUsuario")) {
                    out.writeObject("ok");
                    int codUsuario = (int) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    Usuario dadosUsuario = usuarioDao.dadosUsuario(codUsuario);
                    out.writeObject(dadosUsuario);
                } else if (comando.equalsIgnoreCase("BuscarEmailUsuario")) {
                    out.writeObject("ok");
                    String emailUsuario = (String) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    Usuario dadosUsuarioEmail = usuarioDao.buscarEmailUsuario(emailUsuario);
                    out.writeObject(dadosUsuarioEmail);
                } else if (comando.equalsIgnoreCase("BuscarDadosEvento")) {
                    out.writeObject("ok");
                    int codEvento = (int) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    Evento dadosEvento = eventoDao.dadosEvento(codEvento);
                    out.writeObject(dadosEvento);
                } else if (comando.equalsIgnoreCase("BuscarDadosTipoSinistro")) {
                    out.writeObject("ok");
                    int codTipoSinistro = (int) in.readObject();
                    TipoSinistroDao tipoSinistroDao = new TipoSinistroDao();
                    TipoSinistro dadosTipoSinistro = tipoSinistroDao.nomeTipoSinistroLiteral(codTipoSinistro);
                    out.writeObject(dadosTipoSinistro);
                } else if (comando.equalsIgnoreCase("AlterarTotalSinistro")) {
                    out.writeObject("ok");
                    int totalSinistros = (int) in.readObject();
                    out.writeObject("ok");
                    int codEvento = (int) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    boolean resultado = eventoDao.alterarTotalSinistro(totalSinistros, codEvento);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("AlterarSituacaoSinistro")) {
                    out.writeObject("ok");
                    int codSinistro = (int) in.readObject();
                    out.writeObject("ok");
                    String situacaoSinistro = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    boolean resultado = sinistroDao.alterarSituacaoSinistro(codSinistro, situacaoSinistro);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("EventoListaNome")) {
                    out.writeObject("ok");
                    String nome = (String) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    ArrayList<Evento> listaEventos = eventoDao.getListaEventos(nome, null, null);
                    out.writeObject(listaEventos);
                } else if (comando.equalsIgnoreCase("EventoListaData")) {
                    out.writeObject("ok");
                    String data = (String) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    ArrayList<Evento> listaEventos = eventoDao.getListaEventos(null, data, null);
                    out.writeObject(listaEventos);
                } else if (comando.equalsIgnoreCase("EventoListaCidade")) {
                    out.writeObject("ok");
                    String cidade = (String) in.readObject();
                    EventoDao eventoDao = new EventoDao();
                    ArrayList<Evento> listaEventos = eventoDao.getListaEventos(null, null, cidade);
                    out.writeObject(listaEventos);
                } else if (comando.equalsIgnoreCase("SinistroListaVitima")) {
                    out.writeObject("ok");
                    String vitima = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(null, vitima, null, null, null);
                    out.writeObject(listaSinistro);
                } else if (comando.equalsIgnoreCase("SinistroListaData")) {
                    out.writeObject("ok");
                    String data = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(null, null, data, null, null);
                    out.writeObject(listaSinistro);
                } else if (comando.equalsIgnoreCase("SinistroListaCidade")) {
                    out.writeObject("ok");
                    String cidade = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(null, null, null, cidade, null);
                    out.writeObject(listaSinistro);
                } else if (comando.equalsIgnoreCase("SinistroListaSituacao")) {
                    out.writeObject("ok");
                    String situacao = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(null, null, null, null, situacao);
                    out.writeObject(listaSinistro);
                } else if (comando.equalsIgnoreCase("SinistroExcluir")) {
                    out.writeObject("ok");
                    int codSinistro = (Integer) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    boolean resultado = sinistroDao.excluirSinistro(codSinistro);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("UsuarioLista")) {
                    UsuarioDao usuarioDao = new UsuarioDao();
                    int a = 0;
                    ArrayList<Usuario> listaUsuarios = usuarioDao.getListaUsuarios(null);
                    out.writeObject(listaUsuarios);
                } else if (comando.equalsIgnoreCase("UsuarioListaNome")) {
                    out.writeObject("ok");
                    String nome = (String) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    int a = 0;
                    ArrayList<Usuario> listaUsuarios = usuarioDao.getListaUsuarios(nome);
                    out.writeObject(listaUsuarios);
                } else if (comando.equalsIgnoreCase("UsuarioExcluir")) {
                    out.writeObject("ok");
                    int codUsuario = (Integer) in.readObject();
                    UsuarioDao usuarioDao = new UsuarioDao();
                    boolean resultado = usuarioDao.excluirUsuario(codUsuario);
                    out.writeObject(resultado);
                } else if (comando.equalsIgnoreCase("SinistroListaDesktop")) {
                    out.writeObject("ok");
                    String a = (String) in.readObject();
                    SinistroDao sinistroDao = new SinistroDao();
                    ArrayList<Sinistro> listaSinistro = sinistroDao.getListaSinistro(a, null, null, null, null);
                    out.writeObject(listaSinistro);
                }
                comando = (String) in.readObject();
            }

        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
        }
        try {

            System.out.println("Cliente " + idUnico + " finalizou a conexão.");
            in.close();
            out.close();
            socket.close();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
        }

    }

}
