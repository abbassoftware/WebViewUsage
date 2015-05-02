package com.example.webviewusage;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivityWithURL extends Activity {

    private WebView myWebView;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_web_view);

        myWebView = (WebView) findViewById(R.id.webview);

        myWebView.loadUrl("https://m.facebook.com");
    }

}
