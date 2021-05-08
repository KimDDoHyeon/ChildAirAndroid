package com.example.childair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageButton imageButton =findViewById(R.id.imageButton1);
        ImageButton imageButton2 =findViewById(R.id.imageButton2);
        ImageButton imageButton3 =findViewById(R.id.imageButton3);
        ImageButton imageButton4 =findViewById(R.id.imageButton4);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Result.this, ChildBoard.class);
                startActivity(i);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Result.this, Calendar.class);
                startActivity(i);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Result.this, FoodMenu.class);
                startActivity(i);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Result.this, FoodMenu.class);
                startActivity(i);
            }
        });
        tv = findViewById(R.id.tv);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv.setText(str);
    }

}