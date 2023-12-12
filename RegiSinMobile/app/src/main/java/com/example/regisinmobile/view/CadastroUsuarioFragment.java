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

import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentCadastroUsuarioBinding;
import com.example.regisinmobile.util.Criptografar;
import com.example.regisinmobile.util.Vigenere;


import modelDominio.Pessoa;
import modelDominio.Usuario;
import viewModel.InformacoesViewModel;


public class CadastroUsuarioFragment extends Fragment {

    FragmentCadastroUsuarioBinding binding;

    InformacoesViewModel informacoesViewModel;

    Usuario usuario;

    Vigenere vigenere;

    Pessoa pessoa;

    boolean resultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_cadastro_usuario, container, false);
        binding = FragmentCadastroUsuarioBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // instanciando o viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);
        // programando o clique nos botões
        binding.bCadastroCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // verficando se o usuário informou os dados
                if (!binding.etNomeUsuario.getText().toString().equals("")) {
                    if (!binding.etEmailUsuario.getText().toString().equals("")) {
                        if (!binding.etSenhaUsuario.getText().toString().equals("")) {
                            if (!binding.etCpfUsuario.getText().toString().equals("")) {
                                if (!binding.etRgUsuario.getText().toString().equals("")) {
                                    if (!binding.etTelefoneUsuario.getText().toString().equals("")) {

                                        String senhaDescriptografada = binding.etSenhaUsuario.getText().toString();

                                        //
                                        String chaveReginSin = "AZ!*regisin2023";

                                        Vigenere vigenere = new Vigenere(Criptografar.retirarAcento(chaveReginSin),
                                                Criptografar.retirarAcento(senhaDescriptografada));
                                        String senha = vigenere.encriptar();


                                        // obtendo as informações
                                        String nomeUsuario = binding.etNomeUsuario.getText().toString();
                                        String email = binding.etEmailUsuario.getText().toString();
                                        String cpf = binding.etCpfUsuario.getText().toString();
                                        String rg = binding.etRgUsuario.getText().toString();
                                        String telefone = binding.etTelefoneUsuario.getText().toString();
                                        int tipo = 0;
                                        // instanciando dados do usuário
                                        pessoa = new Pessoa(cpf, rg, telefone, nomeUsuario, senha, email, tipo);
                                        // criando a thread para cadastro do usuário
                                        Thread thread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                                resultado = conexaoController.pessoaRegistrar(pessoa);
                                                // tratando o resultado
                                                getActivity().runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (resultado == true) {
                                                            Toast.makeText(getContext(), "Usuário cadastrado com sucesso.", Toast.LENGTH_SHORT).show();
                                                            limpaCampos();
                                                        } else {
                                                            Toast.makeText(getContext(), "Erro: usuário não cadastrado.", Toast.LENGTH_SHORT).show();
                                                        }
                                                    }
                                                });

                                            }
                                        });
                                        thread.start();

                                    } else {
                                        binding.etTelefoneUsuario.setError("Erro: informe o telefone do usuário.");
                                        binding.etTelefoneUsuario.requestFocus();

                                    }
                                } else {
                                    binding.etRgUsuario.setError("Erro: informe o rg do usuário.");
                                    binding.etRgUsuario.requestFocus();
                                }
                            } else {
                                binding.etCpfUsuario.setError("Erro: informe o cpf do usuário.");
                                binding.etCpfUsuario.requestFocus();
                            }
                        } else {
                            binding.etSenhaUsuario.setError("Erro: informe a senha do usuário.");
                            binding.etSenhaUsuario.requestFocus();
                        }
                    } else {
                        binding.etEmailUsuario.setError("Erro: informe o email do usuário.");
                        binding.etEmailUsuario.requestFocus();
                    }
                } else {
                    binding.etNomeUsuario.setError("Erro: informe o nome do usuário.");
                    binding.etNomeUsuario.requestFocus();
                }
            }
        });

        binding.bCadastroCancelar.setOnClickListener(new View.OnClickListener() {
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

    public void limpaCampos() {
        binding.etNomeUsuario.setText("");
        binding.etEmailUsuario.setText("");
        binding.etSenhaUsuario.setText("");
        binding.etCpfUsuario.setText("");
        binding.etRgUsuario.setText("");
        binding.etTelefoneUsuario.setText("");
    }


}