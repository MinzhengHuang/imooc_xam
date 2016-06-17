package com.xam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.xam.R;
import com.xam.view.RoundProgressBar;

/**
 * Android 高手进阶之自定义View，自定义属性（带进度的圆形进度条）
 *
 * http://blog.csdn.net/xiaanming/article/details/10298163
 */
public class CircleProgressActivity extends Activity {
	private RoundProgressBar mRoundProgressBar1, mRoundProgressBar2,
			mRoundProgressBar3, mRoundProgressBar4, mRoundProgressBar5;
	private int progress = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cricle_progress);

		mRoundProgressBar1 = (RoundProgressBar) findViewById(R.id.roundProgressBar1);
		mRoundProgressBar2 = (RoundProgressBar) findViewById(R.id.roundProgressBar2);
		mRoundProgressBar3 = (RoundProgressBar) findViewById(R.id.roundProgressBar3);
		mRoundProgressBar4 = (RoundProgressBar) findViewById(R.id.roundProgressBar4);
		mRoundProgressBar5 = (RoundProgressBar) findViewById(R.id.roundProgressBar5);

		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (progress <= 100) {
							progress += 3;
							System.out.println(progress);
							mRoundProgressBar1.setProgress(progress);
							mRoundProgressBar2.setProgress(progress);
							mRoundProgressBar3.setProgress(progress);
							mRoundProgressBar4.setProgress(progress);
							mRoundProgressBar5.setProgress(progress);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
					}
				}).start();
			}
		});

	}

}
