package com.ice.casino.games.jgj;

import android.os.Handler;
import android.widget.ImageView;

import com.ice.casino.games.accc.SlloActivity;
import com.ice.casino.games.R;

import java.util.ArrayList;
import java.util.Random;

public class Rand {
    ArrayList<ImageView> arrayList;
    Handler handler;
    SlloActivity mainActivity;
    int a;
    int b;
    int c;

    public Rand(ArrayList<ImageView> arrayList, SlloActivity mainActivity) {
        this.arrayList = arrayList;
        this.mainActivity = mainActivity;

    }

    public void random() {
        handler = new Handler();
        a = 0;
        b = 0;
        c = 0;
        Random random = new Random();
        kfk(random);
        kkl(random);
        kdk(random);
    }

    public void kfk(Random random){
        handler.post(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(0).setImageResource(R.drawable.a2);
                        arrayList.get(0).setTag(1);
                        break;
                    case 1:
                        arrayList.get(0).setImageResource(R.drawable.a3);
                        arrayList.get(0).setTag(2);
                        break;
                    case 2:
                        arrayList.get(0).setImageResource(R.drawable.a4);
                        arrayList.get(0).setTag(3);
                        break;
                    case 3:
                        arrayList.get(0).setImageResource(R.drawable.a5);
                        arrayList.get(0).setTag(4);
                        break;
                }
                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(1).setImageResource(R.drawable.a2);
                        arrayList.get(1).setTag(1);
                        break;
                    case 1:
                        arrayList.get(1).setImageResource(R.drawable.a3);
                        arrayList.get(1).setTag(2);
                        break;
                    case 2:
                        arrayList.get(1).setImageResource(R.drawable.a4);
                        arrayList.get(1).setTag(3);
                        break;
                    case 3:
                        arrayList.get(1).setImageResource(R.drawable.a5);
                        arrayList.get(1).setTag(4);
                        break;
                }

                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(2).setImageResource(R.drawable.a2);
                        arrayList.get(2).setTag(1);
                        break;
                    case 1:
                        arrayList.get(2).setImageResource(R.drawable.a3);
                        arrayList.get(2).setTag(2);
                        break;
                    case 2:
                        arrayList.get(2).setImageResource(R.drawable.a4);
                        arrayList.get(2).setTag(3);
                        break;
                    case 3:
                        arrayList.get(2).setImageResource(R.drawable.a5);
                        arrayList.get(2).setTag(4);
                        break;
                }
                a++;
                if (a != 30) {
                    handler.postDelayed(this::run, 15);
                }
            }
        });
    }

    public void kkl(Random random){
        handler.post(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(3).setImageResource(R.drawable.a2);
                        arrayList.get(3).setTag(1);
                        break;
                    case 1:
                        arrayList.get(3).setImageResource(R.drawable.a3);
                        arrayList.get(3).setTag(2);
                        break;
                    case 2:
                        arrayList.get(3).setImageResource(R.drawable.a4);
                        arrayList.get(3).setTag(3);
                        break;
                    case 3:
                        arrayList.get(3).setImageResource(R.drawable.a5);
                        arrayList.get(3).setTag(4);
                        break;
                }

                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(4).setImageResource(R.drawable.a2);
                        arrayList.get(4).setTag(1);
                        break;
                    case 1:
                        arrayList.get(4).setImageResource(R.drawable.a3);
                        arrayList.get(4).setTag(2);
                        break;
                    case 2:
                        arrayList.get(4).setImageResource(R.drawable.a4);
                        arrayList.get(4).setTag(3);
                        break;
                    case 3:
                        arrayList.get(4).setImageResource(R.drawable.a5);
                        arrayList.get(4).setTag(4);
                        break;
                }

                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(5).setImageResource(R.drawable.a2);
                        arrayList.get(5).setTag(1);
                        break;
                    case 1:
                        arrayList.get(5).setImageResource(R.drawable.a3);
                        arrayList.get(5).setTag(2);
                        break;
                    case 2:
                        arrayList.get(5).setImageResource(R.drawable.a4);
                        arrayList.get(5).setTag(3);
                        break;
                    case 3:
                        arrayList.get(5).setImageResource(R.drawable.a5);
                        arrayList.get(5).setTag(4);
                        break;
                }
                b++;
                if (b != 50) {
                    handler.postDelayed(this::run, 15);
                }
            }
        });
    }

    public void kdk(Random random){
        handler.post(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(6).setImageResource(R.drawable.a2);
                        arrayList.get(6).setTag(1);
                        break;
                    case 1:
                        arrayList.get(6).setImageResource(R.drawable.a3);
                        arrayList.get(6).setTag(2);
                        break;
                    case 2:
                        arrayList.get(6).setImageResource(R.drawable.a4);
                        arrayList.get(6).setTag(3);
                        break;
                    case 3:
                        arrayList.get(6).setImageResource(R.drawable.a5);
                        arrayList.get(6).setTag(4);
                        break;
                }

                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(7).setImageResource(R.drawable.a2);
                        arrayList.get(7).setTag(1);
                        break;
                    case 1:
                        arrayList.get(7).setImageResource(R.drawable.a3);
                        arrayList.get(7).setTag(2);
                        break;
                    case 2:
                        arrayList.get(7).setImageResource(R.drawable.a4);
                        arrayList.get(7).setTag(3);
                        break;
                    case 3:
                        arrayList.get(7).setImageResource(R.drawable.a5);
                        arrayList.get(7).setTag(4);
                        break;
                }

                switch (random.nextInt(4)) {
                    case 0:
                        arrayList.get(8).setImageResource(R.drawable.a2);
                        arrayList.get(8).setTag(1);
                        break;
                    case 1:
                        arrayList.get(8).setImageResource(R.drawable.a3);
                        arrayList.get(8).setTag(2);
                        break;
                    case 2:
                        arrayList.get(8).setImageResource(R.drawable.a4);
                        arrayList.get(8).setTag(3);
                        break;
                    case 3:
                        arrayList.get(8).setImageResource(R.drawable.a5);
                        arrayList.get(8).setTag(4);
                        break;
                }

                c++;
                if (c != 70) {
                    handler.postDelayed(this::run, 15);
                }else {

                    mainActivity.rrees();
                }
            }
        });
    }
}
