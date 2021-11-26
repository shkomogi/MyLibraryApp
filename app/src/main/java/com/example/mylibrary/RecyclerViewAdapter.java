package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    //define arraylist of books
    private ArrayList<Book> booksLi = new ArrayList<>();
    private Context context;
    private CardView bookcard;
    private String type = "";
    private Util utils;
    //context Adapter

    //create a log message for debugging
    //define an Inner class
    private static final String TAG = "Recycler log";

    public RecyclerViewAdapter(SeeAllActivity seeAllActivity) {

    }
    public RecyclerViewAdapter (Context context){
        this.context = context;
        utils = new Util();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_book_recycler,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
        //create a View, an instance of the layout >
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG, "onBindViewHolder: Called"); //for log purposes
        holder.bookName.setText(booksLi.get(position).getBookname());
        holder.bookName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,booksLi.get(position).getBookname()+" Selected",Toast.LENGTH_SHORT).show();
            }

        });
        //define a long press
        holder.bookcard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                switch (type){
                    case "want to read":
                        if (utils.removeWantToReadBook(booksLi.get(position))){
                            Toast.makeText(context,booksLi.get(position).getBookname()+"has successfully deleted",Toast.LENGTH_SHORT).show();
                        }

                        break;
                    case "already read":
                        if (utils.removeAlreadyReadBook(booksLi.get(position))){
                            Toast.makeText(context,booksLi.get(position).getBookname()+"has successfully deleted",Toast.LENGTH_SHORT).show();
                        }

                        break;
                    case "currently reading":
                        if (utils.removeCurrentlyReadingBook(booksLi.get(position))){
                            Toast.makeText(context,booksLi.get(position).getBookname()+"has successfully deleted",Toast.LENGTH_SHORT).show();
                        }

                        break;
                    default:
                        break;
                } return true;

            }
        });

        holder.bookcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,booksLi.get(position).getBookname()+" Selected",Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(booksLi.get(position).getImageURL())
                .into(holder.bookImage);

    }


    @Override
    public int getItemCount() {
        return booksLi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView bookImage;
        private TextView bookName;
        private CardView bookcard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //Initalize
            bookImage = (ImageView) itemView.findViewById(R.id.recyclerView_img);
            bookName = (TextView) itemView.findViewById(R.id.recyclerTextView);
            bookcard = (CardView) itemView.findViewById(R.id.bookCard);
        }
    }

    public void setBooksLi(ArrayList<Book> booksLi) {
        this.booksLi = booksLi;
        notifyDataSetChanged();
    }
    //create setter for string type

    public void setType(String type) {
        this.type = type;
    }
}
