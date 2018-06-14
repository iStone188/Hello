package com.helloandroid.boco.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView firstTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        firstTextView = findViewById(R.id.firsttextview);

        //通过getIntent方法获取从第一个页面传递过来的Intent
        Intent intent = getIntent();
        //根据上一个页面协商好的"MessageKey"，从Intent中取出数据
        String message = intent.getStringExtra("MessageKey");

        firstTextView.setText(message);

    }
}
