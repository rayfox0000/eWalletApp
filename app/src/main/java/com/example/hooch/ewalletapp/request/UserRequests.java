package com.example.hooch.ewalletapp.request;

import com.example.hooch.ewalletapp.domain.LoginResponse;
import com.example.hooch.ewalletapp.domain.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by calvinlow on 26/02/2018.
 */

public interface UserRequests {

    @POST("/auth/signUp")
    Call signUp(@Body User user);

    @POST("/auth/login")
    @FormUrlEncoded
    Call<LoginResponse> login (@Field("username") String username, @Field("password") String password);

    @GET("/uaa/users")
    Call<User> get (@Header("Authorization") String auth);

}
