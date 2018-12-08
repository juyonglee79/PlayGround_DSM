package com.dsm2018.playground.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dsm2018.playground.Connector.API;
import com.dsm2018.playground.Connector.ServiceGenerator;
import com.dsm2018.playground.R;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    EditText id;
    EditText password;
    TextView login;
    TextView passwordFind;
    TextView signIn;
    String getID;
    String getPassword;
    @NonNull String getAppid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getAppid = "hello";

        id = findViewById(R.id.et_id);
        password = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getID = id.getText().toString();
                getPassword = password.getText().toString();
                getID = getID.trim();
                getPassword = getPassword.trim();
                if (getID.getBytes().length <= 0 | getPassword.getBytes().length <= 0 ) {
                    Toast.makeText(getApplicationContext(), "입력이 완료되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else {
                    post();
                }
            }
        });

        signIn = findViewById(R.id.tv_signUp);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSignIn = new Intent(LoginActivity.this, SignInActivity.class);
                startActivity(toSignIn);
            }
        });
    }

    public void post() {
        API retrofit = ServiceGenerator.getClient().create(API.class);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", getID);
        jsonObject.addProperty("password", getPassword);
        Call<JsonObject> call = retrofit.login(jsonObject);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    JsonObject repo = response.body();
                    getAppid=repo.get("id").getAsString();
                    Log.d("idNum", ""+getAppid);
                if (response.code() == 200) {
                    Intent toMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(toMain);
                } else if (response.code() == 204) {
                    Toast.makeText(getApplicationContext(), "인증번호가 맞지 않습니다.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}