package com.example.vkrathi.cs403x_project1_layout3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button b1;
    Button b2;
    Button b3;
    WebView W1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.web1);
        b2 = (Button) findViewById(R.id.web2);
        b3 = (Button) findViewById(R.id.web3);
        W1 = (WebView) findViewById(R.id.webview);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                W1.loadUrl("https://www.google.com");
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                W1.loadUrl("https://www.apple.com");
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                W1.loadUrl("https://www.microsoft.com");
            }
        });
    }
}
