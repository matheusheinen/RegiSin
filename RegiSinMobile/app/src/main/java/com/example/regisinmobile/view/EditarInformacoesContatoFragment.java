package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.regisinmobile.R;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentCadastroUsuarioBinding;
import com.example.regisinmobile.databinding.FragmentEditarInformacoesContatoBinding;

import modelDominio.Pessoa;
import modelDominio.Usuario;
import viewModel.InformacoesViewModel;


public class EditarInformacoesContatoFragment extends Fragment {

    FragmentEditarInformacoesContatoBinding binding;

    InformacoesViewModel informacoesViewModel;

    Usuario usuario;

    Pessoa pessoa;

    boolean resultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_editar_informacoes_contato, container, false);
        binding = FragmentEditarInformacoesContatoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // instanciando o viewModel
        informacoesViewModel = new ViewModelProvider(getActivity()).get(InformacoesViewModel.class);

        binding.bSalvarEdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // verficando se o usuário informou os dados
                if (!binding.etNomeCompleto.getText().toString().equals("")) {
                    if (!binding.etEmail.getText().toString().equals("")) {
                        if (!binding.etTelefone.getText().toString().equals("")) {
                                        // obtendo as informações
                                        int codUsuario = informacoesViewModel.getUsuarioLogado().getCodUsuario();
                                        String nomeUsuario = binding.etNomeCompleto.getText().toString();
                                        String email = binding.etEmail.getText().toString();
                                        String telefone = binding.etTelefone.getText().toString();

                                        // instanciando dados do usuário
                                        pessoa = new Pessoa(codUsuario, nomeUsuario, email, telefone);
                                        // criando a thread para cadastro da marca
                                        Thread thread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                ConexaoController conexaoController = new ConexaoController(informacoesViewModel);
                                                resultado = conexaoController.pessoaAlterarInformacoesContato(pessoa);
                                                // tratando o resultado
                                                getActivity().runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (resultado == true) {
                                                            Toast.makeText(getContext(), "Informações editadas com sucesso.", Toast.LENGTH_SHORT).show();
                                                            limpaCampos();
                                                        } else {
                                                            Toast.makeText(getContext(), "Erro: informações não foram editadas.", Toast.LENGTH_SHORT).show();
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                        thread.start();
                        } else {
                            binding.etTelefone.setError("Erro: informe o telefone.");
                            binding.etTelefone.requestFocus();
                        }
                    }else {
                        binding.etEmail.setError("Erro: informe o email.");
                        binding.etEmail.requestFocus();
                    }
                }else {
                    binding.etNomeCompleto.setError("Erro: informe o nome completo.");
                    binding.etNomeCompleto.requestFocus();
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

    public void limpaCampos() {
        binding.etNomeCompleto.setText("");
        binding.etEmail.setText("");
        binding.etTelefone.setText("");
    }
}