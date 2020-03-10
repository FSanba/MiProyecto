package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button objetoBotonSpinner = findViewById(R.id.botonSpinner);
        objetoBotonSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(), SpinnerActivity.class);
                startActivity(intencion);
            }
        });

        Button objetoBotonListado = findViewById(R.id.botonLista);
        objetoBotonListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intencion);
            }
        });

        Button objetoBotonListadoGrid = findViewById(R.id.botonListaGrid);
        objetoBotonListadoGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(), ListaGridActivity.class);
                startActivity(intencion);
            }
        });

        Button objetoBotonRecycler = findViewById(R.id.botonRecycler);
        objetoBotonRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(), RecyclerActivity.class);
                startActivity(intencion);
            }
        });

        Button objetoBotonGrid = findViewById(R.id.botonGrid);
        objetoBotonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(), GridActivity.class);
                startActivity(intencion);
            }
        });
    }
}
