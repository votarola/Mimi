package com.example.mimi;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity_o extends AppCompatActivity implements View.OnClickListener {



    private Button hablarAhoraBoton;
    private TextView editText;
    TTSManager ttsManager = null;

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_o);
        setupActionBar();

        findViewById(R.id.LetraA).setOnClickListener(this);
        findViewById(R.id.LetraE).setOnClickListener(this);
        findViewById(R.id.LetraI).setOnClickListener(this);
        findViewById(R.id.LetraO).setOnClickListener(this);
        findViewById(R.id.LetraU).setOnClickListener(this);
        editText = findViewById(R.id.txtletra_o);
        hablarAhoraBoton = findViewById(R.id.btn_letra_o);

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
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LetraO:
                Toasty.success(MainActivity_o.this, "Excelente!!",
                        Toast.LENGTH_SHORT, true).show();
                Intent intent = new Intent(MainActivity_o.this, MainActivity_u.class);
                startActivity(intent);
                MainActivity_o.this.finish();

                break;

            default:
                Toasty.error(MainActivity_o.this, "Vuelve a intentarlo!",
                        Toast.LENGTH_SHORT, true).show();

        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        ttsManager.shutDown();
    }

}
