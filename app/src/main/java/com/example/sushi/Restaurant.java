package com.example.sushi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.sushi.databinding.ActivityRegisterBinding;
import com.example.sushi.databinding.ActivityRestaurantBinding;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class Restaurant extends AppCompatActivity {
  ////////  MapsActivity mapsActivity = new MapsActivity();

    ActivityRestaurantBinding activityRestaurantBinding;

    private static final String TAG = "Restaurant";

    // 30.0652097,31.353204,16.08z
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRestaurantBinding = DataBindingUtil.setContentView(this, R.layout.activity_restaurant );
        Intent intent=new Intent(getApplication(),MapsActivity.class);
        intent.putExtra("your Location",1);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }







    @Override
    protected void onPause() {
        super.onPause();
       // stopLocationUpdate();
    }


    public void confirmLocation(View view)
    {
        Intent intent= new Intent(this,MapsActivity.class);

        startActivity(intent);
    }







}