package id.smkcoding.smkcodingchallenge2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return GithubFragment()
        } else {
            return GithubFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}