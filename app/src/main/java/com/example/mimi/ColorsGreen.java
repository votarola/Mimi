package com.example.mimi;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class ColorsGreen extends AppCompatActivity {
    ImageButton imageButtonRosa,
                imageButtonAmarillo,
                imageButtonVerde,
                imageButtonRojo,
                imageButtonMorado,
                imageButtonGris,
                imageButtonNaranjo,
                imageButtonAzul,
                imageButtonNegro;
    private Button hablarAhoraBoton;
    private TextView editText;
    Button next1;
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
        setContentView(R.layout.colorsgreen);
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
        next1= findViewById(R.id.next1);
        editText =findViewById(R.id.txtverde);
        hablarAhoraBoton=findViewById(R.id.buttonverde);

//metodo que llama al textvoz
        ttsManager=new TTSManager();
        ttsManager.init(this);

        hablarAhoraBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });

        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toasty.success(ColorsGreen.this, "Excelente, sigamos con la siguiente",
                        Toast.LENGTH_SHORT, true).show();
                ColorsGreen.this.finish();

                Intent intent = new Intent(ColorsGreen.this, ColorsRed.class);
                startActivity(intent);
                ColorsGreen.this.finish();


            }
        });

        imageButtonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonNaranjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
                        Toast.LENGTH_SHORT, true).show();
            }
        });

        imageButtonNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ColorsGreen.this, "Error, vuelve a intentar",
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

