package com.example.webviewusage;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebVievActivityWithURL extends Activity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_web_view);

        myWebView = (WebView) findViewById(R.id.webview);

        myWebView.loadUrl("https://m.facebook.com");
    }

}
