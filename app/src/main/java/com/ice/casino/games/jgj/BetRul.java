package com.ice.casino.games.jgj;

import android.content.Context;
import android.view.View;

import com.ice.casino.games.accc.RyllActivity;

public class BetRul {

    RyllActivity ryllActivity;
    public static int bettt;
    public static int www;
    public static int scorerr;
    public static boolean ddd = false;

    public BetRul(RyllActivity ryllActivity) {
        this.ryllActivity = ryllActivity;
        scorerr = ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
        bettt = ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
        if (scorerr == 0){
            scorerr = 200;
            ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", 200).apply();
        }
        ryllActivity.textViewSC.setText("Score: " + scorerr);
        ryllActivity.textViewBB.setText("Bet : " + bettt);
        cllc();
    }


    public void cllc() {
        bnm();
        kj();
        kih();
    }

    public void kih(){
        ryllActivity.buttonPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd = true;
                if (scorerr == 0 || scorerr < 0) {
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", 0).apply();
                } else {
                    bettt += 200;
                    scorerr -= 200;
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scorerr).apply();
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bettt).apply();
                    ryllActivity.textViewSC.setText("Score: " + scorerr);
                    ryllActivity.textViewBB.setText("Bet : " + bettt);
                }

            }
        });
    }

    public void kj(){
        ryllActivity.buttonMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd = true;
                if (bettt == 0 || bettt < 0) {
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();
                } else {
                    bettt -= 200;
                    scorerr += 200;
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scorerr).apply();
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bettt).apply();
                    ryllActivity.textViewSC.setText("Score: " + scorerr);
                    ryllActivity.textViewBB.setText("Bet : " + bettt);
                }
            }
        });
    }
    public void bnm(){
        ryllActivity.buttonMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd = true;
                int a = ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
                int b = ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
                b += a;
                if (b == 0 || b < 0) {
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();

                } else {

                    bettt = b;
                    scorerr = 0;
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bettt).apply();
                    ryllActivity.getSharedPreferences(ryllActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scorerr).apply();
                    ryllActivity.textViewSC.setText("Score: " + scorerr);
                    ryllActivity.textViewBB.setText("Bet : " + bettt);

                }
            }
        });
    }
}
