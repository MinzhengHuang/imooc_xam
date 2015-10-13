package com.xam;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import com.xam.adapter.DragAdapter;
import com.xam.view.DragGridView;

/**
 * @blog http://blog.csdn.net/xiaanming 
 * 
 * @author xiaanming
 *
 */
public class DragGridViewActivity extends Activity {
	private List<HashMap<String, Object>> dataSourceList = new ArrayList<HashMap<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draggridview);

		DragGridView mDragGridView = (DragGridView) findViewById(R.id.dragGridView);
		for (int i = 0; i < 15; i++) {
			HashMap<String, Object> itemHashMap = new HashMap<String, Object>();
			itemHashMap.put("item_image",R.drawable.com_tencent_open_notice_msg_icon_big);
			itemHashMap.put("item_text", "拖拽 " + Integer.toString(i));
			dataSourceList.add(itemHashMap);
		}
		
		final DragAdapter mDragAdapter = new DragAdapter(this, dataSourceList);
		
		mDragGridView.setAdapter(mDragAdapter);
		mDragGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(DragGridViewActivity.this, "点击了:"+dataSourceList.get(position).get("item_text"), Toast.LENGTH_SHORT).show();
			}
		});
	}
	

}
