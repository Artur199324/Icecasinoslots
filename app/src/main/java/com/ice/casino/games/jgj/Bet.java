package com.ice.casino.games.jgj;

import android.content.Context;
import android.view.View;

import com.ice.casino.games.accc.SlloActivity;

public class Bet {

    SlloActivity mainActivity;
    public static int bet;
    public static int score;
    public static boolean fff = false;

    public Bet(SlloActivity mainActivity) {
        this.mainActivity = mainActivity;
        cllc();
        score = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
        bet = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
        mainActivity.textViewScor.setText("Score: " + score);
        mainActivity.textViewBet.setText("Bet : " + bet);
    }

    public void cllc() {
        kdh();
        kls();
        lkl();
    }

    private void kdh(){
        mainActivity.buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fff = true;
                if (score == 0 || score < 0) {
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", 0).apply();
                } else {
                    bet += 200;
                    score -= 200;
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", score).apply();
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bet).apply();
                    mainActivity.textViewScor.setText("Score: " + score);
                    mainActivity.textViewBet.setText("Bet : " + bet);
                }

            }
        });
    }

    private void kls(){
        mainActivity.buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fff = true;
                if (bet == 0 || bet < 0) {
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();
                } else {
                    bet -= 200;
                    score += 200;
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", score).apply();
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bet).apply();
                    mainActivity.textViewScor.setText("Score: " + score);
                    mainActivity.textViewBet.setText("Bet : " + bet);
                }
            }
        });
    }

    private void lkl(){
        mainActivity.buttonma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fff = true;
                int a = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("bet", 0);
                int b = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
                b += a;
                if (b == 0 || b < 0) {
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", 0).apply();

                } else {

                    bet = b;
                    score = 0;
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("bet", bet).apply();
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", score).apply();
                    mainActivity.textViewScor.setText("Score: " + score);
                    mainActivity.textViewBet.setText("Bet : " + bet);

                }
            }
        });
    }
}
