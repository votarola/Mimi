package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_Colores extends AppCompatActivity {

    ImageButton imageButtonRosa, imageButtonRojo, imageButtonAmarillo, imageButtonVerde;
    Button next1;
    private Button hablarAhoraBoton;
    private TextView editText;
    TTSManager ttsManager=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores);

        imageButtonRosa = (ImageButton) findViewById(R.id.imageButtonRosa);
        imageButtonRojo = (ImageButton) findViewById(R.id.imageButtonRojo);
        imageButtonAmarillo = (ImageButton) findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = (ImageButton) findViewById(R.id.imageButtonVerde);
        next1 = (Button) findViewById(R.id.next1);

        ttsManager=new TTSManager();
        ttsManager.init(this);

        editText =findViewById(R.id.txtamarillo);
        hablarAhoraBoton=findViewById(R.id.buttonamarillo);

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
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_ok.class);
                startActivity(intent);
                finish();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity_Colores1.class);
                startActivity(intent);
                finish();

            }
        });

    }
            @Override
            protected void onDestroy() {
                super.onDestroy();
                ttsManager.shutDown();
            }
}
