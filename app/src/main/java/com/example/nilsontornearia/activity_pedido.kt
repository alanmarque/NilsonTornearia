package com.example.nilsontornearia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pedido.*
import kotlinx.android.synthetic.main.activity_second.*

class activity_pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
        btnFinPedido.setOnClickListener{
            onBackPressed()
        }

    }
}