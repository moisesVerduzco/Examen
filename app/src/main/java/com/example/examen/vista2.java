package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class vista2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista2);

        Button btMainLink1 = findViewById(R.id.btLink1Enterado);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista1.class);
            startActivity(intent);
        });
    }
}