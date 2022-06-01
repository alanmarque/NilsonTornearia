package com.example.nilsontornearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.toolbar.*

class MapActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val places = arrayListOf(
        Place("Google", LatLng(-23.5868031, -46.6843406), "Av Brg Faria Lima, 3477 - 18° Andar - Itaim Bibi, São Paulo - Sp", 4.8f)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        // configuração do menu lateral
        configuraMenuLateral()
        menu_lateral.menu.findItem(R.id.nav_map).isChecked = true

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync { googleMap ->
            addMarkers(googleMap)
        }
    }

    private fun addMarkers(googleMap: GoogleMap) {
        places.forEach { place ->
            googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .snippet(place.address)
                    .position(place.latLng)
            )

        }
    }

    data class Place(
        val name: String,
        val latLng: LatLng,
        val address: String,
        val rating: Float

    )

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
                openFaqActivity()
                Toast.makeText(this, "Clicou Faq", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_about -> {
                openAboutActivity()
                Toast.makeText(this, "Clicou Sobre", Toast.LENGTH_SHORT).show() }

            R.id.nav_map -> {
                openMapActivity()
                Toast.makeText(this, "Clicou Localização", Toast.LENGTH_SHORT).show() }
        }



        // fecha menu depois de tratar o evento
        layoutMenuLateral.closeDrawer(GravityCompat.START)
        return true
    }

    private fun openNextActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun openAboutActivity(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun openFaqActivity(){
        val intent = Intent(this, FaqActivity::class.java)
        startActivity(intent)
    }

    private fun openMapActivity(){
        val intent = Intent(this, MapActivity::class.java)
        startActivity(intent)
    }

}
