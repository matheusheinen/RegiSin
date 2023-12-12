package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.regisinmobile.R;
import com.example.regisinmobile.adapter.EventoAdapter;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentTelaPrincipalBinding;

import modelDominio.Evento;

import java.util.ArrayList;



import viewModel.InformacoesViewModel;


public class TelaPrincipalFragment extends Fragment {

    FragmentTelaPrincipalBinding binding;

    EventoAdapter eventoAdapter;

    InformacoesViewModel informacoesViewModel;

    ArrayList<Evento> listaEventos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tela_principal, container, false);
        binding = FragmentTelaPrincipalBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.bMenuSelecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(view).navigate(R.id.acao_TelaPrincipalFragment_MenuSelecaoFragment);

            }
        });

        // obtendo a instância do viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);

        // criando a thread para obtenção da lista de bikes
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // obtendo a lista de bikes
                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                listaEventos = conexaoController.eventoLista();
                // verificando se recebeu bikes
                if (listaEventos != null) {
                    // sincronizando as threads para lista-las
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            atualizaListagem();
                        }
                    });
                }
            }
        });
        thread.start();
    }

    public void atualizaListagem() {

        eventoAdapter = new EventoAdapter(listaEventos, trataCliqueItem);
        binding.rvVisualizaEventos.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvVisualizaEventos.setItemAnimator(new DefaultItemAnimator());
        binding.rvVisualizaEventos.setAdapter(eventoAdapter);


    }

    EventoAdapter.EventoOnClickListener trataCliqueItem = new EventoAdapter.EventoOnClickListener() {
        @Override
        public void onClickEvento(View view, int position, Evento evento) {
            //Toast.makeText(getContext(), "Evento -> Nome: " + evento.getNomeEvento() +
                    //", Cidade: " + evento.getCidadeEvento()+
                    //", Descricao: " + evento.getDescricaoEvento() +
                    //", Data: " + evento.getDataEvento(), Toast.LENGTH_SHORT).show();
            TelaPrincipalFragmentDirections.AcaoTelaPrincipalFragmentVisualizacaoDetalhadaEventoFragment acao = TelaPrincipalFragmentDirections.acaoTelaPrincipalFragmentVisualizacaoDetalhadaEventoFragment(evento);
            Navigation.findNavController(view).navigate(acao);
        }
    };



    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}