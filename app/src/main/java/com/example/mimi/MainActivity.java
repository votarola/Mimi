package com.example.mimi;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner toastSize;
    Button normalToast;
    Button errorToast;
    Button warningToast;
    Button successToast;
    Button infoToast;
    Button iconToast;
    Drawable icon;

    String[] toastTxtSize = {"14", "16", "18", "20", "22", "24", "26"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastSize = findViewById(R.id.spToastSize);
        normalToast = findViewById(R.id.btnNormalToast);
        errorToast = findViewById(R.id.btnErrorToast);
        warningToast = findViewById(R.id.btnWarningToast);
        successToast = findViewById(R.id.btnSuccessToast);
        infoToast = findViewById(R.id.btnInfoToast);
        iconToast = findViewById(R.id.btnIconToast);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this
                , android.R.layout.simple_spinner_dropdown_item, toastTxtSize);
        toastSize.setAdapter(adapter);

        normalToast.setOnClickListener(this);
        errorToast.setOnClickListener(this);
        warningToast.setOnClickListener(this);
        successToast.setOnClickListener(this);
        infoToast.setOnClickListener(this);
        iconToast.setOnClickListener(this);
        icon = getResources().getDrawable(R.drawable.ic_warning_white_48dp);

        toastSize.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
                Toasty.Config.getInstance().setTextSize(Integer.valueOf(adapterView.getSelectedItem()
                        .toString())).apply();
            }

            @Override
            public void onNothingSelected(AdapterView adapterView) {

            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnNormalToast:
                Toasty.normal(MainActivity.this, "This is a normal toast message",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnErrorToast:
                Toasty.error(MainActivity.this, "This is an error toast message",
                        Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.btnWarningToast:
                Toasty.warning(MainActivity.this, "This is a warning toast message",
                        Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.btnSuccessToast:
                Toasty.success(MainActivity.this, "This is a success toast message",
                        Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.btnInfoToast:
                Toasty.info(MainActivity.this, "This is a info toast message",
                        Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.btnIconToast:
                Toasty.normal(MainActivity.this, "This is a toast message with icon",
                        icon).show();
                break;

        }
    }
}