package com.qisda.weather;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class weatherUI extends Activity implements OnTouchListener {
	/** Called when the activity is first created. */

	private ImageView w1;
	private ImageView w2;
	private ImageView w3;
	private ImageView w4;

	private ImageView wcurrent;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		w1 = (ImageView) findViewById(R.id.w1);
		w2 = (ImageView) findViewById(R.id.w2);
		w3 = (ImageView) findViewById(R.id.w3);
		w4 = (ImageView) findViewById(R.id.w4);
		wcurrent = (ImageView) findViewById(R.id.wcurrent);

		w1.setBackgroundResource(R.drawable.weather_clear);
		w2.setBackgroundResource(R.drawable.weather_clear_night);
		w3.setBackgroundResource(R.drawable.weather_cloudy);
		w4.setBackgroundResource(R.drawable.weather_showers);
		wcurrent.setBackgroundResource(R.drawable.weather_storm);

		/*
		 * wcurrent.setOnFocusChangeListener(new View.OnFocusChangeListener() {
		 * public void onFocusChange(View v, boolean hasFocus) { if (true ==
		 * hasFocus) { wcurrent.setBackgroundDrawable(v.getBackground());
		 * 
		 * } else {
		 * 
		 * } } }); / wcurrent.setOnTouchListener(new View.OnTouchListener() {
		 * public boolean onTouch(View v, MotionEvent event) {
		 * 
		 * return true; }
		 * 
		 * });
		 */
		
		w1.setOnTouchListener(this);
		w2.setOnTouchListener(this);
		w3.setOnTouchListener(this);
		w4.setOnTouchListener(this);
		wcurrent.setOnTouchListener(this);

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		ImageView imageview = (ImageView)findViewById(v.getId());
		imageview.setBackgroundDrawable(v.getBackground());
		
		switch (v.getId()) {
		case R.id.w1:
			wcurrent.setBackgroundDrawable(v.getBackground());
			break;
		case R.id.w2:
			wcurrent.setBackgroundDrawable(v.getBackground());
			break;

		case R.id.w3:
			wcurrent.setBackgroundDrawable(v.getBackground());
			break;

		case R.id.w4:
			wcurrent.setBackgroundDrawable(v.getBackground());
			break;

		case R.id.wcurrent:
			wcurrent.setBackgroundDrawable(v.getBackground());
			break;

		default:
			break;

		}
		return true;
	}
}