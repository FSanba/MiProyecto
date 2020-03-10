package com.pmdm.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ListaGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_grid);

        //Listado de libros
        ArrayList listaLibros = new ArrayList<>();
        LibroBean libro=new LibroBean("Viaje a la Alcarria", "Descripcion del libro 1");
        libro.setAutor("Camilo Jose Cela");
        libro.setImagen("https://i2.wp.com/c5.staticflickr.com/1/636/31433230212_5e8844e3ab_b.jpg?resize=618%2C956&ssl=1");
        listaLibros.add(libro);

        libro=new LibroBean("La sombra sobre Innsmouth", "Descripcion del libro 2");
        libro.setAutor("HP Lovecraft");
        libro.setImagen("https://www.choosecthulhu.com/wp-content/uploads/libro-lujo-vol3-choose-cthulhu-la-sombra-sobre-innsmouth.jpg");
        listaLibros.add(libro);

        libro=new LibroBean("100 años de soledad", "Descripcion del libro 3");
        libro.setAutor("Gabriel García Márquez");
        libro.setImagen("https://imagessl8.casadellibro.com/a/l/t5/08/9788497592208.jpg");
        listaLibros.add(libro);

        libro=new LibroBean("El Hobbit", "Descripcion del libro 4");
        libro.setAutor("JRR Tolkien");
        libro.setImagen("https://www.popularlibros.com/imagenes_grandes/9788445/978844507485.JPG");
        listaLibros.add(libro);

        GridView gridView = findViewById(R.id.listaGrid);
        AdaptadorListaGrid adaptador = new AdaptadorListaGrid(this, listaLibros);
        gridView.setAdapter(adaptador);
    }
}
