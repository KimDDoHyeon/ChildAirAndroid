package com.example.childair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Search extends AppCompatActivity {

    private  Button Btn;
    private EditText et;
    private  String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

       // et = findViewById(R.id.et);


       // Btn=findViewById(R.id.Btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et.getText().toString();
                Intent intent = new Intent(Search.this, Result.class);
                intent.putExtra("str", str);
                startActivity(intent); //액티비티 이동.
            }
        });




    }

}