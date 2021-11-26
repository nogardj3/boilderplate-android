package com.yhjoo.app_boilerplate.di

import android.content.Context
import com.yhjoo.app_boilerplate.data.SampleDatabase
import com.yhjoo.app_boilerplate.data.dao.SampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): SampleDatabase {
        return SampleDatabase.getInstance(context)
    }

    @Provides
    fun providePlantDao(appDatabase: SampleDatabase): SampleDao {
        return appDatabase.notificationDao()
    }
}
