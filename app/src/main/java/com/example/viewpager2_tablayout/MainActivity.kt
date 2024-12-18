package com.example.viewpager2_tablayout

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tablayout: TabLayout
    private lateinit var viewpager: ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tablayout = findViewById(R.id.tabLayout)
        viewpager = findViewById(R.id.viewpager)

        val list = Page.list

       // val adapter: MyAdapter
         val adapter = MyAdapter(this, list)
        viewpager.adapter = adapter

        TabLayoutMediator(tablayout,viewpager) { tab,position ->

            tab.text = list[position].name
        }.attach()



    }
}