package com.iek.wiflyremote.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.iek.wiflyremote.R;
import com.iek.wiflyremote.stat.M;

public class GoalsFragment extends Fragment {
	private EditText etGInstVel;
	private EditText etGAvgVel;
	private EditText etGLinMet;
	private EditText etGDeadT;
	//private EditText etGFactor;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.goals_fragment, container, false);
		etGInstVel = (EditText) v.findViewById(R.id.etGInstVel);
		etGAvgVel = (EditText) v.findViewById(R.id.etGAvgVel);
		etGLinMet = (EditText) v.findViewById(R.id.etGLinMet);
		etGDeadT = (EditText) v.findViewById(R.id.etGDeadT);
		//etGFactor = (EditText) v.findViewById(R.id.etGFactor);
		Button btGInstVel = (Button) v.findViewById(R.id.btGInstVel);
		Button btGAvgVel = (Button) v.findViewById(R.id.btGAvgVel);
		Button btGLinMet = (Button) v.findViewById(R.id.btGLinMet);
		Button btGDeadT = (Button) v.findViewById(R.id.btGDeadT);
		//Button btGFactor = (Button) v.findViewById(R.id.btGFactor);

		btGInstVel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int i = 0;
				try {
					i = Integer.parseInt(etGInstVel.getText().toString());
				} catch (NumberFormatException e) {
					return;
				}
				if (i <= 999) {
					M.m().sendMessage(null, "V" + String.format("%03d", i));
				}
			}
		});
		btGAvgVel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int i = 0;
				try {
					i = Integer.parseInt(etGAvgVel.getText().toString());
				} catch (NumberFormatException e) {
					return;
				}
				if (i <= 999) {
					M.m().sendMessage(null, "A" + String.format("%03d", i));
				}
			}
		});
		btGLinMet.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int i = 0;
				try {
					i = Integer.parseInt(etGLinMet.getText().toString());
				} catch (NumberFormatException e) {
					return;
				}
				if (i <= 99999) {
					M.m().sendMessage(null, "D" + String.format("%05d", i));
				}
			}
		});
		btGDeadT.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int i;
				try {
					i = Integer.parseInt(etGDeadT.getText().toString());
				} catch (NumberFormatException e) {
					return;
				}
				if (i <= 999) {
					M.m().sendMessage(null, "T" + String.format("%03d", i));
				}
			}
		}); 
		

		return v;
	}
}
