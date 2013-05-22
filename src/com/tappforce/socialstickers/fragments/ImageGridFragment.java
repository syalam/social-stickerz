package com.tappforce.socialstickers.fragments;

import com.tappforce.socialstickerz.R;
import com.tappforce.socialstickerz.adapters.ImageAdapter;
import com.tappforce.socialstickerz.utils.BaseFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class ImageGridFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.gridview_images, container, false);
		GridView imageGrid = (GridView) view.findViewById(R.id.image_gridView);
		imageGrid.setAdapter(new ImageAdapter(view.getContext()));
		
		return view;
	}

	
	
}
