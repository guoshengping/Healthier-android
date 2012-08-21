package com.healthier.activity;

import java.util.ArrayList;
import java.util.HashMap;
import com.healthier.adapter.ClockAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;


public class ClockAcitivity extends Activity implements OnClickListener {
	private ListView picture;
	private ImageView homeImageTop;//首页
	private Button homeBut = null;// 首页
	private Button clockBut = null;// 闹钟
	private Button reminaBut = null;// 健康提醒
	private Button informButton = null;// 健康咨询
	private Button moreButton = null;// 更多

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clock);
		// 初始化Button，以下都是进行强制转换
		homeImageTop = (ImageView)findViewById(R.id.home1);
		homeBut = (Button) findViewById(R.id.a);
		clockBut = (Button) findViewById(R.id.b);
		reminaBut = (Button) findViewById(R.id.c);
		informButton = (Button) findViewById(R.id.d);
		moreButton = (Button) findViewById(R.id.e);

		// 注册监听
		homeImageTop.setOnClickListener(this);
		homeBut.setOnClickListener(this);
		reminaBut.setOnClickListener(this);
		informButton.setOnClickListener(this);
		moreButton.setOnClickListener(this);

		picture = (ListView) findViewById(R.id.clock_middle_picture);// 布局文件
		
		ArrayList<HashMap<String, String>> arrryList = new ArrayList<HashMap<String, String>>();
		int count = 20;
		HashMap<String, String> map = null;
		for (int i = 0; i < count; i++) {
			map = new HashMap<String, String>();
			map.put("ring_cycle", "事件");
			map.put("date", "2012 - 12" + "-" +i);
			arrryList.add(map);
		}

		ClockAdapter clockAdapter = new ClockAdapter(this, arrryList);
		picture.setAdapter(clockAdapter);
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
		case R.id.home1:// 首页
			intent = new Intent(ClockAcitivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;
		case R.id.a:// 首页
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