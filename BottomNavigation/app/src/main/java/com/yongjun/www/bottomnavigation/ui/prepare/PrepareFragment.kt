package com.yongjun.www.bottomnavigation.ui.prepare

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjun.www.bottomnavigation.R

class PrepareFragment : Fragment() {

    companion object {
        fun newInstance() = PrepareFragment()
    }

    private lateinit var viewModel: PrepareViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.prepare_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrepareViewModel::class.java)
        // TODO: Use the ViewModel
    }

}