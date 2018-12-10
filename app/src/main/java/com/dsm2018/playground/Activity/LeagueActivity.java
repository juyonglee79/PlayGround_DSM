package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dsm2018.playground.R;


public class LeagueActivity extends AppCompatActivity {
    Button a,b,c,d;

    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_A:
                    a.setBackgroundResource(R.color.main);
                    a.setTextColor(getResources().getColorStateList(R.color.white));
                    b.setBackgroundResource(R.color.white);
                    b.setTextColor(getResources().getColorStateList(R.color.black));
                    c.setBackgroundResource(R.color.white);
                    c.setTextColor(getResources().getColorStateList(R.color.black));
                    d.setBackgroundResource(R.color.white);
                    d.setTextColor(getResources().getColorStateList(R.color.black));
                    break;
                case R.id.btn_B:
                    b.setBackgroundResource(R.color.main);
                    b.setTextColor(getResources().getColorStateList(R.color.white));
                    a.setBackgroundResource(R.color.white);
                    a.setTextColor(getResources().getColorStateList(R.color.black));
                    c.setBackgroundResource(R.color.white);
                    c.setTextColor(getResources().getColorStateList(R.color.black));
                    d.setBackgroundResource(R.color.white);
                    d.setTextColor(getResources().getColorStateList(R.color.black));
                    break;
                case R.id.btn_C:
                    c.setBackgroundResource(R.color.main);
                    c.setTextColor(getResources().getColorStateList(R.color.white));
                    b.setBackgroundResource(R.color.white);
                    b.setTextColor(getResources().getColorStateList(R.color.black));
                    a.setBackgroundResource(R.color.white);
                    a.setTextColor(getResources().getColorStateList(R.color.black));
                    d.setBackgroundResource(R.color.white);
                    d.setTextColor(getResources().getColorStateList(R.color.black));
                    break;
                case R.id.btn_D:
                    d.setBackgroundResource(R.color.main);
                    d.setTextColor(getResources().getColorStateList(R.color.white));
                    b.setBackgroundResource(R.color.white);
                    b.setTextColor(getResources().getColorStateList(R.color.black));
                    c.setBackgroundResource(R.color.white);
                    c.setTextColor(getResources().getColorStateList(R.color.black));
                    a.setBackgroundResource(R.color.white);
                    a.setTextColor(getResources().getColorStateList(R.color.black));
                    break;

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        LeagueActivity.BtnOnClickListener onClickListener = new LeagueActivity.BtnOnClickListener();

        a = findViewById(R.id.btn_A);
        a.setOnClickListener(onClickListener);
        b = findViewById(R.id.btn_B);
        b.setOnClickListener(onClickListener);
        c = findViewById(R.id.btn_C);
        c.setOnClickListener(onClickListener);
        d = findViewById(R.id.btn_D);
        d.setOnClickListener(onClickListener);
    }
}
