package com.example.viewpager2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.view_pager_activity.*

class ViewPagerActivity : AppCompatActivity() {

    private val customAdapter by lazy { CustomAdapter(supportFragmentManager) }



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
            orientation = ViewPager2.ORIENTATION_VERTICAL
        }
    }

    private fun initTabLayout() {
        tabLayout.setupWithViewPager(viewPager2)
    }

    class CustomAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

        private val fragments: List<Fragment> = listOf(
            Pair(R.drawable.photo1, "心"),
            Pair(R.drawable.photo2, "永久にともに"),
            Pair(R.drawable.photo3, "卒業"),
            Pair(R.drawable.photo4, "三井寿"),
            Pair(R.drawable.photo5, "ハマスタ"),
            Pair(R.drawable.photo6, "蕾"),
            Pair(R.drawable.photo7, "ここから"),
        )
            .map {
                ChildFragment().apply {
                    arguments = Bundle().apply {
                        putInt(ChildFragment.KEY_IMAGE, it.first)
                        putString(ChildFragment.KEY_TEXT, it.second)
                    }
                }
            }

        override fun getItemCount(): Int {
        }

        override fun createFragment(position: Int): Fragment {
        }

//        override fun getCount(): Int = fragments.size
//        override fun getItem(position: Int): Fragment = fragments[position]
//        override fun getPageTitle(position: Int): CharSequence? = "${position}"
//
//        val adapter = ViewPagerAdapter()
//        viewPager2.adapter = adapter
//
//        viewPager2.orientation=ViewPager2.ORIENTATION_VERTICAL
    }

}

