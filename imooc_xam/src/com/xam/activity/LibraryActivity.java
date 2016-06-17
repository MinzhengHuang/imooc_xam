package com.xam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.xam.utils.MResource;

/**
 *  Android将Activity打成jar包供第三方调用（解决资源文件不能打包的问题）
 *
 *  http://blog.csdn.net/xiaanming/article/details/9257853
 */
public class LibraryActivity extends Activity {
	String msg = "我是来自Jar中的Activity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(MResource.getIdByName(getApplication(), "layout",
				"activity_library"));

		TextView mTextView = (TextView) findViewById(MResource.getIdByName(
				getApplication(), "id", "textView1"));
		mTextView.setText(msg);

		Button mButton = (Button) findViewById(MResource.getIdByName(
				getApplication(), "id", "button1"));

		mButton.setText(msg);
		mButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(), msg, Toast.LENGTH_SHORT)
						.show();
			}
		});
	}

}
