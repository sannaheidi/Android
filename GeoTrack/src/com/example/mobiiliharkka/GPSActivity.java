package com.example.mobiiliharkka;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;


public class GPSActivity extends Activity {

    private TextView latituteField;
    private TextView longitudeField;

    /**
     * Provides the location updates.
     */
  private LocationManager mLocationManager;
  
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      
      latituteField = (TextView) findViewById(R.id.TextLatitude);
      longitudeField = (TextView) findViewById(R.id.TextLongitude);

  }
  


  }  

  
  
    

