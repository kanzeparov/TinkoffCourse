package com.example.franck.coures.views;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Franck on 27.11.2017.
 */

public class RetroClient {
    private static final String ROOT_URL = "https://api.tinkoff.ru/";

    private static Retrofit getRetrofitInstatnce() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getApiService() {
        return getRetrofitInstatnce().create(ApiService.class);
    }
}
