package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.regisinmobile.R;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentRegistrarSinistroBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import modelDominio.Evento;
import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import modelDominio.Usuario;
import viewModel.InformacoesViewModel;

public class RegistrarSinistroFragment extends Fragment {

    FragmentRegistrarSinistroBinding binding;
    InformacoesViewModel informacoesViewModel;
    ArrayList<Evento> listaEventos;
    ArrayList<TipoSinistro> listaTipoSinistro;

    TipoSinistro tipoSinistro;
    boolean resultado;

    boolean resultadoAlterarTotalSinistro;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_registrar_sinistro, container, false);
        binding = FragmentRegistrarSinistroBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // obtendo a instância do viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);
        // criando a thread para obtenção da lista de eventos
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // obtendo a lista de eventos
                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                listaEventos = conexaoController.eventoLista();
                listaTipoSinistro = conexaoController.tipoSinistroLista();
                // verificando os eventos recebidas
                if (listaEventos != null) {
                    //sincronizando as threads para carregar o spinner
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            carregaSpinnerEventos(listaEventos);
                        }
                    });
                }
                if (listaTipoSinistro != null) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            carregaSpinnerTipoSinistros(listaTipoSinistro);
                        }
                    });
                }
            }
        });
        thread.start();



        // programando o clique nos botões
        binding.bRegistrarSinistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // verificando se o usuário informou os dados
                if (binding.spEventoSinistro.getSelectedItemPosition() > 0) {
                    if (binding.spTipoSinistro.getSelectedItemPosition() > 0) {
                        if (!binding.etDataSinistro.getText().toString().equals("")) {
                            if (!binding.etCidadeSinistro.getText().toString().equals("")) {
                                if (!binding.etEnderecoSinistro.getText().toString().equals("")) {
                                    if (!binding.etNecessidadesSinistro.getText().toString().equals("")) {
                                // obtendo as informações
                                // obtendo a sinistro selecionada no Spinner (lembrrar que foi adicionado o <<Selecionar>> na primeira posição

                                        Usuario usuario = informacoesViewModel.getUsuarioLogado();
                                        TipoSinistro tipoSinistro = listaTipoSinistro.get(binding.spTipoSinistro.getSelectedItemPosition() - 1);
                                        String cidadeSinistro = binding.etCidadeSinistro.getText().toString();
                                        String enderecoSinistro = binding.etEnderecoSinistro.getText().toString();
                                        String situacaoSinistro = null;
                                        String descricaoSinistro = binding.etNecessidadesSinistro.getText().toString();
                                        String dataSinistro = binding.etDataSinistro.getText().toString();
                                        Evento evento = listaEventos.get(binding.spEventoSinistro.getSelectedItemPosition() - 1);
                                        byte[] imagemSinistro = null;

                                // instanciando a sinistro
                                Sinistro sinistro = new Sinistro(usuario, tipoSinistro, cidadeSinistro, enderecoSinistro, situacaoSinistro, descricaoSinistro, dataSinistro, evento, imagemSinistro);

                                // criando a thread para cadastro da sinistro
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        // realizando o cadastro do sinistro
                                        ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                        resultado = conexaoController.sinistroRegistrar(sinistro);
                                        // sincronizando as threads para tratar o resultado
                                        getActivity().runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (resultado == true) {
                                                    Thread thread1 = new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                                            int codEvento = evento.getCodEvento();
                                                            Evento dadosEvento = conexaoController.dadosEvento(codEvento);
                                                            int totalSinistro = dadosEvento.getTotalSinistroDados();
                                                            totalSinistro++;

                                                            resultadoAlterarTotalSinistro = conexaoController.alterarTotalSinistro(totalSinistro, codEvento);

                                                        }
                                                    });
                                                    thread1.start();
                                                    Toast.makeText(getContext(), "Sinistro cadastrada com sucesso.", Toast.LENGTH_SHORT).show();
                                                    limpaCampos();
                                                } else {
                                                    Toast.makeText(getContext(), "Erro: sinistro não cadstrada.", Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        });
                                    }
                                });
                                thread.start();


                                    } else {
                                        binding.etNecessidadesSinistro.setError("Erro: informe as necessidades.");
                                        binding.etNecessidadesSinistro.requestFocus();
                                    }
                                } else {
                                    binding.etEnderecoSinistro.setError("Erro: informe o endereço.");
                                    binding.etEnderecoSinistro.requestFocus();
                                }
                            } else {
                                binding.etCidadeSinistro.setError("Erro: informe a cidade.");
                                binding.etCidadeSinistro.requestFocus();
                            }
                        } else {
                            binding.etDataSinistro.setError("Erro: informe a data.");
                            binding.etDataSinistro.requestFocus();
                        }
                    } else {
                        Toast.makeText(getContext(), "Erro: informe o tipo do sinistro.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Erro: informe o evento.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.bCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpaCampos();
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    // método responsável por carregar o spinner a partir da lista de Eventos
    // OBS 1: poderia ser utilizado a própria lista da classe e não receber como parâmetro
    // OBS 2: deixei recebendo a lista como parâmetro para ja ter como exemplo no caso de desejar criar uma classe para carregar o spinner
    public void carregaSpinnerEventos(ArrayList<Evento> listaEventos) {
        // declarando o vetor com os nomes dos Eventos
        String[] nomesEventos = new String[listaEventos.size() + 1];
        // carregando o vetor com os nomes dos Eventos
        nomesEventos[0] = "<< Selecionar >>"; // adicionando o selecionar na primeira posição (lembrar disso quando obter o objeto a partir do spinner)
        for (int x = 0; x < listaEventos.size(); x++) {
            Evento evento = listaEventos.get(x);
            nomesEventos[x + 1] = evento.getNomeEvento();
        }
        // definindo o adapter (conteúdo) do spinner
        binding.spEventoSinistro.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, nomesEventos));
    }

    public void carregaSpinnerTipoSinistros(ArrayList<TipoSinistro> listaTipoSinistro) {
        // declarando o vetor com os nomes dos Eventos
        String[] nomesTipoSinistros = new String[listaTipoSinistro.size() + 1];
        // carregando o vetor com os nomes dos Eventos
        nomesTipoSinistros[0] = "<< Selecionar >>"; // adicionando o selecionar na primeira posição (lembrar disso quando obter o objeto a partir do spinner)
        for (int x = 0; x < listaTipoSinistro.size(); x++) {
            tipoSinistro = listaTipoSinistro.get(x);
            nomesTipoSinistros[x + 1] = tipoSinistro.getNomeTipoSinistro();
        }
        // definindo o adapter (conteúdo) do spinner
        binding.spTipoSinistro.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, nomesTipoSinistros));
    }

    public void limpaCampos(){
        binding.etEnderecoSinistro.setText("");
        binding.etCidadeSinistro.setText("");
        binding.etNecessidadesSinistro.setText("");
        binding.etDataSinistro.setText("");
        binding.spTipoSinistro.setSelection(0);
        binding.spEventoSinistro.setSelection(0);

    }

}