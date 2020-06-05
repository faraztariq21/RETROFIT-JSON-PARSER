package com.softdac.examplejsonparser.network;

import com.softdac.examplejsonparser.common.Constants;
import com.softdac.examplejsonparser.interfaces.WebServices;
import com.softdac.examplejsonparser.model.Ayah;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServicesHandler {

    public static WebServicesHandler instance = new WebServicesHandler();
    private WebServices webServices;


    /**
     * Create an instance of Retrofit object
     */
    private WebServicesHandler() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(120, TimeUnit.SECONDS);
        httpClient.connectTimeout(120, TimeUnit.SECONDS);
        httpClient.writeTimeout(120, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        webServices = retrofit.create(WebServices.class);
    }

    public void getAyah(Callback<Ayah> callback) {
        Call<Ayah> call = webServices.getAyah();
        call.enqueue(callback);
    }
}
