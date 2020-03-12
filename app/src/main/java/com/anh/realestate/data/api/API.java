package com.anh.realestate.data.api;

import com.anh.realestate.classes.utils.Constants;
import com.anh.realestate.data.services.TestService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    // Handle call API
    private static int TIME_OUT = 10;
    private Gson gson = new GsonBuilder().setLenient().disableHtmlEscaping().create();
    private Retrofit client;

    private static final API INSTANCE = new API();

    private API() {
        client = makeClient(Constants.URL_MAIN, TIME_OUT);
        createService();
    }

    public static API getInstance() {
        return INSTANCE;
    }
    // declare sevice at here

    private Retrofit makeClient(String baseUrl, int timeout)
    {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public TestService testService;
    private void createService(){
        testService = client.create(TestService.class);
    }

}
