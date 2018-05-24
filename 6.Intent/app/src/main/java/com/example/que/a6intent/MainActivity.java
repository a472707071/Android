package com.example.que.a6intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;htt

public class MainActivity extends AppCompatActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1_webview);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_webview);
                url = editText.getText().toString();
                if (url.isEmpty()) {
                    url = "http://www.baidu.com";
                }
                Intent intent = new Intent("com.ACTION_START_WEBVIEW");
                intent.addCategory("com.START_WEBVIEW_CATEGORY");
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }
}
