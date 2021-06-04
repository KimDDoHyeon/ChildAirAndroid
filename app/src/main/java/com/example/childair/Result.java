package com.example.childair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Result extends AppCompatActivity {

    private TextView tv;
    private ListView listview;
    public List<User> userList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageButton imageButton =findViewById(R.id.btnBoard);
        ImageButton imageButton2 =findViewById(R.id.btnCalen);
        ImageButton imageButton3 =findViewById(R.id.btnFood);
        ImageButton imageButton4 =findViewById(R.id.btnEtc);

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

