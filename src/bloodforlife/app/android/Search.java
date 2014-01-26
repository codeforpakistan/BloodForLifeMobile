package bloodforlife.app.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Search extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		String value="";
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_search);
		
		Bundle ext=getIntent().getExtras();
		if (ext != null) {
		    value = ext.getString("url");
		}
		WebView webView = (WebView)findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);
		webView.loadUrl(value);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
