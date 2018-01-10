package com.lasalle.met.shoplist.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.lasalle.met.shoplist.Adapters.Adapter;
import com.lasalle.met.shoplist.R;

public class MainActivity extends AppCompatActivity {

    private MainActivityManager manager;

    private RecyclerView recyclerView;

    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = new MainActivityManager();

        addButton = findViewById(R.id.button);

        recyclerView = findViewById(R.id.recyclerView);
        final Adapter adapter = new Adapter(manager.getItemLists(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.addItem();
                adapter.notifyDataSetChanged();
            }
        });
    }
}
