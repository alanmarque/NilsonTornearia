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

class AboutActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                openHomeActivity()
                Toast.makeText(this, "Clicou Página inicial", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_faq -> {
                Toast.makeText(this, "Clicou Faq", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_about -> {
                openAboutActivity()
                Toast.makeText(this, "Clicou Sobre", Toast.LENGTH_SHORT).show()
            }
        }

        // fecha menu depois de tratar o evento
        layoutMenuLateral.closeDrawer(GravityCompat.START)
        return true
    }

    private fun openHomeActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        super.onBackPressed()
    }

    private fun openAboutActivity(){
        val intent = Intent(this, AboutActivity::class.java)
        super.onBackPressed()
    }
}
