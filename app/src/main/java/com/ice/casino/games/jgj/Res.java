package com.ice.casino.games.jgj;

import static com.ice.casino.games.jgj.Bet.bet;
import static com.ice.casino.games.jgj.Bet.score;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.ice.casino.games.accc.SlloActivity;

import java.util.ArrayList;

public class Res {

    ArrayList<ImageView> arrayList;
    SlloActivity activity;
    int r0;
    int r1;
    int r2;
    int r3;
    int wwin = 0;
    boolean ffd = false;


    public Res(ArrayList<ImageView> arrayList, SlloActivity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
        r0 = 0;
        r2 = 0;
        r3 = 0;
        wwin = 0;

    }

    public void reset(){
        for (int i = 0; i < arrayList.size(); i++) {

            switch ((int) arrayList.get(i).getTag()){
                case 1:
                    r0++;
                    break;
                case 2:
                    r1++;
                    break;
                case 3:
                    r2++;
                    break;
                case 4:
                    r3++;
                    break;
            }

        }

        if (r0 > r1 && r0 > r2 && r0 > r3) {

            for (int i = 0; i < arrayList.size(); i++) {

                if ((int) arrayList.get(i).getTag() == 1) {

                    animate(arrayList.get(i));
                }
            }

            res(r0);
            ffd = true;

        }

        if (r1 > r0 && r1 > r2 && r1 > r3 ) {
            for (int i = 0; i < arrayList.size(); i++) {

                if ((int) arrayList.get(i).getTag() == 2) {

                    animate(arrayList.get(i));
                }
            }
            res(r1);
            ffd = true;

        }

        if (r2 > r0 && r2 > r1 && r2 > r3 ) {
            for (int i = 0; i < arrayList.size(); i++) {

                if ((int) arrayList.get(i).getTag() == 3) {

                    animate(arrayList.get(i));
                }
            }
            res(r2);
            ffd = true;

        }

        if (r3 > r0 && r3 > r1 && r3 > r2) {
            ;
            for (int i = 0; i < arrayList.size(); i++) {

                if ((int) arrayList.get(i).getTag() == 4) {
                    animate(arrayList.get(i));
                }
            }
            res(r3);
            ffd = true;

        }

        if (!ffd){
            activity.start.setClickable(true);
            Toast toast = Toast.makeText(activity.getApplicationContext(), "You lost"  , Toast.LENGTH_SHORT);
            toast.show();
            if (activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000) == 0){
                activity.imageView13.setVisibility(View.VISIBLE);
                activity.textView4.setVisibility(View.VISIBLE);
                activity.button6.setVisibility(View.VISIBLE);
                activity.button7.setVisibility(View.VISIBLE);
                activity.textViewBet.setText("Bet : " + 0);
                activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();
            }
        }

    }

    private void animate(ImageView imageView){
        Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(500);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(2);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                activity.start.setClickable(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(animation);
    }


    private void res(int kk){

        if (kk > 2) {
            wwin = bet + bet;
            score += wwin;
            activity.textViewWin.setText("Win : " + wwin);
            activity.textViewScor.setText("Score: " + score);
            activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", score).apply();

            if (kk > 4) {
                wwin = bet + bet+ bet;
                score += wwin;
                activity.textViewWin.setText("Win : " + wwin);
                activity.textViewScor.setText("Score: " + score);
                activity.getSharedPreferences(activity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", score).apply();
            }
        } else {
            Toast toast = Toast.makeText(activity.getApplicationContext(), "You lost"  , Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
