package com.developer.android.prihannimsara.testapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
    }

    fun buttonclickforme(v :  View){
        val changePage = Intent(this, SecondPageActivity::class.java)
        startActivity(changePage)
    }
}
