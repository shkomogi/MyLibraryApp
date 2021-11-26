package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

public class WanttoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wantto);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /*** adapter = new RecyclerViewAdapter(this);
        utils = new Util();
        adapter.setType("want to read");

        recyclerView = (RecyclerView) findViewById(R.id.recView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        adapter.setBooks(utils.getWanttoReadBook());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);***/
    }
}