package com.android.activity;

/**
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class HomeActivity extends Activity {
	private ListView list;// listview 控件

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		list = (ListView) findViewById(R.id.listTest);

		
		ArrayList<HashMap<String, String>> arrryList = new ArrayList<HashMap<String, String>>();
		
		/*
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map3 = new HashMap<String, String>();
		HashMap<String, String> map4 = new HashMap<String, String>();
		map1.put("leftTitle", "饮食提醒");
		map1.put("leftContext", "每天  08:30 11:00 14:00 16:00");
		map1.put("rightTime", "12:00");

		map2.put("leftTitle", "医药提醒");
		map2.put("leftContext", "每天  08:30 11:00 14:00 16:00");
		map2.put("rightTime", "12:00");

		map3.put("leftTitle", "运动提醒");
		map3.put("leftContext", "每天  08:30 11:00 14:00 16:00");
		map3.put("rightTime", "12:00");

		map4.put("leftTitle", "运动提醒");
		map4.put("leftContext", "每天  08:30 11:00 14:00 16:00");
		map4.put("rightTime", "12:00");

		arrryList.add(map1);
		arrryList.add(map2);
		arrryList.add(map3);
		arrryList.add(map4);
*/
		int count = 16;
		HashMap<String, String> map = null;
for(int i = 0;i < count ; i++){
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

}
