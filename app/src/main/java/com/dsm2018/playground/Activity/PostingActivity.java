package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.dsm2018.playground.Fragment.ApplyFragment;
import com.dsm2018.playground.R;

public class PostingActivity extends AppCompatActivity {
    Button btnLunch;
    Button btnDinner;
    ImageView sports;
    EditText time;
    EditText title;
    EditText contents;
    TextView btnPost;
    TextView num;
    String string;

    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.img_setSports:
                    Intent toPopup = new Intent(PostingActivity.this, PopupActivity.class);
                    startActivity(toPopup);
                    break;
                case R.id.btn_lunch:
                    btnLunch.setBackgroundResource(R.color.main);
                    btnLunch.setTextColor(getResources().getColorStateList(R.color.white));
                    btnDinner.setBackgroundResource(R.color.white);
                    btnDinner.setTextColor(getResources().getColorStateList(R.color.black));
                    break;
                case R.id.btn_dinner:
                    btnDinner.setBackgroundResource(R.color.main);
                    btnDinner.setTextColor(getResources().getColorStateList(R.color.white));
                    btnLunch.setBackgroundResource(R.color.white);
                    btnLunch.setTextColor(getResources().getColorStateList(R.color.black));
                    break;

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);
        BtnOnClickListener onClickListener = new BtnOnClickListener();

        num = findViewById(R.id.num);
        sports = findViewById(R.id.img_setSports);
        sports.setOnClickListener(onClickListener);
        string = getIntent().getStringExtra("sports");
        if (string.getBytes().length > 0) {
            if (string.equals("1")) {
                num.setText(string);
            } else if (string.equals("2")) {
                num.setText(string);
            } else if (string.equals("3")) {
                num.setText(string);
            } else if (string.equals("4")) {
                num.setText(string);
            } else if (string.equals("5")) {
                num.setText(string);
            } else if (string.equals("6")) {
                num.setText(string);
            } else if(string.equals("7")){
                num.setText("종목선택");
            }

        }
        btnLunch = findViewById(R.id.btn_lunch);
        btnLunch.setOnClickListener(onClickListener);
        btnDinner = findViewById(R.id.btn_dinner);
        btnDinner.setOnClickListener(onClickListener);

        time = findViewById(R.id.et_time);
        title = findViewById(R.id.et_title);
        contents = findViewById(R.id.et_contents);
        btnPost = findViewById(R.id.btn_post);
        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
