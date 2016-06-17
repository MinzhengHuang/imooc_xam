package com.xam.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.xam.R;

/**
 * http://blog.csdn.net/xiaanming/article/details/42833893
 * <p/>
 * Android单点触控技术，对图片进行平移，缩放，旋转操作
 */
public class SingleTouchViewActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletouchview);
    }

}
