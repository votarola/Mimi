package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ColorsRed extends AppCompatActivity {

    ImageButton imageButtonRosa,
                imageButtonAmarillo,
                imageButtonVerde,
                imageButtonRojo,
                imageButtonMorado,
                imageButtonGris,
                imageButtonNaranjo,
                imageButtonAzul,
                imageButtonNegro;
    Button next1;
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
        setContentView(R.layout.colorsred);
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
        editText =findViewById(R.id.txtred);
        hablarAhoraBoton=findViewById(R.id.buttonred);

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

        imageButtonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_ok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });


        imageButtonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        imageButtonGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        imageButtonNaranjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        imageButtonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        imageButtonNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsRed.this, MainActivity_result_nok.class);
                startActivity(intent);
                ColorsRed.this.finish();
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(ColorsRed.this, ColorsPurple.class);
                startActivity(intent);
                ColorsRed.this.finish();

            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
}
