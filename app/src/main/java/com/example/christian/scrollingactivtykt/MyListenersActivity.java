package com.example.christian.scrollingactivtykt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by Christian on 2017/9/24.
 */

public class MyListenersActivity extends AppCompatActivity {

    private static final String TAG = "MyListenersActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        // 实例化一个自己MyListenersView
        MyListenersView myListenersView = (MyListenersView) findViewById(R.id.my_listeners_view);
        myListenersView.setOnClickListener(new View.OnClickListener() {
            // 把自己（MyListenersView）的函数写到了别人（MyListenersActivity）的里面
            @Override
            public void onClick(View v) {
                Log.i(TAG, ">>>>>>>>>>>>>>>>>>>>");
            }
        });
    }
}
