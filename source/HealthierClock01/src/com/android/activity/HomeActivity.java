package com.android.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
