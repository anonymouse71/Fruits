package com.vize.meyveler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton meyveButton1, meyveButton2, meyveButton3, meyveButton4,
			meyveButton5, meyveButton6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listener1();
		listener2();
		listener3();
		listener4();
		listener5();
		listener6();
	}

	public void listener1() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.banana_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Banana.class);
				startActivity(yonlendir);
			}
		});
	}

	public void listener2() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.carrot_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Carrots.class);
				startActivity(yonlendir);
			}
		});
	}
	public void listener3() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.garlic_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Garlic.class);
				startActivity(yonlendir);
			}
		});
	}
	public void listener4() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.lemon_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Lemon.class);
				startActivity(yonlendir);
			}
		});
	}
	public void listener5() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.mushroom_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Mushroom.class);
				startActivity(yonlendir);
			}
		});
	}
	public void listener6() {
		final Context context = this;
		meyveButton1 = (ImageButton) findViewById(R.id.tomato_button);
		meyveButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent yonlendir = new Intent(context, Tomato.class);
				startActivity(yonlendir);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_settings :
				Intent intent = new Intent(this, Hakkimizda.class);
				this.startActivity(intent);
				break;
			default :
				return super.onOptionsItemSelected(item);
		}
		return true;
	}

}
