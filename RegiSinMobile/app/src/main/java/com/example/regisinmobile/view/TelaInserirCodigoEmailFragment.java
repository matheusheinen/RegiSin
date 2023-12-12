package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regisinmobile.R;
import com.example.regisinmobile.databinding.FragmentTelaInserirCodigoEmailBinding;

public class TelaInserirCodigoEmailFragment extends Fragment {

    FragmentTelaInserirCodigoEmailBinding binding;
    //int valorRecebido = TelaInserirCodigoEmailFragment.fromBundle(getArguments()).getMeuArgumento();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tela_inserir_codigo_email, container, false);
        binding = FragmentTelaInserirCodigoEmailBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}