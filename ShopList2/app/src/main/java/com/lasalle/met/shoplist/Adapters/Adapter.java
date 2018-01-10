package com.lasalle.met.shoplist.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lasalle.met.shoplist.Model.ItemList;
import com.lasalle.met.shoplist.R;

import java.util.ArrayList;

/**
 * Created by FurruPi on 20/12/17.
 */

public class Adapter extends RecyclerView.Adapter<Holder> {

    private ArrayList<ItemList> items;
    private Activity activity;



    public Adapter(ArrayList<ItemList> items, Activity activity) {
        this.items = items;
        this.activity = activity;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(
                R.layout.holder,
                parent,
                false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        ItemList item = items.get(position);
        holder.button.setTag(position);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ADAPTER",String.valueOf(v.getTag()));
            }
        });
        //holder.textViewName.setText(item.getName());
        //holder.textViewCount.setText(String.valueOf(item.getCantidad()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}


