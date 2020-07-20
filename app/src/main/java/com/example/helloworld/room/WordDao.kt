package com.example.helloworld.room

import androidx.room.*

@Dao
interface WordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg word: Word): List<Long>
//    fun insert(vararg word: Word): Int 编译生成的类返回值是int, 和kotlin不匹配

    @Update
    fun update(vararg word: Word): Int

    @Delete
    fun delete(vararg word: Word): Int

    @Query("DELETE FROM Word")
    fun deleteAll()

    @Query("SELECT * FROM Word ORDER BY id DESC")
    fun getAllWords(): List<Word>

}