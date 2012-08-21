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

public class HomeAdapter extends BaseAdapter{
	
	private Context context;
	private ArrayList<HashMap<String, String>> arrryList;
	
	public HomeAdapter(Context context,ArrayList<HashMap<String, String>> arrryList){
		this.context = context;
		this.arrryList = arrryList;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return arrryList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater minflater = LayoutInflater.from(context);
		if(convertView == null) { 
			convertView = minflater.inflate(R.layout.item, null);
			//得到view当中的两个控件
			TextView aView = (TextView)convertView.findViewById(R.id.leftTitle);
			HashMap<String, String> map = arrryList.get(position);
			aView.setText(map.get("leftTitle"));
			TextView bView = (TextView)convertView.findViewById(R.id.leftContext);
			bView.setText(map.get("leftContext"));
			TextView cView = (TextView)convertView.findViewById(R.id.rightText);
			cView.setText(map.get("rightText"));
		}
		
		Log.e("adapter的getview方法", "执行次数"+position);
		return convertView;
	}

}
