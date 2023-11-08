package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class vista4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista4);

        Button btMainLink1 = findViewById(R.id.btTerminado);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista1.class);
            startActivity(intent);
        });

        Button btMainLink2 = findViewById(R.id.btEliminar);
        btMainLink2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista1.class);
            startActivity(intent);
        });
    }
}