package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.regisinmobile.R;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentRedefinirSenhaBinding;
import com.example.regisinmobile.util.Criptografar;
import com.example.regisinmobile.util.Vigenere;

import modelDominio.Usuario;
import viewModel.InformacoesViewModel;


public class RedefinirSenhaFragment extends Fragment {

    FragmentRedefinirSenhaBinding binding;

    Usuario usuario;

    InformacoesViewModel informacoesViewModel;

    boolean resultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_redefinir_senha, container, false);
        binding = FragmentRedefinirSenhaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);

        binding.bSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // verificando se o usuário informou os dados
                if (!binding.etSenhaAtual.getText().toString().equals("")) {
                    if (!binding.etNovaSenha.getText().toString().equals("")){
                        if (!binding.etConfirmarSenha.getText().toString().equals("")){

                            String senhaAtual = informacoesViewModel.getUsuarioLogado().getSenha();
                            String chaveReginSin = "AZ!*regisin2023";
                            Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                    Criptografar.retirarAcento(senhaAtual));
                            String senhaAtualDescriptografada = vigenere.decriptar();
                            String novaSenha = binding.etNovaSenha.getText().toString();

                            if (binding.etSenhaAtual.getText().toString().equals(senhaAtualDescriptografada)) {

                                String confirmarSenha = binding.etConfirmarSenha.getText().toString();

                                if (confirmarSenha.equals(novaSenha)){

                                    int codUsuario = informacoesViewModel.getUsuarioLogado().getCodUsuario();

                                    Vigenere vigenere2 = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                            Criptografar.retirarAcento(confirmarSenha));
                                    String senha = vigenere2.encriptar();

                                    usuario = new Usuario(senha, codUsuario);

                                    Thread thread = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                            resultado = conexaoController.alterarSenha(usuario);
                                            // tratando o resultado
                                            getActivity().runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (resultado == true) {
                                                        Toast.makeText(getContext(), "Senha alterada com sucesso.", Toast.LENGTH_SHORT).show();
                                                        //limpaCampos();
                                                    } else {
                                                        Toast.makeText(getContext(), "Erro: senha não foi alterada.", Toast.LENGTH_SHORT).show();
                                                    }
                                                }
                                            });
                                        }
                                    });
                                    thread.start();

                                } else {
                                    binding.etConfirmarSenha.setError("Erro: confirmação da senha inválida.");
                                    binding.etConfirmarSenha.requestFocus();
                                }
                            } else {
                                Toast.makeText(getContext(), "Erro: Senha atual inválida", Toast.LENGTH_SHORT).show();
                            }

                        } else {
                            binding.etConfirmarSenha.setError("Erro: informe a confirmação da senha.");
                            binding.etConfirmarSenha.requestFocus();
                        }
                    } else {
                        binding.etNovaSenha.setError("Erro: informe a nova senha.");
                        binding.etNovaSenha.requestFocus();
                    }
                } else {
                    binding.etSenhaAtual.setError("Erro: informe a senha atual.");
                    binding.etSenhaAtual.requestFocus();
                }
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}