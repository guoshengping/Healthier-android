package com.healthier.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ClockAcitivity extends Activity implements OnClickListener {
	private Button homeBut = null;
	private Button clockBut = null;
	private Button reminaBut = null;
	private Button informButton = null;
	private Button moreButton = null;
	 

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clock);
		// 初始化Button
		homeBut = (Button) findViewById(R.id.a);
		clockBut = (Button) findViewById(R.id.b);
		reminaBut = (Button) findViewById(R.id.c);
		informButton = (Button) findViewById(R.id.d);
		moreButton = (Button) findViewById(R.id.e);

		// 注册监听
		homeBut.setOnClickListener(this);
		reminaBut.setOnClickListener(this);
		informButton.setOnClickListener(this);
		moreButton.setOnClickListener(this);
	}

	// 监听
	/*
	 * class MyButtonListener implements OnClickListener {
	 * 
	 * @Override public void onClick(View v) { Log.e("gsp", "=========");
	 * 
	 * Intent intent = new Intent(); intent.setClass(ClockAcitivity.this,
	 * HomeActivity.class); ClockAcitivity.this.startActivity(intent); } }
	 */

	@Override
	protected void onResume() {
		super.onResume();
		// 设置默认选中状态
		clockBut.setBackgroundResource(R.drawable.btn_foot_hover);// 设置选中效果
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = null;
		switch (v.getId()) {
		case R.id.a:// 首页
			intent = new Intent(ClockAcitivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;
			
		case R.id.home:// 首页
			intent = new Intent(ClockAcitivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;

		case R.id.c:// 健康提醒界面
			intent = new Intent(ClockAcitivity.this, ReminaAcitivity.class);
			this.startActivity(intent);
			break;

		case R.id.d:// 健康咨询界面
			intent = new Intent(ClockAcitivity.this, InformationActivity.class);
			this.startActivity(intent);
			break;

		case R.id.e:// 更多界面
			intent = new Intent(ClockAcitivity.this, MoreActivity.class);
			this.startActivity(intent);
			break;
		default:
			break;

		}
	}
}