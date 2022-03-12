package com.yhjoo.boilerplate.data.dao

import androidx.room.*
import com.yhjoo.boilerplate.data.entity.SampleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SampleDao {
    @Query("SELECT * from sample_table WHERE sample_1 > :comp ORDER BY sample_1 DESC")
    fun getRecentList(comp: Int): Flow<List<SampleEntity>>

    @Query("UPDATE sample_table SET sample_2 = 1 WHERE id = :id")
    fun setRead(id: Long): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(notification: SampleEntity): Long

    @Update
    fun update(notification: SampleEntity): Int

    @Delete
    fun delete(notification: SampleEntity): Int
}