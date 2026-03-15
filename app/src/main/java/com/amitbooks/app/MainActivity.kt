package com.amitbooks.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBook1 = findViewById<Button>(R.id.btnBook1)
        val btnBook2 = findViewById<Button>(R.id.btnBook2)

        btnBook1.setOnClickListener {
            val intent = Intent(this, BookDetailActivity::class.java)
            intent.putExtra("BOOK_NUMBER", 1)
            intent.putExtra("BOOK_TITLE", "Book 1")
            intent.putExtra("BOOK_DESCRIPTION",
                "📖 Welcome to Book 1!\n\n" +
                "This is the first book in the Amit Books collection.\n\n" +
                "Chapter 1: The Beginning\n" +
                "A journey of a thousand miles begins with a single step...\n\n" +
                "Chapter 2: The Adventure\n" +
                "Every great story has its twists and turns...\n\n" +
                "Chapter 3: The Conclusion\n" +
                "All good things come to a beautiful end.")
            startActivity(intent)
        }

        btnBook2.setOnClickListener {
            val intent = Intent(this, BookDetailActivity::class.java)
            intent.putExtra("BOOK_NUMBER", 2)
            intent.putExtra("BOOK_TITLE", "Book 2")
            intent.putExtra("BOOK_DESCRIPTION",
                "📗 Welcome to Book 2!\n\n" +
                "This is the second book in the Amit Books collection.\n\n" +
                "Chapter 1: A New World\n" +
                "Imagination is the beginning of creation...\n\n" +
                "Chapter 2: Discovery\n" +
                "The more we explore, the more we find...\n\n" +
                "Chapter 3: Wisdom\n" +
                "True knowledge comes from within.")
            startActivity(intent)
        }
    }
}
