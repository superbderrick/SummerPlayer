package io.github.superbderrick.summerplayer

import android.os.Bundle
import android.support.v7.app.ActionBar

import android.support.v7.app.AppCompatActivity
import io.github.superbderrick.summerplayer.ui.MainPageAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.supportActionBar!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        this.supportActionBar!!.setCustomView(R.layout.abs_layout)

        val fragmentAdapter = MainPageAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
    }

}

