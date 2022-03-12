package com.yhjoo.boilerplate.data.repository

import android.content.Context
import androidx.annotation.WorkerThread
import com.google.gson.JsonObject
import com.yhjoo.boilerplate.data.RetrofitServices
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val retrofitServices: RetrofitServices.SampleService
) {
    @WorkerThread
    suspend fun createReview(
        recipeID: Int,
        userID: String,
    ): Flow<Response<JsonObject?>> {
        return flow {
            emit(Response.success(JsonObject()))
        }
    }

    @WorkerThread
    suspend fun deleteReview(recipeID: Int): Flow<Response<JsonObject?>> {
        return flow {
            emit(Response.success(JsonObject()))
        }
    }
}