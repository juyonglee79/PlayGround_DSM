package com.dsm2018.playground.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dsm2018.playground.R;

public class PopupActivity extends Activity {
    ImageView[] sports = new ImageView[7];
    TextView btnSelect;
    String data;
    String where;


    class SportsOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ic_soccer:
                    data ="1";
                    break;
                case R.id.ic_baseball:
                    data = "2";
                    break;
                case R.id.ic_basketball:
                    data = "3";
                    break;
                case R.id.ic_badminton:
                    data = "4";
                    break;
                case R.id.ic_dodgeball:
                    data = "5";
                    break;
                case R.id.ic_esports:
                    data = "6";
                    break;
                case R.id.ic_pingpong:
                    data = "7";
                    break;
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);
        SportsOnClickListener onClickListener = new SportsOnClickListener();

        where = getIntent().getStringExtra("where");
        Log.d("where", ""+where);
        sports[0] = findViewById(R.id.ic_soccer);
        sports[0].setOnClickListener(onClickListener);
        sports[1] = findViewById(R.id.ic_baseball);
        sports[1].setOnClickListener(onClickListener);
        sports[2] = findViewById(R.id.ic_basketball);
        sports[2].setOnClickListener(onClickListener);
        sports[3] = findViewById(R.id.ic_badminton);
        sports[3].setOnClickListener(onClickListener);
        sports[4] = findViewById(R.id.ic_dodgeball);
        sports[4].setOnClickListener(onClickListener);
        sports[5] = findViewById(R.id.ic_esports);
        sports[5].setOnClickListener(onClickListener);
        sports[6] = findViewById(R.id.ic_pingpong);
        sports[6].setOnClickListener(onClickListener);
        btnSelect = findViewById(R.id.btn_sports_select);

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPosting = new Intent(PopupActivity.this, PostingActivity.class);
                toPosting.putExtra("where", where);
                toPosting.putExtra("sports", data);
                startActivity(toPosting);
            }
        });
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        return;
    }
}