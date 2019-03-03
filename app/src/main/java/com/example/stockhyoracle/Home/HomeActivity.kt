package com.example.stockhyoracle.Home

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.stockhyoracle.R
import com.example.stockhyoracle.Utils.BottomNavigationViewHelper

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class HomeActivity : AppCompatActivity() {

    val TAG = "HomeActivity"
    val mcontext : Context = this@HomeActivity
    val ACTIVITY_NUM = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate: starting.")

        setupBottomNavigationView()
    }

    //BottomNavigationView setup
    private fun setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView")
        val bottomNavigationViewEx = findViewById<View>(R.id.bottomNavViewBar) as BottomNavigationViewEx
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx)
        BottomNavigationViewHelper.enableNavigation(mcontext, bottomNavigationViewEx)
        val menu = bottomNavigationViewEx.menu
        val menuItem = menu.getItem(ACTIVITY_NUM)
        menuItem.setChecked(true)
    }

}
