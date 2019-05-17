package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity_Colores extends AppCompatActivity {

    ImageButton imageButtonRosa, imageButtonRojo, imageButtonAmarillo, imageButtonVerde;
    Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores);

        imageButtonRosa = (ImageButton) findViewById(R.id.imageButtonRosa);
        imageButtonRojo = (ImageButton) findViewById(R.id.imageButtonRojo);
        imageButtonAmarillo = (ImageButton) findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = (ImageButton) findViewById(R.id.imageButtonVerde);
        next1 = (Button) findViewById(R.id.next1);



        imageButtonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_ok.class);
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
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity_Colores1.class);
                startActivity(intent);

            }
        });

    }
}
