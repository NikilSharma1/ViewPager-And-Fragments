package com.example.viewpagerwithtablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private int numberoftabsintablayout;
    public MyAdapter(@NonNull FragmentManager fm,int numberoftabsintablayout) {
        super(fm);
        this.numberoftabsintablayout=numberoftabsintablayout;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FirstFragment();
            case 1: return new SecondFragment();
            case 2: return new ThirdFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberoftabsintablayout;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Chats";
            case 1:return "Status";
            case 3:return "Calls";
            default:return "chats";
        }
    }
}
