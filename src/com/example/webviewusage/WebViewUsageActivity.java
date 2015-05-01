package com.example.webviewusage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WebViewUsageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_usage);
    }

    public void onBtnClicked(View v) {

        switch (v.getId()) {
        case R.id.btnWebViewActivityWithURL:
            startActivity(new Intent(this, WebVievActivityWithURL.class));
            break;
        case R.id.btnWebViewActivityWithHTML:
            startActivity(new Intent(this, WebViewActivityWithHTML.class));
            break;
        }
    }
}
