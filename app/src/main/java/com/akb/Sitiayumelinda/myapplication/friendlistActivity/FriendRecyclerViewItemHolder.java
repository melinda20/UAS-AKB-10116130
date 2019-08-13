package com.akb.Sitiayumelinda.myapplication.friendlistActivity;
/*Tanggal Pengerjaan : 19 Mei 2019
 * NIM : 10116130
 * Nama : Siti Ayu Melinda
 * Kelas : AKB-3*/

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.akb.Sitiayumelinda.myapplication.R;

public class FriendRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView FriendTitleText = null;

    private ImageView FriendImageView = null;

    public FriendRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            FriendTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            FriendImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getFriendTitleText() {
        return FriendTitleText;
    }

    public ImageView getFriendImageView() {
        return FriendImageView;
    }
}

