package com.ice.casino.games.jgj;

import static com.ice.casino.games.jgj.BetRul.bettt;
import static com.ice.casino.games.jgj.BetRul.scorerr;
import static com.ice.casino.games.jgj.BetRul.www;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.ice.casino.games.accc.RyllActivity;

import java.util.Random;

public class MovRul {

    Random random;
    int old = 0;
    int dd = 0;
    private static float fff = 15.0f;
    private static String[] gdgfee = {"rr","bb", "rr", "bb", "rr", "bb", "rr", "bb","rr","bb","rr","bb"};

    ImageView imageView;
    RyllActivity ryllActivity;

    public MovRul(ImageView imageView, RyllActivity ryllActivity) {
        this.imageView = imageView;
        this.ryllActivity = ryllActivity;
        mov();
    }


    public void mov(){
        random = new Random();
        old = dd % 360;
        dd = random.nextInt(3600) + 720;

        RotateAnimation rotateAnimation =
                new RotateAnimation(old, dd, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3600);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                BetRul.ddd = false;
            }

            @Override
            public void onAnimationEnd(Animation animation) {


                pdp(360 - (dd % 360));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView.startAnimation(rotateAnimation);
    }

    private void pdp(int dd){
        int fx = 1;
        int fy = 3;

        for (int i = 0; i < 12; i++) {
            if (dd >= (fff * fx) && dd < (fff * fy)) {
                if (gdgfee[i].equals(ryllActivity.coll)){
                    www =  bettt + bettt;
                    scorerr +=www;
                    ryllActivity.textViewWWin.setText("Win : " + www);
                    ryllActivity.textViewSC.setText("Score: " + scorerr);
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scorerr).apply();
                }else {
                    Toast toast = Toast.makeText(ryllActivity.getApplicationContext(), "You lost"  , Toast.LENGTH_SHORT);
                    toast.show();
                }

            }

            fy += 2;
            fx += 2;
        }

        if (dd >= (fff * 73) && dd < 360 || dd >= 0 && dd < (fff * 1)) {

            if (gdgfee[gdgfee.length - 1].equals(ryllActivity.coll)){
                www =  bettt + bettt;
                scorerr +=www;
                ryllActivity.textViewWWin.setText("Win : " + www);
                ryllActivity.textViewSC.setText("Score: " + scorerr);
                ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scorerr).apply();
            }

        }
        int ooo = ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
        if (ooo == 0){
            scorerr = 200;
            bettt = 0;
            ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", 200).apply();
            ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();
            ryllActivity.textViewSC.setText("Score: " + ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000));
            ryllActivity.textViewBB.setText("Bet : " + ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0));

        }
    }
}
