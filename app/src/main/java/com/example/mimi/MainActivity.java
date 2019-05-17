package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnSaludar,btnjuego;
    EditText IngresaNombre;
    TextView tvmensaje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnSaludar = (Button) findViewById(R.id.btn);
     IngresaNombre = (EditText) findViewById(R.id.txtingresa);
     tvmensaje = (TextView) findViewById(R.id.tvmensaje);
     btnjuego = (Button) findViewById(R.id.btnjuego) ;



     btnSaludar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             String ingresa = IngresaNombre.getText().toString();
            tvmensaje.setText(ingresa + " como estas");



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
