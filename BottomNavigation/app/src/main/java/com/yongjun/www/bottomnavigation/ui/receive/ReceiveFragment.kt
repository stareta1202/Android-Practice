package com.yongjun.www.bottomnavigation.ui.receive

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.get
import com.yongjun.www.bottomnavigation.R

class ReceiveFragment : Fragment() {
    private lateinit var receiveViewModel: ReceiveViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        receiveViewModel = ViewModelProvider(this).get(ReceiveViewModel::class.java)
        val root = inflater.inflate(R.layout.receive_fragment, container, false)

        return root
    }
}