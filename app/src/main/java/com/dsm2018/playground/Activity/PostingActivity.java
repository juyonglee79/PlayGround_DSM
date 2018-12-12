package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dsm2018.playground.R;

public class PostingActivity extends AppCompatActivity {
    Button btnLunch;
    Button btnDinner;
    ImageView sports;
    EditText time;
    EditText title;
    EditText contents;
    EditText people;
    TextView btnPost;
    TextView num;
    TextView place;
    String string;
    String where;
    String getTime, getTitle, getPeople, getContent, getPlace;

    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.img_setSports:
                    Intent toPopup = new Intent(PostingActivity.this, PopupActivity.class);
                    toPopup.putExtra("where", where);
                    Log.d("zzzzzzzzzzzzzzzzz", ""+where);
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
        place = findViewById(R.id.tv_where);
        sports = findViewById(R.id.img_setSports);
        sports.setOnClickListener(onClickListener);
        string = getIntent().getStringExtra("sports");
        where = getIntent().getStringExtra("where");

        if (where != null) {
            if (where.equals("청죽관")) {
                place.setText("장소 : 청죽관");
            } else if (where.equals("새롬홀")) {
                place.setText("장소 : 새롬홀");
            } else if (where.equals("운동장")) {
                place.setText("장소 : 운동장");
            } else if (where.equals("탁구장")) {
                place.setText("장소 : 탁구장");
            } else if (where.equals("농구장")) {
                place.setText("장소 : 농구장");
            }
        }
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
        Log.d("sdafasdfasdfasasdf", ""+where);
        btnLunch = findViewById(R.id.btn_lunch);
        btnLunch.setOnClickListener(onClickListener);
        btnDinner = findViewById(R.id.btn_dinner);
        btnDinner.setOnClickListener(onClickListener);

        time = findViewById(R.id.et_time);
        getTime = time.getText().toString();
        title = findViewById(R.id.et_title);
        getTitle = title.getText().toString();
        people = findViewById(R.id.et_people);
        getPeople = people.getText().toString();
        contents = findViewById(R.id.et_contents);
        getContent = contents.getText().toString();
        btnPost = findViewById(R.id.btn_post);
        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostingActivity.this, MainActivity.class);
//                intent.putExtra("where", ""+where);
//                intent.putExtra("time", ""+getTime);
//                intent.putExtra("title", ""+getTitle);
//                intent.putExtra("people", ""+getPeople);
//                intent.putExtra("content", ""+getContent);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "게시글 작성완료", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
