package com.example.mybighomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

    }
}