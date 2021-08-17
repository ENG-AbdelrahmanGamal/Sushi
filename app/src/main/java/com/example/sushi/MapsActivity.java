package com.example.sushi;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.sushi.databinding.ActivityMaps2Binding;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapLongClickListener {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;
    LocationManager locationManager ;
    LocationListener locationListener;

    public void centerMapOnLocation(Location location , String title){
        LatLng userLocation=new LatLng(location.getLatitude(),location.getLongitude());
        mMap.clear();
        mMap.addMarker(new MarkerOptions().position(userLocation).title(title));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userLocation,16));


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull @NotNull String[] permissions, @NonNull @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
if(grantResults.length>0&&grantResults[0]== PackageManager.PERMISSION_GRANTED)
{
if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED)
locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER,0,0,locationListener);
Location lastKnownLocation=locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
centerMapOnLocation(lastKnownLocation,"current Location");
}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapClickListener(this::onMapLongClick);

        Intent intent = getIntent();
        if (intent.getIntExtra("PlaceNumber", 0) == 0) {
            // that is mean zoom on user location
            locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
            locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(@NonNull Location location) {
                    centerMapOnLocation(location, "Current Location");
                }
            };

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 0, 0, locationListener);
                Location lastKnownLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                centerMapOnLocation(lastKnownLocation, "Current Location");
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }

        }
    }

    @Override
    public void onMapLongClick(@NonNull @NotNull LatLng latLng) {
        Geocoder geocoder=new Geocoder(getApplicationContext(), Locale.getDefault());
        String address="";
        try{
        List<Address> addressList=geocoder.getFromLocation(latLng.latitude,latLng.longitude,1);
         if(addressList.size()>0&&addressList!=null)
         {
             if(addressList.get(0).getThoroughfare()!=null)
                 if(addressList.get(0).getSubThoroughfare()!=null)

                    address+=addressList.get(0).getSubThoroughfare()+" ";
                      address+=addressList.get(0).getThoroughfare()+" ";




         }
        }catch (Exception e)
        {
            e.printStackTrace();
        }


mMap.addMarker(new MarkerOptions().position(latLng).title(address));

    }
}