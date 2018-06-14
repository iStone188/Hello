package com.helloandroid.boco.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*   private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "中华大西瓜", "可口可乐涨价"};
    private ListView listView;
    private ArrayAdapter<String> adapter;

    private ArrayList<String> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        dataList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            dataList.add("数据源" + i);
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, dataList);
//        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "你的点击是"+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);

                TextView tempTextView = (TextView)view.findViewById(android.R.id.text1);

                intent.putExtra("MessageKey", tempTextView.getText());
                startActivity(intent);

                Log.v("当前tag=", String.valueOf(id));
                Log.v("当前位置position", String.valueOf(position));
                finish();
            }
        });
    }*/


    private ListView listView;

    private MyAdapter adapter;

    private ArrayList<Bean> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        dataList = new ArrayList<Bean>();
        for (int i=0; i<100; i++) {
            Bean tempBean = new Bean();
            tempBean.setName("名字"+i);
            tempBean.setPhone("手机"+i);
            tempBean.setTitle("标题"+i);
            tempBean.setTime("时间"+i);
            dataList.add(tempBean);
        }


        adapter = new MyAdapter(this, dataList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "你的点击是"+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);

//                MyAdapter tempTextView = (MyAdapter)view;

                intent.putExtra("MessageKey", "Hello World");
                startActivity(intent);

                Log.v("当前tag=", String.valueOf(id));
                Log.v("当前位置position", String.valueOf(position));
                finish();
            }
        });
    }
}
