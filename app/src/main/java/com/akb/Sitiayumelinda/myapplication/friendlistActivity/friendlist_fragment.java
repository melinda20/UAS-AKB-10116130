package com.akb.Sitiayumelinda.myapplication.friendlistActivity;

/*Tanggal Pengerjaan : 19 Mei 2019
 * NIM : 10116130
 * Nama : Siti Ayu Melinda
 * Kelas : AKB-3*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.akb.Sitiayumelinda.myapplication.R;
import java.util.ArrayList;
import java.util.List;



public class friendlist_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<FriendRecyclerViewItem> FriendItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_friendlist, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendRecyclerViewDataAdapter FriendDataAdapter = new FriendRecyclerViewDataAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendRecyclerViewItem>();
            FriendItemList.add(new FriendRecyclerViewItem("Aini Izza" , R.drawable.aini));
            FriendItemList.add(new FriendRecyclerViewItem("Anggi", R.drawable.anggggggi));
            FriendItemList.add(new FriendRecyclerViewItem("Lisa Setia Lestari", R.drawable.ica));
            FriendItemList.add(new FriendRecyclerViewItem("Yolanda Mau", R.drawable.yolan));
            FriendItemList.add(new FriendRecyclerViewItem("Salma Fauziyyah", R.drawable.salma));
            FriendItemList.add(new FriendRecyclerViewItem("Muhammad Reza Muzaky", R.drawable.reza));

        }
    }

}
