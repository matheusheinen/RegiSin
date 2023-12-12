package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.regisinmobile.R;
import com.example.regisinmobile.adapter.EventoAdapter;
import com.example.regisinmobile.adapter.SinistroAdapter;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentSinistrosRegistradosBinding;

import java.util.ArrayList;

import modelDominio.Evento;
import modelDominio.Sinistro;
import viewModel.InformacoesViewModel;

public class SinistrosRegistradosFragment extends Fragment {

    FragmentSinistrosRegistradosBinding binding;

    SinistroAdapter sinistroAdapter;

    ArrayList<Sinistro> listaSinistro;

    InformacoesViewModel informacoesViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sinistros_registrados, container, false);
        binding = FragmentSinistrosRegistradosBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // obtendo a instância do viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);

        // criando a thread para obtenção da lista de bikes
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // obtendo a lista de bikes
                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                listaSinistro = conexaoController.sinistroLista();
                // verificando se recebeu bikes
                if (listaSinistro != null) {
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

        sinistroAdapter = new SinistroAdapter(listaSinistro, trataCliqueItem);
        binding.rvVisualizaSinistros.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvVisualizaSinistros.setItemAnimator(new DefaultItemAnimator());
        binding.rvVisualizaSinistros.setAdapter(sinistroAdapter);


    }

    SinistroAdapter.SinistroOnClickListener trataCliqueItem = new SinistroAdapter.SinistroOnClickListener() {
        @Override
        public void onClickSinistro(View view, int position, Sinistro sinistro) {
            Toast.makeText(getContext(), "Sinistro -> Tipo do Sinistro: " + sinistro.getTipoSinistro().getNomeTipoSinistro() +
                    ", Vítima: " + sinistro.getVitima()+
                    ", Situacao: " + sinistro.getSituacaoSinistro() +
                    ", Cidade: " + sinistro.getCidadeSinistro(), Toast.LENGTH_SHORT).show();
            //TelaPrincipalFragmentDirections.AcaoTelaPrincipalFragmentVisualizacaoDetalhadaEventoFragment acao = TelaPrincipalFragmentDirections.acaoTelaPrincipalFragmentVisualizacaoDetalhadaEventoFragment(evento);
            //Navigation.findNavController(view).navigate(acao);
        }
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}