package com.example.webviewusage;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivityWithHTML extends Activity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_with_url);

        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadDataWithBaseURL("file:///android_asset/", getHTMLData(),
                "text/html", "UTF-8", "");
    }

    private String getHTMLData() {
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head>");

        html.append("<link rel=stylesheet href='css/style.css'>");
        html.append("</head>");
        html.append("<body>");
        html.append("<div id ='main'> Loading html data in WebView</div>");
        html.append("</body>");
        html.append("</html>");

        return html.toString();
    }
}
