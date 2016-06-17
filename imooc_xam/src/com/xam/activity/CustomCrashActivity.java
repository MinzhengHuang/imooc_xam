package com.xam.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xam.BaseActivity;
import com.xam.R;

/**
 * Android 重写系统Crash处理类，保存Crash信息到SD卡 和 完美退出程序的方法
 *
 * http://blog.csdn.net/xiaanming/article/details/9344703
 *
 * Created by huangminzheng on 16/6/14.
 */
public class CustomCrashActivity extends BaseActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_crash);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("haha");
            }
        });
    }
}
