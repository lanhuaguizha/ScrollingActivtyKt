package com.example.christian.scrollingactivtykt;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Christian on 2017/9/24.
 */

public class MyListenersView extends View {

    public MyListenersView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myOnClickListener.onClick(MyListenersView.this);
            }
        });
    }

    public MyOnClickListener getMyOnClickListener() {
        return myOnClickListener;
    }

    public void setMyOnClickListener(MyOnClickListener myOnClickListener) {
        this.myOnClickListener = myOnClickListener;
    }

    private MyOnClickListener myOnClickListener;

    interface MyOnClickListener extends View.OnClickListener {
    }
}
