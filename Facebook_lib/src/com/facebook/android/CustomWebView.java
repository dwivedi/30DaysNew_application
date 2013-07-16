package com.facebook.android;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

public class CustomWebView extends WebView {

	public CustomWebView(Context context) {
		super(context);
	}

	public CustomWebView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public CustomWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void onWindowFocusChanged(boolean hasWindowFocus) {
		try {
			super.onWindowFocusChanged(hasWindowFocus);
		} catch (NullPointerException e) {
			// Catch null pointer exception
		}
	}
}
