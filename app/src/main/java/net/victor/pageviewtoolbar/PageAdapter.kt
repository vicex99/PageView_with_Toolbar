package net.victor.pageviewtoolbar

import android.support.v4.app.Fragment

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import net.victor.pageviewtoolbar.DataInTabBar.arrPageFragm

class PageAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PageFragment(arrPageFragm[position])
            1 -> PageFragment(arrPageFragm[position])
            2 -> PageFragment(arrPageFragm[position])
            else -> PageFragment("ERROR")
        }
    }

    override fun getCount(): Int = arrPageFragm.count()
}