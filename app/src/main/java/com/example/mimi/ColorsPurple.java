package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ColorsPurple extends AppCompatActivity {


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorspurple);

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
        editText =findViewById(R.id.txtmorado);
        hablarAhoraBoton=findViewById(R.id.buttonmorado);

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
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });


        imageButtonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_ok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonNaranjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorsPurple.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(ColorsPurple.this, ColorsGray.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
