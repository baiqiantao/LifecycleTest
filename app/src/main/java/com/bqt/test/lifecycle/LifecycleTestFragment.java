package com.bqt.test.lifecycle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bqt.test.R;

public class LifecycleTestFragment extends Fragment {
	public LifecycleTestFragment() {
		getLifecycle().addObserver(new BaseGenericLifecycleObserver()); //不是在onCreate等生命周期方法中注册，而是在构造方法中就注册
	}
	
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		ImageView imageView = new ImageView(getContext());
		imageView.setImageResource(R.drawable.icon);
		return imageView;
	}
}