package com.healthier.activity;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class ReminaAcitivity extends Activity implements OnClickListener {

	private ImageView homeImageTop;//首页
	private Button homeBut = null;// 首页
	private Button clockBut = null;// 闹钟
	private Button reminaBut = null;// 健康提醒
	private Button informButton = null;// 健康咨询
	private Button moreButton = null;// 更多

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remina);
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
		clockBut.setOnClickListener(this);
		informButton.setOnClickListener(this);
		moreButton.setOnClickListener(this);

		// 绑定Layout里面的ListView
		ListView list = (ListView) findViewById(R.id.ListView01);
		// 生成动态数组，加入数据
		ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();

		int []image = new int[]{R.drawable.healthy_bottom_die_bg,R.drawable.healthy_bottom_spor_bg,R.drawable.healthy_bottom_mid_bg};
		String []titile = new String[]{"健康提醒 ","运动提醒","医药提醒"};
		
		int count = 3;
		for (int i = 0; i < count; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", image[i]);// 图像资源的ID
			map.put("ItemTitle", titile[i]);
			listItem.add(map);
		}
		// 生成适配器的Item和动态数组对应的元素
		SimpleAdapter listItemAdapter = new SimpleAdapter(this, listItem,// 数据源
				R.layout.reminaitem,// ListItem的XML实现
				// 动态数组与ImageItem对应的子项
				new String[] { "ItemImage", "ItemTitle" },
				// ImageItem的XML文件里面的一个ImageView,两个TextView ID
				new int[] { R.id.ItemImage, R.id.ItemTitle });

		// 添加并且显示
		list.setAdapter(listItemAdapter);
	}

	@Override
	protected void onResume() {
		super.onResume();
		// 设置默认选中状态
		reminaBut.setBackgroundResource(R.drawable.btn_foot_hover);// 设置选中效果
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = null;
		switch (v.getId()) {
		case R.id.home1:// 首页
			intent = new Intent(ReminaAcitivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;
		case R.id.a:// 首页
			intent = new Intent(ReminaAcitivity.this, HomeActivity.class);
			this.startActivity(intent);
			break;

		case R.id.b:// 闹钟
			intent = new Intent(ReminaAcitivity.this, ClockAcitivity.class);
			this.startActivity(intent);
			break;

		case R.id.d:// 健康提醒
			intent = new Intent(ReminaAcitivity.this, InformationActivity.class);
			this.startActivity(intent);
			break;

		case R.id.e:// 更多
			intent = new Intent(ReminaAcitivity.this, MoreActivity.class);
			this.startActivity(intent);
			break;
		default:
			break;
		}
	}
}
