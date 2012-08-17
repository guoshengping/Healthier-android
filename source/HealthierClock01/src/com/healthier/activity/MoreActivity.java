package com.healthier.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MoreActivity extends Activity implements OnClickListener {
	private ImageView moreImageTop;//首页
	private Button homeBtn = null;// 首页
	private Button clockBtn = null;// 闹钟
	private Button redmeBtn = null;// 健康提醒
	private Button informetionBtn = null;// 健康咨询
	private Button moreBtn = null;// 更多

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more);
		// 初始化button，以下都是进行强制转换
		moreImageTop = (ImageView) findViewById(R.id.home1);
		homeBtn = (Button) findViewById(R.id.a);
		clockBtn = (Button) findViewById(R.id.b);
		redmeBtn = (Button) findViewById(R.id.c);
		informetionBtn = (Button) findViewById(R.id.d);
		moreBtn = (Button) findViewById(R.id.e);

		// 注册监听
		moreImageTop.setOnClickListener(this);
		homeBtn.setOnClickListener(this);
		clockBtn.setOnClickListener(this);
		redmeBtn.setOnClickListener(this);
		informetionBtn.setOnClickListener(this);

	}

	@Override
	protected void onResume() {
		super.onResume();
		// 设置默认选中状态
		moreBtn.setBackgroundResource(R.drawable.btn_foot_hover);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.home1:// 首页
			intent = new Intent(MoreActivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;
		case R.id.a:// 首页
			intent = new Intent(MoreActivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;

		case R.id.b:// 闹钟
			intent = new Intent(MoreActivity.this, ClockAcitivity.class);
			this.startActivity(intent);
			break;

		case R.id.c:// 健康提醒
			intent = new Intent(MoreActivity.this, ReminaAcitivity.class);
			this.startActivity(intent);
			break;

		case R.id.d:// 健康咨询
			intent = new Intent(MoreActivity.this, InformationActivity.class);
			this.startActivity(intent);
			break;
		default:
			break;
		}
	}

}
