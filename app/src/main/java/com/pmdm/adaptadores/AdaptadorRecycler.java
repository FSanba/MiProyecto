package com.pmdm.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.LibroViewHolder> {

    private ArrayList<LibroBean> listaLibros;
    private final AdaptadorRecycler.OnItemClickListener listener;

    public AdaptadorRecycler(ArrayList<LibroBean> items, OnItemClickListener listener) {
        this.listaLibros = items;
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(LibroBean item);
    }

    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView cajaTitulo;
        public TextView cajaDescripcion;

        public LibroViewHolder(View v) {
            super(v);
            imagen = v.findViewById(R.id.imagenLibro);
            cajaTitulo = v.findViewById(R.id.tituloLibro);
            cajaDescripcion = v.findViewById(R.id.descripcionLibro);
        }

        public void bind(final LibroBean item, final AdaptadorRecycler.OnItemClickListener listener) {
            cajaTitulo.setText(item.getNombre());
            //Picasso.with(itemView.getContext()).load(item.g).into(image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }



    @Override
    public int getItemCount() {
        return listaLibros.size();
    }

    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup viewGroup, int posicion) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lista, viewGroup, false);
        return new LibroViewHolder(item);

        /*View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lista, viewGroup, false);
        //final LibroBean libro=it.getItem(position);
        Log.i("logprueba"," en la posición "+ posicion);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("logprueba"," adfadsfdasf ");
                //item.g
                //Log.i("logprueba"," en la posición "+ posicion);
                //Intent intencion = new Intent(contextPadre, LibroActivity.class);
                //intencion.putExtra("idLibro", libro.getIdLibro());
                //contextPadre.startActivity(intencion);
            }
        });
        return new LibroViewHolder(item);*/
    }

    @Override
    public void onBindViewHolder(LibroViewHolder viewHolder, int posicion) {
        viewHolder.bind(listaLibros.get(posicion), listener);
        //viewHolder.imagen.setImageResource(listaLibros.get(posicion).getImagen());
        /*viewHolder.cajaTitulo.setText(listaLibros.get(posicion).getNombre());
        viewHolder.cajaDescripcion.setText(listaLibros.get(posicion).getDescripcion());*/
    }
}
