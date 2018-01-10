package com.lasalle.met.shoplist.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lasalle.met.shoplist.R;

/**
 * Created by FurruPi on 20/12/17.
 */

public class Holder extends RecyclerView.ViewHolder {

     private TextView textViewName;
     private TextView textViewCount;
     public Button button;

    public Holder(View itemView) {
        super(itemView);
        textViewCount = itemView.findViewById(R.id.textView);
        textViewCount = itemView.findViewById(R.id.textView2);

        button = itemView.findViewById(R.id.button2);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("HOLDER",String.valueOf(getAdapterPosition()));
            }
        });*/

    }

    /*public void setItemText(Score score) {
        mItemPosition.setText(Integer.toString(score.getPosition()));
        mItemText.setText(score.getTitle());
        mItemScore.setText(Integer.toString(score.getScore()));
    }*/
}
