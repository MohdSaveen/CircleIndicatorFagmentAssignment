package com.example.circleindicatorfagmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setAdapter();
    }

    private void initViews() {
        viewPager2=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);
    }

    private void setAdapter() {
        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(pagerAdapter);


    }


}