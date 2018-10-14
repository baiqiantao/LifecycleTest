package com.bqt.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.bqt.test.lifecycle.LifecycleTestActivity;
import com.bqt.test.lifecycle.LifecycleTestFragment;

import java.util.Arrays;

public class MainActivity extends FragmentActivity implements AdapterView.OnItemClickListener {
	private FrameLayout frameLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListView listView = new ListView(this);
		String[] array = {"测试 Lifecycle 在 Activity 中的使用",
				"测试 Lifecycle 在 Fragment 中的使用",
				"",
				"",};
		listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Arrays.asList(array)));
		listView.setOnItemClickListener(this);
		frameLayout = new FrameLayout(this);
		frameLayout.setId(R.id.fragment_id);
		listView.addFooterView(frameLayout);
		setContentView(listView);
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		switch (position) {
			case 0:
				startActivity(new Intent(this, LifecycleTestActivity.class));
				break;
			case 1:
				getSupportFragmentManager().beginTransaction()
						.add(frameLayout.getId(), new LifecycleTestFragment(), "Tag")
						.commit();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
		}
	}
}