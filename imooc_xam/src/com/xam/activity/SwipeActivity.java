package com.xam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.xam.R;
import com.xam.view.SwipeDismissListView;
import com.xam.view.SwipeDismissListView.OnDismissCallback;

import java.util.ArrayList;
import java.util.List;

public class SwipeActivity extends Activity {
	private SwipeDismissListView mlvSwipeDismiss;
	private ArrayAdapter<String> mAdapter;
	private List<String> dataSourceList = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swipe);
		init();
	}

	private void init() {
		mlvSwipeDismiss = (SwipeDismissListView) findViewById(R.id.swipeDismissListView);
		for (int i = 0; i < 20; i++) {
			dataSourceList.add("滑动删除" + i);
		}

		mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,
                android.R.id.text1, dataSourceList);
		
		mlvSwipeDismiss.setAdapter(mAdapter);
		
		mlvSwipeDismiss.setOnDismissCallback(new OnDismissCallback() {
			
			@Override
			public void onDismiss(int dismissPosition) {
				 mAdapter.remove(mAdapter.getItem(dismissPosition)); 
			}
		});
		
		mlvSwipeDismiss.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(SwipeActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
			}
		});

	}

}

