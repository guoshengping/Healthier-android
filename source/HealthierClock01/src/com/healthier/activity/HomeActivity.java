package com.healthier.activity;

/**
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class HomeActivity extends Activity implements OnClickListener {
	private ListView list;// listview 控件
	private Button homeBtn = null;// 首页
	private Button clockBut = null;// 闹钟
	private Button reminaBut = null;// 健康提醒
	private Button informetionBtn = null;// 健康咨询
	private Button moreButton = null;// 更多

	/**
	 * activity 第一次创建时调用
	 * 
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);// 保存当前页面状态
		setContentView(R.layout.home);// 设置布局文件

		homeBtn = (Button) findViewById(R.id.a);// 首页按钮

		clockBut = (Button) findViewById(R.id.b);// 闹钟按钮
		clockBut.setOnClickListener(this);// 注册监听

		reminaBut = (Button) findViewById(R.id.c);// 健康提醒按钮
		reminaBut.setOnClickListener(this);// 注册监听

		informetionBtn = (Button) findViewById(R.id.d);// 健康咨询按钮
		informetionBtn.setOnClickListener(this);// 注册监听

		moreButton = (Button) findViewById(R.id.e);// 更多按钮
		moreButton.setOnClickListener(this);// 注册监听

		list = (ListView) findViewById(R.id.listTest);// 布局文件

		ArrayList<HashMap<String, String>> arrryList = new ArrayList<HashMap<String, String>>();

		int count = 16;
		HashMap<String, String> map = null;
		for (int i = 0; i < count; i++) {
			map = new HashMap<String, String>();
			map.put("leftTitle", "饮食提醒");
			map.put("leftContext", "每天  08:30 11:00 14:00 16:00");
			map.put("rightTime", "12:00");
			arrryList.add(map);
		}

		SimpleAdapter listAdapter = new SimpleAdapter(this, arrryList,
				R.layout.item, new String[] { "leftTitle", "leftContext",
						"rightTime" }, new int[] { R.id.leftTitle,
						R.id.leftContext, R.id.rightText });
		list.setAdapter(listAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	/**
	 * activity 即将显示时调用
	 */
	@Override
	protected void onResume() {
		super.onResume();
		homeBtn.setBackgroundResource(R.drawable.btn_foot_hover);// 设置点击效果
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.b:// 跳到闹钟界面
			intent = new Intent(HomeActivity.this, ClockAcitivity.class);
			this.startActivity(intent);
			break;

		case R.id.c:// 跳到健康提醒界面
			intent = new Intent(HomeActivity.this, ReminaAcitivity.class);
			this.startActivity(intent);
			break;
		case R.id.d:// 跳到健康咨询界面
			intent = new Intent(HomeActivity.this, InformationActivity.class);
			this.startActivity(intent);
			break;
		case R.id.e:// 跳到更多界面
			intent = new Intent(HomeActivity.this, MoreActivity.class);
			this.startActivity(intent);
			break;
		default:
			break;
		}
	}
}
