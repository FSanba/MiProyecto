package com.pmdm.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorLista extends ArrayAdapter<LibroBean> {

    //Llegan dos parametros, context (será la actividad que llame a esta clase) y datos (array de información de datos a mostrar)
    public AdaptadorLista(Context context, ArrayList datos) {
        super(context, R.layout.item_lista, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtener el item del layout item_lista
        View item = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, null);

        //Guardar información en el item del listado (solo guardamos el nombre del libro)
        final LibroBean libro=this.getItem(position);

        ImageView objetoImagen = item.findViewById(R.id.imagenLibro);
        TextView objetoTextoTitulo =  item.findViewById(R.id.tituloLibro);
        TextView objetoTextoDescripcion= item.findViewById(R.id.descripcionLibro);
        //objetoImagen.setImageResource(libro.getImageId()); //en este ejemplo no se cargan imágenes en el CardView
        objetoTextoTitulo.setText(libro.getNombre());
        objetoTextoDescripcion.setText(libro.getDescripcion());

        //Accion al pulsar sobre el item, va a la pantalla que muestra detalles del libro pasandole como parametro el identificador
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intencion = new Intent(contextPadre, LibroActivity.class);
                //intencion.putExtra("idLibro", libro.getIdLibro());
                //contextPadre.startActivity(intencion);
            }
        });
        return item;
    }
}