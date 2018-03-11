package com.example.hooch.ewalletapp.request;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by calvinlow on 26/02/2018.
 */

public class APIClient {

    private static final String BASE_URL = "http://47.74.183.129:5000";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static UserRequests userRequests = getClient().create(UserRequests.class);



}
