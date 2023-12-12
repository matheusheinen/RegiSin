package com.example.regisinmobile.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.regisinmobile.R;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentLoginBinding;
import com.example.regisinmobile.util.Criptografar;
import com.example.regisinmobile.util.Vigenere;


import modelDominio.Usuario;
import viewModel.InformacoesViewModel;


public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;

    InformacoesViewModel informacoesViewModel;

    boolean resultado;

    Usuario usuarioLogado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false);
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //obtendo a instância do viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);
        //criando a thread para conexão com o servidor socket
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //criando a conexão com o servidor
                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                resultado = conexaoController.criaConexaoServidor("192.168.56.1", 12345);
                //sincronizando as threads para agir sobre a tela
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (resultado == true) {
                            Toast.makeText(getContext(), "Conexão estabelecida com sucesso.", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "Erro: conexão com servidor não efetuada", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        thread.start();


        // programando o clique nos botões
        binding.bLoginEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String senhaDescriptografada = new String(binding.etLoginSenha.getText().toString());
                // verificando se o usuário informou os dados
                if (!binding.etLoginUsuario.getText().toString().equals("")) {
                    if (!senhaDescriptografada.equals("")) {

                        String chaveReginSin = "AZ!*regisin2023";

                        Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                Criptografar.retirarAcento(senhaDescriptografada));
                        String senha = vigenere.encriptar();

                        // obtendo as informações
                        String email = binding.etLoginUsuario.getText().toString();
                        //instanciando o usuário que está se logando
                        usuarioLogado = new Usuario(senha, email);
                        //criando a thread para autenticar o usuário
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                // efetuando a autenticação do usuário
                                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                usuarioLogado = conexaoController.efetuarLogin(usuarioLogado);
                                // sincronizando as threads para agir sobre a tela
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (usuarioLogado != null) {
                                            //salvando usuário logado
                                            informacoesViewModel.inicializaUsuarioLogado(usuarioLogado);
                                            //chamando a próxima tela
                                            Navigation.findNavController(view).navigate(R.id.acao_LoginFragment_TelaPrincipalFragment);
                                            limpaCampos();
                                        } else {
                                            Toast.makeText(getContext(), "Erro: e-mail e/ou senha inválidos.", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }
                        });
                        thread.start();


                    } else {
                        binding.etLoginSenha.setError("Erro: informe a senha.");
                        binding.etLoginSenha.requestFocus();
                    }
                } else {
                    binding.etLoginUsuario.setError("Erro: informe o e-mail.");
                    binding.etLoginUsuario.requestFocus();
                }
            }
        });

        binding.bLoginCadastarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Navigation.findNavController(view).navigate(R.id.acao_LoginFragment_CadastroUsuarioFragment);
                limpaCampos();
            }
        });

        binding.tvRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.acao_LoginFragment_RecuperarSenhaFragment);
                limpaCampos();
            }
        });

    }


    public void limpaCampos() {
        binding.etLoginUsuario.setText("");
        binding.etLoginSenha.setText("");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }
}