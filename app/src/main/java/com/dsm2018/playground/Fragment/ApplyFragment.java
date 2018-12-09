package com.dsm2018.playground.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dsm2018.playground.Activity.LoginActivity;
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
    String message;
    String what;
    public ApplyFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        what = "/";
        Log.d("message", ""+ message);
        Log.d("message2", ""+ what);
        API retrofit = ServiceGenerator.getClient().create(API.class);
        JsonObject jsonObject = new JsonObject();
        Call<JsonObject> call = retrofit.firstone(what);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject repo = response.body();
                message=repo.get("message").getAsString();
                Log.d("message", ""+ message);
                tv.setText(message);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_apply, container, false);
        tv = view.findViewById(R.id.message1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostingActivity.class);
                intent.putExtra("sports", "7");
                startActivity(intent);
            }
        });
        return view;
    }
}
