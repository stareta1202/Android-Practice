package com.yongjun.www.bottomnavigation.ui.receive

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yongjun.www.bottomnavigation.ui.receive.tab.AnotherTempFragment
import com.yongjun.www.bottomnavigation.ui.receive.tab.TempFragment


private const val num_pages = 3

class ReceiveViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return num_pages
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TempFragment()
            1 -> AnotherTempFragment()
            else -> TempFragment()
        }
    }
}