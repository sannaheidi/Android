package com.example.mobiiliharkka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.support.v4.app.FragmentActivity;
import android.view.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onClick(View v){

        switch(v.getId()) {
        case R.id.buttonMapView:           
            Button ass = (Button) findViewById(R.id.buttonMapView);
            ass.setVisibility(View.GONE);
    
            
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar.setVisibility(View.VISIBLE);
             
          break;
        case R.id.buttonListView:
            setContentView(R.layout.gpslist.xml);
            
        break;
        }
        
        
        
    }
    
}
