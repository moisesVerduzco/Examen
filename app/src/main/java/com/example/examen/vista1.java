package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class vista1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista1);

        Button btMainLink1 = findViewById(R.id.btirVista2);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista2.class);
            startActivity(intent);
        });




        Button btMainLink2 = findViewById(R.id.btirVista3);
        btMainLink2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista3.class);
            startActivity(intent);
        });


        Button btMainLink3 = findViewById(R.id.btirVista4);
        btMainLink3.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), vista4.class);
            startActivity(intent);
        });
    }
}