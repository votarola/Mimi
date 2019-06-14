package com.example.mimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityVoz extends AppCompatActivity {


    private Button hablarAhoraBoton;
    private EditText editText;
    TTSManager ttsManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_voz);

        ttsManager=new TTSManager();
        ttsManager.init(this);

        editText =findViewById(R.id.input_text);
        hablarAhoraBoton=findViewById(R.id.speak_now);

        hablarAhoraBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }


}
