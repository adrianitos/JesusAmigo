package com.amigosdejesus.jesusamigo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onclickfb(View v){
    	Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }
    
    public void onclicktw(View v){
    	Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }
    
}
