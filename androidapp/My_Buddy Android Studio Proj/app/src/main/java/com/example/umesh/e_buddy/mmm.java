package com.example.umesh.e_buddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mmm extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmm);


        myWebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://192.168.43.64/MMM/index.php");
        myWebView.setWebViewClient(new WebViewClient(){

            public void onReceivedError (WebView view, int errorCode, String description , String failingUrl){

                myWebView.loadUrl("file:///android_asset/error.html");
            }


        });
    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
