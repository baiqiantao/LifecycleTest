package com.bqt.test.lifecycle;

import android.arch.lifecycle.DefaultLifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

public class MyDefaultLifecycleObserver implements DefaultLifecycleObserver {
	@Override
	public void onCreate(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onCreate】");
	}
	
	@Override
	public void onStart(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onStart】");
	}
	
	@Override
	public void onResume(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onResume】" + source.getLifecycle().getClass().getSimpleName());
	}
	
	@Override
	public void onPause(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onPause】");
	}
	
	@Override
	public void onStop(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onStop】");
	}
	
	@Override
	public void onDestroy(@NonNull LifecycleOwner source) {
		Log.i("bqt", "Observer【onDestroy】");
	}
}