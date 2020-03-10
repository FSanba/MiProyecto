package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        cargarLista();
    }

    private void cargarLista() {

        //XML con datos de planetas
        ArrayAdapter<String> adaptador1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        adaptador1.addAll(getResources().getStringArray(R.array.planetas)); //identificador del xml donde se encuentra la información

        //Array dinámico con libros
        ArrayList listaLibros = new ArrayList<>();
        listaLibros.add(new LibroBean("100 años de soledad", "Descripcion del primer libro"));
        listaLibros.add(new LibroBean("Viaje a la Alcarria", "Descripcion del segundo libro libro"));
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listaLibros);

        //Layout usuado para representar los datos en el Spinner (es opcional)
        adaptador1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Añadir el adaptador que quieras (adaptador1 o adaptador2) a la vista del spinner
        Spinner vistaSpinner = findViewById(R.id.listaSpinner);
        vistaSpinner.setAdapter(adaptador1);

        //Definimos que pasa cuando pulsamos sobre un elemento de la lista
        vistaSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String datoLista = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(),"Seleccionado:" + datoLista + " en la posición "+ position,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}