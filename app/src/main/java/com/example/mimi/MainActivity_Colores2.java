package com.example.mimi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_Colores2 extends AppCompatActivity {
    ImageButton imageButtonRosa, imageButtonRojo, imageButtonAmarillo, imageButtonVerde;
    private Button hablarAhoraBoton;
    private TextView editText;
    Button next3;
    TTSManager ttsManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores2);

        imageButtonRosa = (ImageButton) findViewById(R.id.imageButtonRosa);
        imageButtonRojo = (ImageButton) findViewById(R.id.imageButtonRojo);
        imageButtonAmarillo = (ImageButton) findViewById(R.id.imageButtonAmarillo);
        imageButtonVerde = (ImageButton) findViewById(R.id.imageButtonVerde);

        ttsManager=new TTSManager();
        ttsManager.init(this);

        editText =findViewById(R.id.txtverde);
        hablarAhoraBoton=findViewById(R.id.buttonverde);

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
                Intent intent = new Intent(MainActivity_Colores2.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });


        imageButtonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores2.this, MainActivity_result_ok.class);
                startActivity(intent);
                finish();
            }
        });

        imageButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores2.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });
        imageButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Colores2.this, MainActivity_result_nok.class);
                startActivity(intent);
                finish();
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
