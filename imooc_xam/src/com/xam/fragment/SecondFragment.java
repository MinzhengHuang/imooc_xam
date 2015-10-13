package com.xam.fragment;

import com.xam.ImageScanActivity;
import com.xam.R;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_second, container, false);
		view.findViewById(R.id.btn_ImageScan).setOnClickListener(this);
		return view;

	}

	@Override
	public void onClick(View v) {
		Intent intent=null;
		switch (v.getId()) {
		case R.id.btn_ImageScan:
			intent=new Intent(getActivity(), ImageScanActivity.class);
			break;

		default:
			break;
		}
		startActivity(intent);
	}
}
