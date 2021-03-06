package com.healthier.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import com.healthier.activity.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ClockAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<HashMap<String, String>> arrryList;
	
	public ClockAdapter(Context context,ArrayList<HashMap<String, String>> arrryList){
		this.context = context;
		this.arrryList = arrryList;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrryList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	//listView通过调用getView（）方法，得到相应的View对象，并将其显示在Activity上
	public View getView(int position, View convertView, ViewGroup arg2) {
		//生成LayoutInflater对象
		LayoutInflater minflater = LayoutInflater.from(context);
		if(convertView == null){
		   convertView = minflater.inflate(R.layout.clock_middle_picture, null);
		   TextView ringCycle = (TextView)convertView.findViewById(R.id.ring_cycle);
		   HashMap<String, String> map = arrryList.get(position);
		   ringCycle.setText(map.get("ring_cycle"));
		   TextView date = (TextView)convertView.findViewById(R.id.date);
		   date.setText(map.get("date"));
		}
		
		Log.e("adapter的getview方法", "执行次数"+position);
		
		return convertView;
	}

}
