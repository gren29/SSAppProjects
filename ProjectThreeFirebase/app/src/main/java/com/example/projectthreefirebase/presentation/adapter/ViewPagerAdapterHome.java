package com.example.projectthreefirebase.presentation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.projectthreefirebase.presentation.view.fragments.ContactFragment;
import com.example.projectthreefirebase.presentation.view.fragments.HomeFragment;
import com.example.projectthreefirebase.presentation.view.fragments.StateFragment;

public class ViewPagerAdapterHome extends FragmentStateAdapter {

    public ViewPagerAdapterHome(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 : return new HomeFragment();
            case 1 : return new StateFragment();
            case 2 : return new ContactFragment();
        }
        return new StateFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
