package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity_Colores extends AppCompatActivity {

    ImageButton imageButtonRosa, imageButtonRojo, imageButtonAmarillo, imageButtonVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores);

        imageButtonRosa = (ImageButton) findViewById(R.id.imageButtonRosa);
        imageButtonRojo = (ImageButton) findViewById(R.id.imageButtonRojo);
        imageButtonAmarillo = (ImageButton) findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = (ImageButton) findViewById(R.id.imageButtonVerde);



        imageButtonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_Colores_Amarillo.class);
                startActivity(intent);
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
            }
        });

    }
}
