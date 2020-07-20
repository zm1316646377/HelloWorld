package com.example.helloworld.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Word(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int?,
                @ColumnInfo(name = "word") val word: String,
                @ColumnInfo(name = "meaning") val meaning: String

)