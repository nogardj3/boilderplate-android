package com.yhjoo.app_boilerplate.data

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.*
import java.util.concurrent.TimeUnit

class RetrofitServices {
    interface SampleService {
        @GET("sample")
        suspend fun getNotice(): Response<ArrayList<SampleData>?>

        companion object {
            fun create(context: Context): SampleService {
                val retrofitClient =
                    OkHttpClient.Builder()
                        .connectTimeout(3, TimeUnit.SECONDS)
                        .writeTimeout(10, TimeUnit.SECONDS)
                        .readTimeout(10, TimeUnit.SECONDS)
                        .build()

                return Retrofit.Builder()
                    .client(retrofitClient)
                    .baseUrl("server_url")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(SampleService::class.java)
            }
        }
    }
}