package com.example.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.view_pager_activity.*

class ViewPagerActivity : AppCompatActivity() {

    private val customAdapter by lazy { CustomAdapter(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_pager_activity)
        initialize()
    }

    private fun initialize() {
        initLayout()
    }

    private fun initLayout() {
        initViewPager2()
        initTabLayout()
    }

    private fun initViewPager2() {
        viewPager2.apply {
            adapter = customAdapter
            offscreenPageLimit = customAdapter.itemCount
        }
    }

    private fun initTabLayout() {
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "${position}"
        }.attach()
    }
}

