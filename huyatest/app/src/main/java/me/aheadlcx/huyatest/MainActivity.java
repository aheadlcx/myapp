package me.aheadlcx.huyatest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cpoopc.scrollablelayoutlib.ScrollableLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ScrollableLayout mScrollLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // 头部图片集

        // ScrollableLayout
        mScrollLayout = (ScrollableLayout) findViewById(R.id.scrollableLayout);
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.pagerStrip);
        initFragmentPager(viewPager, pagerSlidingTabStrip, mScrollLayout);
    }

    public void initFragmentPager( ViewPager viewPager,PagerSlidingTabStrip pagerSlidingTabStrip, final ScrollableLayout mScrollLayout) {
        final ArrayList<ScrollAbleFragment> fragmentList = new ArrayList<>();
        fragmentList.add(RecyclerViewFragment.newInstance());
        fragmentList.add(RecyclerViewFragment.newInstance());
        fragmentList.add(RecyclerViewFragment.newInstance());

        List<String> titleList = new ArrayList<>();
        titleList.add("ListView");
        titleList.add("ScrollView");
        titleList.add("RecyclerView");
        titleList.add("WebView");
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, titleList));
        mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(0));
        pagerSlidingTabStrip.setViewPager(viewPager);
        pagerSlidingTabStrip.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                Log.e("onPageSelected", "page:" + i);
                /** 标注当前页面 **/
                mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(i));
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        viewPager.setCurrentItem(0);
    }
}
