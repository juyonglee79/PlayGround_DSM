package com.dsm2018.playground.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dsm2018.playground.R;

import java.util.Timer;
import java.util.TimerTask;

public class TournamentActivity extends AppCompatActivity {
    static int counter = 0;
    TextView line1, line2, line3, line4, line5, line6, line7, line8, line9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);
        line6 = findViewById(R.id.line6);
        line7 = findViewById(R.id.line7);
        line8 = findViewById(R.id.line8);
        line9 = findViewById(R.id.line9);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                if(counter == 1){
                    line1.setBackgroundResource(R.color.yellow);
                    line6.setBackgroundResource(R.color.yellow);
                }else if(counter == 2){
                    line2.setBackgroundResource(R.color.yellow);
                    line5.setBackgroundResource(R.color.yellow);
                }else if(counter == 3){
                    line3.setBackgroundResource(R.color.yellow);
                    line4.setBackgroundResource(R.color.yellow);
                }else if(counter == 4){
                    line7.setBackgroundResource(R.color.yellow);
                }else if(counter == 5){
                    line8.setBackgroundResource(R.color.yellow);
                }else if(counter ==6){
                    line9.setBackgroundResource(R.color.yellow);
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(tt, 0, 500);
        line1.setBackgroundResource(R.color.white);
        line2.setBackgroundResource(R.color.white);
        line3.setBackgroundResource(R.color.white);
        line4.setBackgroundResource(R.color.white);
        line5.setBackgroundResource(R.color.white);
        line6.setBackgroundResource(R.color.white);
        line7.setBackgroundResource(R.color.white);
        line8.setBackgroundResource(R.color.white);
        line9.setBackgroundResource(R.color.white);
        counter = 0;


    }
}
