package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.toolbar.*

class SecondActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnVoltar.setOnClickListener{
            openNextActivity()
        }

        // configuração do menu lateral
        configuraMenuLateral()
    }

    private fun configuraMenuLateral() {
        // ícone de menu (hamburger) para mostrar o menu
        var toogle = ActionBarDrawerToggle(this, layoutMenuLateral, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        layoutMenuLateral.addDrawerListener(toogle)
        toogle.syncState()

        menu_lateral.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                openNextActivity()
                Toast.makeText(this, "Clicou Página inicial", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_faq -> {
                Toast.makeText(this, "Clicou Faq", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_about -> {
                openAboutActivity()
                Toast.makeText(this, "Clicou Sobre", Toast.LENGTH_SHORT).show() }
        }

        // fecha menu depois de tratar o evento
        layoutMenuLateral.closeDrawer(GravityCompat.START)
        return true
    }

    private fun openNextActivity(){
        val intent = Intent(this, MainActivity::class.java)
        super.onBackPressed()
    }

    private fun openAboutActivity(){
        val intent = Intent(this, activity_about::class.java)
        startActivity(intent)
    }
}
