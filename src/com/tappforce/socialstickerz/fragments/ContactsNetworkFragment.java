package com.tappforce.socialstickerz.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.codinguser.android.contactpicker.ContactsPickerActivity;
import com.tappforce.socialstickerz.R;

public class ContactsNetworkFragment extends ListFragment {

	private String[] contact_networks;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		contact_networks = getResources().getStringArray(R.array.contacts_network_array);
		
	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, contact_networks));
	}


	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		
		switch (position) {
		
		case 0:
			startActivityForResult(new Intent(getActivity(), ContactsPickerActivity.class), position);
			break;
		
		}
		
	}


	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		switch (requestCode) {
		
		case 0:
			Toast.makeText(getActivity(), "Contact Picked", Toast.LENGTH_SHORT).show();
			break;
		
		}
	}
	
	
	
	
}
