package com.example.childair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Result extends AppCompatActivity {

    private TextView tv;
    private TextView tv1;
    public List<User> userList ;
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
        tv1=findViewById(R.id.tv1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv.setText(str);
        initLoadDB();
    }
    private void initLoadDB() {

        DataAdapter mDbHelper = new DataAdapter(getApplicationContext());
        mDbHelper.createDatabase();
        mDbHelper.open();

        // db에 있는 값들을 model을 적용해서 넣는다.
        userList = mDbHelper.getTableData();
        TextView tv1 = (TextView) findViewById(R.id.tv1);


        mDbHelper.close();
        tv1.setText(userList.get(100).getDust1());



        // db 닫기

    }

}