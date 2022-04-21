package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnVoltar.setOnClickListener{
            openNextActivity()
        }
    }


    private fun openNextActivity(){
        val intent = Intent(this, MainActivity::class.java)
        super.onBackPressed()
    }

    fun onCheckboxClicked(view: View){

    }


}
