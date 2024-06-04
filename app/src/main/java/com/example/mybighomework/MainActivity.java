package com.example.mybighomework;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button mb0 = findViewById(R.id.main_start);
        mb0.setOnClickListener(v -> {
            LinearLayout l1 = findViewById(R.id.lawbox);
            LinearLayout l2 = findViewById(R.id.mainbox);
            l1.setVisibility(View.GONE);
            l2.setVisibility(View.VISIBLE);
        });

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

    public void age_limit(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.notice).setMessage(R.string.noticebody).setPositiveButton(R.string.noticebt, null).create().show();
    }
}