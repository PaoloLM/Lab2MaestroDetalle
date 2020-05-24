package com.desarrollo.laboratorio2.Adaptador;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desarrollo.laboratorio2.Entidad.LoveLiveVo;
import com.desarrollo.laboratorio2.R;

import java.util.ArrayList;

public class AdaptadorLoveLive extends RecyclerView.Adapter<AdaptadorLoveLive.LoveLiveViewHolder> implements View.OnClickListener{

    ArrayList<LoveLiveVo> ListaLoveLive;
    private View.OnClickListener listener;

    public AdaptadorLoveLive(ArrayList<LoveLiveVo> listaLoveLive) {
        ListaLoveLive = listaLoveLive;
    }

    public LoveLiveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        view.setOnClickListener(this);
        return new LoveLiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LoveLiveViewHolder holder, int position) {
        holder.foto.setImageResource(ListaLoveLive.get(position).getImagen());
        holder.txtNombre.setText(ListaLoveLive.get(position).getNombre());
        holder.txtDescripcion.setText(ListaLoveLive.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return ListaLoveLive.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onClick(view);
        }
    }

    public class LoveLiveViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre, txtDescripcion;
        ImageView foto;

        public LoveLiveViewHolder(View itemView) {
            super(itemView);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
            txtNombre = (TextView) itemView.findViewById(R.id.idNombre);
            txtDescripcion = (TextView) itemView.findViewById(R.id.idDescripcion);
        }
    }
}
