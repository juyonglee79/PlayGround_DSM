package com.dsm2018.playground.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dsm2018.playground.Activity.PostingActivity;
import com.dsm2018.playground.Connector.API;
import com.dsm2018.playground.Connector.ServiceGenerator;
import com.dsm2018.playground.R;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApplyFragment extends Fragment {
    TextView tv;
    ImageButton sharomHall, pingPong, basket, playground, auditorium;
    String message;
    String what;


    public ApplyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        what = "/";
        Log.d("message", "" + message);
        Log.d("message2", "" + what);
        API retrofit = ServiceGenerator.getClient().create(API.class);
        JsonObject jsonObject = new JsonObject();
        Call<JsonObject> call = retrofit.firstone(what);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject repo = response.body();
                message = repo.get("message").getAsString();
                Log.d("message", "" + message);
                tv.setText(message);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply, container, false);
        sharomHall = view.findViewById(R.id.btn_sharomhall);
        sharomHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "8");
                intent.putExtra("where", "새롬홀");
                startActivity(intent);
            }
        });
        basket = view.findViewById(R.id.btn_basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "8");
                intent.putExtra("where", "농구장");
                startActivity(intent);
            }
        });
        auditorium = view.findViewById(R.id.btn_auditorium);
        auditorium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "8");
                intent.putExtra("where", "청죽관");
                startActivity(intent);
            }
        });
        pingPong = view.findViewById(R.id.btn_pingpong);
        pingPong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "8");
                intent.putExtra("where", "탁구장");
                startActivity(intent);
            }
        });
        playground = view.findViewById(R.id.btn_playground);
        playground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "8");
                intent.putExtra("where", "운동장");
                startActivity(intent);
            }
        });
        tv = view.findViewById(R.id.message1);

        return view;
    }
}
