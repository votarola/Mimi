package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;


public class ColorsYellow extends AppCompatActivity  {

    ImageButton imageButtonRosa,
                imageButtonAmarillo,
                imageButtonVerde,
                imageButtonRojo,
                imageButtonMorado,
                imageButtonGris,
                imageButtonNaranjo,
                imageButtonAzul,
                imageButtonNegro,
                successToast;
    private Button hablarAhoraBoton;
    private TextView editText;
    TTSManager ttsManager=null;


    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)  {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorsyellow);
        setupActionBar();

        imageButtonRosa = findViewById(R.id.imageButtonRosa);
        imageButtonAmarillo = findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = findViewById(R.id.imageButtonVerde);
        imageButtonRojo = findViewById(R.id.imageButtonRojo);
        imageButtonMorado = findViewById(R.id.imageButtonMorado);
        imageButtonGris = findViewById(R.id.imageButtonGris);
        imageButtonNaranjo = findViewById(R.id.imageButtonNaranjo);
        imageButtonAzul = findViewById(R.id.imageButtonAzul);
        imageButtonNegro = findViewById(R.id.imageButtonNegro);
        editText = findViewById(R.id.txtamarillo);
        hablarAhoraBoton = findViewById(R.id.buttonamarillo);

//metodo que llama al textvoz

        ttsManager = new TTSManager();
        ttsManager.init(this);

        hablarAhoraBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });





        imageButtonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(ColorsYellow.this, MainActivity_result_ok.class);
                //startActivity(intent);
                Toasty.success(ColorsYellow.this, "Excelente, sigamos con la siguiente",
                    Toast.LENGTH_SHORT, true).show();

                Intent intent = new Intent(ColorsYellow.this, ColorsPink.class);
                startActivity(intent);
                ColorsYellow.this.finish();


            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();

            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonNaranjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsYellow.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });




    }

            @Override
            protected void onDestroy() {
                super.onDestroy();
                ttsManager.shutDown();
            }
}

