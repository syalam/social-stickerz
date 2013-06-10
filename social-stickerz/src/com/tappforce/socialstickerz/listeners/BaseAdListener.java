package com.tappforce.socialstickerz.listeners;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest.ErrorCode;


// Receives callbacks on various events related to fetching ads.  In this sample,
// the application displays a message on the screen.  A real application may,
// for example, fill the ad with a banner promoting a feature.
public class BaseAdListener implements AdListener {


	public BaseAdListener() {
		
	}
	
	@Override
	public void onDismissScreen(Ad arg0) {
		
	}

	@Override
	public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLeaveApplication(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPresentScreen(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceiveAd(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

}
