package com.example.mimi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mimi.Colors.ColorsYellow;
import com.example.mimi.Numbers.Number3;


public class Home extends AppCompatActivity {

    Button btnSaludar;
    Button btnjuego;
    Button btntoast;
    Button btndados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    // btnSaludar = findViewById(R.id.btn);
     btnjuego = findViewById(R.id.btnjuego);
     btntoast = findViewById(R.id.btntoast);
     btndados = findViewById(R.id.btndados);


     btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);

            }
        });

    btndados.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Home.this, Number3.class);
            startActivity(intent);
        }
    });


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
