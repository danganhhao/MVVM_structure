package com.anh.realestate.data.repositories;

import com.anh.realestate.data.api.API;
import com.anh.realestate.data.models.response.ExampleResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestRepository {
    private static final TestRepository INSTANCE = new TestRepository();
    private TestRepository() {
    }
    public static TestRepository getInstance() {
        return INSTANCE;
    }

    public ExampleResponse getList() {
        API.getInstance().testService.listRepos("testtest").enqueue(new Callback<ExampleResponse>() {
            @Override
            public void onResponse(Call<ExampleResponse> call, Response<ExampleResponse> response) {
                //TODO Xử ký dữ liệu trả về
            }

            @Override
            public void onFailure(Call<ExampleResponse> call, Throwable t) {
                //TODO Xử ký lỗi
            }
        });
        return null;
    }

}
