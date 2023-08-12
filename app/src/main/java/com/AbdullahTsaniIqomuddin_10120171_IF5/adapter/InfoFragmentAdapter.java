package com.AbdullahTsaniIqomuddin_10120171_IF5.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;


public class InfoFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public InfoFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentList.size();
    }
}

/**
 * NAMA    : Abdullah Tsani Iqomuddin
 * NIM     : 10120171
 * Kelas   : IF-5
 * MataKuliah  : Aplikasi Komputasi Bergerak
 * Tugas Pengganti UAS Aplikasi Komputasi Bergerak
 */