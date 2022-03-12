package com.yongjun.www.bottomnavigation.ui.move

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjun.www.bottomnavigation.R

class MoveFragment : Fragment() {

    companion object {
        fun newInstance() = MoveFragment()
    }

    private lateinit var viewModel: MoveViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.move_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MoveViewModel::class.java)
        // TODO: Use the ViewModel
    }

}