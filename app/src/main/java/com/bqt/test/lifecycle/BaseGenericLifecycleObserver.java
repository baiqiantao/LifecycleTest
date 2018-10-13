package com.bqt.test.lifecycle;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.util.Log;

public class BaseGenericLifecycleObserver implements GenericLifecycleObserver {
	
	@Override
	public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
		switch (event) {
			case ON_CREATE:
				Log.i("bqt", "Observer【onCreate】");
				break;
			case ON_START:
				Log.i("bqt", "Observer【onStart】");
				break;
			case ON_RESUME:
				Log.i("bqt", "Observer【onResume】" + source.getLifecycle().getClass().getSimpleName());
				break;
			case ON_PAUSE:
				Log.i("bqt", "Observer【onPause】");
				break;
			case ON_STOP:
				Log.i("bqt", "Observer【onStop】");
				break;
			case ON_DESTROY:
				Log.i("bqt", "Observer【onDestroy】");
				break;
			case ON_ANY:
				Log.i("bqt", "Observer onAny");
				break;
			default:
				Log.i("bqt", "Observer【不存在的事件】");
				break;
		}
	}
}