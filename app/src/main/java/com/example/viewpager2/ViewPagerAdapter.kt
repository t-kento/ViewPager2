package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_fragment.view.*

class ViewPagerAdapter (val images:List<ViewPagerItem>):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_fragment,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentItem: ViewPagerItem = images[position]
        holder.itemView.ivImage.setImageResource(currentItem.imageR)
        holder.textView1.text=currentItem.text1

    }
    class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.ivImage
        val textView1: TextView = itemView.textView1

    }

}

