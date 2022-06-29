package com.ice.casino.games.accc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ice.casino.games.R;
import com.ice.casino.games.jgj.Bet;
import com.ice.casino.games.jgj.Rand;
import com.ice.casino.games.jgj.Res;

import java.util.ArrayList;

public class SlloActivity extends AppCompatActivity {

    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;
    public ImageView image7;
    public ImageView image8;
    public ImageView image9;
    public ArrayList<ImageView> arrayList;
    public Button start;
    public TextView textViewScor;
    public TextView textViewBet;
    public TextView textViewWin;
    public Button buttonm;
    public Button buttonp;
    public Button buttonma;

    public ImageView imageView13;
    public TextView textView4;
    public Button button6;
    public Button button7;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        ofmn();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StttActivity.class));
                finishAffinity();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RyllActivity.class));
                finishAffinity();
            }
        });



        if (getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000) == 0) {
            imageView13.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);
            button7.setVisibility(View.VISIBLE);
        }else {
            start();
            new Bet(this);
        }
    }

    protected void start() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewWin.setText("Win : " + 0);
                int h = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
                if (h == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Place your bet", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    if (Bet.fff == false) {
                        int a = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
                        int b = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
                        a -= b;
                        getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", a).apply();
                        textViewScor.setText("Score: " + a);
                    } else {
                        Bet.fff = false;
                    }
                    start.setClickable(false);
                   Rand rand = new Rand(arrayList, SlloActivity.this);
                   rand.random();
                }

            }
        });
    }

    public void rrees() {
        Res res =new Res(arrayList, SlloActivity.this);
        res.reset();
    }

    private void ofmn(){
        arrayList = new ArrayList<>();
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        textViewScor = findViewById(R.id.textViewScor);
        textViewBet = findViewById(R.id.textViewBet);
        textViewWin = findViewById(R.id.textViewWin);

        arrayList.add(image1);
        arrayList.add(image2);
        arrayList.add(image3);
        arrayList.add(image4);
        arrayList.add(image5);
        arrayList.add(image6);
        arrayList.add(image7);
        arrayList.add(image8);
        arrayList.add(image9);
        start = findViewById(R.id.start);
        imageView13 = findViewById(R.id.imageView13);
        textView4 = findViewById(R.id.textView4);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();
        buttonm = findViewById(R.id.buttonm);
        buttonp = findViewById(R.id.buttonp);
        buttonma = findViewById(R.id.buttonma);
        button = findViewById(R.id.button);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), StttActivity.class));
        finishAffinity();
    }
}