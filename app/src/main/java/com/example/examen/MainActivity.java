package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btMainLink1 = findViewById(R.id.btIniciar);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista1.class);
            startActivity(intent);
        });
    }
}