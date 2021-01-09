package com.rifdahalf.tryinfocovid_19.api

import com.rifdahalf.tryinfocovid_19.model.IndonesiaResponse
import com.rifdahalf.tryinfocovid_19.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}