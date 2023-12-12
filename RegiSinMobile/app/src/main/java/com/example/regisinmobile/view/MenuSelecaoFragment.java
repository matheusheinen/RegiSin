package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regisinmobile.R;
import com.example.regisinmobile.databinding.FragmentMenuSelecaoBinding;


public class MenuSelecaoFragment extends Fragment {

    FragmentMenuSelecaoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_menu_selecao, container, false);
        binding = FragmentMenuSelecaoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.bRegistrarSinistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_MenuSelecaoFragment_RegistrarSinistroFragment);
            }
        });

        binding.bEditarInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_MenuSelecaoFragment_EditarInformacoesContatoFragment);
            }
        });

        binding.bSinistrosRegistrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_MenuSelecaoFragment_SinistrosRegistradosFragment);
            }
        });

        binding.bRedefinirSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_MenuSelecaoFragment_RedefinirSenhaFragment);
            }
        });
        binding.bSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.acao_MenuSelecaoFragment_TelaPrincipalFragment);
            }


        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}