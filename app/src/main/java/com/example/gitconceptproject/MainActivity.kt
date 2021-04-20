package com.example.gitconceptproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("First Commit")

        println("Second Commit")

        println("Test Revert Commit")

        println("Second Branch Commit")

        println("First branch change commit")

        println("This line will be merged")

        println("This line will merged First branch")

        println("Merging in Github")

    }
}