package com.example.zaivon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class otvet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvet)
    }
    fun game(view: View) {
        val intent: Intent = Intent(this@otvet, GameActivity::class.java)
        startActivity(intent)
    }
}
