package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dsm2018.playground.R;

public class LeagueApplyActivity extends AppCompatActivity {
    ImageView setSports;
    Button tournament, league;
    TextView apply;
    String string;
    String where;
    ImageView sports;
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_tournament);

        string = getIntent().getStringExtra("sports");
        where = getIntent().getStringExtra("where");
        sports = findViewById(R.id.img_setSports);
        num = findViewById(R.id.num);
        if (string.getBytes().length > 0) {
            if (string.equals("1")) {
                sports.setImageResource(R.drawable.ic_soccer);
                num.setText("");
            } else if (string.equals("2")) {
                sports.setImageResource(R.drawable.ic_baseball);
                num.setText("");
            } else if (string.equals("3")) {
                sports.setImageResource(R.drawable.ic_basketball);
                num.setText("");
            } else if (string.equals("4")) {
                sports.setImageResource(R.drawable.ic_badminton);
                num.setText("");
            } else if (string.equals("5")) {
                sports.setImageResource(R.drawable.ic_dodgeball);
                num.setText("");
            } else if (string.equals("6")) {
                sports.setImageResource(R.drawable.ic_esports);
                num.setText("");
            } else if (string.equals("7")) {
                sports.setImageResource(R.drawable.ic_pingpong);
                num.setText("");
            } else if (string.equals("8")) {
                num.setText("종목선택");
            }
        }

        setSports = findViewById(R.id.img_setSports);
        setSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPopup = new Intent(LeagueApplyActivity.this, SportsPopupActivity2.class);
                startActivity(toPopup);
            }
        });
        tournament = findViewById(R.id.btn_tournament);
        tournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tournament.setBackgroundResource(R.color.blueBtn);
                tournament.setTextColor(getResources().getColorStateList(R.color.white));
                league.setBackgroundResource(R.color.white);
                league.setTextColor(getResources().getColorStateList(R.color.black));
            }
        });
        league = findViewById(R.id.btn_league);
        league.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tournament.setBackgroundResource(R.color.white);
                tournament.setTextColor(getResources().getColorStateList(R.color.black));
                league.setBackgroundResource(R.color.blueBtn);
                league.setTextColor(getResources().getColorStateList(R.color.white));
            }
        });
        apply= findViewById(R.id.btn_apply2);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueApplyActivity.this, MainActivity.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "신청완료", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}