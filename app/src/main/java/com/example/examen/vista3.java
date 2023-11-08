package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class vista3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista3);

        Button btMainLink1 = findViewById(R.id.btRegresar);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista1.class);
            startActivity(intent);
        });


    }
}