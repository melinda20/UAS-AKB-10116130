package com.akb.Sitiayumelinda.myapplication;
/*Tanggal Pengerjaan = 13 agustus 2019
 * NIM = 10116130
 * Nama = Siti Ayu Melinda
 * Kelas = AKB-03*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }
}
