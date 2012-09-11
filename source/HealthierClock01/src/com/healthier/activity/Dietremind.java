package com.healthier.activity;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Dietremind extends Activity  implements OnClickListener{
	private TextView dietremind = null;
	private ImageView returnImageTop;//后退

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dietremind);
		returnImageTop = (ImageView)findViewById(R.id.home);
		returnImageTop.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.home:// 返回
			intent = new Intent(Dietremind.this, HomeActivity.class);
			this.startActivity(intent);
			break;
		
	}
}
}
