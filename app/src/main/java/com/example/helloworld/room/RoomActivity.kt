package com.example.helloworld.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_room.*
import java.lang.StringBuilder

class RoomActivity : AppCompatActivity() {

    private lateinit var mWordDatabase: WordDatabase
    private lateinit var mWordDao: WordDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        mWordDatabase = Room.databaseBuilder(this, WordDatabase::class.java, "word.db")
            .allowMainThreadQueries()
            .build()
        mWordDao = mWordDatabase.wordDao()
        updateView()

        insert_btn.setOnClickListener{ view ->
            val word = Word(null, "Word", "世界")
            mWordDao.insert(word)
            updateView()
        }
    }

    private fun updateView() {
        val words = mWordDao.getAllWords()
        val wordSb = StringBuilder()
        for (i in words.indices) {
            val word = words.get(i)
            wordSb.append(word.toString()).append("\n")
        }
        words_view.text = wordSb.toString()
    }
}