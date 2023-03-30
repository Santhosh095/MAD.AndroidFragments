package com.example.androidfragments

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val basicDtl:Button = findViewById(R.id.button4)
        val marksDtl:Button = findViewById(R.id.button5)

        basicDtl.setOnClickListener {
            val fragment1 = StudentBasicDetails()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView5,fragment1).commit()
        }
        marksDtl.setOnClickListener {
            val fragment2 = StudentMarkDetails()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView5,fragment2).commit()
        }
    }
}