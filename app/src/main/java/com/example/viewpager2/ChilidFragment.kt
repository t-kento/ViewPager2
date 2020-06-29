package com.example.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.child_fragment.*

class ChildFragment: BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutInflater.inflate(R.layout.child_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        initLayout()
    }

    private fun initLayout() {
        initText()
    }

    private fun initText() {
        textView1.text = "${arguments?.getInt(KEY_TEXT)}"
    }

    companion object {
        const val KEY_TEXT = "key_text"
        const val KEY_IMAGE = "key_image"
    }

    }


