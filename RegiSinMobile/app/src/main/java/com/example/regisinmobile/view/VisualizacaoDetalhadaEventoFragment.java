package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regisinmobile.R;
import com.example.regisinmobile.databinding.FragmentVisualizacaoDetalhadaEventoBinding;
import modelDominio.Evento;


public class VisualizacaoDetalhadaEventoFragment extends Fragment {

    FragmentVisualizacaoDetalhadaEventoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_visualizacao_detalhada_evento, container, false);
        binding = FragmentVisualizacaoDetalhadaEventoBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //obtendo os parâmetros recebidos
        VisualizacaoDetalhadaEventoFragmentArgs argumentos = VisualizacaoDetalhadaEventoFragmentArgs.fromBundle(getArguments());
        //obtendo o parâmetro específico
        Evento evento = argumentos.getEvento();

        //mostrando na tela as informações
        binding.tvVisualizaNomeEvento.setText(evento.getNomeEvento());
        binding.tvVisualizaCidadeEvento.setText(String.valueOf(evento.getCidadeEvento()));
        Log.d("Teste", "Data: " + evento.getDataEvento().toString());
        binding.tvVisualizaDataEvento.setText(evento.getDataEvento().toString());
        binding.tvVisualizaDescricaoEvento.setText(evento.getDescricaoEvento());

        binding.bVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_VisualizacaoDetalhadaEventoFragment_TelaPrincipalFragment);
            }

        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}