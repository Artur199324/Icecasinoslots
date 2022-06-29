package com.ice.casino.games.accc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ice.casino.games.R;

public class StttActivity extends AppCompatActivity {

    Button button2;
    Button button3;
    Button button4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sttt);
        lk();
        kjh();



        textView.setText("Score: " + getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000));
    }

    public void lk(){
        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
        button2 = findViewById(R.id.button2);
    }

    public void kjh(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SlloActivity.class));
                finishAffinity();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RyllActivity.class));
                finishAffinity();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}