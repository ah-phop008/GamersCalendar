package com.example.mochi.gamerscalendar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager = (ViewPager)findViewById(R.id.viewpager);
        PagerAdapter mPagerAdapter = new MyPagerAdapter();
        mViewPager.setAdapter(mPagerAdapter);
    }

    private class MyPagerAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // レイアウトファイル名を配列で指定します。
            int[] pages = {R.layout.back_page, R.layout.main_page, R.layout.next_page};

            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View layout ;
            layout = inflater.inflate(pages[position], null);
            ((ViewPager) container).addView(layout);
            return layout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView((View)object);
        }

        @Override
        public int getCount() {
            // ページ数を返します。
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
}