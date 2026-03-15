package com.amitbooks.app

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        val bookTitle = intent.getStringExtra("BOOK_TITLE") ?: "Book"
        val bookDescription = intent.getStringExtra("BOOK_DESCRIPTION") ?: ""

        val tvTitle = findViewById<TextView>(R.id.tvBookTitle)
        val tvContent = findViewById<TextView>(R.id.tvBookContent)
        val btnBack = findViewById<Button>(R.id.btnBack)

        tvTitle.text = bookTitle
        tvContent.text = bookDescription

        btnBack.setOnClickListener {
            finish()
        }
    }
}
