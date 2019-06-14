package com.example.mimi.Colors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.mimi.R;
import com.example.mimi.TTSManager;

import es.dmoral.toasty.Toasty;

public class ColorsOrange extends AppCompatActivity implements View.OnClickListener {


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
        setContentView(R.layout.colorsorange);
        setupActionBar();

        findViewById(R.id.imageButtonRosa).setOnClickListener(this);
        findViewById(R.id.imageButtonAmarillo).setOnClickListener(this);
        findViewById(R.id.imageButtonVerde).setOnClickListener(this);
        findViewById(R.id.imageButtonRojo).setOnClickListener(this);
        findViewById(R.id.imageButtonMorado).setOnClickListener(this);
        findViewById(R.id.imageButtonGris).setOnClickListener(this);
        findViewById(R.id.imageButtonNaranjo).setOnClickListener(this);
        findViewById(R.id.imageButtonAzul).setOnClickListener(this);
        findViewById(R.id.imageButtonNegro).setOnClickListener(this);
        editText = findViewById(R.id.txtorange);
        hablarAhoraBoton = findViewById(R.id.buttonorange);

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
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButtonNaranjo:
                Toasty.success(ColorsOrange.this, "Excelente!!",
                        Toast.LENGTH_SHORT, true).show();
                Intent intent = new Intent(ColorsOrange.this, ColorsBlue.class);
                startActivity(intent);
                ColorsOrange.this.finish();

                break;

            default:
                Toasty.error(ColorsOrange.this, "Vuelve a intentarlo!",
                        Toast.LENGTH_SHORT, true).show();

        }
    }
}
