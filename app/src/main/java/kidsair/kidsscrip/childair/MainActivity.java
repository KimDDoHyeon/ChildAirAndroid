package kidsair.kidsscrip.childair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.childair.R;

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
    public void onBoardToast(View v){
        Toast.makeText(this, "게시판 준비 중 입니다.", Toast.LENGTH_LONG).show();
    }
    public void onFoodToast(View v){
        Toast.makeText(this, "식단표 준비 중 입니다.", Toast.LENGTH_SHORT).show();
    }
    public void onServiceToast(View v){
        Toast.makeText(this, "서비스 준비 중 입니다.", Toast.LENGTH_LONG).show();
    }
}