package io.github.superbderrick.summerplayer.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> LocalFragment()
            1 -> StreamingFragment()
            2 -> RecentlyFragment()
            else -> {
                return LikeFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Local"
            1 -> "Streaming"
            2 -> "Recently"
            else -> {
                return "Like"
            }
        }
    }

}