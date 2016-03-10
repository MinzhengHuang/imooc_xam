package com.xam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.xam.R;
import com.xam.view.ClearEditText;

public class ClearEditTextActivity extends Activity {
	private Toast mToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clearedittext);
		
		final ClearEditText username = (ClearEditText) findViewById(R.id.username);
		final ClearEditText password = (ClearEditText) findViewById(R.id.password);
		
		((Button) findViewById(R.id.login)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(TextUtils.isEmpty(username.getText())){
					username.setShakeAnimation();
					showToast("用户名不能为空");
					return;
				}
				
				if(TextUtils.isEmpty(password.getText())){
					password.setShakeAnimation();
					showToast("密码不能为空");
					return;
				}
			}
		});
	}
	
	/**
	 * ��ʾToast��Ϣ
	 * @param msg
	 */
	private void showToast(String msg){
		if(mToast == null){
			mToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
		}else{
			mToast.setText(msg);
		}
		mToast.show();
	}


}
