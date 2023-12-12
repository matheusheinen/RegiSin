package com.example.regisinmobile.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regisinmobile.controller.ConexaoController;
import com.example.regisinmobile.databinding.ItemListRowSinistroBinding;

import java.util.ArrayList;
import java.util.List;


import modelDominio.Sinistro;
import modelDominio.TipoSinistro;
import viewModel.InformacoesViewModel;


public class SinistroAdapter extends RecyclerView.Adapter<SinistroAdapter.MyViewHolder> {
    private List<Sinistro> listaSinistro;
    private SinistroOnClickListener sinistroOnClickListener;

    InformacoesViewModel informacoesViewModel;

    public SinistroAdapter(ArrayList<Sinistro> listaSinistro, SinistroOnClickListener sinistroOnClickListener) {
        this.listaSinistro = listaSinistro;
        this.sinistroOnClickListener = sinistroOnClickListener;
    }

    @Override
    public SinistroAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemListRowSinistroBinding itemListRowSinistroBinding = ItemListRowSinistroBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(itemListRowSinistroBinding);
    }

    @Override
    public void onBindViewHolder(final SinistroAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Sinistro sinistro = listaSinistro.get(position);

        holder.itemListRowSinistroBinding.tvTipoSinistro.setText(sinistro.getTipoSinistro().getNomeTipoSinistro());
        holder.itemListRowSinistroBinding.tvCidade.setText(sinistro.getCidadeSinistro());
        holder.itemListRowSinistroBinding.tvVitima.setText(sinistro.getVitima());
        holder.itemListRowSinistroBinding.tvEndereco.setText(sinistro.getEnderecoSinistro());
        holder.itemListRowSinistroBinding.tvSituacao.setText(sinistro.getSituacaoSinistro());


        // tratando o clique no item
        if (sinistroOnClickListener != null) {
            holder.itemListRowSinistroBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sinistroOnClickListener.onClickSinistro(holder.itemView, position, sinistro);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return listaSinistro.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public  ItemListRowSinistroBinding itemListRowSinistroBinding;
        public MyViewHolder(ItemListRowSinistroBinding itemListRowSinistroBinding) {
            super(itemListRowSinistroBinding.getRoot());
            this.itemListRowSinistroBinding = itemListRowSinistroBinding;
        }
    }

    public interface SinistroOnClickListener {
        public void onClickSinistro(View view, int position, Sinistro sinistro);
    }
}
