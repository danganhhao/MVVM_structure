package com.anh.realestate.data.models.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExampleResponse {
    @SerializedName("url")
    @Expose
    private String mUrl;

    public String toString() {
        return mUrl;
    }
}
