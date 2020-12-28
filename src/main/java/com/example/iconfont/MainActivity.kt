package com.example.iconfont

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
    }
    fun click(v: View){
        tv?.let {
            it.text = "\uf106"
        }
    }
}