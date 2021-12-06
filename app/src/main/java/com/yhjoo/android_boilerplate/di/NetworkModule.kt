package com.yhjoo.android_boilerplate.di

import android.content.Context
import com.yhjoo.android_boilerplate.data.RetrofitServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideBasicService(@ApplicationContext context: Context): RetrofitServices.SampleService {
        return RetrofitServices.SampleService.create(context)
    }
}