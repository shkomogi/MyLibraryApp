package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewActivity extends AppCompatActivity {
    private static final String TAG = "MyWevViewActivity";
    //Step1: Define Web View and log t
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        String URL= "";
        try {
             URL = getIntent().getStringExtra("URL");
        }catch (NullPointerException e){
            Log.d(TAG, "onCreate: No intent received");
        }



        //Step2. cast
        myWebView = (WebView) findViewById(R.id.MyWebView);

        //step 3 to navigate the user
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("URL"); //now go to Main and create a new intent to go to new WebView
    }
    //Step 4: Override method

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}