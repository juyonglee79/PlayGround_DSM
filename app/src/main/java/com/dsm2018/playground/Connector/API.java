package com.dsm2018.playground.Connector;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface API {
    @GET("/")
    Call<JsonObject> firstone(@Header("hehe") String what);

    @POST("/auth")
    Call<JsonObject> login(@Body JsonObject jsonObject);
}
