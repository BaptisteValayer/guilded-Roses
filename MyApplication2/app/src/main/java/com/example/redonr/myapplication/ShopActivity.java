package com.example.redonr.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class ShopActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop_layout);
		ListView listView = (ListView) findViewById(R.id.ItemShopListView);
		MyArrayAdapter adapter = new MyArrayAdapter (this,((VariableGlobale)this.getApplication()).getItems());
		listView.setAdapter(adapter);
	}



}
