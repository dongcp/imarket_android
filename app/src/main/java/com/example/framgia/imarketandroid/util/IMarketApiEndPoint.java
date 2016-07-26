package com.example.framgia.imarketandroid.util;

import com.example.framgia.imarketandroid.data.CategoryList;
import com.example.framgia.imarketandroid.models.Session;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by yue on 22/07/2016.
 */
public interface IMarketApiEndPoint {
    @GET("stores/1/categories")
    Call<CategoryList> loadCategories();
    @POST("api/sessions")
    Call<Session> login(@Body Session session);
}