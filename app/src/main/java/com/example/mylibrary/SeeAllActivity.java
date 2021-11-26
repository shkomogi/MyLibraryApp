package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SeeAllActivity extends AppCompatActivity {
    private static final String TAG = "SeeAllBookActivity";
    private ListView listofBooks;
    private RecyclerView bookRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all);

        //Animation
        overridePendingTransition(R.anim.in,R.anim.out);

        Log.d(TAG, "onCreate: Started");

        //initialize ListView and Cast
        //listofBooks = (ListView) findViewById(R.id.listofbooks);
        bookRecView = (RecyclerView) findViewById(R.id.bookRecycler);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this);
        bookRecView.setAdapter(adapter);
        bookRecView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Gifted Hands","Dr.Ben Carson",2000,"https://imgur.com/2vmdhYx","Biography of US Surgeon"));

        //create own Adapter for Recycler View
        adapter.setBooksLi(books);
        //Step 1 - Create a Layout file in layout file for every item to show

        //define an arrayList of Strings & add
        /**ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Maleficient");
        bookList.add("Milly Molly Mandy");
        bookList.add("Great Controversey");
        bookList.add("How to get Rich");

        //create Adapter in format this, layout, arraylist name
        ArrayAdapter<String> bookAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bookList);

        //set Adapter to Listener
        listofBooks.setAdapter(bookAdapter);**/

    }
}