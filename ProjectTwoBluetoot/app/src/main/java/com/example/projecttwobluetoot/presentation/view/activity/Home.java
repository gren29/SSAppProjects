package com.example.projecttwobluetoot.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.databinding.ActivityHomeBinding;
import com.example.projecttwobluetoot.presentation.adapter.ViewPagerAdapterHome;
import com.google.android.material.tabs.TabLayout;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    private ViewPagerAdapterHome adapterHome;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        tabLayout = binding.tabLayoutHome;
        viewPager2 = binding.viewPagerHome;

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapterHome = new ViewPagerAdapterHome(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapterHome);

        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Publicacion"));
        tabLayout.addTab(tabLayout.newTab().setText("Contactos"));
        tabLayout.getTabAt(0).setIcon(R.drawable.fniconoshomeuno);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_notifications_none_24_t);
        tabLayout.getTabAt(2).setIcon(R.drawable.fniconosperfiluno);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition() );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}
