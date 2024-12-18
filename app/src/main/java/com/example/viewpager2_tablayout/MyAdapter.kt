package com.example.viewpager2_tablayout

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter (fragment: FragmentActivity,val list: List<Page>): FragmentStateAdapter(fragment) {

    override fun getItemCount() = list.size

    override fun createFragment(position: Int): Fragment {

        val fragment = Fragment_1()
            fragment.arguments = bundleOf("key" to list[position])
        return fragment
    }


}