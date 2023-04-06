package com.example.virus20;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.virus20.fragment.Converter;
import com.example.virus20.fragment.EUR;
import com.example.virus20.fragment.HRK;

public class VirusFramework extends FragmentStateAdapter {
    public VirusFramework(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Converter();
            case 1:
                return new EUR();
            case 2:
                return new HRK();
            default:
                return new Converter();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
