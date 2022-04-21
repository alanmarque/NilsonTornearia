package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }


    private fun openNextActivity(){
        val intent = Intent(this, NewActivity::class.java)
        startActivity(intent)


    }

    fun onCheckboxClicked(view: View){

    }


}
