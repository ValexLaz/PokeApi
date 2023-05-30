package com.example.comousarapi.Service;

import com.example.comousarapi.Adapters.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserAPI {

    @GET("/api/v2/pokemon-form/23/")
    Call<UserResponse> getAllUser();
    @GET("/api/v2/pokemon-form/23/")
    Call<UserResponse> getUserPerPage(@Query("page") int page, @Query("per_page") int per_page);
    @POST("/api/v2/pokemon-form/23/")
    Call<Pokemon> //y hasta ahí llegue porque no entendí y me chipé




}
