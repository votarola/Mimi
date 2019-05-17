package com.example.mimi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity_result_ok extends AppCompatActivity {

    Button buttonvolver;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__result_ok);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity_result_ok.this, MainActivity_Colores.class);
                startActivity(intent);
            }
        }, 4000);
    }
}