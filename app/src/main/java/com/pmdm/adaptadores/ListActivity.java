package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list); //activity_list.xml (ListView)

        //Listado de libros
        ArrayList listaLibros = new ArrayList<>();
        listaLibros.add(new LibroBean("100 años de soledad", "Descripcion del primer libro"));
        listaLibros.add(new LibroBean("Viaje a la Alcarria", "Descripcion del segundo libro libro"));

        ListView lista = findViewById(R.id.listaNormal);
        AdaptadorLista adaptador = new AdaptadorLista(this,listaLibros);
        lista.setAdapter(adaptador);
    }
}