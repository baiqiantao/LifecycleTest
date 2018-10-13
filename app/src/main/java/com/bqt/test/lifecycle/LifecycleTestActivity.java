package com.bqt.test.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bqt.test.R;

public class LifecycleTestActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getLifecycle().addObserver(new BaseLifecycleObserver()); //在onCreate方法中注册
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.icon);
		setContentView(imageView);
	}
}