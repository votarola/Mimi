package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Home extends AppCompatActivity {

    Button btnSaludar;
    Button btnjuego;
    Button btntoast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    // btnSaludar = findViewById(R.id.btn);
     btnjuego = findViewById(R.id.btnjuego);
     btntoast = findViewById(R.id.btntoast);


     btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);

            }
        });

    /* btnSaludar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(Home.this,MainActivityVoz.class);
             startActivity(intent);

         }
     });
     */


     btnjuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ColorsYellow.class);
                startActivity(intent);
            }
        });

     Button btncerrar = (Button) findViewById(R.id.btncerrar);

        //Implementación del botón "Salir"
        btncerrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();

            }
        });

    }
}


//Instant Run Buggy deshabilitar
