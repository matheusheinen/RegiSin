package com.example.regisinmobile.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Properties;
import java.util.Random;
import android.content.Intent;


import com.example.regisinmobile.R;
import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.FragmentRecuperarSenhaBinding;
import com.example.regisinmobile.util.Criptografar;
import com.example.regisinmobile.util.Vigenere;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import modelDominio.Usuario;
import viewModel.InformacoesViewModel;


public class RecuperarSenhaFragment extends Fragment {

    FragmentRecuperarSenhaBinding binding;

    InformacoesViewModel informacoesViewModel;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_recuperar_senha, container, false);
        binding = FragmentRecuperarSenhaBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.bEnviarEmail.setOnClickListener(new View.OnClickListener() {
            ConexaoController conexaoController = new ConexaoController(informacoesViewModel);

            @Override
            public void onClick(View view) {
                if (!binding.etEmailInserido.getText().toString().equals("")) {

                    Thread thread = new Thread(new Runnable() {

                        @Override
                        public void run() {

                            Random gerador = new Random();
                            int codigoRedefinir = (gerador.nextInt(999999) + 10000);

                            String remetente = "regisin2023@gmail.com";
                            String senhaRemetente = "exlpzgjpzzjrmfvn";
                            String destinatario = binding.etEmailInserido.getText().toString();
                            String assunto = "Recuperação de senha RegiSin";
                            String mensagem = "Foi solicitada uma alteração de senha para seu usuário."
                                    + "Seu código de redefinição é o seguinte: " + codigoRedefinir;


                            System.out.println(senhaRemetente);


                            Properties properties = new Properties();
                            properties.put("mail.smtp.auth", "true");
                            //properties.put("mail.smtp.starttls.enable", "true");
                            properties.put("mail.smtp.host", "smtp.gmail.com");
                            properties.put("mail.smtp.port", "465");
                            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
                            properties.put("mail.smtp.ssl.enable", "true");


                            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(remetente, senhaRemetente);
                                }
                            });


                            try {
                                Message message = new MimeMessage(session);
                                message.setFrom(new InternetAddress(remetente));
                                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
                                message.setSubject(assunto);
                                message.setText(mensagem);

                                Transport.send(message);

                                //Toast.makeText(getContext(), "E-mail enviado com sucesso!", Toast.LENGTH_SHORT).show();


                                Navigation.findNavController(view).navigate(R.id.acao_RecuperarSenhaFragment_TelaInserirCodigoEmailFragment);


                            } catch (MessagingException e) {
                                //Toast.makeText(getContext(), "Erro ao enviar e-mail: ", Toast.LENGTH_SHORT).show();
                            }
                        }

                    });
                    thread.start();


                } else {
                    Toast.makeText(getContext(), "Erro: Informe seu email", Toast.LENGTH_SHORT).show();
                }

            }

        });



    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}