package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomAdapter(fragmentManager: FragmentManager) :
    FragmentStateAdapter(FragmentActivity()) {

    private val fragments: List<Fragment> = listOf(
        Pair(R.drawable.photo1, "心"),
        Pair(R.drawable.photo2, "永久にともに"),
        Pair(R.drawable.photo3, "卒業"),
        Pair(R.drawable.photo4, "三井寿"),
        Pair(R.drawable.photo5, "ハマスタ"),
        Pair(R.drawable.photo6, "蕾"),
        Pair(R.drawable.photo7, "ここから")
    )
        .map {
            ChildFragment().apply {
                arguments = Bundle().apply {
                    putInt(ChildFragment.KEY_IMAGE, it.first)
                    putString(ChildFragment.KEY_TEXT, it.second)
                }
            }
        }

    override fun getItemCount(): Int =fragments.size
    override fun createFragment(position: Int): Fragment = fragments[position]


}