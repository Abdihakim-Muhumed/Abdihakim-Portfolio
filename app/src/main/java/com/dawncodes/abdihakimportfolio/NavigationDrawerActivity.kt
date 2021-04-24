package com.dawncodes.abdihakimportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var  drawable: DrawerLayout
    private  lateinit var  toolbar: Toolbar
    private lateinit var  navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        // view identification
        drawable = findViewById(R.id.drawer_layout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navView = findViewById(R.id.nav_drawer)
        //setting listener
        navView.setNavigationItemSelectedListener(this)
        //setting toggle hunburger
        val toggle : ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawable,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        //attaching toggle to a layout
        drawable.addDrawerListener(toggle)
        //sync state
        toggle.syncState()


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuHome ->{
                val intentHome = Intent(this@NavigationDrawerActivity,HomePage::class.java)
                startActivity(intentHome)
            }
            R.id.menuAbout ->{
                val intentAbout = Intent(this@NavigationDrawerActivity,About::class.java)
                startActivity(intentAbout)
            }
            R.id.menuContact ->{
                val intentContact =Intent(this@NavigationDrawerActivity,ContactUs::class.java)
                startActivity(intentContact)
            }
        }
        return true
    }

    override fun onBackPressed() {
        if (drawable.isDrawerOpen(GravityCompat.START)){
            drawable.closeDrawer(GravityCompat.START)
        }
        else{
            super.onBackPressed()
        }
    }
}