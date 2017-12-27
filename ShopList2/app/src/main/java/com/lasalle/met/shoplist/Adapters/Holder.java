package com.lasalle.met.shoplist.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lasalle.met.shoplist.R;

/**
 * Created by FurruPi on 20/12/17.
 */

public class Holder extends RecyclerView.ViewHolder {

     private TextView textViewName;
     private TextView textViewCount;

    public Holder(View itemView) {
        super(itemView);

        textViewCount = itemView.findViewById(R.id.textView);
        textViewCount = itemView.findViewById(R.id.textView2);

    }

    /*public void setItemText(Score score) {
        mItemPosition.setText(Integer.toString(score.getPosition()));
        mItemText.setText(score.getTitle());
        mItemScore.setText(Integer.toString(score.getScore()));
    }*/
}
