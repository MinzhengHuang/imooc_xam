package com.xam.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.xam.CircleProgressActivity;
import com.xam.ClearEditTextActivity;
import com.xam.DragGridViewActivity;
import com.xam.LibraryActivity;
import com.xam.PhotoAlbumActivity;
import com.xam.R;
import com.xam.SlideCutListViewActivity;
import com.xam.SortListViewActivity;
import com.xam.SwipeActivity;

public class FirstFragment extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first, container, false);
		view.findViewById(R.id.btn_Library).setOnClickListener(this);
		view.findViewById(R.id.btn_ClearEditText).setOnClickListener(this);
		view.findViewById(R.id.btn_CircleProgress).setOnClickListener(this);
		view.findViewById(R.id.btn_DragGridView).setOnClickListener(this);
		view.findViewById(R.id.btn_PhotoAlbum).setOnClickListener(this);
		view.findViewById(R.id.btn_SwipeToDismiss).setOnClickListener(this);
		view.findViewById(R.id.btn_SortListView).setOnClickListener(this);
		view.findViewById(R.id.btn_SlideCutListView).setOnClickListener(this);
		return view;

	}

	@Override
	public void onClick(View v) {
		Intent intent=null;
		switch (v.getId()) {
		case R.id.btn_Library:
			intent=new Intent(getActivity(), LibraryActivity.class);
			break;
		case R.id.btn_ClearEditText:
			intent=new Intent(getActivity(), ClearEditTextActivity.class);
			break;
		case R.id.btn_CircleProgress:
			intent=new Intent(getActivity(), CircleProgressActivity.class);
			break;
		case R.id.btn_DragGridView:
			intent=new Intent(getActivity(), DragGridViewActivity.class);
			break;
		case R.id.btn_PhotoAlbum:
			intent=new Intent(getActivity(), PhotoAlbumActivity.class);
			break;
		case R.id.btn_SwipeToDismiss:
			intent=new Intent(getActivity(), SwipeActivity.class);
			break;
		case R.id.btn_SortListView:
			intent=new Intent(getActivity(), SortListViewActivity.class);
			break;
		case R.id.btn_SlideCutListView:
			intent=new Intent(getActivity(), SlideCutListViewActivity.class);
			break;

		default:
			break;
		}
		startActivity(intent);
	}
}
