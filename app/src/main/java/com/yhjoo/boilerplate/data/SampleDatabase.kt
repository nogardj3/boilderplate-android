package com.yhjoo.boilerplate.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yhjoo.boilerplate.data.dao.SampleDao
import com.yhjoo.boilerplate.data.entity.SampleEntity

@Database(entities = [SampleEntity::class], version = 1, exportSchema = false)
abstract class SampleDatabase : RoomDatabase() {
    abstract fun notificationDao(): SampleDao

    companion object {
        @Volatile
        private var instance: SampleDatabase? = null

        fun getInstance(context: Context): SampleDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): SampleDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                SampleDatabase::class.java,
                "notification_table"
            )
                .build()
        }
    }
}