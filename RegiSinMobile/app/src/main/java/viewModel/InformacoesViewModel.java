package viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import modelDominio.Evento;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelDominio.Usuario;

public class InformacoesViewModel extends ViewModel {
    //informações necessários para o socket
    private MutableLiveData<ObjectInputStream> mIn;
    private MutableLiveData<ObjectOutputStream> mOut;

    //informações sobre o usuário do aplicativo
    private MutableLiveData<Usuario> mUsuarioLogado;

    private MutableLiveData<ArrayList<Evento>> mListaEventos;

    public void inicializaObjetosSocket(ObjectInputStream in, ObjectOutputStream out) {
        //instanciando os mutableliveData
        this.mIn = new MutableLiveData<>();
        this.mOut = new MutableLiveData<>();
        // definindo os objetos recibidos por parâmetro
        this.mIn.postValue(in);
        this.mOut.postValue(out);
    }

    public void inicializaUsuarioLogado(Usuario usuarioLogado) {
        // instanciando o mutableliveData
        this.mUsuarioLogado = new MutableLiveData<>();
        // definindo os objeto recibido por parâmetro
        this.mUsuarioLogado.postValue(usuarioLogado);
    }

    public ObjectInputStream getInputStream() {
        return this.mIn.getValue();
    }

    public ObjectOutputStream getOutputStream() {
        return this.mOut.getValue();
    }

    public Usuario getUsuarioLogado() {
        return this.mUsuarioLogado.getValue();
    }

    public ArrayList<Evento> getListaEventos() {
        if (mListaEventos == null) {
            mListaEventos = new MutableLiveData<>();
            ArrayList<Evento> listaEventos = new ArrayList<>();
            mListaEventos.setValue(listaEventos);
        }
        return mListaEventos.getValue();
    }
}