package com.example.sushi;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class Favorites extends AppCompatActivity {
TabLayout tabLayout=findViewById(R.id.favorites_viewPager);
DotsIndicator dotsIndicator;
ViewPager viewPager;
LinearLayout sliderDotsplan;
private int dotscount ;
private ImageView []dots;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
        viewPager = (ViewPager) findViewById(R.id.favorites_viewPager);
        sliderDotsplan=(LinearLayout)findViewById(R.id.ll_slideDots);
    //    ViewPagerAdapter viewPagerAdapter=new  ViewPagerAdapter(this);

//        adapter = new ViewPagerAdapter();
//        viewPager.setAdapter(adapter);
//        dotsIndicator.setViewPager(viewPager);
//        dotscount=viewPagerAdapter.getCout();
//        dots=new ImageView[dotscount];
//        for (int i = 0; i < dotscount; i++) {
//            dots[i]=new ImageView(this);
//            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable._0210506_005513));
//            LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT)

   //     }

    }
}