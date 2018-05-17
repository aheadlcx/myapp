package me.aheadlcx.huyatest;

import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/2 下午9:10
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<ScrollAbleFragment> fragmentList;
    private List<String> titleList;

    public MyFragmentPagerAdapter(FragmentManager fm, List<ScrollAbleFragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
