package com.pmdm.adaptadores;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdaptadorListaGrid extends ArrayAdapter<LibroBean> {

    //Llegan dos parametros, context (será la actividad que llame a esta clase) y datos (array de información de datos a mostrar)
    public AdaptadorListaGrid(Context context, ArrayList datos) {
        super(context, R.layout.item_lista, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtener el item del layout item_lista
        View item = LayoutInflater.from(getContext()).inflate(R.layout.item_listagrid, null);

        //Obtener los objetos de item_listagrid
        TextView cajaTextoTitulo =  item.findViewById(R.id.tituloLibro);
        TextView cajaAutorTitulo =  item.findViewById(R.id.autorLibro);
        ImageView cajaImagen = item.findViewById(R.id.imagenLibro);

        //Guardar información en el item del listado (solo guardamos el nombre del libro)
        final LibroBean libro=this.getItem(position);
        cajaAutorTitulo.setText(libro.getNombre());
        cajaTextoTitulo.setText(libro.getAutor());
        Picasso.get().load(libro.getImagen()).into(cajaImagen);

        //Accion al pulsar sobre el item, va a la pantalla que muestra detalles del libro pasandole como parametro el identificador
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("logprueba","Libro:"+libro.getAutor());
                //Intent intencion = new Intent(contextPadre, LibroActivity.class);
                //intencion.putExtra("idLibro", libro.getAutor());
                //contextPadre.startActivity(intencion);
            }
        });
        return item;
    }
}