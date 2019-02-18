package net.victor.pageviewtoolbar

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.support.design.widget.TabLayout
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageAdapter = PageAdapter(supportFragmentManager)
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))

        viewPager.adapter = pageAdapter

        DataInTabBar.tabsTitles.forEach{tabTitle ->
            tablayout.addTab(tablayout.newTab().setText(tabTitle), true)
        }

        tablayout.tabMode = TabLayout.MODE_SCROLLABLE
        tablayout.tabGravity = TabLayout.GRAVITY_CENTER


        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                Log.d("debugggg" , "change to tab   ${tablayout.selectedTabPosition}")
                viewPager.setCurrentItem(tab.position, true)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }
}
