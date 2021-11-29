package com.yhjoo.android_boilerplate.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sample_table")
data class SampleEntity(
    @PrimaryKey(autoGenerate = true) val id: Long? = null,
    @ColumnInfo(name = "sample_1") val sample1: Int,
    @ColumnInfo(name = "sample_2") val sample2: Int,
)