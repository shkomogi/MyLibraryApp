package com.example.mylibrary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//2.2 Set the log t
    private static final String TAG = "MainActivity";
    private Button seeallButton,currentButton,wanttoButton,alreadyButton,aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare method
        overridePendingTransition(R.anim.in,R.anim.out);

        initWidgets();

        //method to setOnClickListener
        clickMe();
    }

    //actual click me method outside of main method
    private void clickMe(){
        //apply setOnClick to first button
        seeallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new Intent here to content both Activites
                Intent intent = new Intent(MainActivity.this,SeeAllActivity.class);
                //trigger intent
                startActivity(intent);

            }
        });
        //1. set onclick listener for Button in xml file
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.list new method name here
                abouttapped();
            }
        });
    }

    //2. Create the abouttapped method here
    private void abouttapped(){
        Log.d(TAG, "abouttapped: started ");
        //create new alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("About this cool App")
                .setMessage("Build and published by S.Komogi\n"
                +"In line with Java Pirple Course\n")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //WebView intent
                        Intent intent = new Intent(MainActivity.this,MyWebViewActivity.class);
                        intent.putExtra("URL","http://google.com");
                        //don t forget to start intent activity
                        startActivity(intent);

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        //should end line here but since we want to add buttons, remove; after course\n")
        //4. create webview activity thrn an intent
        builder.create().show();
    }

    private void initWidgets(){
        //initialize buttons here.
        seeallButton = (Button) findViewById(R.id.seeallButton);
        currentButton = (Button) findViewById(R.id.currentButton);
        wanttoButton = (Button) findViewById(R.id.wanttoButton);
        alreadyButton = (Button) findViewById(R.id.alreadyButton);
        aboutButton = (Button) findViewById(R.id.aboutButton);
    }
}