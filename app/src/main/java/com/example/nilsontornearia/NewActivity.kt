package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envio)

        button.setOnClickListener{
            openNextActivity()


        }


    }

    private fun openNextActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)


    }

}