package com.example.mybighomework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button mb1 = findViewById(R.id.main_button_1);
        mb1.setOnClickListener(v -> {
            Intent ll = new Intent(this, ManVSManActivity.class);
            startActivity(ll);
        });

        Button mb2 = findViewById(R.id.main_button_2);
        mb2.setOnClickListener(v -> {
            Intent ll = new Intent(this, ManVSAIActivity.class);
            startActivity(ll);
        });

        Button mb3 = findViewById(R.id.main_button_3);
        mb3.setOnClickListener(v -> {
            Intent ll = new Intent(this, InfoActivity.class);
            startActivity(ll);
        });
    }
}