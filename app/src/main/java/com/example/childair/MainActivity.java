package com.example.childair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton airBtn = findViewById(R.id.btnAir);
        ImageButton calBtn = findViewById(R.id.btnCalen);

        airBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airgo = new Intent(getApplicationContext(), Dust.class);
                startActivity(airgo);
            }
        });

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calgo = new Intent(getApplicationContext(), Calendar.class);
                startActivity(calgo);
            }
        });

    }
}