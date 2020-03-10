package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {

    private GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid); //activity_grid.xml (GridLayout)

        gridLayout = findViewById(R.id.gridPantalla); //obtener el objeto GridLayout

        //Recorrer todos los objetos CardView y definir que pasa al pulsar sobre el botón
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int posicion= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(GridActivity.this,"Pulsado el boton "+ posicion,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}