package com.bqt.test.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class BaseLifecycleObserver implements LifecycleObserver {
	@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
	public void onCreate() {
		Log.i("bqt", "Observer【onCreate】");
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_START)
	public void onStart() {
		Log.i("bqt", "Observer【onStart】");
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
	public void onResume(LifecycleOwner source) {
		Log.i("bqt", "Observer【onResume】" + source.getLifecycle().getClass().getSimpleName());
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
	public void onPause() {
		Log.i("bqt", "Observer【onPause】");
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_STOP)
	public void onStop() {
		Log.i("bqt", "Observer【onStop】");
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
	public void onDestroy() {
		Log.i("bqt", "Observer【onDestroy】");
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_ANY)
	public void onAny(LifecycleOwner source, Lifecycle.Event event) {
		Log.i("bqt", "Observer onAny：" + event.name());
	}
}