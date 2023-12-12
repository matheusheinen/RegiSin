package com.example.regisinmobile.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.regisinmobile.databinding.ItemListRowEventoBinding;

import java.util.ArrayList;
import java.util.List;

import modelDominio.Evento;

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.MyViewHolder>{
    private List<Evento> listaEventos;
    private EventoOnClickListener eventoOnClickListener;

    public EventoAdapter(ArrayList<Evento> listaEventos, EventoOnClickListener eventoOnClickListener) {
        this.listaEventos = listaEventos;
        this.eventoOnClickListener = eventoOnClickListener;
    }


    @Override
    public EventoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemListRowEventoBinding itemListRowEventoBinding = ItemListRowEventoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(itemListRowEventoBinding);
    }

    @Override
    public void onBindViewHolder(final EventoAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Evento evento = listaEventos.get(position);
        holder.itemListRowEventoBinding.tvEventoNome.setText(evento.getNomeEvento());
        holder.itemListRowEventoBinding.tvEventoCidade.setText(evento.getCidadeEvento());
        holder.itemListRowEventoBinding.tvEventoData.setText(evento.getDataEvento());


        // tratando o clique no item
        if (eventoOnClickListener != null) {
            holder.itemListRowEventoBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    eventoOnClickListener.onClickEvento(holder.itemView, position, evento);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return listaEventos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public  ItemListRowEventoBinding itemListRowEventoBinding;
        public MyViewHolder(ItemListRowEventoBinding itemListRowEventoBinding) {
            super(itemListRowEventoBinding.getRoot());
            this.itemListRowEventoBinding = itemListRowEventoBinding;
        }
    }

    public interface EventoOnClickListener {
        public void onClickEvento(View view, int position, Evento evento);
    }
}
