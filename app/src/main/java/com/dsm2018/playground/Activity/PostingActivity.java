package com.dsm2018.playground.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.dsm2018.playground.R;

public class PostingActivity extends AppCompatActivity {
    Button btnLunch;
    Button btnDinner;
    ImageView sports;
    EditText time;
    EditText title;
    EditText contents;
    TextView btnPost;


    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_lunch:
                    btnLunch.setBackgroundResource(R.color.main);
                    btnLunch.setTextColor(getResources().getColorStateList(R.color.white));
                    break;
                case R.id.btn_dinner:
                    btnDinner.setBackgroundResource(R.color.main);
                    btnDinner.setTextColor(getResources().getColorStateList(R.color.white));
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);
        BtnOnClickListener onClickListener = new BtnOnClickListener();

        btnLunch = findViewById(R.id.btn_lunch);
        btnLunch.setOnClickListener(onClickListener);
        btnDinner = findViewById(R.id.btn_dinner);
        btnDinner.setOnClickListener(onClickListener);
        sports = findViewById(R.id.img_setSports);
        time = findViewById(R.id.et_time);
        title = findViewById(R.id.et_title);
        contents = findViewById(R.id.et_contents);
        btnPost = findViewById(R.id.btn_post);



    }

}
