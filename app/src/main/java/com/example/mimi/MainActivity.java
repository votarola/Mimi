package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnSaludar;
    Button btnjuego;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnSaludar = findViewById(R.id.btn);
     btnjuego = findViewById(R.id.btnjuego);



     btnSaludar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this,MainActivityVoz.class);
             startActivity(intent);

         }
     });


     btnjuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Colores.class);
                startActivity(intent);
            }
        });

    }
}


//Instant Run Buggy deshabilitar
