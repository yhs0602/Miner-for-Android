package com.coinhive.mining;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity {
	
	private WebView mWebView;
	
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		mWebView = (WebView) findViewById(R.id.webView);
		
		//Включаем поддержку JavaScript
		mWebView.getSettings().setJavaScriptEnabled(true);
		
		//указываем страницу загрузки
		mWebView.setWebViewClient(new MyWebViewClient());
		
		//ссылка
		mWebView.loadUrl("file:///android_asset/index.html");
    }
	private class MyWebViewClient extends WebViewClient {
		
		@Override
		public boolean shouldOverrideUrlLoading ( WebView view, String url ) {
			view.loadUrl(url);
			return true;
		}
	}
	
	//Необязательно
	@Override
	public void onBackPressed() {
		if(mWebView.canGoBack())
		{
			mWebView.goBack();
		} else {
			super.onBackPressed ( );
		}
	}
}
