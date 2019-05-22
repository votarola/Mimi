package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_Colores1 extends AppCompatActivity {

    ImageButton imageButtonRosa, imageButtonRojo, imageButtonAmarillo, imageButtonVerde;
    Button panrosado;
    private Button hablarAhoraBoton;
    private TextView editText;
    TTSManager ttsManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores1);

        imageButtonRosa = (ImageButton) findViewById(R.id.imageButtonRosa);
        imageButtonRojo = (ImageButton) findViewById(R.id.imageButtonRojo);
        imageButtonAmarillo = (ImageButton) findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = (ImageButton) findViewById(R.id.imageButtonVerde);

        ttsManager=new TTSManager();
        ttsManager.init(this);
        panrosado= (Button) findViewById(R.id.panrosado);
        editText =findViewById(R.id.txtrosado);
        hablarAhoraBoton=findViewById(R.id.buttonrosado);

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
                Intent intent = new Intent(MainActivity_Colores1.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores1.this, MainActivity_result_ok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores1.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores1.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        panrosado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity_Colores1.this, MainActivity_Colores2.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
