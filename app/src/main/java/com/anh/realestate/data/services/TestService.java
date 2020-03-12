package com.anh.realestate.data.services;

import com.anh.realestate.data.models.response.ExampleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

// https://viblo.asia/p/android-co-the-ban-chua-biet-retrofit-924lJxG0KPM
public interface TestService {
    @GET("get")
    Call<ExampleResponse> listRepos(@Path("user") String user);

//    @GET("users/{user}/repos")
//    Call<ExampleResponse> listRepos(@Path("user") String user);
}
