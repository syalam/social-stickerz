package com.tappforce.socialstickerz.fragments;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.google.ads.AdRequest.ErrorCode;
import com.tappforce.socialstickerz.R;
import com.tappforce.socialstickerz.adapters.ImageAdapter;
import com.tappforce.socialstickerz.utils.BaseFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class ImageGridFragment extends BaseFragment {

	private TextView mAdStatus;
	private AdView adView;
	private AdRequest re;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.gridview_images, container, false);
		GridView imageGrid = (GridView) view.findViewById(R.id.image_gridView);
		adView = (AdView) view.findViewById(R.id.ad);
		re = new AdRequest();
		//re.setTesting(true);
		re.addTestDevice(AdRequest.TEST_EMULATOR);
		adView.loadAd(re);
		
		mAdStatus = (TextView) view.findViewById(R.id.status);
		
		imageGrid.setAdapter(new ImageAdapter(view.getContext()));
		
		return view;
	}
	
	
    @Override
	public void onResume() {
		super.onResume();
		
		
		
		
	}


	// Receives callbacks on various events related to fetching ads.  In this sample,
    // the application displays a message on the screen.  A real application may,
    // for example, fill the ad with a banner promoting a feature.
    private class MyAdListener implements AdListener {

        @Override
        public void onDismissScreen(Ad ad) {}

        @Override
        public void onFailedToReceiveAd(Ad ad, ErrorCode errorCode) {
            mAdStatus.setText(R.string.error_receive_ad);
        }

        @Override
        public void onLeaveApplication(Ad ad) {}

        @Override
        public void onPresentScreen(Ad ad) {}

        @Override
        public void onReceiveAd(Ad ad) { mAdStatus.setText(""); }
    }

	
	
}
