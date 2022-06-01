package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pedido.*
import kotlinx.android.synthetic.main.activity_second.*

class activity_pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
        btnFinPedido.setOnClickListener {
            openMainActivity()
        }
    }

        private fun openMainActivity(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
