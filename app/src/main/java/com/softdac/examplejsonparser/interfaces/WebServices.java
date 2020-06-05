package com.softdac.examplejsonparser.interfaces;


import com.softdac.examplejsonparser.model.Ayah;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface WebServices {

    @GET("en/api/v6/aya/day")
    Call<Ayah> getAyah();
}
