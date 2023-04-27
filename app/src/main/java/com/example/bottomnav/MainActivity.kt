package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav : BottomNavigationView = findViewById(R.id.bottomNAv)
        val nav_host = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val nav_controller : NavController = nav_host.findNavController()

        bottomNav.setupWithNavController(nav_controller)
       // NavigationUI.setupWithNavController(bottomNav, nav_controller)

    }





}