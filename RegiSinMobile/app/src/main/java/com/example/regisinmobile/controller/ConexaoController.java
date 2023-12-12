package com.example.regisinmobile.controller;

import android.util.Log;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import modelDominio.Evento;
import modelDominio.Pessoa;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;
import viewModel.InformacoesViewModel;

public class ConexaoController {

    InformacoesViewModel informacoesViewModel;

    public ConexaoController(InformacoesViewModel informacoesViewModel) {
        this.informacoesViewModel = informacoesViewModel;
    }

    public boolean criaConexaoServidor(String ip, int porta) {
        boolean resultado;
        try {
            // inicializando a conexão socket
            Socket socket = new Socket(ip, porta);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            // salvando as informações no viewModel
            informacoesViewModel.inicializaObjetosSocket(in, out);
            resultado = true;
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public Usuario efetuarLogin(Usuario usuario) {
        Usuario usuarioLogado;
        String mensagem;

        try {
            this.informacoesViewModel.getOutputStream().writeObject("UsuarioEfetuarLogin");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(usuario);
            usuarioLogado = (Usuario) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            usuarioLogado = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            usuarioLogado = null;
        }

        return usuarioLogado;
    }

    public boolean alterarSenha(Usuario usuario) {
        boolean resultado;
        String mensagem;

        try {
            this.informacoesViewModel.getOutputStream().writeObject("AlterarSenha");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(usuario);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }

        return resultado;
    }

    // ------------ Usuário -------------

    public boolean pessoaRegistrar(Pessoa pessoa) {
        boolean resultado;
        String mensagem;

        try {
            this.informacoesViewModel.getOutputStream().writeObject("PessoaRegistrar");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(pessoa);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }

        return resultado;
    }

    public boolean pessoaAlterarInformacoesContato(Pessoa pessoa) {
        boolean resultado;
        String mensagem;

        try {
            this.informacoesViewModel.getOutputStream().writeObject("PessoaAlterarInformacoesContato");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(pessoa);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }

        return resultado;
    }

    // ---------- Evento ------------
    public ArrayList<Evento> eventoLista() {
        ArrayList<Evento> listaEventos;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("EventoLista");
            listaEventos = (ArrayList<Evento>) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            listaEventos = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            listaEventos = null;
        }
        return listaEventos;
    }

    // ------------ TipoSinistro -------------
    public boolean tipoSinistroInserir(TipoSinistro tipoSinistro) {
        boolean resultado;
        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("TipoSinistroInserir");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(tipoSinistro);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public ArrayList<TipoSinistro> tipoSinistroLista() {
        ArrayList<TipoSinistro> listaTipoSinistro;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("TipoSinistroLista");
            listaTipoSinistro = (ArrayList<TipoSinistro>) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            listaTipoSinistro = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            listaTipoSinistro = null;
        }
        return listaTipoSinistro;
    }

    // ------ Sinistro -------
    public boolean sinistroRegistrar(Sinistro sinistro) {
        boolean resultado;
        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("SinistroRegistrar");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(sinistro);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public ArrayList<Sinistro> sinistroLista() {
        ArrayList<Sinistro> listaSinistro;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("SinistroLista");
            listaSinistro = (ArrayList<Sinistro>) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            listaSinistro = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            listaSinistro = null;
        }
        return listaSinistro;
    }

    public boolean alterarTotalSinistro(int totalSinistro, int codEvento) {
        boolean resultado;

        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("AlterarTotalSinistro");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(totalSinistro);
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(codEvento);
            resultado = (Boolean) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            resultado = false;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            resultado = false;
        }
        return resultado;
    }

    public Evento dadosEvento(int codEvento) {
        Evento dadosEvento = new Evento();
        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("BuscarDadosEvento");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(codEvento);
            dadosEvento = (Evento) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            dadosEvento = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            dadosEvento = null;
        }
        return dadosEvento;
    }

    public TipoSinistro dadosTipoSinistro(int codTipoSinistro) {
        TipoSinistro dadosTipoSinistro = new TipoSinistro();
        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("BuscarDadosTipoSinistro");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(codTipoSinistro);
            dadosTipoSinistro = (TipoSinistro) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            Log.e("regisin", "Erro: " + ioe.getMessage());
            dadosTipoSinistro = null;
        } catch (ClassNotFoundException classe) {
            Log.e("regisin", "Erro: " + classe.getMessage());
            dadosTipoSinistro = null;
        }
        return dadosTipoSinistro;
    }

    public Usuario buscarEmailUsuario(String emailUsuario) {
        Usuario dadosUsuarioEmail = new Usuario();
        String mensagem;
        try {
            this.informacoesViewModel.getOutputStream().writeObject("BuscarEmailUsuario");
            mensagem = (String) this.informacoesViewModel.getInputStream().readObject();
            this.informacoesViewModel.getOutputStream().writeObject(emailUsuario);
            dadosUsuarioEmail = (Usuario) this.informacoesViewModel.getInputStream().readObject();
        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.getMessage());
            dadosUsuarioEmail = null;
        } catch (ClassNotFoundException classe) {
            System.out.println("Erro: " + classe.getMessage());
            dadosUsuarioEmail = null;
        }
        return dadosUsuarioEmail;
    }


}