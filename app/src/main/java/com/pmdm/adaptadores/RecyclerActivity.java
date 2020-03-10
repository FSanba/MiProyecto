package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler); //activity_recycler.xml (RecyclerView)

        ArrayList listaLibros = new ArrayList<>();
        listaLibros.add(new LibroBean("100 años de soledad", "Descripcion del primer libro"));
        listaLibros.add(new LibroBean("Viaje a la Alcarria", "Descripcion del segundo libro libro"));

        RecyclerView vistaRecycler = findViewById(R.id.listaRecycler);
        vistaRecycler.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        vistaRecycler.setLayoutManager(llm);
       /* List

        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(listaLibros);
        vistaRecycler.setAdapter(adaptadorRecycler);*/

        /*vistaRecycler.seton

        vistaRecycler.setOnClickListener(new RecyclerView.OnClickListener() {
            @Override
            public void onClick(View view) {
                String datoLista = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(),"Seleccionado:" + datoLista + " en la posición "+ position,Toast.LENGTH_LONG).show();

            }
        });*/

        /*@Override public void onItemClick(ContentItem item) {
            Toast.makeText(getContext(), "Item Clicked", Toast.LENGTH_LONG).show();
        }*/
    }
}
